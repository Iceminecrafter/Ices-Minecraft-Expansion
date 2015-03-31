package com.iceminecrafter.IME.items.herbs;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class MFCAloe extends ItemFood{

	public MFCAloe(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setPotionEffect(Potion.fireResistance.id, 10, 1, 0.9F);
	}


}
	