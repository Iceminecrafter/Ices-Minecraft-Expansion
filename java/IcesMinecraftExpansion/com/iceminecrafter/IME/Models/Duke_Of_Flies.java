package com.iceminecrafter.IME.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Duke_Of_Flies extends ModelBase
{
	public Duke_Of_Flies()
	{
		
		textureWidth = 128;
	    textureHeight = 128;
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 32, 32, 32, 0F);
		Shape1.setRotationPoint(-17F, -34F, -14F);
		Shape1.setTextureSize(128, 128);
		Shape1.rotateAngleX = 0F;
		Shape1.rotateAngleY = 0F;
		Shape1.rotateAngleZ = 0F;
		Shape1.mirror = false;
		Shape2 = new ModelRenderer(this, 0, 68);
		Shape2.addBox(0F, 0F, 0F, 7, 10, 7, 0F);
		Shape2.setRotationPoint(-11F, -2F, -9F);
		Shape2.setTextureSize(128, 128);
		Shape2.rotateAngleX = 0F;
		Shape2.rotateAngleY = 0F;
		Shape2.rotateAngleZ = 0F;
		Shape2.mirror = false;
		Shape3 = new ModelRenderer(this, 0, 68);
		Shape3.addBox(0F, 0F, 0F, 7, 10, 7, 0F);
		Shape3.setRotationPoint(3F, -2F, -4F);
		Shape3.setTextureSize(128, 128);
		Shape3.rotateAngleX = 0F;
		Shape3.rotateAngleY = 0F;
		Shape3.rotateAngleZ = 0F;
		Shape3.mirror = false;
		Shape4 = new ModelRenderer(this, 0, 68);
		Shape4.addBox(0F, 0F, 0F, 7, 10, 7, 0F);
		Shape4.setRotationPoint(0F, -2F, 11F);
		Shape4.setTextureSize(128, 128);
		Shape4.rotateAngleX = 0F;
		Shape4.rotateAngleY = 0F;
		Shape4.rotateAngleZ = 0F;
		Shape4.mirror = false;
		Shape5 = new ModelRenderer(this, 0, 68);
		Shape5.addBox(0F, 0F, 0F, 7, 10, 7, 0F);
		Shape5.setRotationPoint(-16F, -2F, 8F);
		Shape5.setTextureSize(128, 128);
		Shape5.rotateAngleX = 0F;
		Shape5.rotateAngleY = 0F;
		Shape5.rotateAngleZ = 0F;
		Shape5.mirror = false;
	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
	}
	
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}
	
	//fields
	public ModelRenderer Shape1;
	public ModelRenderer Shape2;
	public ModelRenderer Shape3;
	public ModelRenderer Shape4;
	public ModelRenderer Shape5;
}
