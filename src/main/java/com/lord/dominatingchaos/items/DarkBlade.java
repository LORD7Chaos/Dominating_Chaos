package com.lord.dominatingchaos.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import java.util.List;

public class DarkBlade extends AbstractChaosSword {

    public DarkBlade() {
        super("dark_blade");
    }

    @Override
    protected void addCustomInformation(ItemStack stack, World worldIn, List<String> tooltip,
                                        net.minecraft.client.util.ITooltipFlag flagIn) {

        tooltip.add("§6Deals 50% more damage to enemies below 50% health");
        tooltip.add("§cDeals 15% of enemy's max health per hit");

    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        float damage = target.getMaxHealth() * 0.15f;
        if (target.getHealth() < target.getMaxHealth() * 0.5f) {
            damage *= 1.5f;
        }
        target.attackEntityFrom(net.minecraft.util.DamageSource.MAGIC, damage);
        return super.hitEntity(stack, target, attacker);
    }
}
