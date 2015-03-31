package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCBismuthArmor extends ItemArmor{

	public MFCBismuthArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(IcesMinecraftExpansion.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == IcesMinecraftExpansion.MFCBismuthHelmet){
			return "metalforgecraft" + ":textures/models/armor/BismuthArmor_1.png";
		}
		
		if(stack.getItem() == IcesMinecraftExpansion.MFCBismuthChestplate){
			return "metalforgecraft" + ":textures/models/armor/BismuthArmor_1.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCBismuthLeggings){
			return "metalforgecraft" + ":textures/models/armor/BismuthArmor_2.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCBismuthBoots){
			return "metalforgecraft" + ":textures/models/armor/BismuthArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
