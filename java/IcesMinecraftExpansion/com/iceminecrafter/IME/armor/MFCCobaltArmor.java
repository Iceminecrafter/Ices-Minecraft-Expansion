package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.proxy.CommonProxy;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCCobaltArmor extends ItemArmor{

	public MFCCobaltArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(CommonProxy.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == CommonProxy.MFCCobaltHelmet){
			return "metalforgecraft" + ":textures/models/armor/CobaltArmor_1.png";
		}
		
		if(stack.getItem() == CommonProxy.MFCCobaltChestplate){
			return "metalforgecraft" + ":textures/models/armor/CobaltArmor_1.png";
		}
		if(stack.getItem() == CommonProxy.MFCCobaltLeggings){
			return "metalforgecraft" + ":textures/models/armor/CobaltArmor_2.png";
		}
		if(stack.getItem() == CommonProxy.MFCCobaltBoots){
			return "metalforgecraft" + ":textures/models/armor/CobaltArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
