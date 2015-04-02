package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemSword;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCOsmiumSword extends ItemSword{

	public MFCOsmiumSword(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
