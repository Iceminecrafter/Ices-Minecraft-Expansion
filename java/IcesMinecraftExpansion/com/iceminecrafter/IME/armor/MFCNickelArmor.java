package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCNickelArmor extends ItemArmor{

	public MFCNickelArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(IcesMinecraftExpansion.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == IcesMinecraftExpansion.MFCNickelHelmet){
			return "metalforgecraft" + ":textures/models/armor/NickelArmor_1.png";
		}
		
		if(stack.getItem() == IcesMinecraftExpansion.MFCNickelChestplate){
			return "metalforgecraft" + ":textures/models/armor/NickelArmor_1.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCNickelLeggings){
			return "metalforgecraft" + ":textures/models/armor/NickelArmor_2.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCNickelBoots){
			return "metalforgecraft" + ":textures/models/armor/NickelArmor_1.png";
		}
		else {
			return null;
		}
		
}}
