package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.proxy.CommonProxy;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCNickelArmor extends ItemArmor{

	public MFCNickelArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(CommonProxy.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == CommonProxy.MFCNickelHelmet){
			return "metalforgecraft" + ":textures/models/armor/NickelArmor_1.png";
		}
		
		if(stack.getItem() == CommonProxy.MFCNickelChestplate){
			return "metalforgecraft" + ":textures/models/armor/NickelArmor_1.png";
		}
		if(stack.getItem() == CommonProxy.MFCNickelLeggings){
			return "metalforgecraft" + ":textures/models/armor/NickelArmor_2.png";
		}
		if(stack.getItem() == CommonProxy.MFCNickelBoots){
			return "metalforgecraft" + ":textures/models/armor/NickelArmor_1.png";
		}
		else {
			return null;
		}
		
}}
