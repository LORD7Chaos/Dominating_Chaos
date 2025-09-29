package com.lord.dominatingchaos.events;

import com.lord.dominatingchaos.init.ModSounds;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

@Mod.EventBusSubscriber
public class PlayerDeathMusicHandler {

    private static final Random RANDOM = new Random();

    @SubscribeEvent
    public static void onPlayerDeath(LivingDeathEvent event) {
        if (event.getEntity() instanceof EntityPlayer) {
            SoundEvent[] deathSounds = {
                    ModSounds.DEATH_MUSIC_1,
                    ModSounds.DEATH_MUSIC_2,
                    ModSounds.DEATH_MUSIC_3,
                    ModSounds.DEATH_MUSIC_4,
                    ModSounds.DEATH_MUSIC_5
            };

            // случайный звук
            SoundEvent chosen = deathSounds[RANDOM.nextInt(deathSounds.length)];

            // проигрываем в мире, а не через игрока
            event.getEntity().world.playSound(
                    null,
                    event.getEntity().posX,
                    event.getEntity().posY,
                    event.getEntity().posZ,
                    chosen,
                    SoundCategory.NEUTRAL,
                    1.0F,
                    1.0F
            );

            System.out.println("[DEBUG] Death music played: " + chosen.getRegistryName());
        }
    }
}