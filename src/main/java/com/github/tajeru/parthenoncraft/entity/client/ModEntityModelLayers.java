package com.github.tajeru.parthenoncraft.entity.client;

import com.github.tajeru.parthenoncraft.Parthenoncraft;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;



public class ModEntityModelLayers {


    public static final EntityModelLayer MINOTAUR =
            new EntityModelLayer(Identifier.of(Parthenoncraft.MOD_ID, "minotaur"),"main");
    public static final EntityModelLayer EYENGEL =
            new EntityModelLayer(Identifier.of(Parthenoncraft.MOD_ID, "eyengel"),"main");
}