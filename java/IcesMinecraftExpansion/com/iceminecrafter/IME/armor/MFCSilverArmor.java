package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.proxy.CommonProxy;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCSilverArmor extends ItemArmor{

	public MFCSilverArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(CommonProxy.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == CommonProxy.MFCSilverHelmet){
			return "metalforgecraft" + ":textures/models/armor/SilverArmor_1.png";
		}
		
		if(stack.getItem() == CommonProxy.MFCSilverChestplate){
			return "metalforgecraft" + ":textures/models/armor/SilverArmor_1.png";
		}
		if(stack.getItem() == CommonProxy.MFCSilverLeggings){
			return "metalforgecraft" + ":textures/models/armor/SilverArmor_2.png";
		}
		if(stack.getItem() == CommonProxy.MFCSilverBoots){
			return "metalforgecraft" + ":textures/models/armor/SilverArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
