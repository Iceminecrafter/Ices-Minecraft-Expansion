package com.iceminecrafter.IME.gen;

import java.util.Random;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class MFCGeneration implements IWorldGenerator{



	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		
		
		
		switch(world.provider.dimensionId) {
		case -1:
			generateInNether(world, random, chunkX*16, chunkZ*16);
			break;
		case 0:
			generateInOverworld(world, random, chunkX*16, chunkZ*16);
			break;
		case 1:
			generateInEnd(world, random, chunkX*16, chunkZ*16);
			break;
		}
	}
	
	
   
	private void generateInEnd(World world, Random random, int x, int z) {
		
		
	}

	private void generateInOverworld(World world, Random random, int x, int z) {
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.mfcorealuminium, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.mfcorebismuth, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.mfcorecalcium, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.mfcorecinnabar, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.mfcorecobalt, 3)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 7; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(12);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.mfcorecopper, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.mfcorelead, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.mfcoremagnesium, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.mfcorenickel, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.mfcoreosmium, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.mfcoreplatinum, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.mfcoresilver, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.mfcoretin, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.mfcoretungsten, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.mfcorezinc, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.MFCOilShale, 30)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 4; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(30);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(IcesMinecraftExpansion.MFCSolidCrudeOil, 30)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		
		
		
		int l = random.nextInt(4) + 4;
        int i1;
	
      
			(new WorldGenLakes(IcesMinecraftExpansion.MFCCrudeOil)).generate(world, random, x + random.nextInt(1600), 4, z + random.nextInt(1600));
        
		
		
		
		
		
		
	}

	private void generateInNether(World world, Random random, int x, int z) {
		
		
	}

}
