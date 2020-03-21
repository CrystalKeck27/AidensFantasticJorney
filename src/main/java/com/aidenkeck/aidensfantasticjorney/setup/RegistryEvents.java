package com.aidenkeck.aidensfantasticjorney.setup;

import com.aidenkeck.aidensfantasticjorney.biomes.ModBiomes;
import com.aidenkeck.aidensfantasticjorney.blocks.ModBlocks;
import com.aidenkeck.aidensfantasticjorney.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {

    public static List<Block> BLOCKS = new ArrayList<>();

    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
        blockRegistryEvent.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
        itemRegistryEvent.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBiomesRegistry(final RegistryEvent.Register<Biome> biomeRegistryEvent) {
        biomeRegistryEvent.getRegistry().registerAll(ModBiomes.BIOMES.toArray(new Biome[0]));

        BiomeDictionary.addTypes(ModBiomes.ANDESITE_HILLS, BiomeDictionary.Type.BEACH, BiomeDictionary.Type.COLD, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.MOUNTAIN);
        BiomeManager.addSpawnBiome(ModBiomes.ANDESITE_HILLS);
        LOGGER.info("REGISTRY: BIOME");
    }
}
