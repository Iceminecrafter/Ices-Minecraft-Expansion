package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemSword;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCCalciumSword extends ItemSword{

	public MFCCalciumSword(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
