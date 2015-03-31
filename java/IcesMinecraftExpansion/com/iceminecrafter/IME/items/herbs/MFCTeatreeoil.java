package com.iceminecrafter.IME.items.herbs;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class MFCTeatreeoil extends ItemFood{

	public MFCTeatreeoil(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setPotionEffect(Potion.weakness.id, 0, 1, 0.5F);
	}


}
	