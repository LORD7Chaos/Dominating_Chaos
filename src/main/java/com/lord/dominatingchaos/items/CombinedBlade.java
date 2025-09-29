package com.lord.dominatingchaos.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class CombinedBlade extends AbstractChaosSword {

    private static final float DAMAGE_PERCENT = 0.35F; // 35% от максимального здоровья

    public CombinedBlade() {
        super("combined_blade");
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        if (!target.world.isRemote) {
            float damage = target.getMaxHealth() * DAMAGE_PERCENT;

            if (attacker instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) attacker;
                player.heal(damage * 0.10F);

                player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2, false, false));
                player.fallDistance = 0.0F;
            }

            target.addPotionEffect(new PotionEffect(MobEffects.POISON, 60, 1));

            target.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 60, 1));

            if (target.world.isDaytime()) {
                damage *= 1.10F;
            }

            if (!target.world.isDaytime()) {
                damage *= 1.10F;
            }

            if (target.getHealth() < target.getMaxHealth() * 0.5F) {
                damage *= 1.5F;
            }

            target.setFire(5);

            target.attackEntityFrom(DamageSource.GENERIC, damage);
        }
        return true;
    }

    @Override
    protected void addCustomInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip,
                                        ITooltipFlag flagIn) {
        tooltip.add("§cDeals 35% of enemy's max health per hit");
        tooltip.add("§6Grants combined passive effects of all chaos blades:");
        tooltip.add("§7Jump Boost + No fall damage");
        tooltip.add("§7Lifesteal on hit");
        tooltip.add("§7Inflicts poison");
        tooltip.add("§7Slows enemies");
        tooltip.add("§7Burns enemies");
        tooltip.add("§7Extra damage during day");
        tooltip.add("§7Extra damage at night");
        tooltip.add("§7Deals 50% more damage to enemies below 50% health");
    }
}
