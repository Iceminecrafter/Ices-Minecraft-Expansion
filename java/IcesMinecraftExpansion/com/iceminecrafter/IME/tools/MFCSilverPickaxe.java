package com.iceminecrafter.IME.tools;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;

public class MFCSilverPickaxe extends ItemPickaxe{

	public MFCSilverPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(IcesMinecraftExpansion.MFC);
	}

}
