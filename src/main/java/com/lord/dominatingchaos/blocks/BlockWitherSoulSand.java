package com.lord.dominatingchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;

public class BlockWitherSoulSand extends Block {

    public BlockWitherSoulSand() {
        super(Material.SAND);
        setTranslationKey("wither_soul_sand");
        setRegistryName("wither_soul_sand");
        setSoundType(SoundType.SAND);
        setHardness(0.5f);
        setResistance(0.5f);
        setTickRandomly(true);
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        entityIn.motionX *= 0.4D;
        entityIn.motionZ *= 0.4D;
        super.onEntityWalk(worldIn, pos, entityIn);
    }
}