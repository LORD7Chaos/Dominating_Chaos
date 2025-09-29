package com.lord.dominatingchaos.items;

import com.google.common.collect.Multimap;
import com.lord.dominatingchaos.init.ModSounds;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import javax.annotation.Nullable;
import java.util.List;

public class ItemChaosBlade extends ItemSword {

    public static final ToolMaterial CHAOS_MATERIAL = EnumHelper.addToolMaterial(
            "CHAOS", 10, -1, 20.0F, 0.0F, 30
    );

    private static final int COOLDOWN_TICKS = 200; // 10 секунд

    public ItemChaosBlade() {
        super(CHAOS_MATERIAL);
        setRegistryName("chaos_blade");
        setTranslationKey("chaos_blade");
        setMaxStackSize(1);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        if (!target.world.isRemote) {
            target.attackEntityFrom(DamageSource.MAGIC, Float.MAX_VALUE);
        }
        return true;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack stack = player.getHeldItem(hand);

        if (!world.isRemote && !player.getCooldownTracker().hasCooldown(this)) {
            double radius = 16.0D;
            AxisAlignedBB area = new AxisAlignedBB(
                    player.posX - radius, player.posY - radius, player.posZ - radius,
                    player.posX + radius, player.posY + radius, player.posZ + radius
            );

            List<Entity> entities = world.getEntitiesWithinAABB(Entity.class, area,
                    e -> e instanceof EntityLivingBase && !(e instanceof EntityPlayer));

            for (Entity entity : entities) {
                if (entity instanceof EntityLivingBase) {
                    ((EntityLivingBase) entity).attackEntityFrom(DamageSource.MAGIC, Float.MAX_VALUE);

                    for (int i = 0; i < 10; i++) {
                        double x = entity.posX + (Math.random() - 0.5) * entity.width;
                        double y = entity.posY + Math.random() * entity.height;
                        double z = entity.posZ + (Math.random() - 0.5) * entity.width;
                        world.spawnParticle(EnumParticleTypes.REDSTONE, x, y, z, 1.0, 0.0, 0.0);
                    }
                }
            }

            player.swingArm(hand);
            world.playSound(null, player.posX, player.posY, player.posZ,
                    ModSounds.CHAOS_ABILITY, SoundCategory.PLAYERS, 1.0F, 0.7F);

            player.getCooldownTracker().setCooldown(this, COOLDOWN_TICKS);
            player.sendMessage(new TextComponentString("§6Chaos is your power!"));
        }

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
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("§cSlays any foe with a single strike");
        tooltip.add("§6Right-click to summon crimson lightning, eradicating all enemies within 32 blocks");
        tooltip.add("§7Cooldown: 10 seconds");
    }
}