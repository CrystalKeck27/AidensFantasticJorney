package com.aidenkeck.aidensfantasticjorney.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadBase;

import java.util.function.Supplier;

public enum ModTiers implements IItemTier {
    ALUMINUM(2, 300, 7.0f, 1f, 18, ModItems.ALUMINUM_INGOT);


    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyLoadBase<Ingredient> repairMaterial;

    ModTiers(int harvestLevel, int durability, float efficiency, float attackDamage, int enchantability, Item repairMaterial){
        this.harvestLevel = harvestLevel;
        this.maxUses = durability;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyLoadBase<>(() -> Ingredient.fromItems(repairMaterial));
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }
}
