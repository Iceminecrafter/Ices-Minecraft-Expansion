package com.iceminecrafter.IME.items;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.world.World;

public class MFCShaleOilBucket extends ItemBucket {
	

	public MFCShaleOilBucket(Block block) {
		super(block);
		
		this.setCreativeTab(IcesMinecraftExpansion.MFC);
		

		
	}
	
	public boolean tryPlaceContainedLiquid(World world, int x, int y, int z){
		if(!world.isAirBlock(x,y,z)){
			return false;
		}else {
			world.setBlock(x, y, z, IcesMinecraftExpansion.MFCShaleOil, 0, 3);
		}
		
		return false;
	}

}
