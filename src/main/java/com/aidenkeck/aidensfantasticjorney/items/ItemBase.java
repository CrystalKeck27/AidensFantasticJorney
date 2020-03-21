package com.aidenkeck.aidensfantasticjorney.items;

import com.aidenkeck.aidensfantasticjorney.setup.ModSetup;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase(Properties properties) {
        super(properties.group(ModSetup.itemGroup));
    }

    public ItemBase() {
        super(new Item.Properties().group(ModSetup.itemGroup));
    }
}
