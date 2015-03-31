package com.iceminecrafter.IME.Entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityMFCChub extends EntityMob implements IBossDisplayData{

	public EntityMFCChub(World world) {
		super(world);
        this.setHealth(this.getMaxHealth());
        this.setSize(0.9F, 4.0F);
        this.isImmuneToFire = false;
        this.getNavigator().setCanSwim(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.experienceValue = 50;
	}
	
	 @SideOnly(Side.CLIENT)
	    public float getShadowSize()
	    {
	        return this.height / 8.0F;
	    }
	 
	 private double func_82214_u(int p_82214_1_)
	    {
	        if (p_82214_1_ <= 0)
	        {
	            return this.posX;
	        }
	        else
	        {
	            float f = (this.renderYawOffset + (float)(180 * (p_82214_1_ - 1))) / 180.0F * (float)Math.PI;
	            float f1 = MathHelper.cos(f);
	            return this.posX + (double)f1 * 1.3D;
	        }
	    }

	    private double func_82208_v(int p_82208_1_)
	    {
	        return p_82208_1_ <= 0 ? this.posY + 3.0D : this.posY + 2.2D;
	    }

	    private double func_82213_w(int p_82213_1_)
	    {
	        if (p_82213_1_ <= 0)
	        {
	            return this.posZ;
	        }
	        else
	        {
	            float f = (this.renderYawOffset + (float)(180 * (p_82213_1_ - 1))) / 180.0F * (float)Math.PI;
	            float f1 = MathHelper.sin(f);
	            return this.posZ + (double)f1 * 1.3D;
	        }
	    }

	 
	   
	    protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4D);
	        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
	    }


}
