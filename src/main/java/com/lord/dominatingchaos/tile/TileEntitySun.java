package com.lord.dominatingchaos.tile;

import net.minecraft.tileentity.TileEntity;

import java.util.Random;

public class TileEntitySun extends TileEntity {

    public float[] rayOffsetsX;
    public float[] rayOffsetsY;
    public float[] rayOffsetsZ;

    public void initRayOffsets(int count, Random random) {
        rayOffsetsX = new float[count];
        rayOffsetsY = new float[count];
        rayOffsetsZ = new float[count];

        for (int i = 0; i < count; i++) {
            rayOffsetsX[i] = random.nextFloat() * 360;
            rayOffsetsY[i] = random.nextFloat() * 360;
            rayOffsetsZ[i] = random.nextFloat() * 360;
        }
    }
}
