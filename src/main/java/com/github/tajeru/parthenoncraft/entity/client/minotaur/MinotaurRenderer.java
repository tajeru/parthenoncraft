package com.github.tajeru.parthenoncraft.entity.client.minotaur;

import com.github.tajeru.parthenoncraft.Parthenoncraft;
import com.github.tajeru.parthenoncraft.entity.client.ModEntityModelLayers;
import com.github.tajeru.parthenoncraft.entity.custom.MinotaurEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class MinotaurRenderer extends MobEntityRenderer<MinotaurEntity, MinotaurModel> {
    public MinotaurRenderer(EntityRendererFactory.Context context) {

        super(context, new MinotaurModel(context.getPart(ModEntityModelLayers.MINOTAUR)), 0.5f);

    }

    @Override
    public Identifier getTexture(MinotaurEntity entity) {
        return Identifier.of(Parthenoncraft.MOD_ID, "textures/entity/minotaur/minotaur.png");
    }

    @Override
    protected void scale(MinotaurEntity entity, MatrixStack matrixStack, float partialTicks) {
        // ここでスケール倍率を変更します。例えば、2.0Fで大きく、0.5Fで小さくします。
        float scaleFactor = 3F; // エンティティを1.5倍の大きさにします
        matrixStack.scale(scaleFactor, scaleFactor, scaleFactor);
        super.scale(entity, matrixStack, partialTicks);
    }

    @Override
    public void render(MinotaurEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }


}
