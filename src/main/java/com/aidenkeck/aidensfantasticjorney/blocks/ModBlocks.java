package com.aidenkeck.aidensfantasticjorney.blocks;

import com.aidenkeck.aidensfantasticjorney.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    @ObjectHolder("aidensfantasticjorney:aluminum_block")
    public static final Block ALUMINUM_BLOCK = new BlockBase("aluminum_block",
            Block.Properties.create(Material.IRON));
    @ObjectHolder("aidensfantasticjorney:aluminum_ore")
    public static final Block ALUMINUM_ORE = new OreBase("aluminum_ore", 1);
}
