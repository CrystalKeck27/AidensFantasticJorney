package com.aidenkeck.aidensfantasticjorney;

import com.aidenkeck.aidensfantasticjorney.init.ModBlocks;
import com.aidenkeck.aidensfantasticjorney.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockBase extends Block {
    public BlockBase(String name, Properties properties) {
        super(properties);
        setRegistryName(name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new BlockItem(this, new Item.Properties()).setRegistryName(name));
    }
}
