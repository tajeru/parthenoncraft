package com.github.tajeru.parthenoncraft.world.gen;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkManager;
import net.minecraft.world.dimension.DimensionType;

public class ModWorldGeneration {
    public static void generateModWorldGeneration() {


        ServerWorldEvents.LOAD.register(ModWorldGeneration::onWorldLoad);
        }

        private static void onWorldLoad(MinecraftServer server, ServerWorld world) {
            // オーバーワールドとエンドディメンションがロードされたときに生成
            ServerWorld overworld = server.getWorld(World.OVERWORLD);
            ServerWorld endWorld = server.getWorld(World.END);

            if (overworld != null && endWorld != null) {
                ModBlockGeneration.generateStairsAndLink(overworld, endWorld);
            }
        }



}


