package com.github.tajeru.parthenoncraft.item;

import com.github.tajeru.parthenoncraft.Parthenoncraft;
import com.github.tajeru.parthenoncraft.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {


    //クリエイティブタブの追加　アイコンの画像やタブの名前の定義 keyは翻訳で使用。
    public static final ItemGroup PARTHENONCRAFT = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Parthenoncraft.MOD_ID, "parthenoncreft_all"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.parthenoncraft"))
                    .icon(() -> new ItemStack(ModBlocks.QUARTZ_BRICKS)).entries((displayContext, entries) -> {
                        //ここにタブ内に表示するアイテムを列挙
                        entries.add(ModItems.CLERIC_TOOTH);
                        entries.add(ModItems.FORMER_HOLY_WATER);
                        entries.add(ModItems.GRAIL_FRAGMENT);
                        entries.add(ModItems.MEMORY);
                        entries.add(ModItems.HUMAN_BONE);
                        entries.add(ModItems.SOMEONES_DIARY);
                        entries.add(ModItems.RED_STRING);


                        entries.add(ModBlocks.QUARTZ_BRICKS);
                        entries.add(ModBlocks.QUARTZ_BRICK_STAIRS);
                        entries.add(ModBlocks.QUARTZ_BRICK_SLAB);
                        entries.add(ModBlocks.QUARTZ_BRICK_WALL);
                        entries.add(ModBlocks.QUARTZ_WALL);
                        entries.add(ModBlocks.QUARTZ_FENCE);
                        entries.add(ModBlocks.QUARTZ_FENCE_GATE);


                        entries.add(ModBlocks.CALCITE_STAIRS);
                        entries.add(ModBlocks.CALCITE_SLAB);
                        entries.add(ModBlocks.CALCITE_BUTTON);
                        entries.add(ModBlocks.CALCITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.CALCITE_FENCE);
                        entries.add(ModBlocks.CALCITE_FENCE_GATE);
                        entries.add(ModBlocks.CALCITE_WALL);

                        entries.add(ModBlocks.CLOUD_BLOCK);
                        entries.add(ModBlocks.CLOUD_STAIRS);
                        entries.add(ModBlocks.CLOUD_SLAB);

                    }).build());

    public static final ItemGroup PARTHENONCRAFT_DEBUG = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Parthenoncraft.MOD_ID, "parthenoncraft_debug"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.parthenoncraft_debug"))
                    .icon(() -> new ItemStack(ModBlocks.TELEPORT_BLOCK)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.TELEPORT_BLOCK);
                        entries.add(ModBlocks.VOID_CLOUD_BLOCK);
                        entries.add(ModBlocks.TELEPORT_CLOUD_STAIRS_START);
                        entries.add(ModBlocks.TELEPORT_CLOUD_STAIRS_END);
                        entries.add(ModBlocks.QUARTZ_WALL_PILLAR);
                        entries.add(ModBlocks.QUARTZ_BRICK_WALL_PILLAR);
                        entries.add(ModBlocks.CALCITE_WALL_PILLAR);
                        entries.add(ModBlocks.QUARTZ_FENCE_PILLAR);
                        entries.add(ModBlocks.CALCITE_FENCE_PILLAR);

                            }).build());
    //main classと関係付け
    public static void registerItemGroups(){
        Parthenoncraft.LOGGER.info("Registering Item Groups for " + Parthenoncraft.MOD_ID);
    }

}
