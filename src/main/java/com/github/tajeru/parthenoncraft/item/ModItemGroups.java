package com.github.tajeru.parthenoncraft.item;

import com.github.tajeru.parthenoncraft.Parthenoncraft;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {


    //クリエイティブタブの追加　アイコンの画像やタブの名前の定義 keyは翻訳で使用。
        //このタグではフローライトをアイコンとしたタブを追加 サンプル
    public static final ItemGroup FLUORITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Parthenoncraft.MOD_ID, "fluorite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fluorite"))
                    .icon(() -> new ItemStack(ModItems.FLUORITE)).entries((displayContext, entries) -> {
                        //ここにタブ内に表示するアイテムを列挙
                    entries.add(ModItems.FLUORITE);
                    entries.add(ModItems.ROW_FLUORITE);


                    }).build());


    public static final ItemGroup PARTHENONCRAFT = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Parthenoncraft.MOD_ID, "fluorite_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.parthenoncraft"))
                    .icon(() -> new ItemStack(ModItems.ROW_FLUORITE)).entries((displayContext, entries) -> {
                        //ここにタブ内に表示するアイテムを列挙
                        entries.add(ModItems.CLERIC_TOOTH);
                        entries.add(ModItems.FORMER_HOLY_WATER);
                        entries.add(ModItems.GRAIL_FRAGMENT);
                        entries.add(ModItems.MEMORY);
                        entries.add(ModItems.HUMAN_BONE);
                        entries.add(ModItems.SOMEONES_DIARY);
                        entries.add(ModItems.RED_STRING);



                    }).build());



    //main classと関係付け
    public static void registerItemGroups(){
        Parthenoncraft.LOGGER.info("Registering Item Groups for " + Parthenoncraft.MOD_ID);
    }

}
