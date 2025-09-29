package com.lord.dominatingchaos.render;

import com.lord.dominatingchaos.entities.EntityInfernalBull;
import com.lord.dominatingchaos.model.ModelInfernalBull;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderInfernalBull extends RenderLiving<EntityInfernalBull> {

    private static final ResourceLocation TEXTURE = new ResourceLocation("dominatingchaos:textures/entity/infernal_bull.png");

    public RenderInfernalBull(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelInfernalBull(), 0.7F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityInfernalBull entity) {
        return TEXTURE;
    }
}
