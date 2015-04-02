package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemAxe;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCOsmiumAxe extends ItemAxe{

	public MFCOsmiumAxe(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
