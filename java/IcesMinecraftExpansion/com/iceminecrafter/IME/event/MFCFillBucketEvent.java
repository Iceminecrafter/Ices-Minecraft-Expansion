package com.iceminecrafter.IME.event;


import com.iceminecrafter.IME.IcesMinecraftExpansion;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.Event.Result;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class MFCFillBucketEvent {
	
	
	@EventHandler
	public void FillBucket(FillBucketEvent event){
		if(event.current.getItem() != Items.bucket){
			return;
		}
		
		ItemStack fullBucket = getLiquid(event.world, event.target);
		
		if(fullBucket == null) return;
		
		event.world.setBlockToAir(event.target.blockX, event.target.blockY, event.target.blockZ);
		event.result = fullBucket;
		event.setResult(Result.ALLOW);
	}
	
	private ItemStack getLiquid(World world, MovingObjectPosition pos){
		  Block block = world.getBlock(pos.blockX, pos.blockY, pos.blockZ);
		  
		  
		if(block == IcesMinecraftExpansion.MFCCrudeOil){
			return new ItemStack(IcesMinecraftExpansion.MFCOilBucket);
		}
		
		return null;
	}
	
}
