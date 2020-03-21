package com.aidenkeck.aidensfantasticjorney;

import com.aidenkeck.aidensfantasticjorney.biomes.ModBiomes;
import com.aidenkeck.aidensfantasticjorney.blocks.ModBlocks;
import com.aidenkeck.aidensfantasticjorney.items.ModItems;
import com.aidenkeck.aidensfantasticjorney.setup.ClientProxy;
import com.aidenkeck.aidensfantasticjorney.setup.IProxy;
import com.aidenkeck.aidensfantasticjorney.setup.RegistryEvents;
import com.aidenkeck.aidensfantasticjorney.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.OverworldBiomeProvider;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("aidensfantasticjorney")
public class AidensFantasticJorney {

    public static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    private static final Logger LOGGER = LogManager.getLogger();

    public AidensFantasticJorney() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        // MinecraftForge.EVENT_BUS.register(RegistryEvents.class);
        // We are automatically being registered so this does not matter
    }

    private void setup(final FMLCommonSetupEvent event) {
        for (Biome biome : Biome.BIOMES) {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.ALUMINUM_ORE.getDefaultState(), 9), Placement.COUNT_RANGE, new CountRangeConfig(20, 0, 0, 64)));
        }
    }
}
