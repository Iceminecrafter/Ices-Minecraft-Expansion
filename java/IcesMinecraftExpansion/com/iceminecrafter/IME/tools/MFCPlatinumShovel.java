package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemSpade;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCPlatinumShovel extends ItemSpade{

	public MFCPlatinumShovel(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
