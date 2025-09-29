package com.lord.dominatingchaos.render;

import com.lord.dominatingchaos.tile.TileEntitySun;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.Random;

public class RenderSun extends TileEntitySpecialRenderer<TileEntitySun> {

    private static final ResourceLocation SUN_TEXTURE = new ResourceLocation("dominatingchaos:textures/blocks/sun_texture.png");
    private static final int RAY_COUNT = 120;
    private final float[] rayOffsetsX = new float[RAY_COUNT];
    private final float[] rayOffsetsY = new float[RAY_COUNT];
    private final float[] rayOffsetsZ = new float[RAY_COUNT];
    private final Random random = new Random();

    public RenderSun() {
        for (int i = 0; i < RAY_COUNT; i++) {
            rayOffsetsX[i] = random.nextFloat() * 360;
            rayOffsetsY[i] = random.nextFloat() * 360;
            rayOffsetsZ[i] = random.nextFloat() * 360;
        }
    }

    @Override
    public void render(TileEntitySun te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5, y + 0.5, z + 0.5);

        float sunRadius = 0.5F;

        bindTexture(SUN_TEXTURE);
        drawSphere(sunRadius, 32, 32);

        GlStateManager.pushMatrix();
        GlStateManager.disableLighting();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

        float rayLength = 1.0F;
        float rayBottomWidth = 0.04F;
        float rayTopWidth = 0.12F;
        float rotationSpeed = 0.03F;

        long time = te.getWorld().getTotalWorldTime();

        for (int i = 0; i < RAY_COUNT; i++) {
            GlStateManager.pushMatrix();

            // Вращение лучей
            float angleY = (time * rotationSpeed + rayOffsetsY[i]) % 360;
            float angleX = (time * rotationSpeed * 0.7F + rayOffsetsX[i]) % 360;
            float angleZ = (time * rotationSpeed * 0.5F + rayOffsetsZ[i]) % 360;
            GlStateManager.rotate(angleY, 0, 1, 0);
            GlStateManager.rotate(angleX, 1, 0, 0);
            GlStateManager.rotate(angleZ, 0, 0, 1);

            GlStateManager.translate(0, 0, sunRadius);

            float alphaRay = 0.4F + 0.3F * (float)Math.sin((time + i * 10) * 0.03F);
            GlStateManager.color(1.0F, 0.9F, 0.0F, alphaRay);

            drawTrapezoidRay(rayLength, rayBottomWidth, rayTopWidth);

            GlStateManager.popMatrix();
        }

        GlStateManager.disableBlend();
        GlStateManager.enableLighting();
        GlStateManager.popMatrix();

        GlStateManager.popMatrix();
    }

    private void drawTrapezoidRay(float length, float bottomWidth, float topWidth) {
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex3f(-bottomWidth, 0, 0);
        GL11.glVertex3f(bottomWidth, 0, 0);
        GL11.glVertex3f(topWidth, 0, length);
        GL11.glVertex3f(-topWidth, 0, length);
        GL11.glEnd();
    }

    private void drawSphere(float radius, int slices, int stacks) {
        for (int i = 0; i <= stacks; i++) {
            double lat0 = Math.PI * (-0.5 + (double) (i - 1) / stacks);
            double z0 = Math.sin(lat0);
            double zr0 = Math.cos(lat0);

            double lat1 = Math.PI * (-0.5 + (double) i / stacks);
            double z1 = Math.sin(lat1);
            double zr1 = Math.cos(lat1);

            GL11.glBegin(GL11.GL_QUAD_STRIP);
            for (int j = 0; j <= slices; j++) {
                double lng = 2 * Math.PI * (double) (j - 1) / slices;
                double x = Math.cos(lng);
                double y = Math.sin(lng);

                GL11.glVertex3d(x * zr0 * radius, y * zr0 * radius, z0 * radius);
                GL11.glVertex3d(x * zr1 * radius, y * zr1 * radius, z1 * radius);
            }
            GL11.glEnd();
        }
    }
}
