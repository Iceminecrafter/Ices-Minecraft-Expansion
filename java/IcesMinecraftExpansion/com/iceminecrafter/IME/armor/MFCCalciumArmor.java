package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.proxy.CommonProxy;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCCalciumArmor extends ItemArmor{

	public MFCCalciumArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(CommonProxy.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == CommonProxy.MFCCalciumHelmet){
			return "metalforgecraft" + ":textures/models/armor/CalciumArmor_1.png";
		}
		
		if(stack.getItem() == CommonProxy.MFCCalciumChestplate){
			return "metalforgecraft" + ":textures/models/armor/CalciumArmor_1.png";
		}
		if(stack.getItem() == CommonProxy.MFCCalciumLeggings){
			return "metalforgecraft" + ":textures/models/armor/CalciumArmor_2.png";
		}
		if(stack.getItem() == CommonProxy.MFCCalciumBoots){
			return "metalforgecraft" + ":textures/models/armor/CalciumArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
