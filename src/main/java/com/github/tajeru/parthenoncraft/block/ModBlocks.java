package com.github.tajeru.parthenoncraft.block;

import com.github.tajeru.parthenoncraft.Parthenoncraft;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //ここに追加するブロックを書く。　音や、硬さ、適正ツールが設定できる。 Settingのスーパークラスからいろいろ選べる
        public static final Block QUARTZ_BRICKS = registerBlock("quartz_bricks",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.NETHER_BRICKS)
                    .strength(3f).requiresTool()));


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
