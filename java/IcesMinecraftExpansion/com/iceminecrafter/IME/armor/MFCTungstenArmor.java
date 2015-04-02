package com.iceminecrafter.IME.armor;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.proxy.CommonProxy;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MFCTungstenArmor extends ItemArmor{

	public MFCTungstenArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(CommonProxy.MFC);
		
		
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(stack.getItem() == CommonProxy.MFCTungstenHelmet){
			return "metalforgecraft" + ":textures/models/armor/TungstenArmor_1.png";
		}
		
		if(stack.getItem() == CommonProxy.MFCTungstenChestplate){
			return "metalforgecraft" + ":textures/models/armor/TungstenArmor_1.png";
		}
		if(stack.getItem() == CommonProxy.MFCTungstenLeggings){
			return "metalforgecraft" + ":textures/models/armor/TungstenArmor_2.png";
		}
		if(stack.getItem() == CommonProxy.MFCTungstenBoots){
			return "metalforgecraft" + ":textures/models/armor/TungstenArmor_1.png";
		}
		else {
			return null;
		}
		
}
}
