package com.github.tajeru.parthenoncraft.item.costom;

import com.github.tajeru.parthenoncraft.block.custom.StatueBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

public class StateChangeWand extends Item {
    public StateChangeWand(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockState state = world.getBlockState(context.getBlockPos());
        PlayerEntity player = context.getPlayer();

        if (!world.isClient() && player != null) {
            if (state.getBlock() instanceof StatueBlock) {
                // 現在のポーズを取得し、次のポーズに変更
                StatueBlock.Pose currentPose = state.get(StatueBlock.POSE);
                StatueBlock.Pose nextPose = getNextPose(currentPose);

                // 新しいブロックステートを設定
                BlockState newState = state.with(StatueBlock.POSE, nextPose);
                world.setBlockState(context.getBlockPos(), newState);

                // アイテムを消費する処理が不要な場合
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }

    // 次のポーズを取得するメソッド
    private StatueBlock.Pose getNextPose(StatueBlock.Pose currentPose) {
        switch (currentPose) {
            case DEFAULT:
                return StatueBlock.Pose.POSE1;
            case POSE1:
                return StatueBlock.Pose.POSE2;
            case POSE2:
                return StatueBlock.Pose.POSE3;
            case POSE3:
            default:
                return StatueBlock.Pose.DEFAULT;
        }
    }
}
