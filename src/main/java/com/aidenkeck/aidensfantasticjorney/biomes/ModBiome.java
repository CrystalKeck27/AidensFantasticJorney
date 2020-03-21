package com.aidenkeck.aidensfantasticjorney.biomes;

import com.aidenkeck.aidensfantasticjorney.blocks.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

public class ModBiome extends Biome {
    protected ModBiome() {
        super(new Biome.Builder()
        .surfaceBuilder(new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT,
                new SurfaceBuilderConfig(ModBlocks.ALUMINUM_BLOCK.getDefaultState(),
                        ModBlocks.ALUMINUM_ORE.getDefaultState(),
                        Blocks.DIAMOND_BLOCK.getDefaultState())))
        .precipitation(RainType.RAIN)
        .category(Category.EXTREME_HILLS)
        .downfall(0.7f)
        .depth(0.7f)
        .temperature(0.5f)
        .waterColor(0xCC8899)
        .waterFogColor(0xCC8899)
        .scale(0.7f)
        .parent(null));
    }
}
