package com.github.tajeru.parthenoncraft.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;


public class TeleportBlock extends Block {
    public TeleportBlock(Settings settings) {
        super(settings);
    }


    //ここに追加したい機能を書く　むいてる方向に100マス移動する機能
    // onUse=右クリック, OnEntityCollision=接触
    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos,
                                 PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient) { // サーバーサイドでのみ実行
            if (player instanceof ServerPlayerEntity) {
                // プレイヤーの向きを取得
                Vec3d lookVec = player.getRotationVec(1.0F);

                // 向いている方向に100ブロック移動した位置を計算
                double targetX = player.getX() + lookVec.x * 100;
                double targetY = player.getY() + lookVec.y * 100;
                double targetZ = player.getZ() + lookVec.z * 100;

                // プレイヤーをテレポート（強制的にテレポート、地面のチェックを無視）
                player.requestTeleport(targetX, targetY, targetZ);  // 地面チェックをせずにテレポート

                // テレポート成功のフィードバック
                return ActionResult.SUCCESS;
            }
        }

        // クライアントサイドやテレポートが失敗した場合の通常の処理
        return super.onUse(state, world, pos, player, hit);
    }

}



