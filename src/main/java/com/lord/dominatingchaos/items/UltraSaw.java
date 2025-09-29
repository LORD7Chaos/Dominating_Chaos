package com.lord.dominatingchaos.items;

import com.lord.dominatingchaos.init.ModSounds;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class UltraSaw extends AbstractChaosSword {

    private static final float DAMAGE_PERCENT = 0.50F; //
    private static final int COOLDOWN = 5 * 20; //

    public UltraSaw() {
        super("ultra_saw");
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack stack = player.getHeldItem(hand);

        if (!world.isRemote) {
            if (!player.getCooldownTracker().hasCooldown(this)) {
                double range = 32.0D;

                Vec3d eyePos = player.getPositionEyes(1.0F);
                Vec3d lookVec = player.getLookVec();
                Vec3d reachVec = eyePos.add(lookVec.x * range, lookVec.y * range, lookVec.z * range);

                RayTraceResult result = world.rayTraceBlocks(eyePos, reachVec, false, true, false);

                if (result != null) {
                    reachVec = result.hitVec;
                }

                EntityLivingBase target = getLookedAtEntity(player, range);
                if (target != null) {
                    float damage = target.getMaxHealth() * DAMAGE_PERCENT;
                    target.attackEntityFrom(DamageSource.causePlayerDamage(player), damage);
                }

                world.playSound(null, player.posX, player.posY, player.posZ,
                        ModSounds.ULTRA_SAW_SHOT, SoundCategory.PLAYERS, 1.0F, 1.0F);

                player.getCooldownTracker().setCooldown(this, COOLDOWN);
            }
        }

        return new ActionResult<>(EnumActionResult.SUCCESS, stack);
    }

    private EntityLivingBase getLookedAtEntity(EntityPlayer player, double range) {
        Vec3d eyePos = player.getPositionEyes(1.0F);
        Vec3d lookVec = player.getLookVec();
        Vec3d reachVec = eyePos.add(lookVec.x * range, lookVec.y * range, lookVec.z * range);

        EntityLivingBase closest = null;
        double closestDist = range * range;

        for (EntityLivingBase entity : player.world.getEntitiesWithinAABB(EntityLivingBase.class,
                player.getEntityBoundingBox().grow(range))) {
            if (entity == player) continue;

            AxisAlignedBB bb = entity.getEntityBoundingBox().grow(0.3D);
            RayTraceResult result = bb.calculateIntercept(eyePos, reachVec);

            if (result != null) {
                double dist = eyePos.squareDistanceTo(result.hitVec);
                if (dist < closestDist) {
                    closest = entity;
                    closestDist = dist;
                }
            }
        }
        return closest;
    }

    @Override
    protected void addCustomInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip,
                                        ITooltipFlag flagIn) {
        tooltip.add("§cRight-click: Fires an energy shot (50% max HP damage)");
        tooltip.add("§7Cooldown: 5 seconds");
    }
}