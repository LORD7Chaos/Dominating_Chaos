package com.lord.dominatingchaos.items;

import com.google.common.collect.Multimap;
import com.lord.dominatingchaos.init.ModSounds;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;

import java.util.List;
import java.util.Random;

public class ItemDominatorsBlade extends ItemSword {

    private static final Random random = new Random();
    private static final int COOLDOWN_TICKS = 200; // 10 секунд

    public ItemDominatorsBlade(ToolMaterial material) {
        super(material);
        setRegistryName("dominators_blade");
        setTranslationKey("dominators_blade");
        setMaxStackSize(1);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        if (!attacker.world.isRemote) {
            if (random.nextFloat() < 0.5f) {
                target.onKillCommand(); // мгновенная смерть
            }
            attacker.world.playSound(null, target.posX, target.posY, target.posZ,
                    ModSounds.DOMINATOR_HIT, SoundCategory.PLAYERS, 1.0F, 1.0F);
        }
        return true;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack stack = player.getHeldItem(hand);

        if (!world.isRemote) {
            if (player.getCooldownTracker().hasCooldown(this)) {
                return new ActionResult<>(EnumActionResult.FAIL, stack);
            }

            int radius = 32;
            AxisAlignedBB area = player.getEntityBoundingBox().grow(radius);

            List<EntityLivingBase> entities = world.getEntitiesWithinAABB(EntityLivingBase.class, area,
                    e -> e != player);

            for (EntityLivingBase entity : entities) {
                entity.onKillCommand(); // мгновенная смерть
            }

            player.world.playSound(null, player.posX, player.posY, player.posZ,
                    ModSounds.DOMINATOR_ABILITY, SoundCategory.PLAYERS, 1.0F, 1.0F);

            player.getCooldownTracker().setCooldown(this, COOLDOWN_TICKS);
            player.sendMessage(new TextComponentString("§6The moment when domination will enslave everyone"));
        }

        player.swingArm(hand);
        return new ActionResult<>(EnumActionResult.SUCCESS, stack);
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
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, net.minecraft.client.util.ITooltipFlag flagIn) {
        tooltip.add("§cHas a 50% chance to instantly slay any creature");
        tooltip.add("§6Right-click to unleash a devastating strike, obliterating all nearby foes within 32 blocks");
        tooltip.add("§7Cooldown: 10 seconds");
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}