package com.github.tajeru.parthenoncraft;

import com.github.tajeru.parthenoncraft.datagen.*;
import com.github.tajeru.parthenoncraft.world.ModConfiguredFeatures;
import com.github.tajeru.parthenoncraft.world.ModPlacedFeatures;
import com.github.tajeru.parthenoncraft.world.dimension.ModDimensions;
import com.github.tajeru.parthenoncraft.world.gen.ModStructuresGeneration;
import com.github.tajeru.parthenoncraft.world.structure.ModStructureConfiguredFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class ParthenoncraftDataGenerator implements DataGeneratorEntrypoint {


    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
     FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

     pack.addProvider(ModModelProvider::new);
     pack.addProvider(ModBlockTagProvider::new);
     pack.addProvider(ModWorldGenerator::new);

    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
       registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.DIMENSION_TYPE, ModDimensions::bootstrapType);

    }
}
