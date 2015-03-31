package com.iceminecrafter.IME.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Maggot extends ModelBase
{
	public Maggot()
	{
		
		textureWidth = 64;
	    textureHeight = 32;
		Shape1 = new ModelRenderer(this, 32, 0);
		Shape1.addBox(0F, 0F, 0F, 4, 4, 6, 0F);
		Shape1.setRotationPoint(-2F, 20F, 0F);
		Shape1.setTextureSize(64, 32);
		Shape1.rotateAngleX = 0F;
		Shape1.rotateAngleY = 0F;
		Shape1.rotateAngleZ = 0F;
		Shape1.mirror = false;
		Shape2 = new ModelRenderer(this, 0, 0);
		Shape2.addBox(0F, 0F, 0F, 4, 4, 4, 0F);
		Shape2.setRotationPoint(-2F, 20F, -5F);
		Shape2.setTextureSize(64, 32);
		Shape2.rotateAngleX = 0F;
		Shape2.rotateAngleY = 0F;
		Shape2.rotateAngleZ = 0F;
		Shape2.mirror = false;
		Shape3 = new ModelRenderer(this, 19, 0);
		Shape3.addBox(0F, 0F, 0F, 4, 3, 1, 0F);
		Shape3.setRotationPoint(-2F, 21F, -1F);
		Shape3.setTextureSize(64, 32);
		Shape3.rotateAngleX = 0F;
		Shape3.rotateAngleY = 0F;
		Shape3.rotateAngleZ = 0F;
		Shape3.mirror = false;
	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
	}
	
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}
	
	//fields
	public ModelRenderer Shape1;
	public ModelRenderer Shape2;
	public ModelRenderer Shape3;
}
