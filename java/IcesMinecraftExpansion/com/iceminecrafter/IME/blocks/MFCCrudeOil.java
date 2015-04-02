package com.iceminecrafter.IME.blocks;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.proxy.CommonProxy;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class MFCCrudeOil extends BlockFluidClassic{

	public MFCCrudeOil(Fluid fluid, Material material) {
		super(CommonProxy.CrudeOil, Material.water);
		
		
	}

}
