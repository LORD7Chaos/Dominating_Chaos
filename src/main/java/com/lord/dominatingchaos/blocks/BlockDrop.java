package com.lord.dominatingchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockDrop extends Block {

    private final String dropItemName; // вместо Item
    private final int minDrop, maxDrop, minExp, maxExp;

    public BlockDrop(String name, String dropItemName, int minDrop, int maxDrop, int minExp, int maxExp) {
        super(Material.ROCK);
        this.dropItemName = dropItemName;
        this.minDrop = minDrop;
        this.maxDrop = maxDrop;
        this.minExp = minExp;
        this.maxExp = maxExp;

        setTranslationKey(name);
        setRegistryName(name);
        setHardness(3.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 3);
        setSoundType(SoundType.STONE);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getByNameOrId("dominatingchaos:" + dropItemName);
    }

    @Override
    public int quantityDropped(Random rand) {
        return minDrop + rand.nextInt(maxDrop - minDrop + 1);
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random rand) {
        int base = quantityDropped(rand);
        if (fortune > 0) base *= (rand.nextInt(fortune + 1) + 1);
        return base;
    }

    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        return MathHelper.getInt(new Random(), minExp, maxExp);
    }
}