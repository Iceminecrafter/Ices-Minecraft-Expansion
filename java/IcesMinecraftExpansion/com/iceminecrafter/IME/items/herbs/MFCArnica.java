package com.iceminecrafter.IME.items.herbs;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class MFCArnica extends ItemFood{

	public MFCArnica(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setPotionEffect(Potion.moveSlowdown.id, 0, 1, 1.5F);

		
	}


}
	