package com.aidenkeck.aidensfantasticjorney.items;

import com.aidenkeck.aidensfantasticjorney.setup.ModSetup;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class ItemSword extends SwordItem {
    public ItemSword(String name, IItemTier itemTier, int addedAttack, float attackSpeed, Properties properties) {
        super(itemTier, addedAttack, attackSpeed, properties);
        setRegistryName(name);

        ModItems.ITEMS.add(this);
    }

    public ItemSword(String name, IItemTier itemTier){
        super(itemTier, 3, -2.4f, new Item.Properties().group(ModSetup.itemGroup).maxStackSize(1));
        setRegistryName(name);

        ModItems.ITEMS.add(this);
    }
}
