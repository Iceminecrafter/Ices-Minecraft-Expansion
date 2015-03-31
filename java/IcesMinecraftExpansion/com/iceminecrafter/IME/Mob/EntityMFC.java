package com.iceminecrafter.IME.Mob;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.Entity.EntityMFCCharger;
import com.iceminecrafter.IME.Entity.EntityMFCChub;
import com.iceminecrafter.IME.Entity.EntityMFCDSpitter;
import com.iceminecrafter.IME.Entity.EntityMFCDukeofFlies;
import com.iceminecrafter.IME.Entity.EntityMFCFly;
import com.iceminecrafter.IME.Entity.EntityMFCGurgling;
import com.iceminecrafter.IME.Entity.EntityMFCLargeFly;
import com.iceminecrafter.IME.Entity.EntityMFCMaggot;
import com.iceminecrafter.IME.Entity.EntityMFCSpitter;
import com.iceminecrafter.IME.Entity.EntityMechon_M69;

import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityMFC {
	
	public static void EntityRegistry(){
		registerEntity();
	}
	
	public static void registerEntity(){
		createEntity(EntityMechon_M69.class, "Mechon M96",0x2ABD82 , 0xE3FF73);
		//createEntity(EntityMFCFly.class, "Attack Fly", 0xFC0000, 0xFFFFFF);
		//createEntity(EntityMFCCharger.class, "Charger", 0xFC0000, 0xFFFFFF);
		//createEntity(EntityMFCChub.class, "Chub", 0xFC0000, 0xFFFFFF);
		//createEntity(EntityMFCSpitter.class, "Spitter", 0xFC0000, 0xFFFFFF);
		//createEntity(EntityMFCDukeofFlies.class, "DukeofFlies", 0xFC0000, 0xFFFFFF);
		//createEntity(EntityMFCGurgling.class, "Gurgling", 0xFC0000, 0xFFFFFF);
		//createEntity(EntityMFCLargeFly.class, "Large Attack Fly", 0xFC0000, 0xFFFFFF);
		//createEntity(EntityMFCMaggot.class, "Maggot", 0xFC0000, 0xFFFFFF);
		//createEntity(EntityMFCDSpitter.class, "Double Spitter", 0xFC0000, 0xFFFFFF);
		
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomID = cpw.mods.fml.common.registry.EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomID);
		EntityRegistry.registerModEntity(entityClass, entityName, randomID, IcesMinecraftExpansion.modInstance, 20, 1, true);
		//EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.desert);
		
		CreateEgg(randomID, solidColor, spotColor);
	}
	
	private static void CreateEgg(int randomID, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomID), new EntityList.EntityEggInfo(randomID, solidColor, spotColor));
	}
}
