package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemHoe;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCTinHoe extends ItemHoe{

	public MFCTinHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
