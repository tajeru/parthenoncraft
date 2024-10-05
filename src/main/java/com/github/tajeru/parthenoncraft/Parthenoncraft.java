package com.github.tajeru.parthenoncraft;

import com.github.tajeru.parthenoncraft.block.ModBlocks;
import com.github.tajeru.parthenoncraft.item.ModItemGroups;
import com.github.tajeru.parthenoncraft.item.ModItems;
import com.github.tajeru.parthenoncraft.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Parthenoncraft implements ModInitializer {

    //modIDの定義。他のファイルでparthenoncraftの代わりにMOD_IDを使用する。
    public static final String MOD_ID = "parthenoncraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    //各クラスファイルの呼び出し、関連付け
    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();


        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModWorldGeneration.generateModWorldGeneration();
    }
}
