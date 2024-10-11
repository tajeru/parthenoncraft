package com.github.tajeru.parthenoncraft.structure.custom;

import com.github.tajeru.parthenoncraft.structure.ModStructuresType;

import com.mojang.serialization.MapCodec;

import net.minecraft.registry.entry.RegistryEntryList;

import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.StructureTerrainAdaptation;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureType;



import java.util.Map;
import java.util.Optional;

public class SkyTowerStructure2 extends Structure {
    public  static final MapCodec<SkyTowerStructure2> CODEC = createCodec(SkyTowerStructure2::new);

    protected SkyTowerStructure2(Config config) {
        super(config);
    }

    // 構造物のインスタンスを生成するメソッドを追加
    public static SkyTowerStructure2 createStructure() {
        // Configを使ってSkyTowerStructure2を生成
        return new SkyTowerStructure2(new Config(
                RegistryEntryList.of(), // 必要に応じたバイオームリストを設定
                Map.of(),               // デフォルトのスポーン設定
                GenerationStep.Feature.SURFACE_STRUCTURES, // 構造物生成タイミング
                StructureTerrainAdaptation.NONE             // 地形適応なし
        ));
    }


    @Override
    protected Optional<StructurePosition> getStructurePosition(Context context) {
        return Optional.empty();
    }

    @Override
    public StructureType<?> getType() {
        return ModStructuresType.SKY_TOWER_STRUCTURE2_TYPE;
    }
}
