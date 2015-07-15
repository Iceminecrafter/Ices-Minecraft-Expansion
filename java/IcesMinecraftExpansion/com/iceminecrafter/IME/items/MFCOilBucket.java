package com.iceminecrafter.IME.items;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MFCOilBucket extends ItemBucket {
	

	public MFCOilBucket(Block block) {
		super(block);
		
		this.setCreativeTab(IcesMinecraftExpansion.MFC);
		

		
	}
	public ItemStack onItemUse(ItemStack par1ItemStack, World par2World, int x, int y, int z, EntityPlayer par3EntityPlayer)
    {
		if (this.tryPlaceContainedLiquid(par2World, x, y, z) && !par3EntityPlayer.capabilities.isCreativeMode)
		{
		return new ItemStack(Items.bucket);
		}
		else{
			return par1ItemStack;
		}
    }
    
	@Override
	public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_){
		if(!p_77648_3_.isAirBlock(p_77648_4_,p_77648_5_,p_77648_6_)){
			return false;
		}else {
			p_77648_3_.setBlock(p_77648_4_,p_77648_5_,p_77648_6_, IcesMinecraftExpansion.MFCCrudeOil, 0, 3);
		}
		
		return false;
	}

}
