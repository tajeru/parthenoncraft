package com.github.tajeru.parthenoncraft.event;

import com.github.tajeru.parthenoncraft.world.dimension.ParthenonDimensionHandler;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.network.ServerPlayerEntity;

public class ModEventHandler {

    public static void registerEvents() {
        // サーバーの各ティックでプレイヤーの位置を監視
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            // 全てのプレイヤーをチェック
            for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()){
                //高度を確認
                ParthenonDimensionHandler.checkPlayerHeight(player);
            }
        });
    }
}
