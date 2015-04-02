package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.proxy.CommonProxy;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCBismuthArmor extends ItemArmor{

	public MFCBismuthArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(CommonProxy.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == CommonProxy.MFCBismuthHelmet){
			return "metalforgecraft" + ":textures/models/armor/BismuthArmor_1.png";
		}
		
		if(stack.getItem() == CommonProxy.MFCBismuthChestplate){
			return "metalforgecraft" + ":textures/models/armor/BismuthArmor_1.png";
		}
		if(stack.getItem() == CommonProxy.MFCBismuthLeggings){
			return "metalforgecraft" + ":textures/models/armor/BismuthArmor_2.png";
		}
		if(stack.getItem() == CommonProxy.MFCBismuthBoots){
			return "metalforgecraft" + ":textures/models/armor/BismuthArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
