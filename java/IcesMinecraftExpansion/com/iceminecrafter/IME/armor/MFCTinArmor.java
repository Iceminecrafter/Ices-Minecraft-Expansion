package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.proxy.CommonProxy;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCTinArmor extends ItemArmor{

	public MFCTinArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(CommonProxy.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == CommonProxy.MFCTinHelmet){
			return "metalforgecraft" + ":textures/models/armor/TinArmor_1.png";
		}
		
		if(stack.getItem() == CommonProxy.MFCTinChestplate){
			return "metalforgecraft" + ":textures/models/armor/TinArmor_1.png";
		}
		if(stack.getItem() == CommonProxy.MFCTinLeggings){
			return "metalforgecraft" + ":textures/models/armor/TinArmor_2.png";
		}
		if(stack.getItem() == CommonProxy.MFCTinBoots){
			return "metalforgecraft" + ":textures/models/armor/TinArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
