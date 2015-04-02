package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemAxe;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCLeadAxe extends ItemAxe{

	public MFCLeadAxe(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
