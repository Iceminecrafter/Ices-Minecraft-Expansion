package com.iceminecrafter.IME.Entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeModContainer;

public class EntityMechon_M69 extends EntityMob{

	public EntityMechon_M69(World world) {
		super(world);
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 2.5D, false));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, 2.5D, false));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(5, new EntityAIWander(this, 1.8D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityVillager.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.setSize(1.3F, 1.0F);
	}
	protected boolean isAIEnabled()
    {
        return true;
    }
	 protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2D);
	        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
	    }


}
