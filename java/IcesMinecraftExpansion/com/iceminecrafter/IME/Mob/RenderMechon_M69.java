package com.iceminecrafter.IME.Mob;

import com.iceminecrafter.IME.Entity.EntityMFCDSpitter;
import com.iceminecrafter.IME.Entity.EntityMFCFly;
import com.iceminecrafter.IME.Entity.EntityMechon_M69;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMechon_M69 extends RenderLiving{

	private static final ResourceLocation Textures = new ResourceLocation("metalforgecraft" + ":textures/models/monsters/Mechon_M69.png");
	
	
	public RenderMechon_M69(ModelBase modelbase, float par2) {
		super(modelbase, par2);
		
	}

	protected ResourceLocation getEntityTexture(EntityMechon_M69 entity) {
		return Textures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityMechon_M69) entity);
	}

}
