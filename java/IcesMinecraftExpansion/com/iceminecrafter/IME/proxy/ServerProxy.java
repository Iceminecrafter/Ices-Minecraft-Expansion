package com.iceminecrafter.IME.proxy;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.tileentity.TileEntityMFCSmelter;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ServerProxy {
	
	public void registerRenderThings(){
		
	}
	public void registerNetworkStuff(){
		NetworkRegistry.INSTANCE.registerGuiHandler(IcesMinecraftExpansion.modInstance, new com.iceminecrafter.IME.handler.MFCGuiHandler());
	}
	
	public void registerTileEntities(){
		
	}

}
