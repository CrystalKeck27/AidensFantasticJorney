package com.aidenkeck.aidensfantasticjorney.items;

import com.aidenkeck.aidensfantasticjorney.setup.ModSetup;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.common.ToolType;

public class ItemPickaxe extends PickaxeItem {
    public ItemPickaxe(String name, IItemTier itemTier, int addedAttack, float attackSpeed, Properties properties) {
        super(itemTier, addedAttack, attackSpeed, properties.group(ModSetup.itemGroup));
        setRegistryName(name);

        ModItems.ITEMS.add(this);
    }

    public ItemPickaxe(String name, IItemTier itemTier) {
        super(itemTier, 1, -2.8f, new Item.Properties().group(ModSetup.itemGroup).maxStackSize(1));
        setRegistryName(name);

        ModItems.ITEMS.add(this);
    }
}
