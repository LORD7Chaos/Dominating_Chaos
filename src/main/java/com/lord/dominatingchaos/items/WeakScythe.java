package com.lord.dominatingchaos.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import com.lord.dominatingchaos.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import java.util.List;

public class WeakScythe extends AbstractChaosSword {

    public WeakScythe() {
        super("weak_scythe");
    }

    @Override
    protected void addCustomInformation(ItemStack stack, World worldIn, List<String> tooltip,
                                        net.minecraft.client.util.ITooltipFlag flagIn) {
        tooltip.add("§cDeals 10% of enemy's max health per hit");
        tooltip.add("§cHarvests blood from slain creatures");
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        float damage = target.getMaxHealth() * 0.10f;
        target.attackEntityFrom(DamageSource.MAGIC, damage);

        if (!attacker.world.isRemote && !target.isEntityAlive()) {
            ItemStack blood = new ItemStack(ModItems.BOTTLE_OF_DIRTY_BLOOD);
            EntityItem drop = new EntityItem(attacker.world, target.posX, target.posY, target.posZ, blood);
            attacker.world.spawnEntity(drop);
        }

        return super.hitEntity(stack, target, attacker);
    }
}
