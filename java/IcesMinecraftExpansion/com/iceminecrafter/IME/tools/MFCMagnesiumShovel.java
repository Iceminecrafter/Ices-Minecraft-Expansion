package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemSpade;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCMagnesiumShovel extends ItemSpade{

	public MFCMagnesiumShovel(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
