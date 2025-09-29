package com.lord.dominatingchaos.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.world.World;
import java.util.List;

public class PoisonBlade extends AbstractChaosSword {

    public PoisonBlade() {
        super("poison_blade");
    }

    @Override
    protected void addCustomInformation(ItemStack stack, World worldIn, List<String> tooltip,
                                        net.minecraft.client.util.ITooltipFlag flagIn) {
        tooltip.add("§aPoisons enemies for 5 seconds");
        tooltip.add("§cDeals 15% of enemy's max health per hit");
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        float damage = target.getMaxHealth() * 0.15f;
        target.attackEntityFrom(net.minecraft.util.DamageSource.MAGIC, damage);
        target.addPotionEffect(new PotionEffect(MobEffects.POISON, 100, 1)); // яд на 5 секунд
        return super.hitEntity(stack, target, attacker);
    }
}
