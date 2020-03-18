package com.aidenkeck.aidensfantasticjorney.blocks;

import com.aidenkeck.aidensfantasticjorney.items.ModItems;
import com.aidenkeck.aidensfantasticjorney.setup.ModSetup;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockBase extends Block {
    public BlockBase(String name, Properties properties) {
        super(properties);
        setRegistryName(name);

        ModBlocks.BLOCKS.add(this);
        Item.Properties itemProperties = new Item.Properties()
                .group(ModSetup.itemGroup);
        ModItems.ITEMS.add(new BlockItem(this, itemProperties).setRegistryName(name));
    }
}
