// Date: 2014/09/28 01:18:28 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package modularTurrets.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDamageAmp extends ModelBase {
    //fields
    ModelRenderer Shape2;
    ModelRenderer Shape1;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;

    public ModelDamageAmp() {
        textureWidth = 64;
        textureHeight = 64;

        Shape2 = new ModelRenderer(this, 5, 15);
        Shape2.addBox(-1F, 1F, -13F, 2, 1, 11);
        Shape2.setRotationPoint(0F, 15F, 0F);
        Shape2.setTextureSize(64, 64);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 0F, 0F);

        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(1F, -5F, -13F, 1, 6, 1);
        Shape1.setRotationPoint(0F, 16F, 0F);
        Shape1.setTextureSize(64, 64);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);

        Shape3 = new ModelRenderer(this, 0, 0);
        Shape3.addBox(1F, -5F, -11F, 1, 6, 1);
        Shape3.setRotationPoint(0F, 16F, 0F);
        Shape3.setTextureSize(64, 64);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 0F, 0F);

        Shape4 = new ModelRenderer(this, 0, 0);
        Shape4.addBox(-2F, -4F, -9F, 1, 6, 1);
        Shape4.setRotationPoint(0F, 15F, 0F);
        Shape4.setTextureSize(64, 64);
        Shape4.mirror = true;
        setRotation(Shape4, 0F, 0F, 0F);

        Shape5 = new ModelRenderer(this, 0, 0);
        Shape5.addBox(-2F, -5F, -13F, 1, 6, 1);
        Shape5.setRotationPoint(0F, 16F, 0F);
        Shape5.setTextureSize(64, 64);
        Shape5.mirror = true;
        setRotation(Shape5, 0F, 0F, 0F);

        Shape6 = new ModelRenderer(this, 0, 0);
        Shape6.addBox(-2F, -5F, -11F, 1, 6, 1);
        Shape6.setRotationPoint(0F, 16F, 0F);
        Shape6.setTextureSize(64, 64);
        Shape6.mirror = true;
        setRotation(Shape6, 0F, 0F, 0F);

        Shape7 = new ModelRenderer(this, 0, 0);
        Shape7.addBox(1F, -5F, -9F, 1, 6, 1);
        Shape7.setRotationPoint(0F, 16F, 0F);
        Shape7.setTextureSize(64, 64);
        Shape7.mirror = true;
        setRotation(Shape7, 0F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        Shape2.render(f5);
        Shape1.render(f5);
        Shape3.render(f5);
        Shape4.render(f5);
        Shape5.render(f5);
        Shape6.render(f5);
        Shape7.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }


    public void setRotationForTarget(float y, float z) {
        Shape1.rotateAngleX = y;
        Shape1.rotateAngleY = z;
        Shape2.rotateAngleX = y;
        Shape2.rotateAngleY = z;
        Shape3.rotateAngleX = y;
        Shape3.rotateAngleY = z;
        Shape4.rotateAngleX = y;
        Shape4.rotateAngleY = z;
        Shape5.rotateAngleX = y;
        Shape5.rotateAngleY = z;
        Shape6.rotateAngleX = y;
        Shape6.rotateAngleY = z;
        Shape7.rotateAngleX = y;
        Shape7.rotateAngleY = z;
    }

    public void renderAll() {
        Shape2.render(0.0625F);
        Shape1.render(0.0625F);
        Shape3.render(0.0625F);
        Shape4.render(0.0625F);
        Shape5.render(0.0625F);
        Shape6.render(0.0625F);
        Shape7.render(0.0625F);
    }
}
