package com.aidenkeck.aidensfantasticjorney.items;

import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<>();

    @ObjectHolder("aidensfantasticjorney:yogurt")
    public static final Item YOGURT = new ItemBase("yogurt", new Item.Properties());
}
