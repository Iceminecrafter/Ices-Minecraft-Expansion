package com.iceminecrafter.IME.gen;

import java.util.Random;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.proxy.CommonProxy;

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
			
			(new WorldGenMinable(CommonProxy.mfcorealuminium, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CommonProxy.mfcorebismuth, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CommonProxy.mfcorecalcium, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CommonProxy.mfcorecinnabar, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CommonProxy.mfcorecobalt, 3)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 7; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(12);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CommonProxy.mfcorecopper, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CommonProxy.mfcorelead, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CommonProxy.mfcoremagnesium, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CommonProxy.mfcorenickel, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CommonProxy.mfcoreosmium, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CommonProxy.mfcoreplatinum, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CommonProxy.mfcoresilver, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CommonProxy.mfcoretin, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CommonProxy.mfcoretungsten, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CommonProxy.mfcorezinc, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CommonProxy.MFCOilShale, 30)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for(int i = 0; i < 4; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(30);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(CommonProxy.MFCSolidCrudeOil, 30)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		
		
		
		int l = random.nextInt(4) + 4;
        int i1;
	
      
			(new WorldGenLakes(CommonProxy.MFCCrudeOil)).generate(world, random, x + random.nextInt(1600), 4, z + random.nextInt(1600));
        
		
		
		
		
		
		
	}

	private void generateInNether(World world, Random random, int x, int z) {
		
		
	}

}
