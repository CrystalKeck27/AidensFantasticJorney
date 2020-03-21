package com.aidenkeck.aidensfantasticjorney.items;

import com.aidenkeck.aidensfantasticjorney.setup.ModSetup;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class ItemAxe extends AxeItem {
    public ItemAxe(IItemTier itemTier, float addedAttack, float attackSpeed, Properties properties) {
        super(itemTier, addedAttack, attackSpeed, properties.group(ModSetup.itemGroup));
    }

    public ItemAxe(IItemTier itemTier) {
        super(itemTier, 6.0f, -3.2f, new Item.Properties().group(ModSetup.itemGroup).maxStackSize(1));
    }
}
