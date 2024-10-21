package com.github.tajeru.parthenoncraft.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class QuartarBlock extends HorizontalFacingBlock {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    // VoxelShapeの定義を修正
    private static final VoxelShape SHAPE_NORTH = VoxelShapes.cuboid(0.0F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
    private static final VoxelShape SHAPE_SOUTH = VoxelShapes.cuboid(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
    private static final VoxelShape SHAPE_WEST = VoxelShapes.cuboid(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
    private static final VoxelShape SHAPE_EAST = VoxelShapes.cuboid(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 1.0F);

    public QuartarBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        // 設置時の向きを反映
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        // 向きに応じて正しいVoxelShapeを返す
        Direction direction = state.get(FACING);
        switch (direction) {
            case SOUTH:
                return SHAPE_SOUTH;
            case WEST:
                return SHAPE_WEST;
            case EAST:
                return SHAPE_EAST;
            default:
                return SHAPE_NORTH;
        }
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }
}
