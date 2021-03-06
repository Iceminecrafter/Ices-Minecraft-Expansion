package com.iceminecrafter.IME.Mob;

import com.iceminecrafter.IME.Entity.EntityMFCDukeofFlies;
import com.iceminecrafter.IME.Entity.EntityMFCFly;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMFCDukeofFlies extends RenderLiving{

	private static final ResourceLocation Textures = new ResourceLocation("metalforgecraft" + ":textures/models/monsters/Duke Of Flies.png");
	
	
	public RenderMFCDukeofFlies(ModelBase modelbase, float par2) {
		super(modelbase, par2);
		
	}

	protected ResourceLocation getEntityTexture(EntityMFCDukeofFlies entity) {
		return Textures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityMFCDukeofFlies) entity);
	}

}
