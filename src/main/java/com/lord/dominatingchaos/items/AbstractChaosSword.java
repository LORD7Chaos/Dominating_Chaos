package com.lord.dominatingchaos.items;

import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

import javax.annotation.Nullable;
import java.util.List;

public abstract class AbstractChaosSword extends ItemSword {

    public static final ToolMaterial VOID_MATERIAL = EnumHelper.addToolMaterial(
            "VOID", 10, -1, 20.0F, 0.0F, 30
    );

    public AbstractChaosSword(String name) {
        super(VOID_MATERIAL);
        setRegistryName(name);
        setTranslationKey(name);
        setMaxStackSize(1);
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
                               net.minecraft.client.util.ITooltipFlag flagIn) {
        addCustomInformation(stack, worldIn, tooltip, flagIn);
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    protected abstract void addCustomInformation(ItemStack stack, @Nullable World worldIn,
                                                 List<String> tooltip,
                                                 net.minecraft.client.util.ITooltipFlag flagIn);
}