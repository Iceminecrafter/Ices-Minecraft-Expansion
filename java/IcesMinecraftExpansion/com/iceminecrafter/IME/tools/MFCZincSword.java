package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemSword;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCZincSword extends ItemSword{

	public MFCZincSword(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
