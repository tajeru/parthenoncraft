package com.github.tajeru.parthenoncraft.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.entity.Entity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

public class TeleportCloudStairsStart extends StairsBlock {

    // sブロックとeブロックのリンクを管理するためのマップ
    private static final Map<BlockPos, BlockPos> sToEMap = new HashMap<>();

    public TeleportCloudStairsStart(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }


    // sブロックを踏んだ際の処理
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClient && entity instanceof ServerPlayerEntity player) {
            // sブロックの座標から、リンクされたeブロックの座標を取得
            BlockPos eBlockPos = sToEMap.get(pos);
            if (eBlockPos != null) {
                // エンドディメンションへテレポート
                ServerWorld endWorld = player.getServer().getWorld(World.END);
                if (endWorld != null) {
                    Vec3d teleportPos = new Vec3d(eBlockPos.getX(), eBlockPos.getY() + 1, eBlockPos.getZ());
                    player.teleport(endWorld, teleportPos.x, teleportPos.y, teleportPos.z, player.getYaw(), player.getPitch());
                    player.sendMessage(Text.literal("Teleported to the End!"), false);
                }
            } else {
                player.sendMessage(Text.literal("No linked structure found!"), false);
            }
        }
    }

    // sブロックとeブロックをリンクするメソッド
    public static void linkBlocks(BlockPos sPos, BlockPos ePos) {
        sToEMap.put(sPos, ePos);
    }
}
