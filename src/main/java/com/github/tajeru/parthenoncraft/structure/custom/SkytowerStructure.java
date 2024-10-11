package com.github.tajeru.parthenoncraft.structure.custom;

import com.github.tajeru.parthenoncraft.structure.ModStructures;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.placement.StructurePlacement;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureType;

import java.util.List;
import java.util.Optional;

public class SkytowerStructure extends Structure {

    // CODEC の定義
    public static final MapCodec<SkytowerStructure> MAP_CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    Structure.Config.CODEC.forGetter(structure -> structure.config)
            ).apply(instance, SkytowerStructure::new)
    );

    //public SkytowerStructure(RegistryEntry<ConfiguredFeature<?,?>> configuration, List<StructurePlacement> placements) {
       // super(configuration, placements);
   // }

    // 構造物の生成に必要な設定
    public SkytowerStructure(Structure.Config config) {
        super(config);
    }


    // Sky Tower 構造物の ConfiguredFeature を返すメソッド
    public static ConfiguredFeature<?, ?> createSkyTowerFeature() {
        return new ConfiguredFeature<>(Feature.NO_OP,  // 構造物として登録
                new DefaultFeatureConfig()  // 基本設定
        );
    }

    // 実際の構造物をワールドに配置するメソッド
    public boolean placeStructure(StructureWorldAccess world, ChunkGenerator generator, Random random, BlockPos pos) {
        // 構造物生成の処理
        return createSkyTowerFeature().generate(world, generator, random, pos);
    }


    @Override
    protected Optional<StructurePosition> getStructurePosition(Context context) {

        return Optional.empty();
    }

    @Override
    public StructureType<?> getType() {
        return ModStructures.SKY_TOWER_STRUCTURE_TYPE;
    }
}
