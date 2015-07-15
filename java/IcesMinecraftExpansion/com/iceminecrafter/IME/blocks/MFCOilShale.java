package com.iceminecrafter.IME.blocks;

import java.util.Random;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class MFCOilShale extends Block{
	
	public MFCOilShale() {
		super(Material.sand);

	}
	
    @Override
	public Item getItemDropped(int par1, Random par2Random, int par3){
		return IcesMinecraftExpansion.OilySand;
	}

}
