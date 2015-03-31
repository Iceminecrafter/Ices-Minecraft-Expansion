package com.iceminecrafter.IME.handler;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MFCSmelterRecipes {
	
	private static final MFCSmelterRecipes SMELTING_BASE = new MFCSmelterRecipes();
	
	private Map smeltingList = new HashMap();
	private Map experienceList = new HashMap();
	
	public static MFCSmelterRecipes smelting(){
		return SMELTING_BASE;
	}
	
	private MFCSmelterRecipes(){
		
		
		this.addRecipie(IcesMinecraftExpansion.mfcrawalloycast, new ItemStack(IcesMinecraftExpansion.mfcalloycast), 0.5F);
		
		
		this.addRecipieBlock(IcesMinecraftExpansion.mfcorealuminium, new ItemStack(IcesMinecraftExpansion.mfcingotaluminium, 2), 1.0F);
		this.addRecipieBlock(IcesMinecraftExpansion.mfcorebismuth, new ItemStack(IcesMinecraftExpansion.mfcingotbismuth, 2), 1.0F);
		this.addRecipieBlock(IcesMinecraftExpansion.mfcorecalcium, new ItemStack(IcesMinecraftExpansion.mfcingotcalcium, 2), 1.0F);
		this.addRecipieBlock(IcesMinecraftExpansion.mfcorecobalt, new ItemStack(IcesMinecraftExpansion.mfcingotcobalt, 2), 1.0F);
		this.addRecipieBlock(IcesMinecraftExpansion.mfcorecopper, new ItemStack(IcesMinecraftExpansion.mfcingotcopper, 2), 1.0F);
		this.addRecipieBlock(IcesMinecraftExpansion.mfcorelead, new ItemStack(IcesMinecraftExpansion.mfcingotlead, 2), 1.0F);
		this.addRecipieBlock(IcesMinecraftExpansion.mfcoremagnesium, new ItemStack(IcesMinecraftExpansion.mfcingotmagnesium, 2), 1.0F);
		this.addRecipieBlock(IcesMinecraftExpansion.mfcorenickel, new ItemStack(IcesMinecraftExpansion.mfcingotaluminium, 2), 1.0F);
		this.addRecipieBlock(IcesMinecraftExpansion.mfcoreosmium, new ItemStack(IcesMinecraftExpansion.mfcingotnickel, 2), 1.0F);
		this.addRecipieBlock(IcesMinecraftExpansion.mfcoreplatinum, new ItemStack(IcesMinecraftExpansion.mfcingotplatinum, 2), 1.0F);
		this.addRecipieBlock(IcesMinecraftExpansion.mfcoresilver, new ItemStack(IcesMinecraftExpansion.mfcingotsilver, 2), 1.0F);
		this.addRecipieBlock(IcesMinecraftExpansion.mfcoretin, new ItemStack(IcesMinecraftExpansion.mfcingottin, 2), 1.0F);
		this.addRecipieBlock(IcesMinecraftExpansion.mfcoretungsten, new ItemStack(IcesMinecraftExpansion.mfcingottungsten, 2), 1.0F);
		this.addRecipieBlock(IcesMinecraftExpansion.mfcorezinc, new ItemStack(IcesMinecraftExpansion.mfcingotzinc, 2), 1.0F);
		this.addRecipieBlock(Blocks.iron_ore, new ItemStack(IcesMinecraftExpansion.mfcingotzinc, 2), 1.0F);
		this.addRecipieBlock(Blocks.gold_ore, new ItemStack(IcesMinecraftExpansion.mfcingotzinc, 2), 1.0F);
		this.addRecipieBlock(Blocks.log, new ItemStack(Items.coal, 1), 1.0F);
		
	}
	
	public void addRecipie(Item item, ItemStack itemstack, float experience){
		this.addLists(item, itemstack, experience);
	}
	public void addRecipieBlock(Block block, ItemStack itemstack, float experience){
		this.addListsBlock(block, itemstack, experience);
	}
	
	public void addLists(Item item, ItemStack itemstack, float experience){
		this.putLists(new ItemStack(item, 1, 32767), itemstack, experience);
	}
	
	public void addListsBlock(Block block, ItemStack itemstack, float experience){
		this.putLists(new ItemStack(block, 1, 32767), itemstack, experience);
	}
	
	public void putLists(ItemStack itemstack, ItemStack itemstack2, float experience){
		this.smeltingList.put(itemstack, itemstack2);
		this.experienceList.put(itemstack2, Float.valueOf(experience));
	}
	
	public ItemStack getSmeltingResult(ItemStack itemstack){
		Iterator iterator = this.smeltingList.entrySet().iterator();
		Entry entry;
		
		do{
			if(!iterator.hasNext()){
				return null;
			}
			entry = (Entry) iterator.next();
		}
		while(!canBeSmelted(itemstack, (ItemStack)entry.getKey()));
		return (ItemStack)entry.getValue();
	}

	private boolean canBeSmelted(ItemStack itemstack, ItemStack itemstack2) {
		return itemstack2.getItem() == itemstack.getItem() && (itemstack2.getItemDamage() == 32767 || itemstack2.getItemDamage() == itemstack.getItemDamage());
	}
	
	public float giveExperience(ItemStack itemstack){
		Iterator iterator = this.experienceList.entrySet().iterator();
		Entry entry;
		
		do{
			if(!iterator.hasNext()){
				return 0.0F;
			}
			entry = (Entry) iterator.next();
		}
		while(!this.canBeSmelted(itemstack, (ItemStack)entry.getKey()));
		
		if(itemstack.getItem().getSmeltingExperience(itemstack) != -1){
			return itemstack.getItem().getSmeltingExperience(itemstack);
		}
		
		return ((Float)entry.getValue()).floatValue();
	}
}
