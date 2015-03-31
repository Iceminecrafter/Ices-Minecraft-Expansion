package com.iceminecrafter.IME.items.herbs;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class MFCPepermintoil extends ItemFood{

	public MFCPepermintoil(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setPotionEffect(Potion.poison.id, 5, 1, 0.5F);

	}


}
	