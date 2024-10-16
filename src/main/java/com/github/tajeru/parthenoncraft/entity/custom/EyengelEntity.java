package com.github.tajeru.parthenoncraft.entity.custom;

import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.EnumSet;

public class EyengelEntity extends PathAwareEntity {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public AnimationState attackAnimationState = new AnimationState();
    public AnimationState hurtAnimationState = new AnimationState();
    public AnimationState deathAnimationState = new AnimationState();

    public EyengelEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
        this.moveControl = new EyengelMoveControl(this);  // カスタムMoveControlを追加
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new FlyGoal(this, 1.0));  // 飛行行動の追加
        this.goalSelector.add(2, new ChargeTargetGoal());  // 突進攻撃
        this.goalSelector.add(3, new MeleeAttackGoal(this, 1.0, false)); // 近接攻撃
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, PlayerEntity.class, true)); // プレイヤーをターゲット
        this.targetSelector.add(2, new RevengeGoal(this)); // 攻撃してきた対象に復讐
    }

    @Override
    public void tick() {
        super.tick();
        this.setNoGravity(true);  // 常に浮遊

        // 地面との距離を1マス空けるためのコード
        if (this.getY() - this.getEntityWorld().getBottomY() < 3.0) {
            this.setPosition(this.getX(), this.getEntityWorld().getBottomY() + 3.0, this.getZ());  // 高さを1ブロックに設定
        }

        // ターゲットが存在する場合、その方向に回転
        LivingEntity target = this.getTarget();
        if (target != null) {
            // ターゲットの方向（Yaw）を計算
            double dx = target.getX() - this.getX();
            double dz = target.getZ() - this.getZ();
            float targetYaw = (float) (MathHelper.atan2(dz, dx) * (180.0 / Math.PI)) - 90.0F;

            // 現在のYaw
            float currentYaw = this.getYaw();

            // 回転速度を制限
            float maxTurnSpeed = 10.0f;  // 1ティックあたりの最大回転角度
            float yawDifference = MathHelper.wrapDegrees(targetYaw - currentYaw);


            // 回転速度を制限しながら回転
            if (Math.abs(yawDifference) > maxTurnSpeed) {
                if (yawDifference > 0) {
                    this.setYaw(currentYaw + maxTurnSpeed);
                } else {
                    this.setYaw(currentYaw - maxTurnSpeed);
                }
            } else {
                this.setYaw(targetYaw);  // ターゲットの方向に自然な回転で向く
            }

            // `bodyYaw`も調整
            this.bodyYaw = this.getYaw();
        }



        // 状態に応じてアニメーションの優先順位を管理
        if (this.getHealth() <= 0) {
            // 死亡アニメーションが優先される
            if (!this.deathAnimationState.isRunning()) {
                this.stopAllAnimations();  // 他のアニメーションをすべて停止
                this.deathAnimationState.start(this.age);  // 死亡アニメーションを開始
            }
        } else if (this.hurtTime > 0) {
            // ダメージアニメーション
            if (!this.hurtAnimationState.isRunning()) {
                this.stopAllAnimations();  // 他のアニメーションをすべて停止
                this.hurtAnimationState.start(this.age);  // ダメージアニメーションを開始
            }
        } else if (this.isAttacking()) {
            // 攻撃アニメーション
            if (!this.attackAnimationState.isRunning()) {
                this.stopAllAnimations();  // 他のアニメーションをすべて停止
                this.attackAnimationState.start(this.age);  // 攻撃アニメーションを開始
            }
        } else {
            // アイドルアニメーション
            if (!this.idleAnimationState.isRunning() && this.idleAnimationTimeout == 0) {
                this.stopAllAnimations();  // 他のアニメーションをすべて停止
                this.idleAnimationState.start(this.age);  // アイドルアニメーションを開始
                this.idleAnimationTimeout =40;  // ランダムに次のアイドル開始タイムを設定
            } else if (this.idleAnimationTimeout > 0) {
                this.idleAnimationTimeout--;  // アイドルタイムをデクリメント
            }
        }

        // ターゲットがいる場合は追尾、それ以外はランダム移動
        if (this.getTarget() != null) {

            this.moveControl.moveTo(target.getX(), target.getY(), target.getZ(), 1.0);
        } else {
            // ターゲットがいない場合はランダム移動
            double newX = this.getX() + (this.random.nextDouble() - 0.5) * 10.0;
            double newY = this.getY() + (this.random.nextDouble() - 0.5) * 2.0;
            double newZ = this.getZ() + (this.random.nextDouble() - 0.5) * 10.0;
            this.moveControl.moveTo(newX, newY, newZ, 1.0);
        }
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        if (super.damage(source, amount)) {
            this.hurtAnimationState.start(this.age);  // 被ダメージアニメーション
            return true;
        }
        return false;
    }

    @Override
    public void onDeath(DamageSource source) {
        super.onDeath(source);
        this.deathAnimationState.start(this.age);  // 死亡アニメーション
    }

    public boolean isDead() {
        return this.getHealth() <= 0;
    }

    private boolean isTakingDamage() {
        return this.hurtAnimationState.isRunning();
    }

    public AnimationState getAttackAnimationState() {
        return attackAnimationState;
    }

    public boolean isAttacking() {
        return this.attackAnimationState.isRunning();
    }

    // すべてのアニメーションを停止するメソッド
    private void stopAllAnimations() {
        this.idleAnimationState.stop();
        this.attackAnimationState.stop();
        this.hurtAnimationState.stop();
        this.deathAnimationState.stop();
    }

    // 突進攻撃のゴール
    private class ChargeTargetGoal extends Goal {
        public ChargeTargetGoal() {
            this.setControls(EnumSet.of(Control.MOVE));
        }

        @Override
        public boolean canStart() {
            LivingEntity target = EyengelEntity.this.getTarget();
            return target != null && target.isAlive() && !EyengelEntity.this.getMoveControl().isMoving() &&
                    EyengelEntity.this.random.nextInt(7) == 0 && EyengelEntity.this.squaredDistanceTo(target) > 4.0;
        }

        @Override
        public boolean shouldContinue() {
            return EyengelEntity.this.getMoveControl().isMoving() && EyengelEntity.this.getTarget() != null &&
                    EyengelEntity.this.getTarget().isAlive();
        }

        @Override
        public void start() {
            LivingEntity target = EyengelEntity.this.getTarget();
            if (target != null) {
                Vec3d targetPos = target.getEyePos();
                EyengelEntity.this.moveControl.moveTo(targetPos.x, targetPos.y, targetPos.z, 1.0);
            }
        }

        @Override
        public boolean shouldRunEveryTick() {
            return true;
        }

        @Override
        public void tick() {
            LivingEntity target = EyengelEntity.this.getTarget();
            if (target != null && EyengelEntity.this.getBoundingBox().intersects(target.getBoundingBox())) {
                EyengelEntity.this.tryAttack(target);
            }
        }
    }

    // カスタムMoveControl
    private class EyengelMoveControl extends MoveControl {
        public EyengelMoveControl(EyengelEntity owner) {
            super(owner);
        }

        @Override
        public void tick() {
            if (this.state == State.MOVE_TO) {
                Vec3d moveTo = new Vec3d(this.targetX - EyengelEntity.this.getX(),
                        this.targetY - EyengelEntity.this.getY(),
                        this.targetZ - EyengelEntity.this.getZ());
                double distance = moveTo.length();

                if (distance < EyengelEntity.this.getBoundingBox().getAverageSideLength()) {
                    this.state = State.WAIT;
                    EyengelEntity.this.setVelocity(EyengelEntity.this.getVelocity().multiply(0.5));
                } else {
                    EyengelEntity.this.setVelocity(EyengelEntity.this.getVelocity().add(moveTo.multiply(this.speed * 0.05 / distance)));
                    Vec3d velocity = EyengelEntity.this.getVelocity();
                    EyengelEntity.this.setYaw(-((float) MathHelper.atan2(velocity.x, velocity.z)) * 57.295776F);
                    EyengelEntity.this.bodyYaw = EyengelEntity.this.getYaw();
                }
            }
        }
    }

    public static DefaultAttributeContainer.Builder createMonsterMobAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 30)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 4);
    }
}
//nomal 20,0.4,3
