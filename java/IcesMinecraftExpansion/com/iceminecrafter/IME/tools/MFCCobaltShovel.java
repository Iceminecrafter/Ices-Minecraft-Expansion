package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemSpade;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCCobaltShovel extends ItemSpade{

	public MFCCobaltShovel(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
