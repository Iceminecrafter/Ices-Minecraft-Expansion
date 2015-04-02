package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemSword;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCLeadSword extends ItemSword{

	public MFCLeadSword(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
