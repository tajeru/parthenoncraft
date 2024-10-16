package com.github.tajeru.parthenoncraft.entity.client.animation;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class MinotaurAnimations {

    public static final Animation ANIM_MINOTAUR_IDLE = Animation.Builder.create(2.0F).looping()
            .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5F, AnimationHelper.createRotationalVector(4.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.0F, AnimationHelper.createRotationalVector(-4.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.0F, AnimationHelper.createRotationalVector(1.67F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .build();

    public static final Animation ANIM_MINOTAUR_WALK = Animation.Builder.create(2.0F).looping()
            .addBoneAnimation("top_body", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(-2.5F, -0.1F, -5.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.0F, AnimationHelper.createRotationalVector(-2.5F, -0.1F, 5.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.0F, AnimationHelper.createRotationalVector(-2.5F, -0.1F, -2.5F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_arms", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.0F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.0F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_arms", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.0F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.0F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_regs", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.0F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.0F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_regs", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.0F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.0F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .build();

    public static final Animation ANIM_MINOTAUR_ATTACK = Animation.Builder.create(1.375F)
            .addBoneAnimation("all", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.9583F, AnimationHelper.createRotationalVector(-2.5024F, -2.4976F, 0.1091F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("top_body", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5F, AnimationHelper.createRotationalVector(5.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.75F, AnimationHelper.createRotationalVector(7.5336F, 9.9904F, 0.2212F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.875F, AnimationHelper.createRotationalVector(-5.0F, -17.5F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.1667F, AnimationHelper.createRotationalVector(-10.4825F, -27.4292F, 1.2206F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.375F, AnimationHelper.createRotationalVector(-10.4825F, -27.4292F, 1.2206F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_arms", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5F, AnimationHelper.createRotationalVector(-7.7022F, -4.4066F, -121.8156F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.75F, AnimationHelper.createRotationalVector(-12.7022F, -4.4066F, -121.8156F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.875F, AnimationHelper.createRotationalVector(135.7902F, -11.4506F, -128.9871F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.375F, AnimationHelper.createRotationalVector(135.7902F, -11.4506F, -128.9871F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_arms", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5F, AnimationHelper.createTranslationalVector(-9.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.75F, AnimationHelper.createTranslationalVector(-9.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("down_body", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.875F, AnimationHelper.createRotationalVector(-2.2889F, -5.0999F, -2.2889F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_regs", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5F, AnimationHelper.createRotationalVector(12.4953F, -0.2178F, 2.4905F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.75F, AnimationHelper.createRotationalVector(12.4953F, -0.2178F, 2.4905F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.875F, AnimationHelper.createRotationalVector(-12.6952F, -9.9805F, 4.677F), Transformation.Interpolations.LINEAR)
            ))
            .build();

    public static final Animation ANIM_MINOTAUR_DAMAGED = Animation.Builder.create(0.1667F)
            .addBoneAnimation("all", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.1667F, AnimationHelper.createRotationalVector(3.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("top_body", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.1667F, AnimationHelper.createRotationalVector(14.1714F, -19.6828F, -3.5366F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.1667F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_arms", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.1667F, AnimationHelper.createRotationalVector(-20.1601F, 8.4207F, -18.3681F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_arms", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.1667F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_regs", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.1667F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_regs", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.1667F, AnimationHelper.createTranslationalVector(-1.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_down_reg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.1667F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_regs", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.1667F, AnimationHelper.createRotationalVector(-42.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_regs", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.1667F, AnimationHelper.createTranslationalVector(-2.0F, -0.5F, -3.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_top_reg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.1667F, AnimationHelper.createRotationalVector(7.5547F, -4.8292F, -1.2972F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_down_reg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.1667F, AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_down_reg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.1667F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .build();

    public static final Animation ANIM_MINOTAUR_DEAD = Animation.Builder.create(3.25F)
            .addBoneAnimation("top_body", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.3333F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.4583F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5833F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("top_body", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.3333F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 3.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.4583F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 3.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5833F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 13.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_top_reg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5833F, AnimationHelper.createRotationalVector(-1.4165F, -0.5237F, 0.0919F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.5417F, AnimationHelper.createRotationalVector(-1.4165F, -0.5237F, 0.0919F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.6667F, AnimationHelper.createRotationalVector(-45.93F, -0.96F, 0.17F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.75F, AnimationHelper.createRotationalVector(-90.444F, -1.3966F, 0.2452F), Transformation.Interpolations.LINEAR),
                    new Keyframe(3.25F, AnimationHelper.createRotationalVector(-90.444F, -1.3966F, 0.2452F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_top_reg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.3333F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 3.5F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.4583F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 3.5F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5833F, AnimationHelper.createTranslationalVector(0.0F, -5.2F, 12.4F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.5417F, AnimationHelper.createTranslationalVector(0.0F, -5.2F, 12.4F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.6667F, AnimationHelper.createTranslationalVector(0.0F, -5.2F, 12.65F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, -5.2F, 12.9F), Transformation.Interpolations.LINEAR),
                    new Keyframe(3.25F, AnimationHelper.createTranslationalVector(0.0F, -5.2F, 12.9F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_top_reg", new Transformation(Transformation.Targets.SCALE,
                    new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.75F, AnimationHelper.createScalingVector(1.0F, 1.5F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(3.25F, AnimationHelper.createScalingVector(1.0F, 1.5F, 1.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_down_reg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.3333F, AnimationHelper.createRotationalVector(-19.37F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-19.37F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5833F, AnimationHelper.createRotationalVector(-90.37F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.5417F, AnimationHelper.createRotationalVector(-90.37F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.625F, AnimationHelper.createRotationalVector(-90.37F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_down_reg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.3333F, AnimationHelper.createTranslationalVector(0.0F, -0.1F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.4583F, AnimationHelper.createTranslationalVector(0.0F, -0.1F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5833F, AnimationHelper.createTranslationalVector(0.0F, 2.4F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.5417F, AnimationHelper.createTranslationalVector(0.0F, 2.4F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.625F, AnimationHelper.createTranslationalVector(0.0F, 2.4F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_down_reg", new Transformation(Transformation.Targets.SCALE,
                    new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5833F, AnimationHelper.createScalingVector(1.0F, 1.4F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.5417F, AnimationHelper.createScalingVector(1.0F, 1.4F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_top_reg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5833F, AnimationHelper.createRotationalVector(-1.25F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.5417F, AnimationHelper.createRotationalVector(-1.25F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.6667F, AnimationHelper.createRotationalVector(-45.62F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.75F, AnimationHelper.createRotationalVector(-90.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(3.25F, AnimationHelper.createRotationalVector(-90.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_top_reg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.3333F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 3.5F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.4583F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 3.5F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5833F, AnimationHelper.createTranslationalVector(0.0F, -5.2F, 12.4F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.5417F, AnimationHelper.createTranslationalVector(0.0F, -5.2F, 12.4F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.6667F, AnimationHelper.createTranslationalVector(0.0F, -5.15F, 12.45F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, -5.1F, 12.5F), Transformation.Interpolations.LINEAR),
                    new Keyframe(3.25F, AnimationHelper.createTranslationalVector(0.0F, -5.1F, 12.5F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_top_reg", new Transformation(Transformation.Targets.SCALE,
                    new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.75F, AnimationHelper.createScalingVector(1.0F, 1.5F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(3.25F, AnimationHelper.createScalingVector(1.0F, 1.5F, 1.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_down_reg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.3333F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5833F, AnimationHelper.createRotationalVector(-90.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.5417F, AnimationHelper.createRotationalVector(-90.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.625F, AnimationHelper.createRotationalVector(-90.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_down_reg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.3333F, AnimationHelper.createTranslationalVector(0.0F, -0.1F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.4583F, AnimationHelper.createTranslationalVector(0.0F, -0.1F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5833F, AnimationHelper.createTranslationalVector(0.0F, 2.45F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.5417F, AnimationHelper.createTranslationalVector(0.0F, 2.45F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.625F, AnimationHelper.createTranslationalVector(0.0F, 2.45F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_down_reg", new Transformation(Transformation.Targets.SCALE,
                    new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5833F, AnimationHelper.createScalingVector(1.0F, 1.4F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.5417F, AnimationHelper.createScalingVector(1.0F, 1.4F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.8333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.125F, AnimationHelper.createRotationalVector(-17.0489F, 1.5645F, 28.1375F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.4583F, AnimationHelper.createRotationalVector(-24.0822F, 10.2549F, 37.9172F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createRotationalVector(-34.1431F, 5.9032F, 49.0037F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.7083F, AnimationHelper.createRotationalVector(-47.0461F, 59.8066F, 41.6907F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.875F, AnimationHelper.createRotationalVector(-103.3964F, 68.3439F, -1.0222F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.0F, AnimationHelper.createRotationalVector(-100.2834F, 65.188F, -7.259F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.8333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.125F, AnimationHelper.createTranslationalVector(13.0F, -1.0F, 9.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.4583F, AnimationHelper.createTranslationalVector(13.0F, -1.0F, 9.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.7083F, AnimationHelper.createTranslationalVector(13.0F, -31.0F, 9.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.875F, AnimationHelper.createTranslationalVector(20.0F, -23.0F, 9.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.0F, AnimationHelper.createTranslationalVector(24.0F, -30.0F, 9.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(2.5417F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.6667F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.75F, AnimationHelper.createRotationalVector(-95.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(3.25F, AnimationHelper.createRotationalVector(-95.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.8F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.5417F, AnimationHelper.createTranslationalVector(0.0F, 1.3F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.6667F, AnimationHelper.createTranslationalVector(0.0F, -1.7F, 8.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, -11.7F, 10.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(3.25F, AnimationHelper.createTranslationalVector(0.0F, -11.7F, 10.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_arms", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(2.5417F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.6667F, AnimationHelper.createRotationalVector(-55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.75F, AnimationHelper.createRotationalVector(-97.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(3.25F, AnimationHelper.createRotationalVector(-97.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_arms", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.4167F, AnimationHelper.createTranslationalVector(0.0F, 1.41F, 0.37F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.5417F, AnimationHelper.createTranslationalVector(0.0F, 1.4F, 0.4F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.6667F, AnimationHelper.createTranslationalVector(0.0F, -6.75F, 19.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, -38.6F, 34.4F), Transformation.Interpolations.LINEAR),
                    new Keyframe(3.25F, AnimationHelper.createTranslationalVector(0.0F, -38.6F, 34.4F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("R_up_arm", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_arms", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(2.5417F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.6667F, AnimationHelper.createRotationalVector(-47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.75F, AnimationHelper.createRotationalVector(-95.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(3.25F, AnimationHelper.createRotationalVector(-95.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_arms", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.4167F, AnimationHelper.createTranslationalVector(0.0F, 1.02F, 0.02F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.5417F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.1F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.6667F, AnimationHelper.createTranslationalVector(0.0F, -3.2F, 16.9F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, -35.0F, 33.1F), Transformation.Interpolations.LINEAR),
                    new Keyframe(3.25F, AnimationHelper.createTranslationalVector(0.0F, -35.0F, 33.1F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("L_up_arm", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.5417F, AnimationHelper.createTranslationalVector(0.0F, -0.4F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .build();
}
