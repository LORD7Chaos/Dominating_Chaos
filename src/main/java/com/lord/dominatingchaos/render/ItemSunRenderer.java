package com.lord.dominatingchaos.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ItemSunRenderer extends TileEntityItemStackRenderer {

    private final RenderSun renderSun = new RenderSun();

    @Override
    public void renderByItem(ItemStack stack, float partialTicks) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(0.5, 0.5, 0.5);
        renderSun.render(null, 0, 0, 0, partialTicks, 0, 1.0f);
        GlStateManager.popMatrix();
    }
}