package com.aidenkeck.aidensfantasticjorney.blocks;

import com.aidenkeck.aidensfantasticjorney.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    @ObjectHolder("aidensfantasticjorney:not_iron")
    public static final Block NOT_IRON = new BlockBase("not_iron",
            Block.Properties.create(Material.IRON));
}
