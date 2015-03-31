package com.iceminecrafter.IME.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Mechon_M69 extends ModelBase{

  //fields
    ModelRenderer LegL1;
    ModelRenderer FootL;
    ModelRenderer LegL2;
    ModelRenderer LegL3;
    ModelRenderer LegR1;
    ModelRenderer LegR3;
    ModelRenderer LegR2;
    ModelRenderer FootR;
    ModelRenderer Casing1;
    ModelRenderer Headpeice1;
    ModelRenderer Fan1;
    ModelRenderer CollonSpire;
    ModelRenderer BaseSpire;
    ModelRenderer SpindleL;
    ModelRenderer SpindleR;
    ModelRenderer SFanL1;
    ModelRenderer BulgeL;
    ModelRenderer SFanR1;
    ModelRenderer BulgeR;
    ModelRenderer SFanL2;
    ModelRenderer SFanR2;
    ModelRenderer SpindleL2;
    ModelRenderer SpindleL3;
    ModelRenderer SFanL3;
    ModelRenderer SFanL4;
    ModelRenderer SpindleR2;
    ModelRenderer SpindleR3;
    ModelRenderer SFanR3;
    ModelRenderer SFanR4;
    ModelRenderer Claw1;
    ModelRenderer Claw2;
    ModelRenderer Claw3;
    ModelRenderer Claw6;
    ModelRenderer Claw4;
    ModelRenderer Claw5;
    ModelRenderer SEyeR;
    ModelRenderer SEyeL;
    ModelRenderer EyeMain;
  
  public Mechon_M69()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      LegL1 = new ModelRenderer(this, 44, 0);
      LegL1.addBox(0F, 0F, 0F, 2, 3, 3);
      LegL1.setRotationPoint(8F, 11F, -1F);
      LegL1.setTextureSize(128, 64);
      LegL1.mirror = true;
      setRotation(LegL1, 0F, 0F, 0F);
      FootL = new ModelRenderer(this, 56, 0);
      FootL.addBox(0F, 0F, 0F, 1, 2, 1);
      FootL.setRotationPoint(8F, 11F, -1F);
      FootL.setTextureSize(128, 64);
      FootL.mirror = true;
      setRotation(FootL, 0F, 0F, 0F);
      LegL2 = new ModelRenderer(this, 61, 0);
      LegL2.addBox(0F, 0F, 0F, 2, 6, 3);
      LegL2.setRotationPoint(8F, 11F, -1F);
      LegL2.setTextureSize(128, 64);
      LegL2.mirror = true;

      setRotation(LegL2, 0F, 0F, 0F);
      LegL3 = new ModelRenderer(this, 73, 0);
      LegL3.addBox(0F, 0F, 0F, 2, 5, 2);
      LegL3.setRotationPoint(8F, 11F, -1F);
      LegL3.setTextureSize(128, 64);
      LegL3.mirror = true;

      setRotation(LegL3, 0F, 0F, 0F);
      LegR1 = new ModelRenderer(this, 83, 0);
      LegR1.addBox(0F, 0F, 0F, 2, 5, 5);
      LegR1.setRotationPoint(-10F, 9F, -3F);
      LegR1.setTextureSize(128, 64);
      LegR1.mirror = true;

      setRotation(LegR1, 0F, 0F, 0F);
      LegR3 = new ModelRenderer(this, 99, 0);
      LegR3.addBox(0F, 0F, 0F, 2, 5, 3);
      LegR3.setRotationPoint(-10F, 9F, -3F);
      LegR3.setTextureSize(128, 64);
      LegR3.mirror = true;

      setRotation(LegR3, 0F, 0F, 0F);
      LegR2 = new ModelRenderer(this, 112, 0);
      LegR2.addBox(0F, 0F, 0F, 2, 8, 5);
      LegR2.setRotationPoint(-10F, 9F, -3F);
      LegR2.setTextureSize(128, 64);
      LegR2.mirror = true;

      setRotation(LegR2, 0F, 0F, 0F);
      FootR = new ModelRenderer(this, 42, 13);
      FootR.addBox(0F, 0F, 0F, 1, 2, 1);
      FootR.setRotationPoint(-10F, 9F, -3F);
      FootR.setTextureSize(128, 64);
      FootR.mirror = true;
      setRotation(FootR, 0F, 0F, 0F);
      Casing1 = new ModelRenderer(this, 0, 0);
      Casing1.addBox(0F, 0F, 0F, 10, 10, 10);
      Casing1.setRotationPoint(-5F, 8F, -5F);
      Casing1.setTextureSize(128, 64);
      Casing1.mirror = true;

      setRotation(Casing1, 0F, 0F, 0F);
      Headpeice1 = new ModelRenderer(this, 0, 30);
      Headpeice1.addBox(0F, 0F, 0F, 4, 8, 17);
      Headpeice1.setRotationPoint(-2F, 7F, -9F);
      Headpeice1.setTextureSize(128, 64);
      Headpeice1.mirror = true;

      setRotation(Headpeice1, 0F, 0F, 0F);
      Fan1 = new ModelRenderer(this, 68, 50);
      Fan1.addBox(0F, 0F, 0F, 0, 6, 6);
      Fan1.setRotationPoint(0F, 5F, 4F);
      Fan1.setTextureSize(128, 64);
      Fan1.mirror = true;
      setRotation(Fan1, 0F, 0F, 0F);
      CollonSpire = new ModelRenderer(this, 85, 36);
      CollonSpire.addBox(0F, 0F, 0F, 1, 1, 3);
      CollonSpire.setRotationPoint(-0.5F, 16F, -14F);
      CollonSpire.setTextureSize(128, 64);
      CollonSpire.mirror = true;
      setRotation(CollonSpire, 0F, 0F, 0F);
      BaseSpire = new ModelRenderer(this, 85, 25);
      BaseSpire.addBox(0F, 0F, 0F, 3, 3, 6);
      BaseSpire.setRotationPoint(-1.5F, 15F, -11F);
      BaseSpire.setTextureSize(128, 64);
      BaseSpire.mirror = true;
      setRotation(BaseSpire, 0F, 0F, 0F);
      SpindleL = new ModelRenderer(this, 0, 21);
      SpindleL.addBox(0F, 0F, 0F, 8, 1, 1);
      SpindleL.setRotationPoint(5F, 12F, 0F);
      SpindleL.setTextureSize(128, 64);
      SpindleL.mirror = true;
      setRotation(SpindleL, 0F, 0F, 0F);
      SpindleR = new ModelRenderer(this, 0, 24);
      SpindleR.addBox(0F, 0F, 0F, 8, 1, 1);
      SpindleR.setRotationPoint(-13F, 12F, 0F);
      SpindleR.setTextureSize(128, 64);
      SpindleR.mirror = true;

      setRotation(SpindleR, 0F, 0F, 0F);
      SFanL1 = new ModelRenderer(this, 84, 52);
      SFanL1.addBox(0F, 0F, 0F, 1, 5, 5);
      SFanL1.setRotationPoint(6F, 10F, -2F);
      SFanL1.setTextureSize(128, 64);
      SFanL1.mirror = true;

      setRotation(SFanL1, 0F, 0F, 0F);
      BulgeL = new ModelRenderer(this, 30, 56);
      BulgeL.addBox(0F, 0F, 0F, 4, 4, 4);
      BulgeL.setRotationPoint(2F, 15F, -6F);
      BulgeL.setTextureSize(128, 64);
      BulgeL.mirror = true;
      setRotation(BulgeL, 0F, 0F, 0F);
      SFanR1 = new ModelRenderer(this, 49, 53);
      SFanR1.addBox(0F, 0F, 0F, 1, 5, 5);
      SFanR1.setRotationPoint(-7F, 10F, -2F);
      SFanR1.setTextureSize(128, 64);
      SFanR1.mirror = true;
      setRotation(SFanR1, 0F, 0F, 0F);
      BulgeR = new ModelRenderer(this, 50, 40);
      BulgeR.addBox(0F, 0F, 0F, 4, 4, 4);
      BulgeR.setRotationPoint(-6F, 15F, -6F);
      BulgeR.setTextureSize(128, 64);
      BulgeR.mirror = true;
      setRotation(BulgeR, 0F, 0F, 0F);
      SFanL2 = new ModelRenderer(this, 22, 22);
      SFanL2.addBox(0F, 0F, 0F, 0, 3, 3);
      SFanL2.setRotationPoint(12F, 11F, -1F);
      SFanL2.setTextureSize(128, 64);
      SFanL2.mirror = true;
      setRotation(SFanL2, 0F, 0F, 0F);
      SFanR2 = new ModelRenderer(this, 29, 22);
      SFanR2.addBox(0F, 0F, 0F, 0, 3, 3);
      SFanR2.setRotationPoint(-12F, 11F, -1F);
      SFanR2.setTextureSize(128, 64);
      SFanR2.mirror = true;
      setRotation(SFanR2, 0F, 0F, 0F);
      SpindleL2 = new ModelRenderer(this, 1, 27);
      SpindleL2.addBox(0F, 0F, 0F, 3, 1, 1);
      SpindleL2.setRotationPoint(8F, 11F, -1F);
      SpindleL2.setTextureSize(128, 64);
      SpindleL2.mirror = true;

      setRotation(SpindleL2, 0F, 0F, 0F);
      SpindleL3 = new ModelRenderer(this, 10, 27);
      SpindleL3.addBox(0F, 0F, 0F, 3, 1, 1);
      SpindleL3.setRotationPoint(8F, 11F, -1F);
      SpindleL3.setTextureSize(128, 64);
      SpindleL3.mirror = true;

      setRotation(SpindleL3, 0F, 0F, 0F);
      SFanL3 = new ModelRenderer(this, 38, 22);
      SFanL3.addBox(0F, 0F, 0F, 0, 3, 3);
      SFanL3.setRotationPoint(8F, 11F, -1F);
      SFanL3.setTextureSize(128, 64);
      SFanL3.mirror = true;
      setRotation(SFanL3, 0F, 0F, 0F);
      SFanL4 = new ModelRenderer(this, 52, 9);
      SFanL4.addBox(0F, 0F, 0F, 0, 3, 3);
      SFanL4.setRotationPoint(8F, 11F, -1F);
      SFanL4.setTextureSize(128, 64);
      SFanL4.mirror = true;
      setRotation(SFanL4, 0F, 0F, 0F);
      SpindleR2 = new ModelRenderer(this, 63, 11);
      SpindleR2.addBox(0F, 0F, 0F, 3, 1, 1);
      SpindleR2.setRotationPoint(-10F, 9F, -3F);
      SpindleR2.setTextureSize(128, 64);
      SpindleR2.mirror = true;
      setRotation(SpindleR2, 0F, 0F, 0F);
      SpindleR3 = new ModelRenderer(this, 63, 15);
      SpindleR3.addBox(0F, 0F, 0F, 3, 1, 1);
      SpindleR3.setRotationPoint(-10F, 9F, -3F);
      SpindleR3.setTextureSize(128, 64);
      SpindleR3.mirror = true;
      setRotation(SpindleR3, 0F, 0F, 0F);
      SFanR3 = new ModelRenderer(this, 73, 11);
      SFanR3.addBox(0F, 0F, 0F, 0, 3, 3);
      SFanR3.setRotationPoint(-10F, 9F, -3F);
      SFanR3.setTextureSize(128, 64);
      SFanR3.mirror = true;
      setRotation(SFanR3, 0F, 0F, 0F);
      SFanR4 = new ModelRenderer(this, 82, 12);
      SFanR4.addBox(0F, 0F, 0F, 0, 3, 3);
      SFanR4.setRotationPoint(-10F, 9F, -3F);
      SFanR4.setTextureSize(128, 64);
      SFanR4.mirror = true;
      setRotation(SFanR4, 0F, 0F, 0F);
      Claw1 = new ModelRenderer(this, 50, 20);
      Claw1.addBox(0F, 0F, 0F, 2, 2, 3);
      Claw1.setRotationPoint(-10F, 9F, -3F);
      Claw1.setTextureSize(128, 64);
      Claw1.mirror = true;

      setRotation(Claw1, 0F, 0F, 0F);
      Claw2 = new ModelRenderer(this, 63, 20);
      Claw2.addBox(0F, 0F, 0F, 2, 3, 2);
      Claw2.setRotationPoint(-10F, 9F, -3F);
      Claw2.setTextureSize(128, 64);
      Claw2.mirror = true;

      setRotation(Claw2, 0F, 0F, 0F);
      Claw3 = new ModelRenderer(this, 73, 20);
      Claw3.addBox(0F, 0F, 0F, 2, 4, 2);
      Claw3.setRotationPoint(-10F, 9F, -3F);
      Claw3.setTextureSize(128, 64);
      Claw3.mirror = true;

      setRotation(Claw3, 0F, 0F, 0F);
      Claw6 = new ModelRenderer(this, 50, 30);
      Claw6.addBox(0F, 0F, 0F, 2, 4, 1);
      Claw6.setRotationPoint(-10F, 9F, -3F);
      Claw6.setTextureSize(128, 64);
      Claw6.mirror = true;
      setRotation(Claw6, 0F, 0F, 0F);
      Claw4 = new ModelRenderer(this, 60, 30);
      Claw4.addBox(0F, 0F, 0F, 2, 3, 4);
      Claw4.setRotationPoint(-10F, 9F, -3F);
      Claw4.setTextureSize(128, 64);
      Claw4.mirror = true;

      setRotation(Claw4, 0F, 0F, 0F);
      Claw5 = new ModelRenderer(this, 74, 30);
      Claw5.addBox(0F, 0F, 0F, 2, 5, 2);
      Claw5.setRotationPoint(-10F, 9F, -3F);
      Claw5.setTextureSize(128, 64);
      Claw5.mirror = true;

      setRotation(Claw5, 0F, 0F, 0F);
      SEyeR = new ModelRenderer(this, 100, 12);
      SEyeR.addBox(0F, 0F, 0F, 1, 1, 1);
      SEyeR.setRotationPoint(-2F, 12F, -10F);
      SEyeR.setTextureSize(128, 64);
      SEyeR.mirror = true;
      setRotation(SEyeR, 0F, 0F, 0F);
      SEyeL = new ModelRenderer(this, 91, 14);
      SEyeL.addBox(0F, 0F, 0F, 1, 1, 1);
      SEyeL.setRotationPoint(1F, 12F, -10F);
      SEyeL.setTextureSize(128, 64);
      SEyeL.mirror = true;
      setRotation(SEyeL, 0F, 0F, 0F);
      EyeMain = new ModelRenderer(this, 100, 16);
      EyeMain.addBox(0F, 0F, 0F, 2, 2, 1);
      EyeMain.setRotationPoint(-1F, 10F, -10F);
      EyeMain.setTextureSize(128, 64);
      EyeMain.mirror = true;
      setRotation(EyeMain, 0F, 0F, 0F);
      
      Claw1.addChild(Claw2);
      Claw2.addChild(Claw3);
      Claw3.addChild(Claw4);
      Claw4.addChild(Claw5);
      Claw5.addChild(Claw6);
      LegR1.addChild(LegR2);
      LegR2.addChild(LegR3);
      LegR3.addChild(FootR);
      LegL1.addChild(LegL2);
      LegL2.addChild(LegL3);
      LegL3.addChild(FootL);
      LegR2.addChild(Claw1);
      SpindleL2.addChild(SFanL3);
      SpindleL3.addChild(SFanL4);
      SpindleR2.addChild(SFanR3);
      SpindleR3.addChild(SFanR4);
      LegL2.addChild(SpindleL2);
      LegL3.addChild(SpindleL3);
      LegR2.addChild(SpindleR2);
      LegR3.addChild(SpindleR3);

  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Casing1.render(f5);
    LegL1.render(f5);
    LegR1.render(f5);
    Headpeice1.render(f5);
    Fan1.render(f5);
    CollonSpire.render(f5);
    BaseSpire.render(f5);
    SpindleR.render(f5);
    SFanL1.render(f5);
    SpindleL.render(f5);
    BulgeL.render(f5);
    SFanR1.render(f5);
    BulgeR.render(f5);
    SFanL2.render(f5);
    SFanR2.render(f5);
    SEyeR.render(f5);
    SEyeL.render(f5);
    EyeMain.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.LegL1.rotateAngleX = -1.5F * this.Function1(f, 13.0F) * f1;
    this.LegR1.rotateAngleX = 1.5F * this.Function1(f, 13.0F) * f1;
    this.LegL1.rotateAngleY = 0.0F;
    this.LegR1.rotateAngleY = 0.0F;
  }
  
  private float Function1(float f, float f1)
  {
      return (Math.abs(f % f1 - f1 * 0.5F) - f1 * 0.25F) / (f1 * 0.25F);
  }

}
