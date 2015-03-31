package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCPlatinumArmor extends ItemArmor{

	public MFCPlatinumArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(IcesMinecraftExpansion.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == IcesMinecraftExpansion.MFCPlatinumHelmet){
			return "metalforgecraft" + ":textures/models/armor/PlatinumArmor_1.png";
		}
		
		if(stack.getItem() == IcesMinecraftExpansion.MFCPlatinumChestplate){
			return "metalforgecraft" + ":textures/models/armor/PlatinumArmor_1.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCPlatinumLeggings){
			return "metalforgecraft" + ":textures/models/armor/PlatinumArmor_2.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCPlatinumBoots){
			return "metalforgecraft" + ":textures/models/armor/PlatinumArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
