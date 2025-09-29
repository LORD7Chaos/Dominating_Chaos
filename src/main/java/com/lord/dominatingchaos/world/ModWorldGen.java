package com.lord.dominatingchaos.world;

import com.lord.dominatingchaos.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
                         net.minecraft.world.gen.IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()) {
            case 0: // Overworld

                generateOre(ModBlocks.STOUNILIT_ORE.getDefaultState(), world, random, chunkX, chunkZ, 6, 5, 25, 3, Blocks.STONE);
                generateOre(ModBlocks.TECHNICUM_ORE.getDefaultState(), world, random, chunkX, chunkZ, 7, 5, 50, 6, Blocks.STONE);
                generateOre(ModBlocks.CHEMISTRUM_ORE.getDefaultState(), world, random, chunkX, chunkZ, 7, 5, 50, 6, Blocks.STONE);
                generateOre(ModBlocks.PHYSURIYM_ORE.getDefaultState(), world, random, chunkX, chunkZ, 7, 5, 50, 6, Blocks.STONE);
                generateOre(ModBlocks.ARTAMODIUM_ORE.getDefaultState(), world, random, chunkX, chunkZ, 5, 5, 20, 3, Blocks.STONE);
                break;

            case -1: // Nether
                generateOre(ModBlocks.REDNOVITE_ORE.getDefaultState(), world, random, chunkX, chunkZ, 10, 20, 64, 8, Blocks.NETHERRACK);
                generateOre(ModBlocks.UNUSUALIUM_ORE.getDefaultState(), world, random, chunkX, chunkZ, 6, 30, 38, 4, Blocks.NETHERRACK);
                generateOre(ModBlocks.CLEAROLIUM_ORE.getDefaultState(), world, random, chunkX, chunkZ, 6, 30, 40, 4, Blocks.NETHERRACK);
                break;

            case 1: // End
                break;
        }
    }

    private void generateOre(IBlockState ore, World world, Random random, int chunkX, int chunkZ,
                             int veinsPerChunk, int minY, int maxY, int veinSize, net.minecraft.block.Block replaceableBlock) {
        int deltaY = maxY - minY + 1;
        for (int i = 0; i < veinsPerChunk; i++) {
            int x = chunkX * 16 + random.nextInt(16);
            int y = minY + random.nextInt(deltaY);
            int z = chunkZ * 16 + random.nextInt(16);
            new WorldGenMinable(ore, veinSize, block -> block.getBlock() == replaceableBlock)
                    .generate(world, random, new BlockPos(x, y, z));
        }
    }
}