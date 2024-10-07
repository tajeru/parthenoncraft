package com.github.tajeru.parthenoncraft.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CloudStairs extends StairsBlock {
    private final int transparency;


    public CloudStairs(BlockState baseBlockState, Settings settings, int transparency) {
        super(baseBlockState, settings);
        this.transparency = transparency;
    }

    public int getTransparency() {
        return transparency;
    }
}

