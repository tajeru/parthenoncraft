package com.github.tajeru.parthenoncraft.world;

import com.github.tajeru.parthenoncraft.Parthenoncraft;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

//ワールドに生成されるオブジェクトやブロックそのものを生成するクラス
public class ModConfiguredFeatures {

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context){



    }

    //レジストリキーの作成と登録をおこなうメソッド
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Parthenoncraft.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}




//1. public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name)
//このメソッドは、カスタムのConfiguredFeatureのRegistryKeyを作成するために使用されます。RegistryKeyはMinecraftの**レジストリ（登録システム）**でリソース（ここではConfiguredFeature）を識別するためのキーを生成します。
//
//構造：
//RegistryKey.of: これは、Minecraftのリソースを一意に識別するためのキーを生成します。ここでは、RegistryKeys.CONFIGURED_FEATUREというレジストリに新しいキーを作成しています。
//Identifier.of(Parthenoncraft.MOD_ID, name): これにより、特定のMod ID（Parthenoncraft.MOD_ID）と名前（name）を基に、一意のIdentifierを生成します。これは、Modの名前空間においてそのリソースを一意に識別するためのものです。
//目的：
//このメソッドは、nameで指定された文字列に基づいて、ConfiguredFeatureのキーを作成し、後でそのキーを使ってレジストリに登録するためのものです。
//
//2. private static <FC extends FeatureConfig, F extends Feature<FC>> void register(...)
//このメソッドは、ConfiguredFeatureを実際に登録するために使用されます。この登録プロセスは、Minecraftのワールド生成システムで使用される特定の地形やオブジェクト（例: 植物、鉱石）を定義するためのものです。
//
//構造：
//Registerable<ConfiguredFeature<?, ?>> context: これがレジストリのコンテキストです。Minecraftのレジストリに何かを登録する際に使われる仕組みです。新しいConfiguredFeatureをこのコンテキストに登録します。
//RegistryKey<ConfiguredFeature<?, ?>> key: これは、先ほどの registerKey メソッドで作成されたレジストリキーで、登録されるConfiguredFeatureを識別するために使われます。
//F feature: これは、ワールド生成で使用されるFeatureの型です。例えば、鉱石生成や植物生成のようなワールド内での特定の生成ロジックが含まれています。
//FC configuration: これは、生成ロジックに関連するFeatureConfigの型です。具体的には、生成されるオブジェクト（鉱石、木、構造物など）の配置や数など、生成の詳細設定を含みます。
//目的：
//このメソッドは、指定されたRegistryKeyとConfiguredFeatureのペアをMinecraftのレジストリに登録します。ConfiguredFeatureは、feature（生成される要素）とconfiguration（その要素の設定）のペアで構成されます。
//context.register() を使って、実際に ConfiguredFeature をレジストリに登録しています。
//全体の流れ：
//registerKey で ConfiguredFeature に対する一意のキーを生成します。
//register メソッドでそのキーと生成する要素（例えば、特定の植物や鉱石）をMinecraftのレジストリに登録します。
//具体例：
//たとえば、Minecraftに新しい鉱石の生成ロジックを追加したい場合、このコードはその鉱石の生成設定をレジストリに登録し、ゲーム内で使用できるようにします。
