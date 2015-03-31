package com.iceminecrafter.IME.blocks;

import java.util.Random;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class MFCOreCinnabar extends Block {

	public MFCOreCinnabar() {
		super(Material.rock);
		
		

	}
	
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3){
		return IcesMinecraftExpansion.mfccrystalcinnabar;
	}

}
