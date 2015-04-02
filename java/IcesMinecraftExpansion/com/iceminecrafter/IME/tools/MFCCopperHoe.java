package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemHoe;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCCopperHoe extends ItemHoe{

	public MFCCopperHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
