package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemSpade;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCAluminiumShovel extends ItemSpade{

	public MFCAluminiumShovel(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
