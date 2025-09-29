package com.lord.dominatingchaos.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import java.util.List;

public class FrostBlade extends AbstractChaosSword {

    public FrostBlade() {
        super("frost_blade");
    }

    @Override
    protected void addCustomInformation(ItemStack stack, World worldIn, List<String> tooltip,
                                        net.minecraft.client.util.ITooltipFlag flagIn) {
        tooltip.add("§aSlows enemies for 3 seconds");
        tooltip.add("§cDeals 12% of enemy's max health per hit");
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        float damage = target.getMaxHealth() * 0.12f;
        target.attackEntityFrom(net.minecraft.util.DamageSource.MAGIC, damage);
        target.addPotionEffect(new net.minecraft.potion.PotionEffect(net.minecraft.init.MobEffects.SLOWNESS, 60, 1));
        return super.hitEntity(stack, target, attacker);
    }
}
