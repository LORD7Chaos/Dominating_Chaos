package com.lord.dominatingchaos.init;

import com.lord.dominatingchaos.items.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ModItems {


    public static Item STOUNILIT;
    public static Item ARTAMODIUM_INGOT;
    public static Item ARTAMODIUM_NUGGET;

    public static Item TECHNICIUM_INGOT;
    public static Item TECHNICIUM_NUGGET;

    public static Item CHEMISTRUM_INGOT;
    public static Item CHEMISTRUM_NUGGET;

    public static Item PHYSURIYM_INGOT;
    public static Item PHYSURIYM_NUGGET;

    public static Item REDNOVITE;

    public static Item UNUSUALIUM_INGOT;
    public static Item UNUSUALIUM_NUGGET;

    public static Item CLEAROLIUM;



    public static Item REDSTONE_INGOT;
    public static Item ACID_BOTTLE;
    public static Item EMPTY_ELECTRICAL_CIRCUIT;
    public static Item ELECTRICAL_CIRCUIT;
    public static Item ELECTRONIC_RESISTOR;
    public static Item ELECTRONIC_TRANSISTOR;
    public static Item ARTAMODIUM_COIL;
    public static Item ARTAMODIUM_DUALCOIL;
    public static Item ELECTRONIC_MOTOR;
    public static Item WITHER_BONE_PIECE;
    public static Item SOUL_INGOT;
    public static Item IRON_ROD;
    public static Item OBSIDIAN_ROD;
    public static Item BROKE_STONE;
    public static Item BROKEN_COBBLESTONE;
    public static Item EMERALD_DUST;
    public static Item DIAMOND_DUST;
    public static Item EMERAMOND_DUST;
    public static Item QUARTZ_DUST;
    public static Item DUST_OF_PURIFICATION;
    public static Item WEAK_SOUL;
    public static Item NETHER_STAR_DUST;
    public static Item HELL_FIRE;

    public static Item DURABLE_STONE;
    public static Item DURABLE_STONE_DUST;

    public static Item BOTTLE_OF_DIRTY_BLOOD;
    public static Item DIRTY_BLOOD_INGOT;
    public static Item BOTTLE_OF_CLEAR_BLOOD;
    public static Item CLEAR_BLOOD_INGOT;
    public static Item PURE_BLOODSTONE;


    public static Item YANG;
    public static Item YING;

    public static Item DOMINATOR_INGOT;
    public static Item CHAOS_INGOT;

    public static Item DOMINATORS_BLADE;
    public static Item CHAOS_BLADE;

    public static Item WEAK_SCYTHE;

    public static Item SLIME_BLADE;
    public static Item BLOOD_BLADE;
    public static Item POISON_BLADE;
    public static Item FROST_BLADE;
    public static Item INFERNO_BLADE;
    public static Item SUN_BLADE;
    public static Item NIGHT_BLADE;
    public static Item DARK_BLADE;


    public static Item COMBINED_BLADE;

    public static Item CHAINSAW;
    public static Item TRITY_BLADE;
    public static Item VITY_BLADE;
    public static Item ULTRA_SAW;

    public static Item UNUSUALIUM_HAMMER;



    public static void init() {

        STOUNILIT = new Item()
                .setRegistryName("stounilit")
                .setTranslationKey("stounilit")
                .setCreativeTab(CreativeTabs.MATERIALS);
        ARTAMODIUM_INGOT = new Item()
                .setRegistryName("artamodium_ingot")
                .setTranslationKey("artamodium_ingot")
                .setCreativeTab(CreativeTabs.MATERIALS);

        ARTAMODIUM_NUGGET = new Item()
                .setRegistryName("artamodium_nugget")
                .setTranslationKey("artamodium_nugget")
                .setCreativeTab(CreativeTabs.MATERIALS);

        TECHNICIUM_INGOT = new Item()
                .setRegistryName("technicium_ingot")
                .setTranslationKey("technicium_ingot")
                .setCreativeTab(CreativeTabs.MATERIALS);

        TECHNICIUM_NUGGET = new Item()
                .setRegistryName("technicium_nugget")
                .setTranslationKey("technicium_nugget")
                .setCreativeTab(CreativeTabs.MATERIALS);

        CHEMISTRUM_INGOT = new Item()
                .setRegistryName("chemistrum_ingot")
                .setTranslationKey("chemistrum_ingot")
                .setCreativeTab(CreativeTabs.MATERIALS);

        CHEMISTRUM_NUGGET = new Item()
                .setRegistryName("chemistrum_nugget")
                .setTranslationKey("chemistrum_nugget")
                .setCreativeTab(CreativeTabs.MATERIALS);

        PHYSURIYM_INGOT = new Item()
                .setRegistryName("physuriym_ingot")
                .setTranslationKey("physuriym_ingot")
                .setCreativeTab(CreativeTabs.MATERIALS);

        PHYSURIYM_NUGGET = new Item()
                .setRegistryName("physuriym_nugget")
                .setTranslationKey("physuriym_nugget")
                .setCreativeTab(CreativeTabs.MATERIALS);

        REDNOVITE = new Item()
                .setRegistryName("rednovite")
                .setTranslationKey("rednovite")
                .setCreativeTab(CreativeTabs.MATERIALS);

        UNUSUALIUM_INGOT = new Item()
                .setRegistryName("unusualium_ingot")
                .setTranslationKey("unusualium_ingot")
                .setCreativeTab(CreativeTabs.MATERIALS);

        UNUSUALIUM_NUGGET = new Item()
                .setRegistryName("unusualium_nugget")
                .setTranslationKey("unusualium_nugget")
                .setCreativeTab(CreativeTabs.MATERIALS);

        CLEAROLIUM = new Item()
                .setRegistryName("clearolium")
                .setTranslationKey("clearolium")
                .setCreativeTab(CreativeTabs.MATERIALS);

        REDSTONE_INGOT = new Item()
                .setRegistryName("redstone_ingot")
                .setTranslationKey("redstone_ingot")
                .setCreativeTab(CreativeTabs.MATERIALS);

        ACID_BOTTLE = new Item()
                .setRegistryName("acid_bottle")
                .setTranslationKey("acid_bottle")
                .setCreativeTab(CreativeTabs.MATERIALS);

        EMPTY_ELECTRICAL_CIRCUIT = new Item()
                .setRegistryName("empty_electrical_circuit")
                .setTranslationKey("empty_electrical_circuit")
                .setCreativeTab(CreativeTabs.MATERIALS);

        ELECTRICAL_CIRCUIT = new Item()
                .setRegistryName("electrical_circuit")
                .setTranslationKey("electrical_circuit")
                .setCreativeTab(CreativeTabs.MATERIALS);

        ELECTRONIC_RESISTOR = new Item()
                .setRegistryName("electronic_resistor")
                .setTranslationKey("electronic_resistor")
                .setCreativeTab(CreativeTabs.MATERIALS);
        ELECTRONIC_TRANSISTOR = new Item()
                .setRegistryName("electronic_transistor")
                .setTranslationKey("electronic_transistor")
                .setCreativeTab(CreativeTabs.MATERIALS);

        ARTAMODIUM_COIL = new Item()
                .setRegistryName("artamodium_coil")
                .setTranslationKey("artamodium_coil")
                .setCreativeTab(CreativeTabs.MATERIALS);

        ARTAMODIUM_DUALCOIL = new Item()
                .setRegistryName("artamodium_dualcoil")
                .setTranslationKey("artamodium_dualcoil")
                .setCreativeTab(CreativeTabs.MATERIALS);

        ELECTRONIC_MOTOR = new Item()
                .setRegistryName("electronic_motor")
                .setTranslationKey("electronic_motor")
                .setCreativeTab(CreativeTabs.MATERIALS);

        WITHER_BONE_PIECE= new Item()
                .setRegistryName("wither_bone_piece")
                .setTranslationKey("wither_bone_piece")
                .setCreativeTab(CreativeTabs.MATERIALS);

        SOUL_INGOT= new Item()
                .setRegistryName("soul_ingot")
                .setTranslationKey("soul_ingot")
                .setCreativeTab(CreativeTabs.MATERIALS);

        IRON_ROD = new Item()
                .setRegistryName("iron_rod")
                .setTranslationKey("iron_rod")
                .setCreativeTab(CreativeTabs.MATERIALS);

        OBSIDIAN_ROD = new Item()
                .setRegistryName("obsidian_rod")
                .setTranslationKey("obsidian_rod")
                .setCreativeTab(CreativeTabs.MATERIALS);

        BROKE_STONE = new Item()
                .setRegistryName("broke_stone")
                .setTranslationKey("broke_stone")
                .setCreativeTab(CreativeTabs.MATERIALS);

        BROKEN_COBBLESTONE = new Item()
                .setRegistryName("broken_cobblestone")
                .setTranslationKey("broken_cobblestone")
                .setCreativeTab(CreativeTabs.MATERIALS);

        EMERALD_DUST = new Item()
                .setRegistryName("emerald_dust")
                .setTranslationKey("emerald_dust")
                .setCreativeTab(CreativeTabs.MATERIALS);

        DIAMOND_DUST = new Item()
                .setRegistryName("diamond_dust")
                .setTranslationKey("diamond_dust")
                .setCreativeTab(CreativeTabs.MATERIALS);

        EMERAMOND_DUST = new Item()
                .setRegistryName("emeramond_dust")
                .setTranslationKey("emeramond_dust")
                .setCreativeTab(CreativeTabs.MATERIALS);

        QUARTZ_DUST = new Item()
                .setRegistryName("quartz_dust")
                .setTranslationKey("quartz_dust")
                .setCreativeTab(CreativeTabs.MATERIALS);

        DUST_OF_PURIFICATION = new Item()
                .setRegistryName("dust_of_purification")
                .setTranslationKey("dust_of_purification")
                .setCreativeTab(CreativeTabs.MATERIALS);

        WEAK_SOUL = new Item()
                .setRegistryName("weak_soul")
                .setTranslationKey("weak_soul")
                .setCreativeTab(CreativeTabs.MATERIALS);

        NETHER_STAR_DUST = new Item()
                .setRegistryName("nether_star_dust")
                .setTranslationKey("nether_star_dust")
                .setCreativeTab(CreativeTabs.MATERIALS);
        HELL_FIRE = new Item()
                .setRegistryName("hell_fire")
                .setTranslationKey("hell_fire")
                .setCreativeTab(CreativeTabs.MATERIALS);
        DURABLE_STONE = new Item()
                .setRegistryName("durable_stone")
                .setTranslationKey("durable_stone")
                .setCreativeTab(CreativeTabs.MATERIALS);
        DURABLE_STONE_DUST = new Item()
                .setRegistryName("durable_stone_dust")
                .setTranslationKey("durable_stone_dust")
                .setCreativeTab(CreativeTabs.MATERIALS);

        BOTTLE_OF_DIRTY_BLOOD = new Item()
                .setRegistryName("bottle_of_dirty_blood")
                .setTranslationKey("bottle_of_dirty_blood")
                .setCreativeTab(CreativeTabs.MATERIALS);

        DIRTY_BLOOD_INGOT = new Item()
                .setRegistryName("dirty_blood_ingot")
                .setTranslationKey("dirty_blood_ingot")
                .setCreativeTab(CreativeTabs.MATERIALS);

        BOTTLE_OF_CLEAR_BLOOD = new Item()
                .setRegistryName("bottle_of_clear_blood")
                .setTranslationKey("bottle_of_clear_blood")
                .setCreativeTab(CreativeTabs.MATERIALS);

        CLEAR_BLOOD_INGOT = new Item()
                .setRegistryName("clear_blood_ingot")
                .setTranslationKey("clear_blood_ingot")
                .setCreativeTab(CreativeTabs.MATERIALS);

        PURE_BLOODSTONE = new Item()
                .setRegistryName("pure_bloodstone")
                .setTranslationKey("pure_bloodstone")
                .setCreativeTab(CreativeTabs.MATERIALS);

        YING = new Item()
                .setRegistryName("ying")
                .setTranslationKey("ying")
                .setCreativeTab(CreativeTabs.MATERIALS);

        YANG = new Item()
                .setRegistryName("yang")
                .setTranslationKey("yang")
                .setCreativeTab(CreativeTabs.MATERIALS);

        DOMINATOR_INGOT = new Item()
                .setRegistryName("dominator_ingot")
                .setTranslationKey("dominator_ingot")
                .setCreativeTab(CreativeTabs.MATERIALS);

        CHAOS_INGOT = new Item()
                .setRegistryName("chaos_ingot")
                .setTranslationKey("chaos_ingot")
                .setCreativeTab(CreativeTabs.MATERIALS);



        DOMINATORS_BLADE = new ItemDominatorsBlade(
                Item.ToolMaterial.DIAMOND
        ).setCreativeTab(CreativeTabs.COMBAT);

        CHAOS_BLADE = new ItemChaosBlade()
                .setCreativeTab(CreativeTabs.COMBAT);


        WEAK_SCYTHE = new WeakScythe().setCreativeTab(CreativeTabs.COMBAT);

        SLIME_BLADE = new SlimeBlade().setCreativeTab(CreativeTabs.COMBAT);
        BLOOD_BLADE = new BloodBlade().setCreativeTab(CreativeTabs.COMBAT);
        POISON_BLADE = new PoisonBlade().setCreativeTab(CreativeTabs.COMBAT);
        FROST_BLADE = new FrostBlade().setCreativeTab(CreativeTabs.COMBAT);
        INFERNO_BLADE = new InfernoBlade().setCreativeTab(CreativeTabs.COMBAT);
        SUN_BLADE = new SunBlade().setCreativeTab(CreativeTabs.COMBAT);
        NIGHT_BLADE = new NightBlade().setCreativeTab(CreativeTabs.COMBAT);
        DARK_BLADE = new DarkBlade().setCreativeTab(CreativeTabs.COMBAT);

        COMBINED_BLADE = new CombinedBlade().setCreativeTab(CreativeTabs.COMBAT);

        CHAINSAW = new Chainsaw().setCreativeTab(CreativeTabs.COMBAT);
        TRITY_BLADE = new TrityBlade().setCreativeTab(CreativeTabs.COMBAT);
        VITY_BLADE = new VityBlade().setCreativeTab(CreativeTabs.COMBAT);
        ULTRA_SAW = new UltraSaw().setCreativeTab(CreativeTabs.COMBAT);

        UNUSUALIUM_HAMMER = new UnusualiumHammer()
                .setCreativeTab(CreativeTabs.TOOLS);

    }







    public static void initModels() {


        ModelLoader.setCustomModelResourceLocation(STOUNILIT, 0,
                new ModelResourceLocation(STOUNILIT.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ARTAMODIUM_INGOT, 0,
                new ModelResourceLocation(ARTAMODIUM_INGOT.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ARTAMODIUM_NUGGET, 0,
                new ModelResourceLocation(ARTAMODIUM_NUGGET.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(TECHNICIUM_INGOT, 0,
                new ModelResourceLocation(TECHNICIUM_INGOT.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TECHNICIUM_NUGGET, 0,
                new ModelResourceLocation(TECHNICIUM_NUGGET.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(CHEMISTRUM_INGOT, 0,
                new ModelResourceLocation(CHEMISTRUM_INGOT.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CHEMISTRUM_NUGGET, 0,
                new ModelResourceLocation(CHEMISTRUM_NUGGET.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(PHYSURIYM_INGOT, 0,
                new ModelResourceLocation(PHYSURIYM_INGOT.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(PHYSURIYM_NUGGET, 0,
                new ModelResourceLocation(PHYSURIYM_NUGGET.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(REDNOVITE, 0,
                new ModelResourceLocation(REDNOVITE.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(UNUSUALIUM_INGOT, 0,
                new ModelResourceLocation(UNUSUALIUM_INGOT.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(UNUSUALIUM_NUGGET, 0,
                new ModelResourceLocation(UNUSUALIUM_NUGGET.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CLEAROLIUM, 0,
                new ModelResourceLocation(CLEAROLIUM.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(REDSTONE_INGOT, 0,
                new ModelResourceLocation(REDSTONE_INGOT.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ACID_BOTTLE, 0,
                new ModelResourceLocation(ACID_BOTTLE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(EMPTY_ELECTRICAL_CIRCUIT, 0,
                new ModelResourceLocation(EMPTY_ELECTRICAL_CIRCUIT.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ELECTRICAL_CIRCUIT, 0,
                new ModelResourceLocation(ELECTRICAL_CIRCUIT.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(ELECTRONIC_RESISTOR, 0,
                new ModelResourceLocation(ELECTRONIC_RESISTOR.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ELECTRONIC_TRANSISTOR, 0,
                new ModelResourceLocation(ELECTRONIC_TRANSISTOR.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(ARTAMODIUM_COIL, 0,
                new ModelResourceLocation(ARTAMODIUM_COIL.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ARTAMODIUM_DUALCOIL, 0,
                new ModelResourceLocation(ARTAMODIUM_DUALCOIL.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(ELECTRONIC_MOTOR, 0,
                new ModelResourceLocation(ELECTRONIC_MOTOR.getRegistryName(), "inventory"));


        ModelLoader.setCustomModelResourceLocation(WITHER_BONE_PIECE, 0,
                new ModelResourceLocation(WITHER_BONE_PIECE.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(SOUL_INGOT, 0,
                new ModelResourceLocation(SOUL_INGOT.getRegistryName(), "inventory"));


        ModelLoader.setCustomModelResourceLocation(IRON_ROD, 0,
                new ModelResourceLocation(IRON_ROD.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(OBSIDIAN_ROD, 0,
                new ModelResourceLocation(OBSIDIAN_ROD.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(BROKE_STONE, 0,
                new ModelResourceLocation(BROKE_STONE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BROKEN_COBBLESTONE, 0,
                new ModelResourceLocation(BROKEN_COBBLESTONE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(EMERALD_DUST, 0,
                new ModelResourceLocation(EMERALD_DUST.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(DIAMOND_DUST, 0,
                new ModelResourceLocation(DIAMOND_DUST.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(EMERAMOND_DUST, 0,
                new ModelResourceLocation(EMERAMOND_DUST.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(QUARTZ_DUST, 0,
                new ModelResourceLocation(QUARTZ_DUST.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(DUST_OF_PURIFICATION, 0,
                new ModelResourceLocation(DUST_OF_PURIFICATION.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(WEAK_SOUL, 0,
                new ModelResourceLocation(WEAK_SOUL.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(NETHER_STAR_DUST, 0,
                new ModelResourceLocation(NETHER_STAR_DUST.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(HELL_FIRE, 0,
                new ModelResourceLocation(HELL_FIRE.getRegistryName(), "inventory"));


        ModelLoader.setCustomModelResourceLocation(DURABLE_STONE, 0,
                new ModelResourceLocation(DURABLE_STONE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(DURABLE_STONE_DUST, 0,
                new ModelResourceLocation(DURABLE_STONE_DUST.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(BOTTLE_OF_DIRTY_BLOOD, 0,
                new ModelResourceLocation(BOTTLE_OF_DIRTY_BLOOD.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(DIRTY_BLOOD_INGOT, 0,
                new ModelResourceLocation(DIRTY_BLOOD_INGOT.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BOTTLE_OF_CLEAR_BLOOD, 0,
                new ModelResourceLocation(BOTTLE_OF_CLEAR_BLOOD.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CLEAR_BLOOD_INGOT, 0,
                new ModelResourceLocation(CLEAR_BLOOD_INGOT.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(PURE_BLOODSTONE, 0,
                new ModelResourceLocation(PURE_BLOODSTONE.getRegistryName(), "inventory"));


        ModelLoader.setCustomModelResourceLocation(YANG, 0,
                new ModelResourceLocation(YANG.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(YING, 0,
                new ModelResourceLocation(YING.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(DOMINATOR_INGOT, 0,
                new ModelResourceLocation(DOMINATOR_INGOT.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CHAOS_INGOT, 0,
                new ModelResourceLocation(CHAOS_INGOT.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(WEAK_SCYTHE, 0,
                new ModelResourceLocation(WEAK_SCYTHE.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(DOMINATORS_BLADE, 0,
                new ModelResourceLocation(DOMINATORS_BLADE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(CHAOS_BLADE, 0,
                new ModelResourceLocation(CHAOS_BLADE.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(SLIME_BLADE, 0,
                new ModelResourceLocation(SLIME_BLADE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BLOOD_BLADE, 0,
                new ModelResourceLocation(BLOOD_BLADE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(POISON_BLADE, 0,
                new ModelResourceLocation(POISON_BLADE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(FROST_BLADE, 0,
                new ModelResourceLocation(FROST_BLADE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(INFERNO_BLADE, 0,
                new ModelResourceLocation(INFERNO_BLADE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(SUN_BLADE, 0,
                new ModelResourceLocation(SUN_BLADE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(NIGHT_BLADE, 0,
                new ModelResourceLocation(NIGHT_BLADE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(DARK_BLADE, 0,
                new ModelResourceLocation(DARK_BLADE.getRegistryName(), "inventory"));


        ModelLoader.setCustomModelResourceLocation(COMBINED_BLADE, 0,
                new ModelResourceLocation(COMBINED_BLADE.getRegistryName(), "inventory"));


        ModelLoader.setCustomModelResourceLocation(CHAINSAW, 0,
                new ModelResourceLocation(CHAINSAW.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(TRITY_BLADE, 0,
                new ModelResourceLocation(TRITY_BLADE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(VITY_BLADE, 0,
                new ModelResourceLocation(VITY_BLADE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ULTRA_SAW, 0,
                new ModelResourceLocation(ULTRA_SAW.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(UNUSUALIUM_HAMMER, 0,
                new ModelResourceLocation(UNUSUALIUM_HAMMER.getRegistryName(), "inventory"));
    }
}