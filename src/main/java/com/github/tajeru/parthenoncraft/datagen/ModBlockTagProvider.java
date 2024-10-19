package com.github.tajeru.parthenoncraft.datagen;

import com.github.tajeru.parthenoncraft.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.CALCITE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.CALCITE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.CALCITE_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.QUARTZ_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.QUARTZ_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.QUARTZ_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.QUARTZ_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.QUARTZ_PILLAR_WALL);

        getOrCreateTagBuilder(BlockTags.WALL_POST_OVERRIDE).add(ModBlocks.QUARTZ_BRICK_WALL_PILLAR);
        getOrCreateTagBuilder(BlockTags.WALL_POST_OVERRIDE).add(ModBlocks.QUARTZ_WALL_PILLAR);
        getOrCreateTagBuilder(BlockTags.WALL_POST_OVERRIDE).add(ModBlocks.CALCITE_WALL_PILLAR);
        getOrCreateTagBuilder(BlockTags.WALL_POST_OVERRIDE).add(ModBlocks.QUARTZ_PILLAR_WALL_PILLAR);



    }
}
