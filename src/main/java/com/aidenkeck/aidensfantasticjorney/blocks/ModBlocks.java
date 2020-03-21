package com.aidenkeck.aidensfantasticjorney.blocks;

import com.aidenkeck.aidensfantasticjorney.items.ModItems;
import com.aidenkeck.aidensfantasticjorney.setup.ModSetup;
import com.aidenkeck.aidensfantasticjorney.setup.RegistryEvents;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    @ObjectHolder("aidensfantasticjorney:aluminum_block")
    public static final Block ALUMINUM_BLOCK = register("aluminum_block", new Block(Block.Properties.create(Material.IRON)));
    @ObjectHolder("aidensfantasticjorney:aluminum_ore")
    public static final Block ALUMINUM_ORE = register("aluminum_ore", new OreBase(1));

    private static Block register(String name, Block block) {
        block.setRegistryName(name);
        BLOCKS.add(block);
        ModItems.ITEMS.add(new BlockItem(block, new Item.Properties().group(ModSetup.itemGroup)).setRegistryName(name));
        return block;
    }
}
