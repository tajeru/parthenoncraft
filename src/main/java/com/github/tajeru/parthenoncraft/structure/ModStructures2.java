package com.github.tajeru.parthenoncraft.structure;

import com.github.tajeru.parthenoncraft.Parthenoncraft;
import com.github.tajeru.parthenoncraft.structure.custom.SkyTowerStructure2;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.registry.Registries;




public class ModStructures2 {


    //構造物そのものを登録　idは.nbtファイル
    public static final RegistryKey<Structure> SKY_TOWER2_KEY = of("sky_tower");
    public static final RegistryKey<Structure> ANOTHER_STRUCTURE_KEY = of("another_structure");

    private static RegistryKey<Structure> of(String id) {
        return RegistryKey.of(RegistryKeys.STRUCTURE, Identifier.of(Parthenoncraft.MOD_ID, id));
    }


    //mainとの関係付け
    public static void registerStructureKeys() {
        Parthenoncraft.LOGGER.info("Registering Mod CustomStructureKey for" + Parthenoncraft.MOD_ID);

    }
}
