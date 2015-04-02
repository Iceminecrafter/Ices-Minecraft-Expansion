package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemSpade;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCCopperShovel extends ItemSpade{

	public MFCCopperShovel(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
