package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemPickaxe;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCCobaltPickaxe extends ItemPickaxe{

	public MFCCobaltPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
