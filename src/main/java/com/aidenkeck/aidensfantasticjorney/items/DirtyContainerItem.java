package com.aidenkeck.aidensfantasticjorney.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class DirtyContainerItem extends ItemBase {

    public DirtyContainerItem(Item cleanVariant) {
        this.cleanVariant = cleanVariant;
    }

    public Item cleanVariant;

    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getHeldItem(hand);
        RayTraceResult rayTraceResult = rayTrace(world, player, RayTraceContext.FluidMode.ANY);
        if(rayTraceResult.getType() == RayTraceResult.Type.MISS) {
            return new ActionResult<>(ActionResultType.PASS, itemStack);
        } else {
            if(rayTraceResult.getType() == RayTraceResult.Type.BLOCK) {
                BlockPos blockPos = ((BlockRayTraceResult)rayTraceResult).getPos();
                if(!world.isBlockModifiable(player, blockPos)) {
                    return new ActionResult<>(ActionResultType.PASS, itemStack);
                }

                if(world.getFluidState(blockPos).isTagged(FluidTags.WATER)) {
                    return new ActionResult<>(ActionResultType.SUCCESS, cleanContainer(itemStack, player));
                }
            }

            return new ActionResult<>(ActionResultType.PASS, itemStack);
        }
    }

    protected ItemStack cleanContainer(ItemStack itemStack, PlayerEntity player) {
        itemStack.shrink(1);
        ItemStack cleanVariantStack = new ItemStack(cleanVariant);
        player.addStat(Stats.ITEM_USED.get(this));
        if(itemStack.isEmpty()) {
            return cleanVariantStack;
        } else {
            if(!player.inventory.addItemStackToInventory(cleanVariantStack)) {
                player.dropItem(cleanVariantStack, false);
            }

            return itemStack;
        }
    }
}
