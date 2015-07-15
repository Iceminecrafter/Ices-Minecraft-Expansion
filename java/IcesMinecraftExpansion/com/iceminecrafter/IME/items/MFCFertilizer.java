package com.iceminecrafter.IME.items;

import cpw.mods.fml.common.eventhandler.Event.Result;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.FakePlayerFactory;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class MFCFertilizer extends Item{

	
	
	 public static boolean applyBonemeal(ItemStack p_150919_0_, World p_150919_1_, int p_150919_2_, int p_150919_3_, int p_150919_4_, EntityPlayer player)
	    {
	        Block block = p_150919_1_.getBlock(p_150919_2_, p_150919_3_, p_150919_4_);

	        BonemealEvent event = new BonemealEvent(player, p_150919_1_, block, p_150919_2_, p_150919_3_, p_150919_4_);
	        if (MinecraftForge.EVENT_BUS.post(event))
	        {
	            return false;
	        }

	        if (event.getResult() == Result.ALLOW)
	        {
	            if (!p_150919_1_.isRemote)
	            {
	                p_150919_0_.stackSize--;
	            }
	            return true;
	        }

	        if (block instanceof IGrowable)
	        {
	            IGrowable igrowable = (IGrowable)block;

	            if (igrowable.func_149851_a(p_150919_1_, p_150919_2_, p_150919_3_, p_150919_4_, p_150919_1_.isRemote))
	            {
	                if (!p_150919_1_.isRemote)
	                {
	                    if (igrowable.func_149852_a(p_150919_1_, p_150919_1_.rand, p_150919_2_, p_150919_3_, p_150919_4_))
	                    {
	                        igrowable.func_149853_b(p_150919_1_, p_150919_1_.rand, p_150919_2_, p_150919_3_, p_150919_4_);
	                    }

	                    --p_150919_0_.stackSize;
	                }

	                return true;
	            }

	        }
			return false;}
	        
	        
	        
	        public static boolean func_150919_a(ItemStack p_150919_0_, World p_150919_1_, int p_150919_2_, int p_150919_3_, int p_150919_4_)
	        {
	            if (p_150919_1_ instanceof WorldServer)
	                return applyBonemeal(p_150919_0_, p_150919_1_, p_150919_2_, p_150919_3_, p_150919_4_, FakePlayerFactory.getMinecraft((WorldServer)p_150919_1_));
	            return false;
	        }
}
