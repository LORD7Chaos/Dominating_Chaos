package com.lord.dominatingchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOreBase extends Block {

    public BlockOreBase(String name) {
        super(Material.ROCK);
        setRegistryName(name);
        setTranslationKey(name);
        setHardness(3.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
