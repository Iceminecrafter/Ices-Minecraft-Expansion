package com.iceminecrafter.IME.blocks;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.proxy.CommonProxy;

public class MFCShaleOil extends BlockFluidClassic{

	public MFCShaleOil(Fluid fluid, Material material) {
		super(CommonProxy.ShaleOil, Material.water);
		
		
	}

}
