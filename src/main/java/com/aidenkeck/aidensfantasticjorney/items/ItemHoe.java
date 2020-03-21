package com.aidenkeck.aidensfantasticjorney.items;

import com.aidenkeck.aidensfantasticjorney.setup.ModSetup;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class ItemHoe extends HoeItem {
    public ItemHoe(IItemTier itemTier, float attackSpeed, Properties properties) {
        super(itemTier, attackSpeed, properties);
    }

    public ItemHoe(IItemTier itemTier) {
        super(itemTier,-1.0f, new Item.Properties().group(ModSetup.itemGroup).maxStackSize(1));
    }
}
