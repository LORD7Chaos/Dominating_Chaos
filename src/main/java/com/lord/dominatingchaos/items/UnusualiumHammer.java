package com.lord.dominatingchaos.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UnusualiumHammer extends Item {

    public UnusualiumHammer() {
        super();
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.TOOLS);
        this.setTranslationKey("unusualium_hammer");
        this.setRegistryName("unusualium_hammer");
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        return stack.copy();
    }
}