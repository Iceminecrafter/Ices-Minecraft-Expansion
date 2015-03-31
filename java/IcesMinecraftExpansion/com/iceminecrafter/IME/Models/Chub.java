package com.iceminecrafter.IME.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
public class Chub extends ModelBase
{
	public Chub()
	{
		textureWidth = 128;
	    textureHeight = 128;
	    
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 32, 32, 32, 0F);
		Shape1.setRotationPoint(-21F, -12F, -10F);
		Shape1.setTextureSize(128, 128);
		Shape1.rotateAngleX = 0F;
		Shape1.rotateAngleY = 0F;
		Shape1.rotateAngleZ = 0F;
		Shape1.mirror = false;
		Shape2 = new ModelRenderer(this, 1, 66);
		Shape2.addBox(0F, 0F, 0F, 20, 20, 20, 0F);
		Shape2.setRotationPoint(10F, 0F, -4F);
		Shape2.setTextureSize(128, 128);
		Shape2.rotateAngleX = 0F;
		Shape2.rotateAngleY = 0F;
		Shape2.rotateAngleZ = 0F;
		Shape2.mirror = false;
		Shape3 = new ModelRenderer(this, 86, 72);
		Shape3.addBox(0F, 0F, 0F, 10, 10, 10, 0F);
		Shape3.setRotationPoint(30F, 10F, 1F);
		Shape3.setTextureSize(128, 128);
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
