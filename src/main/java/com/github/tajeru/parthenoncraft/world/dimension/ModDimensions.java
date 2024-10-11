package com.github.tajeru.parthenoncraft.world.dimension;

import com.github.tajeru.parthenoncraft.Parthenoncraft;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DirtPathBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;
import net.minecraft.server.MinecraftServer;

import java.util.OptionalLong;

public class ModDimensions {
    public static final RegistryKey<DimensionOptions> PARTHENONDIM_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            Identifier.of(Parthenoncraft.MOD_ID, "parthenondim"));
    public static final RegistryKey<World> PARTHENONDIM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            Identifier.of(Parthenoncraft.MOD_ID, "parthenondim"));
    public static final RegistryKey<DimensionType> PARTHENON_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            Identifier.of(Parthenoncraft.MOD_ID, "parthenondim_type"));


    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(PARTHENON_DIM_TYPE, new DimensionType(
                OptionalLong.of(6000),
                true,
                false,
                false,
                false,
                0.001,
                false,
                true,
                16,
                512,
                512,
                BlockTags.DIRT,
                DimensionTypes.OVERWORLD_ID,
                3.0f,
                new DimensionType.MonsterSettings(true, false, UniformIntProvider.create(0, 0), 0)));


    }}

//時間を12000に固定
//空が存在する
//天井が存在する
//ネザーのように熱い
//自然生成な地形である
//座標スケール　8 => 1/8
//ベッドで寝られる
//ピグリンが安全
//最低高度
//最高高度
//論理的な高さブロックおけない領域？
//火をつけると燃え続けるブロック
//ディメンションタイプ
//デフォルト光源
//モンスターのわき設定
