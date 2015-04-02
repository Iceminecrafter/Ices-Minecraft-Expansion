package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemAxe;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCCobaltAxe extends ItemAxe{

	public MFCCobaltAxe(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
