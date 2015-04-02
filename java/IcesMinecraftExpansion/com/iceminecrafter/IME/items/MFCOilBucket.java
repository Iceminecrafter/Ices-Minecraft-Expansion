package com.iceminecrafter.IME.items;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.world.World;

public class MFCOilBucket extends ItemBucket {
	

	public MFCOilBucket(Block block) {
		super(block);
		
		this.setCreativeTab(CommonProxy.MFC);
		

		
	}
	
	public boolean tryPlaceContainedLiquid(World world, int x, int y, int z){
		if(!world.isAirBlock(x,y,z)){
			return false;
		}else {
			world.setBlock(x, y, z, CommonProxy.MFCCrudeOil, 0, 3);
		}
		
		return false;
	}

}
