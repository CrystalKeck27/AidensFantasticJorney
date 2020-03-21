package com.aidenkeck.aidensfantasticjorney.items;

import com.aidenkeck.aidensfantasticjorney.setup.ModSetup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;

public class ModArmorItem extends ArmorItem {
    public ModArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
        super(materialIn, slot, builder.group(ModSetup.itemGroup).maxStackSize(1));
    }

    public ModArmorItem(IArmorMaterial armorMaterial, EquipmentSlotType slot) {
        super(armorMaterial, slot, new Item.Properties().group(ModSetup.itemGroup).maxStackSize(1));
    }
}
