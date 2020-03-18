package com.aidenkeck.aidensfantasticjorney.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<>();

    @ObjectHolder("aidensfantasticjorney:aluminum_ingot")
    public static final Item ALUMINUM_INGOT = new ItemBase("aluminum_ingot", new Item.Properties());

    @ObjectHolder("aidensfantasticjorney:aluminum_sword")
    public static final Item ALUMINUM_SWORD = new ItemSword("aluminum_sword", ModTiers.ALUMINUM);
    @ObjectHolder("aidensfantasticjorney:aluminum_pickaxe")
    public static final Item ALUMINUM_PICKAXE = new ItemPickaxe("aluminum_pickaxe", ModTiers.ALUMINUM);
    @ObjectHolder("aidensfantasticjorney:aluminum_axe")
    public static final Item ALUMINUM_AXE = new ItemAxe("aluminum_axe", ModTiers.ALUMINUM);
    @ObjectHolder("aidensfantasticjorney:aluminum_shovel")
    public static final Item ALUMINUM_SHOVEL = new ItemShovel("aluminum_shovel", ModTiers.ALUMINUM);
    @ObjectHolder("aidensfantasticjorney:aluminum_hoe")
    public static final Item ALUMINUM_HOE = new ItemHoe("aluminum_hoe", ModTiers.ALUMINUM);

    @ObjectHolder("aidensfantasticjorney:yogurt")
    public static final Item YOGURT = new ItemYogurt("yogurt", 3, 2.4f);
    @ObjectHolder("aidensfantasticjorney:yogurt_sweetberry")
    public static final Item YOGURT_SWEETBERRY = new ItemYogurt("yogurt_sweetberry", 4, 5.4f);
    @ObjectHolder("aidensfantasticjorney:yogurt_chocolate")
    public static final Item YOGURT_CHOCOLATE = new ItemYogurt("yogurt_chocolate", 5, 1.2f);
    @ObjectHolder("aidensfantasticjorney:yogurt_watermelon")
    public static final Item YOGURT_WATERMELON = new ItemYogurt("yogurt_watermelon", 5, 6.0f);
}
