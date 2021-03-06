package com.aidenkeck.aidensfantasticjorney.setup;

import com.aidenkeck.aidensfantasticjorney.biomes.ModBiomes;
import com.aidenkeck.aidensfantasticjorney.blocks.ModBlocks;
import com.aidenkeck.aidensfantasticjorney.client.renderer.EntityDoohickieRenderer;
import com.aidenkeck.aidensfantasticjorney.entities.EntityDoohickie;
import com.aidenkeck.aidensfantasticjorney.entities.ModEntities;
import com.aidenkeck.aidensfantasticjorney.items.ModItems;
import com.aidenkeck.aidensfantasticjorney.particles.ModParticles;
import net.minecraft.block.Block;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.particles.ParticleType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
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

        //BiomeDictionary.addTypes(ModBiomes.ANDESITE_HILLS, BiomeDictionary.Type.BEACH, BiomeDictionary.Type.COLD, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.MOUNTAIN);
        //BiomeManager.addSpawnBiome(ModBiomes.ANDESITE_HILLS);
    }

    @SubscribeEvent
    public static void onEntityRegistry(final RegistryEvent.Register<EntityType<?>> entityTypeRegistryEvent) {
        entityTypeRegistryEvent.getRegistry().registerAll(ModEntities.ENTITY_TYPES.toArray(new EntityType<?>[0]));
        RenderingRegistry.registerEntityRenderingHandler(EntityDoohickie.class, EntityDoohickieRenderer::new);
    }

    @SubscribeEvent
    public static void onParticlesRegistry(final RegistryEvent.Register<ParticleType<?>> particleRegistryEvent) {
        //particleRegistryEvent.getRegistry().registerAll(ModParticles.PARTICLES.toArray(new ParticleType[0]));
    }
}
