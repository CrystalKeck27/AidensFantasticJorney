package com.aidenkeck.aidensfantasticjorney.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class ItemYogurt extends ItemBase {
    public ItemYogurt(String name, int hunger, float saturation) {
        super(name, new Item.Properties()
                .food(new Food.Builder().hunger(hunger).saturation(saturation).build()));
    }
}
