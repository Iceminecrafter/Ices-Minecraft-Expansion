package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemPickaxe;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCMagnesiumPickaxe extends ItemPickaxe{

	public MFCMagnesiumPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
