package com.github.tajeru.parthenoncraft.world.structure;

import com.github.tajeru.parthenoncraft.Parthenoncraft;
import com.mojang.serialization.MapCodec;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

//ワールドに生成されるオブジェクトやブロックそのものを生成するクラス
public class ModStructureConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> SKY_TOWER_FEATURE = registerKey("sky_tower_feature");




    //レジストリキーの作成と登録をおこなうメソッド
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Parthenoncraft.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
