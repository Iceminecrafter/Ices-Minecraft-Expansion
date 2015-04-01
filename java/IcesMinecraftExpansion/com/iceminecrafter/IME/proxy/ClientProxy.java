package com.iceminecrafter.IME.proxy;

import com.iceminecrafter.IME.Entity.EntityMechon_M69;
import com.iceminecrafter.IME.Mob.EntityMFC;
import com.iceminecrafter.IME.Mob.RenderMechon_M69;
import com.iceminecrafter.IME.Models.Mechon_M69;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	
	public void registerRenderThings(){
		EntityMFC.EntityRegistry();
		
		//RenderingRegistry.registerEntityRenderingHandler(EntityMFCFly.class, new RenderMFCFly(new Fly(), 0));
		//RenderingRegistry.registerEntityRenderingHandler(EntityMFCCharger.class, new RenderMFCCharger(new Charger(), 0));
		//RenderingRegistry.registerEntityRenderingHandler(EntityMFCChub.class, new RenderMFCChub(new Chub(), 0));
		//RenderingRegistry.registerEntityRenderingHandler(EntityMFCDSpitter.class, new RenderMFCDSpitter(new DSpitter(), 0));
		//RenderingRegistry.registerEntityRenderingHandler(EntityMFCDukeofFlies.class, new RenderMFCDukeofFlies(new Duke_Of_Flies(), 0));
		//RenderingRegistry.registerEntityRenderingHandler(EntityMFCGurgling.class, new RenderMFCGurgling(new Gurgling(), 0));
		//RenderingRegistry.registerEntityRenderingHandler(EntityMFCLargeFly.class, new RenderMFCLargeFly(new Large_Fly(), 0));
		//RenderingRegistry.registerEntityRenderingHandler(EntityMFCMaggot.class, new RenderMFCMaggot(new Maggot(), 0));
		//RenderingRegistry.registerEntityRenderingHandler(EntityMFCSpitter.class, new RenderMFCSpitter(new Spitter(), 0));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMechon_M69.class, new RenderMechon_M69(new Mechon_M69(), 0));
	}

}
