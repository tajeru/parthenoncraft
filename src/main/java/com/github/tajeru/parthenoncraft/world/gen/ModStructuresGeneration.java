package com.github.tajeru.parthenoncraft.world.gen;

import com.github.tajeru.parthenoncraft.structure.custom.CreateSkytowerStructure;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;


public class ModStructuresGeneration {



    public static void generateSkyTower(StructureWorldAccess world, ChunkGenerator generator, Random random, BlockPos pos) {

        //NBTからスカイタワーを生成
        CreateSkytowerStructure skyTower = new CreateSkytowerStructure();


    }
}
