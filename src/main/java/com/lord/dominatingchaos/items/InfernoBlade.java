package com.lord.dominatingchaos.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import java.util.List;

public class InfernoBlade extends AbstractChaosSword {

    public InfernoBlade() {
        super("inferno_blade");
    }

    @Override
    protected void addCustomInformation(ItemStack stack, World worldIn, List<String> tooltip,
                                        net.minecraft.client.util.ITooltipFlag flagIn) {

        tooltip.add("§aSets enemies on fire for 5 seconds");
        tooltip.add("§cDeals 15% of enemy's max health per hit");

    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        float damage = target.getMaxHealth() * 0.15f;
        target.attackEntityFrom(net.minecraft.util.DamageSource.ON_FIRE, damage);
        target.setFire(5); // поджигает на 5 секунд
        return super.hitEntity(stack, target, attacker);
    }
}
