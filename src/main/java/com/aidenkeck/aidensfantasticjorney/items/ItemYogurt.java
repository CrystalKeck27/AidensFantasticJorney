package com.aidenkeck.aidensfantasticjorney.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemYogurt extends ItemBase {
    public ItemYogurt(int hunger, float saturation) {
        super(new Item.Properties()
                .food(new Food.Builder().hunger(hunger).saturation(saturation).build()));
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        //stack.shrink(1);
        ItemStack dirtyStack = new ItemStack(ModItems.DIRTY_YOGURT_CONTAINER);
        if (stack.isEmpty()) {
            return dirtyStack;
        } else {
            if (entityLiving instanceof PlayerEntity) {
                PlayerEntity player = (PlayerEntity) entityLiving;
                if(!player.inventory.addItemStackToInventory(dirtyStack)) {
                    player.dropItem(dirtyStack, false);
                }
            }

            return stack;
        }
    }
}
