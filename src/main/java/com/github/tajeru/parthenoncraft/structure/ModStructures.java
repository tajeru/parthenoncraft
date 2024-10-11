package com.github.tajeru.parthenoncraft.structure;


import com.github.tajeru.parthenoncraft.Parthenoncraft;
import com.github.tajeru.parthenoncraft.item.ModItems;
import com.github.tajeru.parthenoncraft.structure.custom.SkytowerStructure;
import com.github.tajeru.parthenoncraft.world.gen.ModStructuresGeneration;
import com.github.tajeru.parthenoncraft.world.structure.ModStructureConfiguredFeatures;
import com.mojang.serialization.Codec;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.*;

import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.StructureTerrainAdaptation;
import net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement;
import net.minecraft.world.gen.chunk.placement.SpreadType;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureType;

import java.util.List;
import java.util.Map;

//ModConfiguredFeaturesで定義された構造物やブロックをどこにどのようにどんな条件で生成させるかを決める。 CF -> PF
public class ModStructures {


    public static final RegistryKey<Structure> SKY_TOWER_KEY = RegistryKey.of(RegistryKeys.STRUCTURE,
            Identifier.of(Parthenoncraft.MOD_ID,"sky_tower"));

        public static void registerStructures(Registerable<Structure> context) {
        // 構造物の登録処理

            //バイオームの変数
            RegistryEntryList<Biome> biomes = RegistryEntryList.of(context.getRegistryLookup(RegistryKeys.BIOME)
                    .getOrThrow(BiomeKeys.PLAINS));
        RegistryEntry<ConfiguredFeature<?, ?>> skyTowerFeature = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE)
                .getOrThrow(ModStructureConfiguredFeatures.SKY_TOWER_FEATURE);
            //構造物の登録
        context.register(SKY_TOWER_KEY, new SkytowerStructure(
               new Structure.Config(
                       biomes,
                       Map.of(),
                       GenerationStep.Feature.SURFACE_STRUCTURES,
                       StructureTerrainAdaptation.NONE)));

    }
    public static final StructureType<SkytowerStructure> SKY_TOWER_STRUCTURE_TYPE = register("sky_tower",SkytowerStructure.MAP_CODEC);

        private static<S extends Structure> StructureType<S> register(String id, MapCodec<S> codec){
            return Registry.register(
                    Registries.STRUCTURE_TYPE,
                    RegistryKey.of(RegistryKeys.STRUCTURE_TYPE,Identifier.of(Parthenoncraft.MOD_ID,id)),
                () -> codec);
        }

    public static void registerStructureTypes() {
        // このメソッドでレジストリに構造物タイプを登録
        Registry.register(Registries.STRUCTURE_TYPE,
                Identifier.of(Parthenoncraft.MOD_ID,"skytower"),
                SKY_TOWER_STRUCTURE_TYPE);



        Parthenoncraft.LOGGER.info("Registering Mod registerStructureType for" + Parthenoncraft.MOD_ID);

    }


}
