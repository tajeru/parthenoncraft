package com.github.tajeru.parthenoncraft.entity.client.eyengel;

import com.github.tajeru.parthenoncraft.entity.client.animation.EyengelAnimations;
import com.github.tajeru.parthenoncraft.entity.custom.EyengelEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class EyengelModel extends SinglePartEntityModel<EyengelEntity> {

    private final ModelPart body;
    private final ModelPart head;

    public EyengelModel(ModelPart root) {
        this.body = root.getChild("body");
        this.head = this.body.getChild("head");

    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData wings = body.addChild("wings", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -5.0F, -4.0F));

        ModelPartData l_wing = wings.addChild("l_wing", ModelPartBuilder.create(), ModelTransform.pivot(-2.325F, -0.8F, 0.025F));

        ModelPartData l_top_wing = l_wing.addChild("l_top_wing", ModelPartBuilder.create(), ModelTransform.pivot(-0.0098F, 0.0126F, 0.0F));

        ModelPartData l_up_wing_frame_r1 = l_top_wing.addChild("l_up_wing_frame_r1", ModelPartBuilder.create().uv(94, 46).cuboid(-4.0F, -1.0F, -1.0F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.6652F, -1.2126F, 0.5F, 0.0F, 0.0F, 0.8727F));

        ModelPartData l_top_wing_feather = l_top_wing.addChild("l_top_wing_feather", ModelPartBuilder.create(), ModelTransform.pivot(-1.6652F, -1.2126F, 0.5F));

        ModelPartData feather_r1 = l_top_wing_feather.addChild("feather_r1", ModelPartBuilder.create().uv(72, 94).cuboid(0.0F, -1.0F, -1.0F, 3.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.85F, 0.0F, 0.0F, 0.8727F));

        ModelPartData feather_r2 = l_top_wing_feather.addChild("feather_r2", ModelPartBuilder.create().uv(10, 88).cuboid(0.0F, -1.0F, -1.0F, 3.0F, 7.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-2.1F, -2.65F, 0.725F, 0.0F, 0.0F, 1.309F));

        ModelPartData feather_r3 = l_top_wing_feather.addChild("feather_r3", ModelPartBuilder.create().uv(98, 54).cuboid(0.0F, -1.0F, -1.0F, 3.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.8F, 0.3F, 0.2F, 0.0F, 0.0F, 0.5236F));

        ModelPartData feather_r4 = l_top_wing_feather.addChild("feather_r4", ModelPartBuilder.create().uv(40, 98).cuboid(-1.0F, -1.0F, -1.0F, 5.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-2.2F, -2.2F, 0.075F, 0.0F, 0.0F, 1.0908F));

        ModelPartData l_mid_wing = l_top_wing.addChild("l_mid_wing", ModelPartBuilder.create(), ModelTransform.of(-3.7194F, -4.4931F, -0.25F, 0.0F, 0.0F, 1.2217F));

        ModelPartData l_mid_wing_frame_r1 = l_mid_wing.addChild("l_mid_wing_frame_r1", ModelPartBuilder.create().uv(86, 36).cuboid(-7.006F, -0.582F, -0.5F, 7.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.2103F, 0.2164F, 0.25F, 0.0F, 0.0F, 0.2182F));

        ModelPartData l_down_wing = l_mid_wing.addChild("l_down_wing", ModelPartBuilder.create(), ModelTransform.of(-6.3787F, -1.3104F, 0.25F, 0.0F, 0.0F, 0.0436F));

        ModelPartData l_down_wing_frame_r1 = l_down_wing.addChild("l_down_wing_frame_r1", ModelPartBuilder.create().uv(8, 86).cuboid(-10.6225F, -0.4306F, -0.5F, 11.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.2795F, -0.2691F, 0.0F, 0.0F, 0.0F, 0.5236F));

        ModelPartData l_down_wing_feather = l_down_wing.addChild("l_down_wing_feather", ModelPartBuilder.create(), ModelTransform.pivot(-0.6823F, -2.1608F, -0.25F));

        ModelPartData feather_r5 = l_down_wing_feather.addChild("feather_r5", ModelPartBuilder.create().uv(90, 86).cuboid(-10.6225F, -0.4306F, 0.0F, 5.0F, 12.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5529F, 1.8917F, 0.6F, 0.0F, 0.0F, 0.48F));

        ModelPartData feather_r6 = l_down_wing_feather.addChild("feather_r6", ModelPartBuilder.create().uv(52, 93).cuboid(-4.6225F, -1.4306F, 0.0F, 5.0F, 13.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5471F, 1.5917F, 0.575F, 0.0F, 0.0F, 0.2095F));

        ModelPartData feather_r7 = l_down_wing_feather.addChild("feather_r7", ModelPartBuilder.create().uv(88, 61).cuboid(-4.6225F, -0.4306F, -0.5F, 5.0F, 13.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.2529F, 2.0917F, 0.425F, 0.0F, 0.0F, 0.5585F));

        ModelPartData feather_r8 = l_down_wing_feather.addChild("feather_r8", ModelPartBuilder.create().uv(22, 88).cuboid(-2.5879F, 0.2363F, -0.5F, 5.0F, 14.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-5.9471F, -1.8083F, 0.45F, 0.0F, 0.0F, 0.7592F));

        ModelPartData l_mid_wing_feather = l_mid_wing.addChild("l_mid_wing_feather", ModelPartBuilder.create(), ModelTransform.pivot(0.1302F, 0.1558F, 0.3F));

        ModelPartData feather_r9 = l_mid_wing_feather.addChild("feather_r9", ModelPartBuilder.create().uv(94, 38).cuboid(-5.0F, -3.0F, -0.5F, 4.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.0898F, 2.7187F, 0.65F, 0.0F, 0.0F, 0.0436F));

        ModelPartData feather_r10 = l_mid_wing_feather.addChild("feather_r10", ModelPartBuilder.create().uv(94, 25).cuboid(-5.0F, -3.0F, -0.5F, 4.0F, 9.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-2.9102F, 2.7187F, 0.75F, 0.0F, 0.0F, 0.2618F));

        ModelPartData feather_r11 = l_mid_wing_feather.addChild("feather_r11", ModelPartBuilder.create().uv(94, 11).cuboid(-5.0F, -4.0F, -1.0F, 5.0F, 10.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5898F, 2.0187F, 0.575F, 0.0F, 0.0F, -0.2356F));

        ModelPartData feather_r12 = l_mid_wing_feather.addChild("feather_r12", ModelPartBuilder.create().uv(0, 94).cuboid(-2.5F, -5.0F, 0.0F, 5.0F, 10.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-6.0642F, 4.3513F, -0.225F, 0.0F, 0.0F, 0.1396F));

        ModelPartData r_wing = wings.addChild("r_wing", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, -0.75F, -0.075F));

        ModelPartData r_top_wing = r_wing.addChild("r_top_wing", ModelPartBuilder.create(), ModelTransform.pivot(0.0598F, -0.3374F, 0.1F));

        ModelPartData r_up_wing_frame_r1 = r_top_wing.addChild("r_up_wing_frame_r1", ModelPartBuilder.create().uv(94, 46).mirrored().cuboid(-2.0F, -1.0F, -1.0F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(1.9402F, -0.9126F, 0.5F, 0.0F, 0.0F, -0.8727F));

        ModelPartData r_top_wing_feather = r_top_wing.addChild("r_top_wing_feather", ModelPartBuilder.create(), ModelTransform.pivot(1.9402F, -0.9126F, 0.5F));

        ModelPartData feather_r13 = r_top_wing_feather.addChild("feather_r13", ModelPartBuilder.create().uv(72, 94).mirrored().cuboid(-3.0F, -1.0F, -1.0F, 3.0F, 6.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, 0.85F, 0.0F, 0.0F, -0.8727F));

        ModelPartData feather_r14 = r_top_wing_feather.addChild("feather_r14", ModelPartBuilder.create().uv(10, 88).mirrored().cuboid(-3.0F, -1.0F, -1.0F, 3.0F, 7.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.1F, -2.65F, 0.725F, 0.0F, 0.0F, -1.309F));

        ModelPartData feather_r15 = r_top_wing_feather.addChild("feather_r15", ModelPartBuilder.create().uv(98, 54).mirrored().cuboid(-3.0F, -1.0F, -1.0F, 3.0F, 6.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.8F, 0.3F, 0.2F, 0.0F, 0.0F, -0.5236F));

        ModelPartData feather_r16 = r_top_wing_feather.addChild("feather_r16", ModelPartBuilder.create().uv(40, 98).mirrored().cuboid(-4.0F, -1.0F, -1.0F, 5.0F, 6.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.2F, -2.2F, 0.075F, 0.0F, 0.0F, -1.0908F));

        ModelPartData r_mid_wing = r_top_wing.addChild("r_mid_wing", ModelPartBuilder.create(), ModelTransform.of(3.9944F, -4.1931F, -0.25F, 0.0F, 0.0F, -1.2217F));

        ModelPartData r_mid_wing_frame_r1 = r_mid_wing.addChild("r_mid_wing_frame_r1", ModelPartBuilder.create().uv(86, 36).mirrored().cuboid(-0.1707F, -0.5839F, -0.5F, 7.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-0.0373F, 0.1801F, 0.25F, 0.0F, 0.0F, -0.2182F));

        ModelPartData r_down_wing = r_mid_wing.addChild("r_down_wing", ModelPartBuilder.create(), ModelTransform.of(6.494F, -1.4322F, 0.25F, 0.0F, 0.0F, -0.0436F));

        ModelPartData r_down_wing_frame_r1 = r_down_wing.addChild("r_down_wing_frame_r1", ModelPartBuilder.create().uv(8, 86).mirrored().cuboid(-0.3775F, -0.4306F, -0.5F, 11.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.159F, -0.1525F, 0.0F, 0.0F, 0.0F, -0.5236F));

        ModelPartData r_down_wing_feather = r_down_wing.addChild("r_down_wing_feather", ModelPartBuilder.create(), ModelTransform.pivot(0.5618F, -2.0442F, -0.25F));

        ModelPartData feather_r17 = r_down_wing_feather.addChild("feather_r17", ModelPartBuilder.create().uv(90, 86).mirrored().cuboid(5.6225F, -0.4306F, 0.0F, 5.0F, 12.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-0.5529F, 1.8917F, 0.6F, 0.0F, 0.0F, -0.48F));

        ModelPartData feather_r18 = r_down_wing_feather.addChild("feather_r18", ModelPartBuilder.create().uv(52, 93).mirrored().cuboid(-0.3775F, -1.4306F, 0.0F, 5.0F, 13.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.5471F, 1.5917F, 0.575F, 0.0F, 0.0F, -0.2095F));

        ModelPartData feather_r19 = r_down_wing_feather.addChild("feather_r19", ModelPartBuilder.create().uv(88, 61).mirrored().cuboid(-0.3775F, -0.4306F, -0.5F, 5.0F, 13.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-0.2529F, 2.0917F, 0.425F, 0.0F, 0.0F, -0.5585F));

        ModelPartData feather_r20 = r_down_wing_feather.addChild("feather_r20", ModelPartBuilder.create().uv(0, 0).cuboid(-2.4121F, 0.2363F, -0.5F, 5.0F, 14.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(5.9471F, -1.8083F, 0.45F, 0.0F, 0.0F, -0.7592F));

        ModelPartData r_mid_wing_feather = r_mid_wing.addChild("r_mid_wing_feather", ModelPartBuilder.create(), ModelTransform.pivot(-0.3012F, -0.3141F, 0.15F));

        ModelPartData feather_r21 = r_mid_wing_feather.addChild("feather_r21", ModelPartBuilder.create().uv(94, 38).mirrored().cuboid(1.0F, -3.0F, -0.5F, 4.0F, 8.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-0.9188F, 3.1886F, 0.8F, 0.0F, 0.0F, -0.0436F));

        ModelPartData feather_r22 = r_mid_wing_feather.addChild("feather_r22", ModelPartBuilder.create().uv(94, 25).mirrored().cuboid(1.0F, -3.0F, -0.5F, 4.0F, 9.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(3.0812F, 3.1886F, 0.9F, 0.0F, 0.0F, -0.2618F));

        ModelPartData feather_r23 = r_mid_wing_feather.addChild("feather_r23", ModelPartBuilder.create().uv(94, 11).mirrored().cuboid(0.0F, -4.0F, -1.0F, 5.0F, 10.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-0.4188F, 2.4886F, 0.725F, 0.0F, 0.0F, 0.2356F));

        ModelPartData feather_r24 = r_mid_wing_feather.addChild("feather_r24", ModelPartBuilder.create().uv(0, 94).mirrored().cuboid(-2.5F, -5.0F, 0.0F, 5.0F, 10.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(6.2352F, 4.8212F, -0.075F, 0.0F, 0.0F, -0.1396F));

        ModelPartData head = body.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -6.0F, 0.0F));

        ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(78, 12).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F))
                .uv(48, 72).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.9635F, 0.0F, -0.3927F));

        ModelPartData cube_r2 = head.addChild("cube_r2", ModelPartBuilder.create().uv(80, 0).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F))
                .uv(72, 48).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.9635F, 0.0F, -0.7854F));

        ModelPartData cube_r3 = head.addChild("cube_r3", ModelPartBuilder.create().uv(80, 24).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F))
                .uv(56, 72).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.9635F, 0.0F, -1.1781F));

        ModelPartData cube_r4 = head.addChild("cube_r4", ModelPartBuilder.create().uv(80, 36).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F))
                .uv(72, 60).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.9635F, 0.0F, -1.5708F));

        ModelPartData cube_r5 = head.addChild("cube_r5", ModelPartBuilder.create().uv(80, 48).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F))
                .uv(64, 72).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.9635F, 0.0F, -2.3562F));

        ModelPartData cube_r6 = head.addChild("cube_r6", ModelPartBuilder.create().uv(80, 60).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F))
                .uv(72, 72).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.9635F, 0.0F, -2.7489F));

        ModelPartData cube_r7 = head.addChild("cube_r7", ModelPartBuilder.create().uv(80, 72).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F))
                .uv(16, 74).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.9635F, 0.0F, -3.1416F));

        ModelPartData cube_r8 = head.addChild("cube_r8", ModelPartBuilder.create().uv(0, 82).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F))
                .uv(24, 74).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.9635F, 0.0F, -1.9635F));

        ModelPartData cube_r9 = head.addChild("cube_r9", ModelPartBuilder.create().uv(0, 70).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, -0.3927F));

        ModelPartData cube_r10 = head.addChild("cube_r10", ModelPartBuilder.create().uv(8, 70).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, -0.7854F));

        ModelPartData cube_r11 = head.addChild("cube_r11", ModelPartBuilder.create().uv(70, 12).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, -1.1781F));

        ModelPartData cube_r12 = head.addChild("cube_r12", ModelPartBuilder.create().uv(72, 0).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, -1.5708F));

        ModelPartData cube_r13 = head.addChild("cube_r13", ModelPartBuilder.create().uv(72, 24).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, -2.3562F));

        ModelPartData cube_r14 = head.addChild("cube_r14", ModelPartBuilder.create().uv(32, 72).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, -2.7489F));

        ModelPartData cube_r15 = head.addChild("cube_r15", ModelPartBuilder.create().uv(72, 36).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, -3.1416F));

        ModelPartData cube_r16 = head.addChild("cube_r16", ModelPartBuilder.create().uv(40, 72).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, -1.9635F));

        ModelPartData cube_r17 = head.addChild("cube_r17", ModelPartBuilder.create().uv(62, 12).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.7489F, 0.0F, -0.3927F));

        ModelPartData cube_r18 = head.addChild("cube_r18", ModelPartBuilder.create().uv(16, 62).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.7489F, 0.0F, -0.7854F));

        ModelPartData cube_r19 = head.addChild("cube_r19", ModelPartBuilder.create().uv(24, 62).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.7489F, 0.0F, -1.1781F));

        ModelPartData cube_r20 = head.addChild("cube_r20", ModelPartBuilder.create().uv(64, 0).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.7489F, 0.0F, -1.5708F));

        ModelPartData cube_r21 = head.addChild("cube_r21", ModelPartBuilder.create().uv(64, 24).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.7489F, 0.0F, -2.3562F));

        ModelPartData cube_r22 = head.addChild("cube_r22", ModelPartBuilder.create().uv(64, 36).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.7489F, 0.0F, -2.7489F));

        ModelPartData cube_r23 = head.addChild("cube_r23", ModelPartBuilder.create().uv(64, 48).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.7489F, 0.0F, -3.1416F));

        ModelPartData cube_r24 = head.addChild("cube_r24", ModelPartBuilder.create().uv(64, 60).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.7489F, 0.0F, -1.9635F));

        ModelPartData cube_r25 = head.addChild("cube_r25", ModelPartBuilder.create().uv(56, 36).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -0.3927F));

        ModelPartData cube_r26 = head.addChild("cube_r26", ModelPartBuilder.create().uv(56, 48).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -0.7854F));

        ModelPartData cube_r27 = head.addChild("cube_r27", ModelPartBuilder.create().uv(0, 58).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -1.1781F));

        ModelPartData cube_r28 = head.addChild("cube_r28", ModelPartBuilder.create().uv(8, 58).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -1.5708F));

        ModelPartData cube_r29 = head.addChild("cube_r29", ModelPartBuilder.create().uv(32, 60).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -2.3562F));

        ModelPartData cube_r30 = head.addChild("cube_r30", ModelPartBuilder.create().uv(40, 60).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -2.7489F));

        ModelPartData cube_r31 = head.addChild("cube_r31", ModelPartBuilder.create().uv(48, 60).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -3.1416F));

        ModelPartData cube_r32 = head.addChild("cube_r32", ModelPartBuilder.create().uv(56, 60).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -1.9635F));

        ModelPartData cube_r33 = head.addChild("cube_r33", ModelPartBuilder.create().uv(48, 36).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, -0.3927F));

        ModelPartData cube_r34 = head.addChild("cube_r34", ModelPartBuilder.create().uv(40, 48).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, -0.7854F));

        ModelPartData cube_r35 = head.addChild("cube_r35", ModelPartBuilder.create().uv(48, 48).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, -1.1781F));

        ModelPartData cube_r36 = head.addChild("cube_r36", ModelPartBuilder.create().uv(16, 50).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, -1.5708F));

        ModelPartData cube_r37 = head.addChild("cube_r37", ModelPartBuilder.create().uv(24, 50).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, -2.3562F));

        ModelPartData cube_r38 = head.addChild("cube_r38", ModelPartBuilder.create().uv(54, 12).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, -2.7489F));

        ModelPartData cube_r39 = head.addChild("cube_r39", ModelPartBuilder.create().uv(56, 0).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, -3.1416F));

        ModelPartData cube_r40 = head.addChild("cube_r40", ModelPartBuilder.create().uv(56, 24).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, -1.9635F));

        ModelPartData cube_r41 = head.addChild("cube_r41", ModelPartBuilder.create().uv(40, 24).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, -0.3927F));

        ModelPartData cube_r42 = head.addChild("cube_r42", ModelPartBuilder.create().uv(40, 36).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, -0.7854F));

        ModelPartData cube_r43 = head.addChild("cube_r43", ModelPartBuilder.create().uv(0, 46).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, -1.1781F));

        ModelPartData cube_r44 = head.addChild("cube_r44", ModelPartBuilder.create().uv(8, 46).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, -1.5708F));

        ModelPartData cube_r45 = head.addChild("cube_r45", ModelPartBuilder.create().uv(46, 12).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, -2.3562F));

        ModelPartData cube_r46 = head.addChild("cube_r46", ModelPartBuilder.create().uv(48, 0).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, -2.7489F));

        ModelPartData cube_r47 = head.addChild("cube_r47", ModelPartBuilder.create().uv(48, 24).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, -3.1416F));

        ModelPartData cube_r48 = head.addChild("cube_r48", ModelPartBuilder.create().uv(32, 48).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, -1.9635F));

        ModelPartData cube_r49 = head.addChild("cube_r49", ModelPartBuilder.create().uv(32, 24).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, -0.3927F));

        ModelPartData cube_r50 = head.addChild("cube_r50", ModelPartBuilder.create().uv(0, 34).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, -0.7854F));

        ModelPartData cube_r51 = head.addChild("cube_r51", ModelPartBuilder.create().uv(8, 34).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, -1.1781F));

        ModelPartData cube_r52 = head.addChild("cube_r52", ModelPartBuilder.create().uv(32, 36).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, -1.5708F));

        ModelPartData cube_r53 = head.addChild("cube_r53", ModelPartBuilder.create().uv(38, 12).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, -2.3562F));

        ModelPartData cube_r54 = head.addChild("cube_r54", ModelPartBuilder.create().uv(16, 38).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, -2.7489F));

        ModelPartData cube_r55 = head.addChild("cube_r55", ModelPartBuilder.create().uv(24, 38).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, -3.1416F));

        ModelPartData cube_r56 = head.addChild("cube_r56", ModelPartBuilder.create().uv(40, 0).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, -1.9635F));

        ModelPartData cube_r57 = head.addChild("cube_r57", ModelPartBuilder.create().uv(32, 0).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

        ModelPartData cube_r58 = head.addChild("cube_r58", ModelPartBuilder.create().uv(30, 12).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

        ModelPartData cube_r59 = head.addChild("cube_r59", ModelPartBuilder.create().uv(24, 26).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.1781F));

        ModelPartData cube_r60 = head.addChild("cube_r60", ModelPartBuilder.create().uv(16, 26).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

        ModelPartData cube_r61 = head.addChild("cube_r61", ModelPartBuilder.create().uv(24, 0).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.9635F));

        ModelPartData cube_r62 = head.addChild("cube_r62", ModelPartBuilder.create().uv(22, 14).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.3562F));

        ModelPartData cube_r63 = head.addChild("cube_r63", ModelPartBuilder.create().uv(8, 22).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.7489F));

        ModelPartData cube_r64 = head.addChild("cube_r64", ModelPartBuilder.create().uv(0, 22).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

        ModelPartData ring = body.addChild("ring", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -6.3619F, -0.3637F));

        ModelPartData cube_r65 = ring.addChild("cube_r65", ModelPartBuilder.create().uv(14, 22).cuboid(2.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -7.0F, 4.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData cube_r66 = ring.addChild("cube_r66", ModelPartBuilder.create().uv(8, 82).cuboid(3.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -7.0F, 9.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData cube_r67 = ring.addChild("cube_r67", ModelPartBuilder.create().uv(8, 82).cuboid(3.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -7.0F, -1.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData cube_r68 = ring.addChild("cube_r68", ModelPartBuilder.create().uv(88, 8).cuboid(3.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -7.0F, 8.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData cube_r69 = ring.addChild("cube_r69", ModelPartBuilder.create().uv(88, 8).cuboid(3.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.0F, 8.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData cube_r70 = ring.addChild("cube_r70", ModelPartBuilder.create().uv(88, 8).cuboid(3.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -7.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData cube_r71 = ring.addChild("cube_r71", ModelPartBuilder.create().uv(88, 8).cuboid(3.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData cube_r72 = ring.addChild("cube_r72", ModelPartBuilder.create().uv(24, 12).cuboid(2.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -7.0F, 6.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData cube_r73 = ring.addChild("cube_r73", ModelPartBuilder.create().uv(24, 12).cuboid(2.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -7.0F, 6.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData cube_r74 = ring.addChild("cube_r74", ModelPartBuilder.create().uv(24, 12).cuboid(2.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -7.0F, 1.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData cube_r75 = ring.addChild("cube_r75", ModelPartBuilder.create().uv(24, 12).cuboid(2.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -7.0F, 1.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData cube_r76 = ring.addChild("cube_r76", ModelPartBuilder.create().uv(14, 22).cuboid(2.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -7.0F, 4.0F, 0.0F, 1.5708F, 0.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        body.render(matrices, vertexConsumer, light, overlay, color);
    }




    @Override
    public ModelPart getPart() {
        return this.body;
    }
    @Override
    public void setAngles(EyengelEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.detHeadAngles(headPitch, headYaw);

        // 飛行アニメーション
        this.animateMovement(EyengelAnimations.ANIM_EYENGEL_FLYING, limbAngle, limbDistance, 2f, 2f);

        // アイドルモーション
        this.updateAnimation(entity.idleAnimationState, EyengelAnimations.ANIM_EYENGEL_IDLE, animationProgress, 1f);

        // 攻撃モーション
        this.updateAnimation(entity.attackAnimationState, EyengelAnimations.ANIM_EYENGEL_ATTACK, animationProgress, 1f);

        // ダメージアニメーション
        this.updateAnimation(entity.hurtAnimationState, EyengelAnimations.ANIM_EYENGEL_HURT, animationProgress, 1f);

        // 死亡アニメーション
        this.updateAnimation(entity.deathAnimationState, EyengelAnimations.ANIM_EYENGEL_DEATH, animationProgress, 1f);
    }

    private void detHeadAngles(float headYaw, float headPitch) {
        // 180度のオフセットを追加して正面を向かせる
        headYaw = MathHelper.clamp(headYaw, -90.0f, 90.0f);
        headPitch = MathHelper.clamp(headPitch, -45f, 45f);

        // 180度のオフセットを追加
        this.head.yaw = headYaw  * 0.017453292f;
        this.head.pitch = headPitch * 0.017453292f;
    }


}
