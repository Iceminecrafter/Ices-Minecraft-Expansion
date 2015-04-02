package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.proxy.CommonProxy;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCPlatinumArmor extends ItemArmor{

	public MFCPlatinumArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(CommonProxy.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == CommonProxy.MFCPlatinumHelmet){
			return "metalforgecraft" + ":textures/models/armor/PlatinumArmor_1.png";
		}
		
		if(stack.getItem() == CommonProxy.MFCPlatinumChestplate){
			return "metalforgecraft" + ":textures/models/armor/PlatinumArmor_1.png";
		}
		if(stack.getItem() == CommonProxy.MFCPlatinumLeggings){
			return "metalforgecraft" + ":textures/models/armor/PlatinumArmor_2.png";
		}
		if(stack.getItem() == CommonProxy.MFCPlatinumBoots){
			return "metalforgecraft" + ":textures/models/armor/PlatinumArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
