package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemSword;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCBismuthSword extends ItemSword{

	public MFCBismuthSword(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
