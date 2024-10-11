package com.github.tajeru.parthenoncraft;

import com.github.tajeru.parthenoncraft.block.ModBlocks;
import com.github.tajeru.parthenoncraft.event.ModEventHandler;
import com.github.tajeru.parthenoncraft.item.ModItemGroups;
import com.github.tajeru.parthenoncraft.item.ModItems;
import com.github.tajeru.parthenoncraft.structure.ModStructures;
import com.github.tajeru.parthenoncraft.structure.custom.CreateSkytowerStructure;
import com.github.tajeru.parthenoncraft.world.dimension.ModDimensions;
import com.github.tajeru.parthenoncraft.world.gen.ModStructuresGeneration;
import com.github.tajeru.parthenoncraft.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Parthenoncraft implements ModInitializer {

    //modIDの定義。他のファイルでparthenoncraftの代わりにMOD_IDを使用する。
    public static final String MOD_ID = "parthenoncraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    //各クラスファイルの呼び出し、関連付け
    @Override
    public void onInitialize() {

        //ワールド情報を取得
        ServerLifecycleEvents.SERVER_STARTED.register((MinecraftServer server) -> {
                    ServerWorld overworld = server.getWorld(World.OVERWORLD);
                    ServerWorld nether = server.getWorld(World.NETHER);
                    ServerWorld end = server.getWorld(World.END);
                    ServerWorld parthenon = server.getWorld(ModDimensions.PARTHENONDIM_LEVEL_KEY);

            //パルテノンディメンションがあるなら生成
            if (overworld != null) {
                CreateSkytowerStructure skyTower = new CreateSkytowerStructure();
                skyTower.placeStructure(overworld, overworld.getChunkManager().getChunkGenerator(), overworld.getRandom(), new BlockPos(100, 100, 100));
            }else{
                LOGGER.error("Parthenon Dimension is null");
            }
        });


        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModWorldGeneration.generateModWorldGeneration();







        ModEventHandler.registerEvents();
    }
}
