package com.iceminecrafter.IME.tools;

import net.minecraft.item.ItemPickaxe;

import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCTungstenPickaxe extends ItemPickaxe{

	public MFCTungstenPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(CommonProxy.MFC);
	}

}
