package com.lord.dominatingchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;

public class BlockIngot extends Block {

    public BlockIngot(Material material, String name, CreativeTabs tab) {
        super(material);

        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(tab);

        setHardness(5f);
        setResistance(10f);
        setSoundType(SoundType.METAL);
    }
}
