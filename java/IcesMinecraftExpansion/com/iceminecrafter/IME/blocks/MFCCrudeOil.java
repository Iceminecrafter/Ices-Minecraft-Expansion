package com.iceminecrafter.IME.blocks;

import com.iceminecrafter.IME.IcesMinecraftExpansion;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class MFCCrudeOil extends BlockFluidClassic{

	public MFCCrudeOil(Fluid fluid, Material material) {
		super(IcesMinecraftExpansion.CrudeOil, IcesMinecraftExpansion.materialOil);
		
		
	}

}
