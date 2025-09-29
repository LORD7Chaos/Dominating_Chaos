package com.lord.dominatingchaos.init;

import com.lord.dominatingchaos.blocks.*;
import com.lord.dominatingchaos.tile.TileEntitySun;
import com.lord.dominatingchaos.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    public static Block DOMINATOR_INGOT_BLOCK;
    public static Block CHAOS_INGOT_BLOCK;
    public static Block SUN_BLOCK;
    public static Block STOUNILIT_ORE;
    public static Block REDNOVITE_ORE;
    public static Block TECHNICUM_ORE;
    public static Block CHEMISTRUM_ORE;
    public static Block PHYSURIYM_ORE;
    public static Block UNUSUALIUM_ORE;
    public static Block ARTAMODIUM_ORE;
    public static Block CLEAROLIUM_ORE;
    public static Block WITHER_SOUL_SAND;



    public static void init() {
        DOMINATOR_INGOT_BLOCK = new BlockIngot(Material.IRON, "dominator_ingot_block", CreativeTabs.BUILDING_BLOCKS);
        CHAOS_INGOT_BLOCK = new BlockIngot(Material.IRON, "chaos_ingot_block", CreativeTabs.BUILDING_BLOCKS);
        SUN_BLOCK = new BlockSun(); GameRegistry.registerTileEntity(TileEntitySun.class, "dominatingchaos:sun_block");
        STOUNILIT_ORE = new BlockDrop("stounilit_ore", "stounilit", 1, 2, 1, 2);
        TECHNICUM_ORE = new BlockOreBase("technicium_ore");
        ARTAMODIUM_ORE = new BlockOreBase("artamodium_ore");
        CHEMISTRUM_ORE = new BlockOreBase("chemistrum_ore");
        PHYSURIYM_ORE = new BlockOreBase("physuriym_ore");
        UNUSUALIUM_ORE = new BlockOreBase("unusualium_ore");
        REDNOVITE_ORE = new BlockDrop("rednovite_ore", "rednovite", 1, 2, 2, 5);

        CLEAROLIUM_ORE = new BlockDrop("clearolium_ore", "clearolium", 1, 2, 10, 15);

        WITHER_SOUL_SAND = new BlockWitherSoulSand();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(DOMINATOR_INGOT_BLOCK),
                0,
                new ModelResourceLocation(DOMINATOR_INGOT_BLOCK.getRegistryName(), "inventory")
        );

        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(CHAOS_INGOT_BLOCK),
                0,
                new ModelResourceLocation(CHAOS_INGOT_BLOCK.getRegistryName(), "inventory")
        );

        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(SUN_BLOCK),
                0,
                new net.minecraft.client.renderer.block.model.ModelResourceLocation(SUN_BLOCK.getRegistryName(), "inventory")
        );

        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(STOUNILIT_ORE),
                0,
                new ModelResourceLocation(STOUNILIT_ORE.getRegistryName(), "inventory")
        );
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(TECHNICUM_ORE),
                0,
                new ModelResourceLocation(TECHNICUM_ORE.getRegistryName(), "inventory")
        );
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(ARTAMODIUM_ORE),
                0,
                new ModelResourceLocation(ARTAMODIUM_ORE.getRegistryName(), "inventory")
        );

        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(CHEMISTRUM_ORE),
                0,
                new ModelResourceLocation(CHEMISTRUM_ORE.getRegistryName(), "inventory")
        );
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(PHYSURIYM_ORE),
                0,
                new ModelResourceLocation(PHYSURIYM_ORE.getRegistryName(), "inventory")
        );
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(REDNOVITE_ORE),
                0,
                new ModelResourceLocation(REDNOVITE_ORE.getRegistryName(), "inventory")
        );
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(UNUSUALIUM_ORE),
                0,
                new ModelResourceLocation(UNUSUALIUM_ORE.getRegistryName(), "inventory")
        );
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(CLEAROLIUM_ORE),
                0,
                new ModelResourceLocation(CLEAROLIUM_ORE.getRegistryName(), "inventory")
        );

        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(WITHER_SOUL_SAND),
                0,
                new ModelResourceLocation(WITHER_SOUL_SAND.getRegistryName(), "inventory")
        );
    }
}