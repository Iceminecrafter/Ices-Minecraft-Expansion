package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemAxe;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCTinAxe extends ItemAxe{

	public MFCTinAxe(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
