package com.iceminecrafter.IME.blocks;

import java.util.ArrayList;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

public class MFCSolidCrudeOil extends Block {

	public MFCSolidCrudeOil() {
		super(Material.sand);
		// TODO Auto-generated constructor stub
	}
	
    public void harvestBlock(World world, EntityPlayer player, int x, int y, int z, int par1)
    {
    	player.addStat(StatList.mineBlockStatArray[Block.getIdFromBlock(this)], 1);
    	player.addExhaustion(0.025F);

        if (this.canSilkHarvest(world, player, x, y, z, par1) && EnchantmentHelper.getSilkTouchModifier(player))
        {
            ArrayList<ItemStack> items = new ArrayList<ItemStack>();
            ItemStack itemstack = this.createStackedBlock(par1);

            if (itemstack != null) items.add(itemstack);

            ForgeEventFactory.fireBlockHarvesting(items, world, this, x, y, z, par1, 0, 1.0f, true, player);
            for (ItemStack is : items)
                this.dropBlockAsItem(world, x, y, z, is);
        }
        else
        {
            if (world.provider.isHellWorld)
            {
            	world.setBlock(x, y, z, Blocks.fire);
                return;
            }

            int i1 = EnchantmentHelper.getFortuneModifier(player);
            harvesters.set(player);
            this.dropBlockAsItem(world, x, y, z, par1, i1);
            harvesters.set(null);
            Material material = world.getBlock(x, y - 1, z).getMaterial();

            if (material.blocksMovement() || material.isLiquid())
            {
            	world.setBlock(x, y, z, IcesMinecraftExpansion.MFCCrudeOil);
            }
        }
    }

}
