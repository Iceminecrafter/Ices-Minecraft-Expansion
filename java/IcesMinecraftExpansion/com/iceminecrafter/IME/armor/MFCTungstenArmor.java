package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCTungstenArmor extends ItemArmor{

	public MFCTungstenArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(IcesMinecraftExpansion.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == IcesMinecraftExpansion.MFCTungstenHelmet){
			return "metalforgecraft" + ":textures/models/armor/TungstenArmor_1.png";
		}
		
		if(stack.getItem() == IcesMinecraftExpansion.MFCTungstenChestplate){
			return "metalforgecraft" + ":textures/models/armor/TungstenArmor_1.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCTungstenLeggings){
			return "metalforgecraft" + ":textures/models/armor/TungstenArmor_2.png";
		}
		if(stack.getItem() == IcesMinecraftExpansion.MFCTungstenBoots){
			return "metalforgecraft" + ":textures/models/armor/TungstenArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
