package com.aidenkeck.aidensfantasticjorney.items;

import com.aidenkeck.aidensfantasticjorney.entities.ModEntities;
import com.aidenkeck.aidensfantasticjorney.setup.ModSetup;
import com.aidenkeck.aidensfantasticjorney.setup.RegistryEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static List<Item> ITEMS = new ArrayList<>();

    @ObjectHolder("aidensfantasticjorney:aluminum_ingot")
    public static final Item ALUMINUM_INGOT = register("aluminum_ingot", new ItemBase());
    @ObjectHolder("aidensfantasticjorney:aluminum_nugget")
    public static final Item ALUMINUM_NUGGET = register("aluminum_nugget", new ItemBase());

    @ObjectHolder("aidensfantasticjorney:aluminum_sword")
    public static final Item ALUMINUM_SWORD = register("aluminum_sword", new ItemSword(ModTiers.ALUMINUM));
    @ObjectHolder("aidensfantasticjorney:aluminum_pickaxe")
    public static final Item ALUMINUM_PICKAXE = register("aluminum_pickaxe", new ItemPickaxe(ModTiers.ALUMINUM));
    @ObjectHolder("aidensfantasticjorney:aluminum_axe")
    public static final Item ALUMINUM_AXE = register("aluminum_axe", new ItemAxe(ModTiers.ALUMINUM));
    @ObjectHolder("aidensfantasticjorney:aluminum_shovel")
    public static final Item ALUMINUM_SHOVEL = register("aluminum_shovel", new ItemShovel(ModTiers.ALUMINUM));
    @ObjectHolder("aidensfantasticjorney:aluminum_hoe")
    public static final Item ALUMINUM_HOE = register("aluminum_hoe", new ItemHoe(ModTiers.ALUMINUM));

    @ObjectHolder("aidensfantasticjorney:aluminum_helmet")
    public static final Item ALUMINUM_HELMET = register("aluminum_helmet", new ModArmorItem(ModArmorMaterial.ALUMINUM, EquipmentSlotType.HEAD));
    @ObjectHolder("aidensfantasticjorney:aluminum_chestplate")
    public static final Item ALUMINUM_CHESTPLATE = register("aluminum_chestplate", new ModArmorItem(ModArmorMaterial.ALUMINUM, EquipmentSlotType.CHEST));
    @ObjectHolder("aidensfantasticjorney:aluminum_leggings")
    public static final Item ALUMINUM_LEGGINGS = register("aluminum_leggings", new ModArmorItem(ModArmorMaterial.ALUMINUM, EquipmentSlotType.LEGS));
    @ObjectHolder("aidensfantasticjorney:aluminum_boots")
    public static final Item ALUMINUM_BOOTS = register("aluminum_boots", new ModArmorItem(ModArmorMaterial.ALUMINUM, EquipmentSlotType.FEET));

    @ObjectHolder("aidensfantasticjorney:yogurt_container")
    public static final Item YOGURT_CONTAINER = register("yogurt_container", new ItemBase());
    @ObjectHolder("aidensfantasticjorney:dirty_yogurt_container")
    public static final Item DIRTY_YOGURT_CONTAINER = register("dirty_yogurt_container", new DirtyContainerItem(YOGURT_CONTAINER));
    @ObjectHolder("aidensfantasticjorney:yogurt")
    public static final Item YOGURT = register("yogurt", new ItemYogurt( 3, 2.4f));
    @ObjectHolder("aidensfantasticjorney:yogurt_sweetberry")
    public static final Item YOGURT_SWEETBERRY = register("yogurt_sweetberry", new ItemYogurt(4, 5.4f));
    @ObjectHolder("aidensfantasticjorney:yogurt_chocolate")
    public static final Item YOGURT_CHOCOLATE = register("yogurt_chocolate", new ItemYogurt(5, 1.2f));
    @ObjectHolder("aidensfantasticjorney:yogurt_watermelon")
    public static final Item YOGURT_WATERMELON = register("yogurt_watermelon", new ItemYogurt(5, 6.0f));

    @ObjectHolder("aidensfantasticjorney:doohickie_egg")
    public static final Item DOOHICKIE_EGG = register("doohickie_egg",
            new SpawnEggItem(ModEntities.DOOHICKIE, 0xFFFFFF, 0x0000FF,
                    new Item.Properties().group(ModSetup.itemGroup)));

    private static Item register(String name, Item item) {
        item.setRegistryName(name);

        ITEMS.add(item);
        return item;
    }
}
