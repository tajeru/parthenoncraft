package com.github.tajeru.parthenoncraft.goal;
import net.minecraft.block.Block;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.EnumSet;

public class ReturnToBlockGoal extends Goal {
    private final MobEntity mob;
    private final Block targetBlock;
    private BlockPos targetBlockPos;

    public ReturnToBlockGoal(MobEntity mob, Block targetBlock) {
        this.mob = mob;
        this.targetBlock = targetBlock;
        this.setControls(EnumSet.of(Control.MOVE));
    }

    @Override
    public boolean canStart() {
        // 周囲に目的のブロックがあるかを探す
        this.targetBlockPos = findTargetBlock(this.mob.getWorld(), this.targetBlock);
        return this.targetBlockPos != null;
    }

    @Override
    public void start() {
        // 目的のブロックの1マス上に移動する
        if (this.targetBlockPos != null) {
            BlockPos blockAboveTarget = this.targetBlockPos.up(); // ブロックの上の位置
            this.mob.getNavigation().startMovingTo(blockAboveTarget.getX(), blockAboveTarget.getY(), blockAboveTarget.getZ(), 1.0D);
        }
    }

    @Override
    public boolean shouldContinue() {
        // ブロックの真上に到着するまでゴールを継続する
        if (this.targetBlockPos == null) return false;

        BlockPos blockAboveTarget = this.targetBlockPos.up(); // ブロックの上の位置
        return !this.mob.getBlockPos().isWithinDistance(blockAboveTarget, 1.0);
    }

    @Override
    public void stop() {
        // ゴールを中断した際の動作
        this.targetBlockPos = null;
    }

    private BlockPos findTargetBlock(World world, Block targetBlock) {
        BlockPos mobPos = this.mob.getBlockPos();  // モブの現在の位置を取得

        // 探索範囲を指定（半径20ブロック以内）
        int radius = 20;

        // 指定された範囲をスキャンして、指定したブロックを探す
        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos checkPos = mobPos.add(x, y, z);  // 周囲の座標を生成
                    if (world.getBlockState(checkPos).getBlock() == targetBlock) {
                        return checkPos;  // 目的のブロックを見つけた場合、その位置を返す
                    }
                }
            }
        }

        return null;  // 指定したブロックが見つからなかった場合
    }
}
