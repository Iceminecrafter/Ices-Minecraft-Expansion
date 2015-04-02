package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemAxe;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCMagnesiumAxe extends ItemAxe{

	public MFCMagnesiumAxe(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
