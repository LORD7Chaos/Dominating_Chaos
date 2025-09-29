package com.lord.dominatingchaos.init;

import com.lord.dominatingchaos.init.ModBlocks;
import com.lord.dominatingchaos.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting {

    public static void init() {
        GameRegistry.addSmelting(ModBlocks.ARTAMODIUM_ORE, new ItemStack(ModItems.ARTAMODIUM_INGOT), 1.0f);
        GameRegistry.addSmelting(ModBlocks.TECHNICUM_ORE, new ItemStack(ModItems.TECHNICIUM_INGOT), 1.0f);
        GameRegistry.addSmelting(ModBlocks.CHEMISTRUM_ORE, new ItemStack(ModItems.CHEMISTRUM_INGOT), 1.0f);
        GameRegistry.addSmelting(ModBlocks.PHYSURIYM_ORE, new ItemStack(ModItems.PHYSURIYM_INGOT), 1.0f);
        GameRegistry.addSmelting(ModBlocks.UNUSUALIUM_ORE, new ItemStack(ModItems.UNUSUALIUM_INGOT), 1.0f);
    }
}
