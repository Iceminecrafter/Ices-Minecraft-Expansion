package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCMagnesiumArmor extends ItemArmor{

	public MFCMagnesiumArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(IcesMinecraftExpansion.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == IcesMinecraftExpansion.MFCMagnesiumHelmet){
			return "metalforgecraft" + ":textures/models/armor/MagnesiumArmor_1.png";
		}
		
		if(stack.getItem() == IcesMinecraftExpansion.MFCMagnesiumChestplate){
			return "metalforgecraft" + ":textures/models/armor/MagnesiumArmor_1.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCMagnesiumLeggings){
			return "metalforgecraft" + ":textures/models/armor/MagnesiumArmor_2.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCMagnesiumBoots){
			return "metalforgecraft" + ":textures/models/armor/MagnesiumArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
