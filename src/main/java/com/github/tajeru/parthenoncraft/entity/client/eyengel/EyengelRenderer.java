package com.github.tajeru.parthenoncraft.entity.client.eyengel;

import com.github.tajeru.parthenoncraft.Parthenoncraft;
import com.github.tajeru.parthenoncraft.entity.client.ModEntityModelLayers;
import com.github.tajeru.parthenoncraft.entity.custom.EyengelEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;

public class EyengelRenderer extends MobEntityRenderer<EyengelEntity, EyengelModel> {
    public EyengelRenderer(EntityRendererFactory.Context context) {
        super(context, new EyengelModel(context.getPart(ModEntityModelLayers.EYENGEL)), 1.5f);
    }

    @Override
    public Identifier getTexture(EyengelEntity entity) {
        return Identifier.of(Parthenoncraft.MOD_ID, "textures/entity/eyengel/eyengel.png");
    }

    @Override
    protected void scale(EyengelEntity entity, MatrixStack matrixStack, float partialTicks) {
        float scaleFactor = 3F; // スケールを1倍に設定
        matrixStack.scale(scaleFactor, scaleFactor, scaleFactor);
        super.scale(entity, matrixStack, partialTicks);
    }

    @Override
    public void render(EyengelEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int packedLight) {
        // モデルを180度回転
        matrixStack.push();
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180)); // Y軸に対して180度回転

        super.render(entity, entityYaw, partialTicks, matrixStack, vertexConsumerProvider, packedLight);

        matrixStack.pop();
    }
}
