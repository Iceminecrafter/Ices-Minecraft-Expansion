package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.proxy.CommonProxy;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCOsmiumArmor extends ItemArmor{

	public MFCOsmiumArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(CommonProxy.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == CommonProxy.MFCOsmiumHelmet){
			return "metalforgecraft" + ":textures/models/armor/OsmiumArmor_1.png";
		}
		
		if(stack.getItem() == CommonProxy.MFCOsmiumChestplate){
			return "metalforgecraft" + ":textures/models/armor/OsmiumArmor_1.png";
		}
		if(stack.getItem() == CommonProxy.MFCOsmiumLeggings){
			return "metalforgecraft" + ":textures/models/armor/OsmiumArmor_2.png";
		}
		if(stack.getItem() == CommonProxy.MFCOsmiumBoots){
			return "metalforgecraft" + ":textures/models/armor/OsmiumArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
