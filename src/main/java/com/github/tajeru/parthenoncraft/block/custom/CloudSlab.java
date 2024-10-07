package com.github.tajeru.parthenoncraft.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;

public class CloudSlab extends SlabBlock {
    private final int transparency;

    public CloudSlab(Settings settings, int transparency) {
        super(settings);
        this.transparency = transparency;
    }


    public int getTransparency() {
        return transparency;
    }
}

