package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCOsmiumArmor extends ItemArmor{

	public MFCOsmiumArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(IcesMinecraftExpansion.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == IcesMinecraftExpansion.MFCOsmiumHelmet){
			return "metalforgecraft" + ":textures/models/armor/OsmiumArmor_1.png";
		}
		
		if(stack.getItem() == IcesMinecraftExpansion.MFCOsmiumChestplate){
			return "metalforgecraft" + ":textures/models/armor/OsmiumArmor_1.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCOsmiumLeggings){
			return "metalforgecraft" + ":textures/models/armor/OsmiumArmor_2.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCOsmiumBoots){
			return "metalforgecraft" + ":textures/models/armor/OsmiumArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
