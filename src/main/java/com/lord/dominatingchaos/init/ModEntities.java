package com.lord.dominatingchaos.init;

import com.lord.dominatingchaos.MyMod;
import com.lord.dominatingchaos.Tags;
import com.lord.dominatingchaos.entities.EntityInfernalBull;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
    private static int nextId = 1;

    public static void init() {
        register("infernal_bull", EntityInfernalBull.class, 0xFF3300, 0x000000);
    }

    private static void register(String name, Class<? extends net.minecraft.entity.Entity> cls, int eggPrimary, int eggSecondary) {
        EntityRegistry.registerModEntity(new ResourceLocation(Tags.MODID, name),
                cls, name, nextId++, MyMod.INSTANCE, 64, 3, true, eggPrimary, eggSecondary);
    }
}
