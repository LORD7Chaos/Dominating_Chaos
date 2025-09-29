package com.lord.dominatingchaos.init;

import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSounds {

    public static SoundEvent DOMINATOR_HIT;
    public static SoundEvent DOMINATOR_ABILITY;
    public static SoundEvent CHAOS_ABILITY;
    public static SoundEvent ULTRA_SAW_SHOT;

    public static SoundEvent DEATH_MUSIC_1;
    public static SoundEvent DEATH_MUSIC_2;
    public static SoundEvent DEATH_MUSIC_3;
    public static SoundEvent DEATH_MUSIC_4;
    public static SoundEvent DEATH_MUSIC_5;


    public static void init() {
        DOMINATOR_HIT = registerSound("dominators_hit");
        DOMINATOR_ABILITY = registerSound("dominators_ability");
        CHAOS_ABILITY = registerSound("chaos_ability");
        ULTRA_SAW_SHOT = registerSound("ultra_saw_shot");

        DEATH_MUSIC_1 = registerSound("death_music_1");
        DEATH_MUSIC_2 = registerSound("death_music_2");
        DEATH_MUSIC_3 = registerSound("death_music_3");
        DEATH_MUSIC_4 = registerSound("death_music_4");
        DEATH_MUSIC_5 = registerSound("death_music_5");
    }

    private static SoundEvent registerSound(String name) {
        SoundEvent sound = new SoundEvent(new ResourceLocation("dominatingchaos", name));
        sound.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(sound);
        return sound;
    }
}