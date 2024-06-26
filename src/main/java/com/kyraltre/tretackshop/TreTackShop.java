package com.kyraltre.tretackshop;

import com.kyraltre.tretackshop.block.TackShopBlocks;
import com.kyraltre.tretackshop.registry.AwardShopBlockRegistry;
import com.kyraltre.tretackshop.registry.AwardShopItems;
import com.kyraltre.tretackshop.registry.TackShopBlockRegistry;
import com.kyraltre.tretackshop.registry.TackShopItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("tretackshop")
public class TreTackShop
{
    public static final String MOD_ID = "tretackshop";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static ResourceLocation resloc(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
    public static ResourceLocation swresloc(String name) {
        return new ResourceLocation("swem", name);
    }

    public TreTackShop() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, TackShopCommonConfigs.SPEC, "tretackshop-common.toml");
        //TackItems.register(eventBus); // registers the deferred items in ModItems
        TackShopItems.init(eventBus);
        TackShopBlockRegistry.init(eventBus);
        AwardShopBlockRegistry.init(eventBus);
        AwardShopItems.init(eventBus);
        TackShopBlocks.register(eventBus); //registers the deferred items in ModBlocks

        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {

        RenderTypeLookup.setRenderLayer(TackShopBlocks.PUMPKIN_GRAND.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TackShopBlocks.PUMPKIN_RESERVE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TackShopBlocks.SNOWFLAKE_RESERVE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TackShopBlocks.SNOWFLAKE_GRAND.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TackShopBlocks.HEART_RESERVE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TackShopBlocks.HEART_GRAND.get(), RenderType.getCutout());

    }


    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("Tre says plant a tree <3");
        LOGGER.info(14 + " Award Sets Loaded.");
    }

    }
//        // Register the setup method for modloading
//        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
//        // Register the enqueueIMC method for modloading
//        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
//        // Register the processIMC method for modloading
//        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
//        // Register the doClientStuff method for modloading
//        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
//
//        // Register ourselves for server and other game events we are interested in
//        MinecraftForge.EVENT_BUS.register(this);
//    }
//
//    private void setup(final FMLCommonSetupEvent event)
//    {
//        // some preinit code
//        LOGGER.info("HELLO FROM PREINIT");
//        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
//    }
//
//    private void doClientStuff(final FMLClientSetupEvent event) {
//        // do something that can only be done on the client
//     //   LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
//    }
//
//    private void enqueueIMC(final InterModEnqueueEvent event)
//    {
//        // some example code to dispatch IMC to another mod
//        InterModComms.sendTo("tretackshop", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
//    }
//
//    private void processIMC(final InterModProcessEvent event)
//    {
//        // some example code to receive and process InterModComms from other mods
//        LOGGER.info("Got IMC {}", event.getIMCStream().
//                map(m->m.getMessageSupplier().get()).
//                collect(Collectors.toList()));
//    }
//    // You can use SubscribeEvent and let the Event Bus discover methods to call
//    @SubscribeEvent
//    public void onServerStarting(FMLServerStartingEvent event) {
//        // do something when the server starts
//        LOGGER.info("HELLO from server starting");
//    }
//
//    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
//    // Event bus for receiving Registry Events)
//    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
//    public static class RegistryEvents {
//        @SubscribeEvent
//        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
//            // register a new block here
//            LOGGER.info("HELLO from Register Block");
//        }
//    }

