package com.github.tajeru.parthenoncraft;

import com.github.tajeru.parthenoncraft.block.ModBlocks;
import com.github.tajeru.parthenoncraft.entity.client.ModEntities;
import com.github.tajeru.parthenoncraft.entity.client.ModEntityModelLayers;
import com.github.tajeru.parthenoncraft.entity.client.eyengel.EyengelModel;
import com.github.tajeru.parthenoncraft.entity.client.eyengel.EyengelRenderer;
import com.github.tajeru.parthenoncraft.entity.client.minotaur.MinotaurModel;
import com.github.tajeru.parthenoncraft.entity.client.minotaur.MinotaurRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class ParthenoncraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VOID_CLOUD_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CLOUD_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CLOUD_STAIRS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CLOUD_SLAB, RenderLayer.getTranslucent());

        //mobレイヤー登録
        EntityModelLayerRegistry.registerModelLayer(ModEntityModelLayers.MINOTAUR, MinotaurModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(ModEntityModelLayers.EYENGEL, EyengelModel::getTexturedModelData);

        //mobレンダラー登録
        EntityRendererRegistry.register(ModEntities.MINOTAUR, MinotaurRenderer::new);
        EntityRendererRegistry.register(ModEntities.EYENGEL, EyengelRenderer::new);




    }
}
