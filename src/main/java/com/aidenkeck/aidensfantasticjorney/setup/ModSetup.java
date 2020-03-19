package com.aidenkeck.aidensfantasticjorney.setup;

import com.aidenkeck.aidensfantasticjorney.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
    public static ItemGroup itemGroup = new ItemGroup("aidensfantasticjorney") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.ALUMINUM_BLOCK);
        }
    };
}
