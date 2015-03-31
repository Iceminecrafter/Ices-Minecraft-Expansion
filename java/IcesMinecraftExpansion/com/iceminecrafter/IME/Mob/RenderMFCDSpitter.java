package com.iceminecrafter.IME.Mob;

import com.iceminecrafter.IME.Entity.EntityMFCDSpitter;
import com.iceminecrafter.IME.Entity.EntityMFCFly;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMFCDSpitter extends RenderLiving{

	private static final ResourceLocation Textures = new ResourceLocation("metalforgecraft" + ":textures/models/monsters/DSpitter.png");
	
	
	public RenderMFCDSpitter(ModelBase modelbase, float par2) {
		super(modelbase, par2);
		
	}

	protected ResourceLocation getEntityTexture(EntityMFCDSpitter entity) {
		return Textures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityMFCDSpitter) entity);
	}

}
