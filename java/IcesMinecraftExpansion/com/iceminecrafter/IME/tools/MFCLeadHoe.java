package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemHoe;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCLeadHoe extends ItemHoe{

	public MFCLeadHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
