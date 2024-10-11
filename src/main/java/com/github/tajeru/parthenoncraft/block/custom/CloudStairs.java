package com.github.tajeru.parthenoncraft.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;


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

