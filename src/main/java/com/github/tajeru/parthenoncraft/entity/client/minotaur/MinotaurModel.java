package com.github.tajeru.parthenoncraft.entity.client.minotaur;

import com.github.tajeru.parthenoncraft.entity.client.animation.MinotaurAnimations;
import com.github.tajeru.parthenoncraft.entity.custom.MinotaurEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class MinotaurModel extends SinglePartEntityModel<MinotaurEntity> {
    private final ModelPart all;
    private final ModelPart head;

    public MinotaurModel(ModelPart root) {
        this.all = root.getChild("all");
        this.head = this.all.getChild("top_body").getChild("head");

    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData all = modelPartData.addChild("all", ModelPartBuilder.create(), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        ModelPartData top_body = all.addChild("top_body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -10.0F, -3.0F));

        ModelPartData head = top_body.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-13.0F, -23.9F, -10.8F, 26.0F, 25.0F, 24.0F, new Dilation(0.0F))
                .uv(44, 101).cuboid(-21.0F, -35.9F, -2.8F, 5.0F, 19.0F, 5.0F, new Dilation(0.0F))
                .uv(104, 71).cuboid(-21.0F, -16.9F, -2.8F, 8.0F, 3.0F, 5.0F, new Dilation(0.0F))
                .uv(104, 79).cuboid(13.0F, -16.9F, -2.8F, 8.0F, 3.0F, 5.0F, new Dilation(0.0F))
                .uv(64, 101).cuboid(16.0F, -35.9F, -2.8F, 5.0F, 19.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -37.7967F, 2.7473F));

        ModelPartData body = top_body.addChild("body", ModelPartBuilder.create().uv(0, 49).cuboid(-10.0F, -27.25F, -6.0F, 19.75F, 27.25F, 11.5F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -9.6967F, 3.9473F));

        ModelPartData R_arms = top_body.addChild("R_arms", ModelPartBuilder.create(), ModelTransform.pivot(17.0F, -33.6967F, 3.9473F));

        ModelPartData R_up_arm = R_arms.addChild("R_up_arm", ModelPartBuilder.create().uv(0, 87).cuboid(9.75F, -45.0F, -11.0F, 10.0F, 14.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(-17.0F, 44.0F, 4.0F));

        ModelPartData R_down_arm = R_arms.addChild("R_down_arm", ModelPartBuilder.create(), ModelTransform.pivot(-17.0F, 44.0F, 4.0F));

        ModelPartData cube_r1 = R_down_arm.addChild("cube_r1", ModelPartBuilder.create().uv(100, 0).cuboid(-10.0F, -24.0F, -11.0F, 10.0F, 14.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(19.75F, -9.0F, 3.0F, 0.1309F, 0.0F, 0.0F));

        ModelPartData L_arms = top_body.addChild("L_arms", ModelPartBuilder.create(), ModelTransform.pivot(-13.0F, -30.6967F, 2.9473F));

        ModelPartData L_up_arm = L_arms.addChild("L_up_arm", ModelPartBuilder.create().uv(60, 49).cuboid(-21.0F, -45.0F, -11.0F, 10.0F, 14.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(14.0F, 41.0F, 5.5F));

        ModelPartData L_down_arm = L_arms.addChild("L_down_arm", ModelPartBuilder.create(), ModelTransform.pivot(13.0F, 41.0F, 5.5F));

        ModelPartData cube_r2 = L_down_arm.addChild("cube_r2", ModelPartBuilder.create().uv(60, 75).cuboid(-10.0F, -24.0F, -11.0F, 10.0F, 14.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-10.0F, -9.0F, 3.0F, 0.1309F, 0.0F, 0.0F));

        ModelPartData down_body = all.addChild("down_body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -20.0F, 0.0F));

        ModelPartData R_regs = down_body.addChild("R_regs", ModelPartBuilder.create(), ModelTransform.pivot(4.0F, 0.0F, 0.0F));

        ModelPartData R_top_reg = R_regs.addChild("R_top_reg", ModelPartBuilder.create().uv(84, 101).cuboid(-4.0F, -9.7F, 0.2F, 8.0F, 10.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 9.7F, -2.7F));

        ModelPartData R_down_reg = R_regs.addChild("R_down_reg", ModelPartBuilder.create().uv(100, 26).cuboid(-4.0F, -10.0F, -2.5F, 8.0F, 10.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 20.0F, 0.0F));

        ModelPartData L_regs = down_body.addChild("L_regs", ModelPartBuilder.create(), ModelTransform.pivot(-3.0F, 1.0F, 0.0F));

        ModelPartData L_top_reg = L_regs.addChild("L_top_reg", ModelPartBuilder.create().uv(104, 41).cuboid(-4.0F, -10.0F, 0.0F, 8.0F, 10.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 9.0F, -2.5F));

        ModelPartData L_down_reg = L_regs.addChild("L_down_reg", ModelPartBuilder.create().uv(104, 56).cuboid(-8.0F, -10.0F, -2.5F, 8.0F, 10.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 19.0F, 0.0F));
        return TexturedModelData.of(modelData, 144, 144);
    }
    @Override
    public void setAngles(MinotaurEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.detHeadAngles(headPitch, netHeadYaw);

        this.animateMovement(MinotaurAnimations.ANIM_MINOTAUR_WALK, limbSwing, limbSwing, 2f,2f );
        this.updateAnimation(entity.idleAnimationState, MinotaurAnimations.ANIM_MINOTAUR_IDLE, ageInTicks, 1f);

        //攻撃モーションの追加
        this.updateAnimation(entity.attackAnimationState, MinotaurAnimations.ANIM_MINOTAUR_ATTACK, ageInTicks, 1f);

        // ダメージアニメーション
        this.updateAnimation(entity.damageAnimationState, MinotaurAnimations.ANIM_MINOTAUR_DAMAGED, ageInTicks, 1f);

        // 死亡アニメーション
        this.updateAnimation(entity.deathAnimationState, MinotaurAnimations.ANIM_MINOTAUR_DEAD, ageInTicks, 1f);
    }

    private  void detHeadAngles(float netHeadYaw, float headPitch){
        netHeadYaw = MathHelper.clamp(netHeadYaw, -30.0f,30.0f);
        headPitch = MathHelper.clamp(headPitch, -25f,45f);

        this.head.yaw = netHeadYaw * 0.017453292f;
        this.head.pitch = headPitch * 0.017453292f;

    }


    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        all.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return all;
    }
}
