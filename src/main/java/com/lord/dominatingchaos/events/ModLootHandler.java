package com.lord.dominatingchaos.events;

import com.lord.dominatingchaos.init.ModItems;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.conditions.RandomChance;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ModLootHandler {

    @SubscribeEvent
    public static void onLootLoad(LootTableLoadEvent event) {
        if (event.getName().equals(new ResourceLocation("minecraft", "entities/wither_skeleton"))) {

            LootEntry entry = new LootEntryItem(
                    ModItems.WITHER_BONE_PIECE,
                    1, // вес
                    0, // качество
                    new LootFunction[0],
                    new LootCondition[] {
                            new RandomChance(0.75f) // шанс 25%
                    },
                    "dominatingchaos_wither_piece"
            );

            LootPool pool = new LootPool(
                    new LootEntry[] { entry },
                    new LootCondition[0],
                    new RandomValueRange(1),
                    new RandomValueRange(1, 2),
                    "dominatingchaos_wither_pool"
            );

            event.getTable().addPool(pool);
        }
    }
}