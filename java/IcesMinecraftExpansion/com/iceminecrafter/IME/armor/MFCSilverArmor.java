package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCSilverArmor extends ItemArmor{

	public MFCSilverArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(IcesMinecraftExpansion.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == IcesMinecraftExpansion.MFCSilverHelmet){
			return "metalforgecraft" + ":textures/models/armor/SilverArmor_1.png";
		}
		
		if(stack.getItem() == IcesMinecraftExpansion.MFCSilverChestplate){
			return "metalforgecraft" + ":textures/models/armor/SilverArmor_1.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCSilverLeggings){
			return "metalforgecraft" + ":textures/models/armor/SilverArmor_2.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCSilverBoots){
			return "metalforgecraft" + ":textures/models/armor/SilverArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
