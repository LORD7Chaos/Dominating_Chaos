package com.lord.dominatingchaos.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import java.util.List;

public class SunBlade extends AbstractChaosSword {

    public SunBlade() {
        super("sun_blade");
    }

    @Override
    protected void addCustomInformation(ItemStack stack, World worldIn, List<String> tooltip,
                                        net.minecraft.client.util.ITooltipFlag flagIn) {

        tooltip.add("§6Deals 50% more damage during daytime");
        tooltip.add("§cDeals 15% of enemy's max health per hit");



    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        float damage = target.getMaxHealth() * 0.15f;
        if (attacker.world.isDaytime()) {
            damage *= 1.5f;
        }
        target.attackEntityFrom(net.minecraft.util.DamageSource.GENERIC, damage);
        return super.hitEntity(stack, target, attacker);
    }
}
