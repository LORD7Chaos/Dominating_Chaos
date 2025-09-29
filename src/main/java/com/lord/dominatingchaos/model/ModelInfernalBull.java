package com.lord.dominatingchaos.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelInfernalBull extends ModelBase {
    public ModelRenderer head, body, leg1, leg2, leg3, leg4;

    public ModelInfernalBull() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        head = new ModelRenderer(this, 42, 16);
        head.setRotationPoint(0.0F, 4.0F, -8.0F);
        head.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6);

        body = new ModelRenderer(this, 0, 13);
        body.setRotationPoint(0.0F, 5.0F, 2.0F);
        body.addBox(-7.0F, -10.0F, -7.0F, 14, 25, 10);

        leg1 = new ModelRenderer(this, 0, 50);
        leg1.setRotationPoint(-4.0F, 12.0F, 7.0F);
        leg1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);

        leg2 = new ModelRenderer(this, 0, 50);
        leg2.setRotationPoint(4.0F, 12.0F, 7.0F);
        leg2.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);

        leg3 = new ModelRenderer(this, 0, 50);
        leg3.setRotationPoint(-4.0F, 12.0F, -6.0F);
        leg3.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);

        leg4 = new ModelRenderer(this, 0, 50);
        leg4.setRotationPoint(4.0F, 12.0F, -6.0F);
        leg4.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
                       float netHeadYaw, float headPitch, float scale) {
        setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
        head.render(scale);
        body.render(scale);
        leg1.render(scale);
        leg2.render(scale);
        leg3.render(scale);
        leg4.render(scale);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks,
                                  float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.head.rotateAngleX = headPitch * 0.017453292F;

        this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
}
