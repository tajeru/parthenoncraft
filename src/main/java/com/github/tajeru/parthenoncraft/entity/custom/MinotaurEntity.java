package com.github.tajeru.parthenoncraft.entity.custom;


import com.github.tajeru.parthenoncraft.goal.ReturnToBlockGoal;
import net.minecraft.block.Blocks;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class MinotaurEntity extends PathAwareEntity{
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public AnimationState attackAnimationState = new AnimationState();
    public AnimationState damageAnimationState = new AnimationState();
    public AnimationState deathAnimationState = new AnimationState();



    public MinotaurEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }



    protected void initGoals() {
        // 優先度1: プレイヤーなどを攻撃
        this.goalSelector.add(2, new MeleeAttackGoal(this, 1.0, false)); // 近接攻撃

        // 優先度2: ターゲットを確認し、プレイヤーを追いかける
        this.targetSelector.add(2, new ActiveTargetGoal(this, PlayerEntity.class, true)); // プレイヤーをターゲット
        this.targetSelector.add(3, new RevengeGoal(this, new Class[0])); // 攻撃してきた対象を追いかける

        // 優先度3: 必要なら水に入ると泳ぐ
        this.goalSelector.add(1, new SwimGoal(this)); // 水に落ちたとき泳ぐ
        this.goalSelector.add(4, new ReturnToBlockGoal(this, Blocks.DIAMOND_BLOCK));

        // 優先度4: 周りを見渡す、対象を見る
        this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F)); // 対象を見る
        this.goalSelector.add(7, new LookAroundGoal(this)); // 周囲を見渡す

        // 優先度5: 目的がない場合に俳諧する
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 0.8)); // ランダムに歩き回る
    }


    private void setupAnimationStates(){
        if(this.idleAnimationTimeout <= 0){
            this.idleAnimationTimeout = 40; //アイドルアニメーションの秒数　1秒=20
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }

    }


    @Override
    public void tick() {
        super.tick();
        if (!this.getWorld().isClient && this.age % 5 == 0) {
            this.updateGoalControls();
        }
        if(this.getWorld().isClient()){
            this.setupAnimationStates();
        }

    }
    @Override
    public boolean tryAttack(Entity target) {
        boolean success = super.tryAttack(target);
        if(success){
            this.attackAnimationState.start(this.age);
        }
        return success;
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        boolean isDamaged = super.damage(source, amount);
        if (isDamaged) {
            this.damageAnimationState.start(this.age); // 被ダメージアニメーションを発動
        }
        return isDamaged;
    }

    @Override
    public void onDeath(DamageSource source) {
        super.onDeath(source);
        this.deathAnimationState.start(this.age); // 死亡アニメーションを発動
    }





    public static DefaultAttributeContainer.Builder createMonsterMobAttributes(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 30)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.3)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE,4);

    }
}
