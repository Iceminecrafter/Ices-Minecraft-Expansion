package com.iceminecrafter.IME.Mob;

import com.iceminecrafter.IME.Entity.EntityMFCFly;
import com.iceminecrafter.IME.Entity.EntityMFCLargeFly;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMFCLargeFly extends RenderLiving{

	private static final ResourceLocation Textures = new ResourceLocation("metalforgecraft" + ":textures/models/monsters/Large Fly.png");
	
	
	public RenderMFCLargeFly(ModelBase modelbase, float par2) {
		super(modelbase, par2);
		
	}

	protected ResourceLocation getEntityTexture(EntityMFCLargeFly entity) {
		return Textures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityMFCLargeFly) entity);
	}

}
