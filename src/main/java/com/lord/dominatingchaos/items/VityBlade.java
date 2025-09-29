package com.lord.dominatingchaos.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class VityBlade extends AbstractChaosSword {

    private static final float DAMAGE_PERCENT = 0.12F;

    public VityBlade() {
        super("vity_blade");
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        if (!target.world.isRemote) {
            float damage = target.getMaxHealth() * DAMAGE_PERCENT;

            target.addPotionEffect(new net.minecraft.potion.PotionEffect(
                    net.minecraft.init.MobEffects.SLOWNESS, 60, 1));

            if (attacker instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) attacker;
                if (player.getHealth() < player.getMaxHealth() * 0.5F) {
                    player.heal(player.getMaxHealth() * 0.1F);
                }
            }

            target.attackEntityFrom(DamageSource.GENERIC, damage);
        }
        return true;
    }

    @Override
    protected void addCustomInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip,
                                        ITooltipFlag flagIn) {
        tooltip.add("§cDeals 12% of enemy's max health per hit");
        tooltip.add("§6Yin variant: slows enemies on hit");
        tooltip.add("§7Passive: restores 10% health on kill if HP < 50%");
    }
}