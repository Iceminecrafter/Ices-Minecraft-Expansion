package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.proxy.CommonProxy;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCCopperArmor extends ItemArmor{

	public MFCCopperArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(CommonProxy.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == CommonProxy.MFCCopperHelmet){
			return "metalforgecraft" + ":textures/models/armor/CopperArmor_1.png";
		}
		
		if(stack.getItem() == CommonProxy.MFCCopperChestplate){
			return "metalforgecraft" + ":textures/models/armor/CopperArmor_1.png";
		}
		if(stack.getItem() == CommonProxy.MFCCopperLeggings){
			return "metalforgecraft" + ":textures/models/armor/CopperArmor_2.png";
		}
		if(stack.getItem() == CommonProxy.MFCCopperBoots){
			return "metalforgecraft" + ":textures/models/armor/CopperArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
