package com.aidenkeck.aidensfantasticjorney.items;

import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<>();

    @ObjectHolder("aidensfantasticjorney:yogurt")
    public static final Item YOGURT = new ItemYogurt("yogurt", 3, 2.4f);
    @ObjectHolder("aidensfantasticjorney:yogurt_sweetberry")
    public static final Item YOGURT_SWEETBERRY = new ItemYogurt("yogurt_sweetberry", 4, 5.4f);
}
