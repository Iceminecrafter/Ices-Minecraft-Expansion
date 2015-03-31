package com.iceminecrafter.IME.items.herbs;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class MFCPeperminttea extends ItemFood{

	public MFCPeperminttea(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		setPotionEffect(Potion.hunger.id, 5, 1, 0.5F);
	}


}
	