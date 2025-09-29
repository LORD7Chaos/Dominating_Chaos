
package com.lord.dominatingchaos.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;

import javax.annotation.Nullable;
import java.util.List;

public class Chainsaw extends ItemAxe {

    private static final float DAMAGE_PERCENT = 0.10F;

    public Chainsaw() {
        super(ToolMaterial.DIAMOND, 0.0F, -3.0F);
        setRegistryName("chainsaw");
        setTranslationKey("chainsaw");
        setMaxStackSize(1);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        if (!target.world.isRemote) {
            float damage = target.getMaxHealth() * DAMAGE_PERCENT;
            target.attackEntityFrom(DamageSource.GENERIC, damage);
        }
        return true;
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {
        Multimap<String, AttributeModifier> modifiers = super.getAttributeModifiers(slot, stack);
        if (slot == EntityEquipmentSlot.MAINHAND) {
            modifiers.removeAll(SharedMonsterAttributes.ATTACK_DAMAGE.getName());
        }
        return modifiers;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip,
                               ITooltipFlag flagIn) {
        tooltip.add("§cDeals 10% of enemy's max health per hit");
        tooltip.add("§6Extremely fast attack speed");
        tooltip.add("§7Ideal for chopping through enemies quickly");
    }

    @Override
    public float getDestroySpeed(ItemStack stack, net.minecraft.block.state.IBlockState state) {
        return 25.0F;
    }
}
