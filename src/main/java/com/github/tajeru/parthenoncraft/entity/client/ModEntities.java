package com.github.tajeru.parthenoncraft.entity.client;

import com.github.tajeru.parthenoncraft.Parthenoncraft;
import com.github.tajeru.parthenoncraft.entity.custom.EyengelEntity;
import com.github.tajeru.parthenoncraft.entity.custom.MinotaurEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
//    public static final EntityType<MonsterMobEntity> MONSTER_MOB = Registry.register(Registries.ENTITY_TYPE,
//            Identifier.of(Parthenoncraft.MOD_ID, "monstermob"),
//            EntityType.Builder.create(MonsterMobEntity::new, SpawnGroup.MONSTER).dimensions(2f, 3.5f).build());

    public static final EntityType<MinotaurEntity> MINOTAUR = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Parthenoncraft.MOD_ID, "minotaur"),
            EntityType.Builder.create(MinotaurEntity::new, SpawnGroup.MONSTER).dimensions(3f, 5.5f).build());

    public static final EntityType<EyengelEntity> EYENGEL = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Parthenoncraft.MOD_ID, "eyengel"),
            EntityType.Builder.create(EyengelEntity::new, SpawnGroup.MONSTER).dimensions(2.4f, 1.5f).build());
            //nomal size is 0.8f, 0.5f

    public static void registerModEntities(){
        Parthenoncraft.LOGGER.info("Registerting Mod Entities for " + Parthenoncraft.MOD_ID);
    }
}
