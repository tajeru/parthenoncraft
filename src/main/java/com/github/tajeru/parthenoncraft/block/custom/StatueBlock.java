package com.github.tajeru.parthenoncraft.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.Direction;

public class StatueBlock extends HorizontalFacingBlock {
    public static final EnumProperty<Pose> POSE = EnumProperty.of("pose", Pose.class);
    protected StatueBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(POSE, Pose.DEFAULT));
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, POSE);
    }
    // ポーズのEnum
    public enum Pose implements StringIdentifiable {
        DEFAULT("default"),
        POSE1("pose1"),
        POSE2("pose2"),
        POSE3("pose3");

        private final String name;

        Pose(String name) {
            this.name = name;
        }

        @Override
        public String asString() {
            return this.name;
        }
    }

}
