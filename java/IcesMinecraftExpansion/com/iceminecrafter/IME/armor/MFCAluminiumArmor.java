package com.iceminecrafter.IME.armor;

import java.util.Stack;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCAluminiumArmor extends ItemArmor{

	public MFCAluminiumArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(IcesMinecraftExpansion.MFC);
		
		
	}
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
			if(stack.getItem() == IcesMinecraftExpansion.MFCAluminiumHelmet){
				return "metalforgecraft" + ":textures/models/armor/AluminiumArmor_1.png";
			}
			
			if(stack.getItem() == IcesMinecraftExpansion.MFCAluminiumChestplate){
				return "metalforgecraft" + ":textures/models/armor/AluminiumArmor_1.png";
			}
			if(stack.getItem() == IcesMinecraftExpansion.MFCAluminiumLeggings){
				return "metalforgecraft" + ":textures/models/armor/AluminiumArmor_2.png";
			}
			if(stack.getItem() == IcesMinecraftExpansion.MFCAluminiumBoots){
				return "metalforgecraft" + ":textures/models/armor/AluminiumArmor_1.png";
			}
			else {
				return null;
			}
			
		}
		
		
	

}
