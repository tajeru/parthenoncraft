package com.github.tajeru.parthenoncraft.item;

import com.github.tajeru.parthenoncraft.Parthenoncraft;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

//Item登録
public class ModItems {

    //アイテムを追加
    //↓テンプレート
    public static final Item FLUORITE = registerItem("fluorite", new Item(new Item.Settings()));
    public static final Item ROW_FLUORITE = registerItem("raw_fluorite", new Item(new Item.Settings()));

    //アイテム登録を行う関数　基本触らない。
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Parthenoncraft.MOD_ID, name), item);
    }

    //クリエイティブモードのインベントリに追加するための処理。ここにも追加　Ingredients=材料
    private static void customIngredients(FabricItemGroupEntries entries){
        entries.add(FLUORITE);
        entries.add(ROW_FLUORITE);
    }

    //ModItemsと main class をリンク付け　基本触らない？かな
    public static void registerModItems(){
        Parthenoncraft.LOGGER.info("Registering Mod Items for" + Parthenoncraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
    }
}
