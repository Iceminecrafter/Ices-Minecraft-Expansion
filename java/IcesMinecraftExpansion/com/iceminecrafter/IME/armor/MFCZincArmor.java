package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCZincArmor extends ItemArmor{

	public MFCZincArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(IcesMinecraftExpansion.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == IcesMinecraftExpansion.MFCZincHelmet){
			return "metalforgecraft" + ":textures/models/armor/ZincArmor_1.png";
		}
		
		if(stack.getItem() == IcesMinecraftExpansion.MFCZincChestplate){
			return "metalforgecraft" + ":textures/models/armor/ZincArmor_1.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCZincLeggings){
			return "metalforgecraft" + ":textures/models/armor/ZincArmor_2.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCZincBoots){
			return "metalforgecraft" + ":textures/models/armor/ZincArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
