package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.proxy.CommonProxy;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCZincArmor extends ItemArmor{

	public MFCZincArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(CommonProxy.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == CommonProxy.MFCZincHelmet){
			return "metalforgecraft" + ":textures/models/armor/ZincArmor_1.png";
		}
		
		if(stack.getItem() == CommonProxy.MFCZincChestplate){
			return "metalforgecraft" + ":textures/models/armor/ZincArmor_1.png";
		}
		if(stack.getItem() == CommonProxy.MFCZincLeggings){
			return "metalforgecraft" + ":textures/models/armor/ZincArmor_2.png";
		}
		if(stack.getItem() == CommonProxy.MFCZincBoots){
			return "metalforgecraft" + ":textures/models/armor/ZincArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
