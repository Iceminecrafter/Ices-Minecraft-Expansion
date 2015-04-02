package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemPickaxe;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCLeadPickaxe extends ItemPickaxe{

	public MFCLeadPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
