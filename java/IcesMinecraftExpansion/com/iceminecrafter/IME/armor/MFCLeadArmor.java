package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCLeadArmor extends ItemArmor{

	public MFCLeadArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(IcesMinecraftExpansion.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == IcesMinecraftExpansion.MFCLeadHelmet){
			return "metalforgecraft" + ":textures/models/armor/LeadArmor_1.png";
		}
		
		if(stack.getItem() == IcesMinecraftExpansion.MFCLeadChestplate){
			return "metalforgecraft" + ":textures/models/armor/LeadArmor_1.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCLeadLeggings){
			return "metalforgecraft" + ":textures/models/armor/LeadArmor_2.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCLeadBoots){
			return "metalforgecraft" + ":textures/models/armor/LeadArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
