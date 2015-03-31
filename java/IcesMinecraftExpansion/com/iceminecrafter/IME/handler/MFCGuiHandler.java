package com.iceminecrafter.IME.handler;

import com.iceminecrafter.IME.gui.GUIMFCSmelter;
import com.iceminecrafter.IME.inventory.ContainerMFCSmelter;
import com.iceminecrafter.IME.tileentity.TileEntityMFCSmelter;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class MFCGuiHandler implements IGuiHandler {

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		if(ID == 0){
			TileEntityMFCSmelter tileentitysmelter = (TileEntityMFCSmelter) world.getTileEntity(x, y, z);
			return new GUIMFCSmelter(player.inventory, tileentitysmelter);
		}
		return null;
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		if(ID == 0){
			TileEntityMFCSmelter tileentitysmelter = (TileEntityMFCSmelter) world.getTileEntity(x, y, z);
			
			return new ContainerMFCSmelter(player.inventory, tileentitysmelter);
		}
		return null;
	}

}
