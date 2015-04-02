package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemHoe;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCAluminiumHoe extends ItemHoe{

	public MFCAluminiumHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
