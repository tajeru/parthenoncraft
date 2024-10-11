package com.github.tajeru.parthenoncraft.structure;


import com.github.tajeru.parthenoncraft.Parthenoncraft;
import com.mojang.serialization.MapCodec;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureType;
import com.github.tajeru.parthenoncraft.structure.custom.SkyTowerStructure2;


public abstract class ModStructuresType {
    // カスタム構造物の登録
    public static final StructureType<SkyTowerStructure2> SKY_TOWER_STRUCTURE2_TYPE = register("sky_tower", SkyTowerStructure2.CODEC);

    // StructureTypeの登録メソッド (MapCodec<Structure>を使用)
    private static <S extends Structure> StructureType<S> register(String id, MapCodec<S> codec) {
        return Registry.register(Registries.STRUCTURE_TYPE, id, () -> codec);
    }

    public static void registerStructureKeys() {
        Parthenoncraft.LOGGER.info("Registering Mod CustomStructureType for" + Parthenoncraft.MOD_ID);
    }
}




