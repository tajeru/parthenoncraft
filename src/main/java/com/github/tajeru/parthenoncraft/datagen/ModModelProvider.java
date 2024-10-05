package com.github.tajeru.parthenoncraft.datagen;

import com.github.tajeru.parthenoncraft.block.ModBlocks;
import com.github.tajeru.parthenoncraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    //　textures/models/itemの.jsonを自動生成してくれる
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TELEPORT_BLOCK);

    }

    @Override
    //　textures/models/itemの.jsonを自動生成してくれる
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    itemModelGenerator.register(ModItems.FLUORITE, Models.GENERATED);
    itemModelGenerator.register(ModItems.ROW_FLUORITE, Models.GENERATED);
    itemModelGenerator.register(ModItems.CLERIC_TOOTH, Models.GENERATED);
    itemModelGenerator.register(ModItems.FORMER_HOLY_WATER, Models.GENERATED);
    itemModelGenerator.register(ModItems.GRAIL_FRAGMENT, Models.GENERATED);
    itemModelGenerator.register(ModItems.MEMORY, Models.GENERATED);
    itemModelGenerator.register(ModItems.HUMAN_BONE, Models.GENERATED);
    itemModelGenerator.register(ModItems.SOMEONES_DIARY, Models.GENERATED);
    itemModelGenerator.register(ModItems.RED_STRING, Models.GENERATED);


    }
}
