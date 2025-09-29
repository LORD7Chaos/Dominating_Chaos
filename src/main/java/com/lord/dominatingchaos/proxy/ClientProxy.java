package com.lord.dominatingchaos.proxy;

import com.lord.dominatingchaos.init.ModBlocks;
import com.lord.dominatingchaos.init.ModItems;
import com.lord.dominatingchaos.tile.TileEntitySun;
import com.lord.dominatingchaos.render.RenderSun;
import com.lord.dominatingchaos.entities.EntityInfernalBull;
import com.lord.dominatingchaos.render.RenderInfernalBull;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModItems.initModels();
        ModBlocks.initModels();
    }

    @Override
    public void init() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySun.class, new RenderSun());

        RenderingRegistry.registerEntityRenderingHandler(EntityInfernalBull.class, new IRenderFactory<EntityInfernalBull>() {
            @Override
            public Render<? super EntityInfernalBull> createRenderFor(RenderManager manager) {
                return new RenderInfernalBull(manager);
            }
        });

    }
}
