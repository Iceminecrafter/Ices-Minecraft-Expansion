package com.iceminecrafter.IME.Mob;

import com.iceminecrafter.IME.Entity.EntityMFCFly;
import com.iceminecrafter.IME.Entity.EntityMFCMaggot;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMFCMaggot extends RenderLiving{

	private static final ResourceLocation Textures = new ResourceLocation("metalforgecraft" + ":textures/models/monsters/Maggot.png");
	
	
	public RenderMFCMaggot(ModelBase modelbase, float par2) {
		super(modelbase, par2);
		
	}

	protected ResourceLocation getEntityTexture(EntityMFCMaggot entity) {
		return Textures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityMFCMaggot) entity);
	}

}
