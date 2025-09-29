package com.lord.dominatingchaos;

import com.lord.dominatingchaos.init.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.lord.dominatingchaos.world.ModWorldGen;
import com.lord.dominatingchaos.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = Tags.MODID,
        name = Tags.MODNAME,
        version = Tags.VERSION,
        acceptedMinecraftVersions = "[1.12.2]"
)
public class MyMod {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MODID);

    @Mod.Instance
    public static MyMod INSTANCE;

    @SidedProxy(
            clientSide = "com.lord.dominatingchaos.proxy.ClientProxy",
            serverSide = "com.lord.dominatingchaos.proxy.CommonProxy"
    )
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
        MinecraftForge.EVENT_BUS.register(this);
        proxy.preInit();
        ModEntities.init();
        ModSounds.init();
        LOGGER.info("Loaded " + Tags.MODNAME + " at version " + Tags.VERSION);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ModSmelting.init();
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }

    @EventHandler
    public void serverStarting(FMLServerStartingEvent event) {}

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        ModBlocks.init();
        event.getRegistry().registerAll(
                ModBlocks.DOMINATOR_INGOT_BLOCK,
                ModBlocks.CHAOS_INGOT_BLOCK,
                ModBlocks.SUN_BLOCK,
                ModBlocks.STOUNILIT_ORE,
                ModBlocks.TECHNICUM_ORE,
                ModBlocks.CHEMISTRUM_ORE,
                ModBlocks.PHYSURIYM_ORE,
                ModBlocks.ARTAMODIUM_ORE,
                ModBlocks.REDNOVITE_ORE,
                ModBlocks.UNUSUALIUM_ORE,
                ModBlocks.CLEAROLIUM_ORE,
                ModBlocks.WITHER_SOUL_SAND
        );
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new ItemBlock(ModBlocks.DOMINATOR_INGOT_BLOCK)
                        .setRegistryName(ModBlocks.DOMINATOR_INGOT_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.CHAOS_INGOT_BLOCK)
                        .setRegistryName(ModBlocks.CHAOS_INGOT_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.SUN_BLOCK)
                        .setRegistryName(ModBlocks.SUN_BLOCK.getRegistryName()),
                new ItemBlock(ModBlocks.STOUNILIT_ORE)
                        .setRegistryName(ModBlocks.STOUNILIT_ORE.getRegistryName()),
                new ItemBlock(ModBlocks.TECHNICUM_ORE)
                        .setRegistryName(ModBlocks.TECHNICUM_ORE.getRegistryName()),
                new ItemBlock(ModBlocks.CHEMISTRUM_ORE)
                        .setRegistryName(ModBlocks.CHEMISTRUM_ORE.getRegistryName()),
                new ItemBlock(ModBlocks.PHYSURIYM_ORE)
                        .setRegistryName(ModBlocks.PHYSURIYM_ORE.getRegistryName()),
                new ItemBlock(ModBlocks.ARTAMODIUM_ORE)
                        .setRegistryName(ModBlocks.ARTAMODIUM_ORE.getRegistryName()),
                new ItemBlock(ModBlocks.REDNOVITE_ORE)
                        .setRegistryName(ModBlocks.REDNOVITE_ORE.getRegistryName()),
                new ItemBlock(ModBlocks.UNUSUALIUM_ORE)
                        .setRegistryName(ModBlocks.UNUSUALIUM_ORE.getRegistryName()),
                new ItemBlock(ModBlocks.CLEAROLIUM_ORE)
                        .setRegistryName(ModBlocks.CLEAROLIUM_ORE.getRegistryName()),
                new ItemBlock(ModBlocks.WITHER_SOUL_SAND)
                        .setRegistryName(ModBlocks.WITHER_SOUL_SAND.getRegistryName())
        );

        ModItems.init();
        event.getRegistry().registerAll(
                ModItems.STOUNILIT,
                ModItems.ARTAMODIUM_INGOT,
                ModItems.ARTAMODIUM_NUGGET,
                ModItems.TECHNICIUM_INGOT,
                ModItems.TECHNICIUM_NUGGET,
                ModItems.CHEMISTRUM_INGOT,
                ModItems.CHEMISTRUM_NUGGET,
                ModItems.PHYSURIYM_INGOT,
                ModItems.PHYSURIYM_NUGGET,
                ModItems.REDNOVITE,
                ModItems.UNUSUALIUM_INGOT,
                ModItems.UNUSUALIUM_NUGGET,
                ModItems.CLEAROLIUM,
                ModItems.REDSTONE_INGOT,
                ModItems.ACID_BOTTLE,
                ModItems.EMPTY_ELECTRICAL_CIRCUIT,
                ModItems.ELECTRICAL_CIRCUIT,
                ModItems.ELECTRONIC_RESISTOR,
                ModItems.ELECTRONIC_TRANSISTOR,
                ModItems.ARTAMODIUM_COIL,
                ModItems.ARTAMODIUM_DUALCOIL,
                ModItems.ELECTRONIC_MOTOR,
                ModItems.WITHER_BONE_PIECE,
                ModItems.IRON_ROD,
                ModItems.OBSIDIAN_ROD,
                ModItems.UNUSUALIUM_HAMMER,
                ModItems.BROKE_STONE,
                ModItems.BROKEN_COBBLESTONE,
                ModItems.DIAMOND_DUST,
                ModItems.EMERALD_DUST,
                ModItems.EMERAMOND_DUST,
                ModItems.QUARTZ_DUST,
                ModItems.DUST_OF_PURIFICATION,
                ModItems.WEAK_SOUL,
                ModItems.SOUL_INGOT,
                ModItems.NETHER_STAR_DUST,
                ModItems.HELL_FIRE,
                ModItems.DURABLE_STONE,
                ModItems.DURABLE_STONE_DUST,
                ModItems.WEAK_SCYTHE,
                ModItems.BOTTLE_OF_DIRTY_BLOOD,
                ModItems.DIRTY_BLOOD_INGOT,
                ModItems.BOTTLE_OF_CLEAR_BLOOD,
                ModItems.CLEAR_BLOOD_INGOT,
                ModItems.PURE_BLOODSTONE,
                ModItems.YANG,
                ModItems.YING,
                ModItems.DOMINATOR_INGOT,
                ModItems.CHAOS_INGOT,
                ModItems.DOMINATORS_BLADE,
                ModItems.CHAOS_BLADE,
                ModItems.SLIME_BLADE,
                ModItems.POISON_BLADE,
                ModItems.BLOOD_BLADE,
                ModItems.SUN_BLADE,
                ModItems.INFERNO_BLADE,
                ModItems.FROST_BLADE,
                ModItems.NIGHT_BLADE,
                ModItems.DARK_BLADE,
                ModItems.COMBINED_BLADE,
                ModItems.CHAINSAW,
                ModItems.TRITY_BLADE,
                ModItems.VITY_BLADE,
                ModItems.ULTRA_SAW

        );
    }

    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        // рецепты добавишь потом
    }
}