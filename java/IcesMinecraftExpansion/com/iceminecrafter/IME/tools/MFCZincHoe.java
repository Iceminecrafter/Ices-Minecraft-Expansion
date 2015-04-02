package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemHoe;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCZincHoe extends ItemHoe{

	public MFCZincHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
