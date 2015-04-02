package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemPickaxe;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCNickelPickaxe extends ItemPickaxe{

	public MFCNickelPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
