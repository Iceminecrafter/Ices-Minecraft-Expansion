package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCTinArmor extends ItemArmor{

	public MFCTinArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(IcesMinecraftExpansion.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == IcesMinecraftExpansion.MFCTinHelmet){
			return "metalforgecraft" + ":textures/models/armor/TinArmor_1.png";
		}
		
		if(stack.getItem() == IcesMinecraftExpansion.MFCTinChestplate){
			return "metalforgecraft" + ":textures/models/armor/TinArmor_1.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCTinLeggings){
			return "metalforgecraft" + ":textures/models/armor/TinArmor_2.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCTinBoots){
			return "metalforgecraft" + ":textures/models/armor/TinArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
