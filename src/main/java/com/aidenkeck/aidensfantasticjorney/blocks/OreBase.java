package com.aidenkeck.aidensfantasticjorney.blocks;

import com.aidenkeck.aidensfantasticjorney.items.ModItems;
import com.aidenkeck.aidensfantasticjorney.setup.ModSetup;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class OreBase extends OreBlock {
    public OreBase(String name) {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F));
        setRegistryName(name);

        ModBlocks.BLOCKS.add(this);
        Item.Properties itemProperties = new Item.Properties()
                .group(ModSetup.itemGroup);
        ModItems.ITEMS.add(new BlockItem(this, itemProperties).setRegistryName(name));
    }
}
