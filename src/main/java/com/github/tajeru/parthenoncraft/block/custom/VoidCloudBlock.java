package com.github.tajeru.parthenoncraft.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class VoidCloudBlock extends Block {
    private static final VoxelShape SHAPE = Block.createCuboidShape(0,0,0,16,16,16);
    private final int transparency;

    public VoidCloudBlock(Settings settings, int transparency) {
        super(settings);
        this.transparency = transparency;
    }
    @Override
    protected  VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pod, ShapeContext context) {
        return SHAPE;
    }

    public int getTransparency() {
        return transparency;
    }
}


