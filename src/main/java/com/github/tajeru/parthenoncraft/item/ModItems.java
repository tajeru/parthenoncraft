package com.github.tajeru.parthenoncraft.item;

import com.github.tajeru.parthenoncraft.Parthenoncraft;
import com.github.tajeru.parthenoncraft.entity.client.ModEntities;
import com.github.tajeru.parthenoncraft.item.costom.EntranceCompassItem;
import com.github.tajeru.parthenoncraft.item.costom.StateChangeWand;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

//Item登録
public class ModItems {

    //アイテムを追加
    public static final Item ENTRANCE_COMPASS = registerItem("entrance_compass",
            new EntranceCompassItem(new Item.Settings()));
    public static final Item STATE_CHANGE_WAND = registerItem("state_change_wand",
            new StateChangeWand(new Item.Settings()));


    //↓テンプレート
    public static final Item FLUORITE = registerItem("fluorite", new Item(new Item.Settings()));
    public static final Item ROW_FLUORITE = registerItem("raw_fluorite", new Item(new Item.Settings()));
    public static final Item CLERIC_TOOTH = registerItem("cleric_tooth", new Item(new Item.Settings()));
    public static final Item FORMER_HOLY_WATER = registerItem("former_holy_water", new Item(new Item.Settings()));
    public static final Item GRAIL_FRAGMENT= registerItem("grail_fragment", new Item(new Item.Settings()));
    public static final Item MEMORY = registerItem("memory", new Item(new Item.Settings()));
    public static final Item HUMAN_BONE = registerItem("human_bone", new Item(new Item.Settings()));
    public static final Item SOMEONES_DIARY = registerItem("someones_diary", new Item(new Item.Settings()));
    public static final Item RED_STRING = registerItem("red_string", new Item(new Item.Settings()));

    //スポーンブロック追加
    public static final Item MINOTAUR_SPAWN_EGG = registerItem("minotaur_spawn_egg",
            new SpawnEggItem(ModEntities.MINOTAUR, 0x340000, 0xe9f00e, new Item.Settings()));

    public static final Item EYENGEL_SPAWN_EGG = registerItem("eyengel_spawn_egg",
            new SpawnEggItem(ModEntities.EYENGEL, 0xfafafa, 0xfbf96e, new Item.Settings()));


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
