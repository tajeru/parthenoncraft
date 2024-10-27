package com.github.tajeru.parthenoncraft.datagen;

import com.github.tajeru.parthenoncraft.block.ModBlocks;
import com.github.tajeru.parthenoncraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

import java.util.Optional;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    //　textures/models/itemの.jsonを自動生成してくれる
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //テクスチャの変数追加
        BlockStateModelGenerator.BlockTexturePool calciteTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CALCITE);
        BlockStateModelGenerator.BlockTexturePool quartzBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.QUARTZ_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smoothQuartzBlockTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_QUARTZ);
        BlockStateModelGenerator.BlockTexturePool quartzPillarBlockTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.QUARTZ_PILLAR);
        BlockStateModelGenerator.BlockTexturePool cloudBlockTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CLOUD_BLOCK);
        BlockStateModelGenerator.BlockTexturePool whiteQuartzTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_QUARTZ_BLOCK);
        //ここにブロックを追加
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TELEPORT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOID_CLOUD_BLOCK);


        calciteTexturePool.stairs(ModBlocks.CALCITE_STAIRS);
        calciteTexturePool.slab(ModBlocks.CALCITE_SLAB);
        calciteTexturePool.button(ModBlocks.CALCITE_BUTTON);
        calciteTexturePool.pressurePlate(ModBlocks.CALCITE_PRESSURE_PLATE);
        calciteTexturePool.fence(ModBlocks.CALCITE_FENCE);
        calciteTexturePool.fence(ModBlocks.CALCITE_FENCE_PILLAR);
        calciteTexturePool.fenceGate(ModBlocks.CALCITE_FENCE_GATE);
        calciteTexturePool.wall(ModBlocks.CALCITE_WALL);
        calciteTexturePool.wall(ModBlocks.CALCITE_WALL_PILLAR);

        quartzBricksTexturePool.stairs(ModBlocks.QUARTZ_BRICK_STAIRS);
        quartzBricksTexturePool.slab(ModBlocks.QUARTZ_BRICK_SLAB);
        quartzBricksTexturePool.wall(ModBlocks.QUARTZ_BRICK_WALL);
        quartzBricksTexturePool.wall(ModBlocks.QUARTZ_BRICK_WALL_PILLAR);

        smoothQuartzBlockTexturePool.fence(ModBlocks.QUARTZ_FENCE);
        smoothQuartzBlockTexturePool.fence(ModBlocks.QUARTZ_FENCE_PILLAR);
        smoothQuartzBlockTexturePool.fenceGate(ModBlocks.QUARTZ_FENCE_GATE);
        smoothQuartzBlockTexturePool.wall(ModBlocks.QUARTZ_WALL);
        smoothQuartzBlockTexturePool.wall(ModBlocks.QUARTZ_WALL_PILLAR);

        whiteQuartzTexturePool.stairs(ModBlocks.WHITE_QUARTZ_STAIRS);
        whiteQuartzTexturePool.slab(ModBlocks.WHITE_QUARTZ_SLAB);
        whiteQuartzTexturePool.fence(ModBlocks.WHITE_QUARTZ_FENCE);
        whiteQuartzTexturePool.fence(ModBlocks.WHITE_QUARTZ_FENCE_PILLAR);
        whiteQuartzTexturePool.wall(ModBlocks.WHITE_QUARTZ_WALL);
        whiteQuartzTexturePool.wall(ModBlocks.WHITE_QUARTZ_WALL_PILLAR);

        quartzPillarBlockTexturePool.wall(ModBlocks.QUARTZ_PILLAR_WALL);
        quartzPillarBlockTexturePool.wall(ModBlocks.QUARTZ_PILLAR_WALL_PILLAR);


        cloudBlockTexturePool.stairs(ModBlocks.CLOUD_STAIRS);
        cloudBlockTexturePool.slab(ModBlocks.CLOUD_SLAB);
        cloudBlockTexturePool.stairs(ModBlocks.TELEPORT_CLOUD_STAIRS_START);
        cloudBlockTexturePool.stairs(ModBlocks.TELEPORT_CLOUD_STAIRS_END);






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


        //スポーンエッグ
        itemModelGenerator.register(ModItems.MINOTAUR_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.register(ModItems.EYENGEL_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));




    }
}
