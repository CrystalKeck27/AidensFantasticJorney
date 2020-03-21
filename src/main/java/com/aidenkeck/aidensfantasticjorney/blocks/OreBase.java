package com.aidenkeck.aidensfantasticjorney.blocks;

import com.aidenkeck.aidensfantasticjorney.items.ModItems;
import com.aidenkeck.aidensfantasticjorney.setup.ModSetup;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class OreBase extends OreBlock {
    public OreBase(int harvestLevel) {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0F, 3.0F)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(harvestLevel));
    }
}
