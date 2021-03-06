package com.aidenkeck.aidensfantasticjorney.items;

import com.aidenkeck.aidensfantasticjorney.setup.ModSetup;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;

public class ItemShovel extends ShovelItem {
    public ItemShovel(IItemTier itemTier, int addedAttack, float attackSpeed, Properties properties) {
        super(itemTier, addedAttack, attackSpeed, properties.group(ModSetup.itemGroup));
    }

    public ItemShovel(IItemTier itemTier) {
        super(itemTier, 1.5f, -3.0f, new Item.Properties().group(ModSetup.itemGroup).maxStackSize(1));
    }
}
