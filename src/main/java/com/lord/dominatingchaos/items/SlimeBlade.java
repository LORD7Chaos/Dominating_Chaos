package com.lord.dominatingchaos.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.world.World;
import java.util.List;

public class SlimeBlade extends AbstractChaosSword {

    public SlimeBlade() {
        super("slime_blade");
    }

    @Override
    protected void addCustomInformation(ItemStack stack, World worldIn, List<String> tooltip,
                                        net.minecraft.client.util.ITooltipFlag flagIn) {
        tooltip.add("§bGrants Jump Boost and negates fall damage while held");
        tooltip.add("§cDeals 20% of enemy's max health per hit");
    }

    @Override
    public void onUpdate(ItemStack stack, World world, net.minecraft.entity.Entity entity, int slot, boolean isSelected) {
        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;
            if (isSelected) {
                player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 2, false, false));
                player.fallDistance = 0.0F;
            }
        }
    }

    @Override
    public boolean hitEntity(ItemStack stack, net.minecraft.entity.EntityLivingBase target,
                             net.minecraft.entity.EntityLivingBase attacker) {
        float damage = target.getMaxHealth() * 0.15f;
        target.attackEntityFrom(net.minecraft.util.DamageSource.GENERIC, damage);
        return super.hitEntity(stack, target, attacker);
    }
}
