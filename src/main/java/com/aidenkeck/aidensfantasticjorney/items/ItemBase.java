package com.aidenkeck.aidensfantasticjorney.items;

import com.aidenkeck.aidensfantasticjorney.setup.ModSetup;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase(String name, Properties properties) {
        super(properties.group(ModSetup.itemGroup));
        setRegistryName(name);

        ModItems.ITEMS.add(this);
    }
}
