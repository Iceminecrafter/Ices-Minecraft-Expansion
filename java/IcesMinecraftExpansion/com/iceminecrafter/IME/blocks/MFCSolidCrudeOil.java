package com.iceminecrafter.IME.blocks;

import java.util.ArrayList;
import java.util.Random;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

public class MFCSolidCrudeOil extends Block {

	public MFCSolidCrudeOil() {
		super(Material.clay);
		// TODO Auto-generated constructor stub
	}

    @Override
	public Item getItemDropped(int par1, Random par2Random, int par3){
		return IcesMinecraftExpansion.OilyClay;
	}

}
