package com.iceminecrafter.IME.items.herbs;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class MFCHerbaltea extends ItemFood{

	public MFCHerbaltea(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setPotionEffect(Potion.regeneration.id, 5, 4, 1.0F);


	}


}
	