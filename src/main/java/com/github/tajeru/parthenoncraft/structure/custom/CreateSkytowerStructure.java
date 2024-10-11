package com.github.tajeru.parthenoncraft.structure.custom;

import com.github.tajeru.parthenoncraft.Parthenoncraft;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.StructureTemplate;
import net.minecraft.structure.StructureTemplateManager;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;

import java.util.Optional;

public class CreateSkytowerStructure {
    private final Identifier SKY_TOWER_NBT_TEMPLATE_ID = Identifier.of("parthenoncraft","structures/sky_tower");

    public  boolean placeStructure(StructureWorldAccess world, ChunkGenerator generator, Random random, BlockPos pos) {
        // ここに構造物の生成処理を記述する
        StructureTemplateManager templateManager = world.getServer().getStructureTemplateManager();
        Optional<StructureTemplate> optionalTemplate = templateManager.getTemplate(SKY_TOWER_NBT_TEMPLATE_ID);

        if (optionalTemplate.isPresent()) {
            StructureTemplate template = optionalTemplate.get();
            // 構造物を配置する際の設定
            StructurePlacementData placementData = new StructurePlacementData()
                    .setMirror(BlockMirror.NONE) // 鏡像反転なし
                    .setRotation(BlockRotation.NONE) // 回転なし
                    .setPosition(pos) // 構造物の配置場所
                    .setIgnoreEntities(true) // エンティティを無視しない
                    .setUpdateNeighbors(true); // 隣接するブロックの更新

            //設置する構造物の中心座標
            BlockPos pivot = new BlockPos(0, 100, 0);
            //構造物の設置
            template.place(world, pos, pivot, placementData, random, 2);

            return true;
        } else {
            System.out.println("Template not found: " + SKY_TOWER_NBT_TEMPLATE_ID);

            return false;
        }
    }
}
