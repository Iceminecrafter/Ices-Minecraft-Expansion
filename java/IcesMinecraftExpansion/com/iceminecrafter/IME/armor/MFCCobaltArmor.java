package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCCobaltArmor extends ItemArmor{

	public MFCCobaltArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(IcesMinecraftExpansion.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == IcesMinecraftExpansion.MFCCobaltHelmet){
			return "metalforgecraft" + ":textures/models/armor/CobaltArmor_1.png";
		}
		
		if(stack.getItem() == IcesMinecraftExpansion.MFCCobaltChestplate){
			return "metalforgecraft" + ":textures/models/armor/CobaltArmor_1.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCCobaltLeggings){
			return "metalforgecraft" + ":textures/models/armor/CobaltArmor_2.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCCobaltBoots){
			return "metalforgecraft" + ":textures/models/armor/CobaltArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
