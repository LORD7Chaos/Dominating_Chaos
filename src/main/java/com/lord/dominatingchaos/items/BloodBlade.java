package com.lord.dominatingchaos.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import java.util.List;

public class BloodBlade extends AbstractChaosSword {

    public BloodBlade() {
        super("blood_blade");
    }

    @Override
    protected void addCustomInformation(ItemStack stack, World worldIn, List<String> tooltip,
                                        net.minecraft.client.util.ITooltipFlag flagIn) {
        tooltip.add("§aRestores 50% of the damage dealt to the player");
        tooltip.add("§cDrains 20% of enemy's max health per hit");
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        float damage = target.getMaxHealth() * 0.2f; // 20% от максимального здоровья
        target.attackEntityFrom(net.minecraft.util.DamageSource.GENERIC, damage);
        if (attacker instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) attacker;
            player.heal(damage * 0.5f); // восстанавливает 50% нанесённого урона
        }
        return super.hitEntity(stack, target, attacker);
    }
}
