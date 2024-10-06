package com.github.tajeru.parthenoncraft.world.dimension;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.TeleportTarget;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class ParthenonDimensionHandler {

    // 最低高度を超えたときの処理n
    public static void checkPlayerHeight(ServerPlayerEntity player) {
        // プレイヤーがいるディメンションがparthenonか確認
        if (player.getWorld().getRegistryKey().getValue().equals(Identifier.of("parthenoncraft", "parthenondim"))) {
            // 最低高度をチェック
            if (player.getY() < 64) {  // -64は最低高度の例です
                System.out.println("Player is below Y=64, teleporting to overworld.");
                // オーバーワールドへの転送
                teleportToOverworld(player);
            }
        }
    }

    private static void teleportToOverworld(ServerPlayerEntity player) {
        ServerWorld overworld = player.getServer().getWorld(World.OVERWORLD);
        if (overworld != null) {
            // オーバーワールドの最大高度を取得し、最大319に設定
            int maxY = overworld.getHeight();
            TeleportTarget target = getTeleportTarget(player, maxY, overworld);

            // プレイヤーをオーバーワールドに転送
            player.teleport(overworld, target.pos().x, target.pos().y, target.pos().z, target.yaw(), target.pitch());
        }
    }

    private static @NotNull TeleportTarget getTeleportTarget(ServerPlayerEntity player, int maxY, ServerWorld overworld) {
        int teleportY = Math.min(maxY, 319);  // 高度限界付近に転送

        // PostDimensionTransition設定
        TeleportTarget.PostDimensionTransition postTransition = entity -> {
            // 転送後の追加処理（必要であればここにロジックを追加）
        };

        // TeleportTargetの設定
        TeleportTarget target = new TeleportTarget(
                overworld,
                new Vec3d(player.getX(), teleportY, player.getZ()),  // 転送先の座標
                Vec3d.ZERO,  // 速度はゼロに設定
                player.getYaw(),  // プレイヤーの向きを維持
                player.getPitch(),  // プレイヤーの俯角を維持
                postTransition  // PostDimensionTransitionを追加
        );
        return target;
    }
}

