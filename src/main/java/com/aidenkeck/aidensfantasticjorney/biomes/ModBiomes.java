package com.aidenkeck.aidensfantasticjorney.biomes;

import com.aidenkeck.aidensfantasticjorney.setup.RegistryEvents;
import net.minecraft.world.biome.Biome;

import java.util.ArrayList;
import java.util.List;

public class ModBiomes {
    public static List<Biome> BIOMES = new ArrayList<>();

    //public static final Biome ANDESITE_HILLS = register("andesite_hills", new ModBiome());

    private static Biome register(String name, Biome biome) {
        biome.setRegistryName(name);

        BIOMES.add(biome);
        return biome;
    }
}
