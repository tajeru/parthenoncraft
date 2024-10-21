package com.github.tajeru.parthenoncraft.block;

import com.github.tajeru.parthenoncraft.Parthenoncraft;
import com.github.tajeru.parthenoncraft.block.custom.*;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //ここに追加するブロックを書く。　音や、硬さ、適正ツールが設定できる。 Settingのスーパークラスからいろいろ選べる
    // customで個別に機能をついかしたものはnew Blockのところをnew OOBlockとする。ex) new TeleportBlock(Abstract...

        //特殊ブロック
    public static final Block TELEPORT_BLOCK = registerBlock("teleport_block",
            new TeleportBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS)
                    .strength(4f).requiresTool()));

    public static final Block VOID_CLOUD_BLOCK = registerBlock("void_cloud_block",
            new VoidCloudBlock(AbstractBlock.Settings.create().noCollision().strength(0.5f),200 ));


        //装飾ブロック
    public static final Block QUARTZ_BRICKS = registerBlock("quartz_bricks",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.NETHER_BRICKS)
                        .strength(3f).requiresTool()));

    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(),
                AbstractBlock.Settings.create().strength(1f).requiresTool()));

    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));

    public static final Block CALCITE_BUTTON = registerBlock("calcite_button",
            new ButtonBlock(BlockSetType.STONE, 10, AbstractBlock.Settings.create().requiresTool()));

    public static final Block CALCITE_PRESSURE_PLATE = registerBlock("calcite_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.create().requiresTool()));

    public static final Block CALCITE_FENCE = registerBlock("calcite_fence",
            new FenceBlock(AbstractBlock.Settings.create().requiresTool()));

    public static final Block CALCITE_FENCE_PILLAR = registerBlock("calcite_fence_pillar",
            new FenceBlock(AbstractBlock.Settings.create().requiresTool()));

    public static final Block CALCITE_FENCE_GATE = registerBlock("calcite_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().requiresTool()));

    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(AbstractBlock.Settings.create().requiresTool()));

    public  static final Block CALCITE_WALL_PILLAR = registerBlock("calcite_wall_pillar",
            new WallBlock(AbstractBlock.Settings.create().requiresTool()));







    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            new StairsBlock(ModBlocks.QUARTZ_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));

    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(3f).requiresTool()));

    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().requiresTool()));

    public static final Block QUARTZ_BRICK_WALL_PILLAR = registerBlock("quartz_brick_wall_pillar",
            new WallBlock(AbstractBlock.Settings.create().requiresTool()));

    public static final Block QUARTZ_FENCE = registerBlock("quartz_fence",
            new FenceBlock(AbstractBlock.Settings.create().requiresTool()));

    public static final Block QUARTZ_FENCE_PILLAR = registerBlock("quartz_fence_pillar",
            new FenceBlock(AbstractBlock.Settings.create().requiresTool()));

    public static final Block QUARTZ_FENCE_GATE = registerBlock("quartz_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().requiresTool()));

    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            new WallBlock(AbstractBlock.Settings.create().requiresTool()));

    public static final Block QUARTZ_WALL_PILLAR = registerBlock("quartz_wall_pillar",
            new WallBlock(AbstractBlock.Settings.create().requiresTool()));

    public static final Block QUARTZ_PILLAR_WALL = registerBlock("quartz_pillar_wall",
            new WallBlock(AbstractBlock.Settings.create().requiresTool()));

    public static final Block QUARTZ_PILLAR_WALL_PILLAR = registerBlock("quartz_pillar_wall_pillar",
            new WallBlock(AbstractBlock.Settings.create().requiresTool()));

    public static final Block QUARTZ_PILLAR_QUARTER = registerBlock("quartz_pillar_quarter",
            new QuartarBlock(AbstractBlock.Settings.create().requiresTool()));


    public static final Block CLOUD_BLOCK = registerBlock("cloud_block",
            new CloudBlock(AbstractBlock.Settings.create().strength(0.5f),200 ));

    public static final Block CLOUD_STAIRS  = registerBlock("cloud_stairs",
            new CloudStairs(ModBlocks.CLOUD_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(0.5f).requiresTool(), 200));

    public static final Block TELEPORT_CLOUD_STAIRS_START = registerBlock("teleport_cloud_stairs_start",
            new  TeleportCloudStairsStart(ModBlocks.CLOUD_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(10f).requiresTool()));

    public static final Block TELEPORT_CLOUD_STAIRS_END = registerBlock("teleport_cloud_stairs_end",
            new TeleportCloudStairsEnd(ModBlocks.CLOUD_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(10f).requiresTool()));

    public static final Block CLOUD_SLAB = registerBlock("cloud_slab",
            new CloudSlab(AbstractBlock.Settings.create().strength(0.5f).requiresTool(), 200));







    //ブロック追加の関数　さらに下のブロックアイテムをよびだしている。
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Parthenoncraft.MOD_ID, name), block);
    }

    //ブロックのアイテムとしての追加。上の関数から呼び出されている。
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Parthenoncraft.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    //mainクラスとの関係付け
    public static void registerModBlocks(){
        Parthenoncraft.LOGGER.info("Registering Mod Blocks for" + Parthenoncraft.MOD_ID);

    }
}
