package com.imperiouspi.generalmod;

import com.imperiouspi.generalmod.blocks.*;
import com.imperiouspi.generalmod.event.RainEvent;
import com.imperiouspi.generalmod.items.CardItem;
import com.imperiouspi.generalmod.setup.ClientProxy;
import com.imperiouspi.generalmod.setup.IProxy;
import com.imperiouspi.generalmod.setup.ModSetup;
import com.imperiouspi.generalmod.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
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
@Mod("generalmod")
public class GeneralMod {

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static ModSetup setup = new ModSetup();

    private static final Logger LOGGER = LogManager.getLogger();

    public GeneralMod() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(new WeatherEvents());

        //This should be put in the rain code net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(new RainEvent());
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.init();
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            //Block Registry
            event.getRegistry().register(new CardTableBlock());
            event.getRegistry().register(new PipeBlock());
            event.getRegistry().register(new PumpBlock());
            event.getRegistry().register(new RopeBlock());
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            //Block Item Registry
            Item.Properties prop = new Item.Properties().group(setup.itemGroup);
            event.getRegistry().register(new BlockItem(ModBlocks.CARDTABLEBLOCK, prop).setRegistryName("cardtableblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.PIPE, prop).setRegistryName("pipeblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.PUMP, prop).setRegistryName("pumpblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.ROPE, prop).setRegistryName("ropeblock"));
            //Item Registry
            event.getRegistry().register(new CardItem());
        }

        @SubscribeEvent
        public static void onTileEntityRegister(final RegistryEvent.Register<TileEntityType<?>> event) {
            event.getRegistry().register(TileEntityType.Builder.create(PipeTE::new, ModBlocks.PIPE).build(null).setRegistryName("pipeblock"));
        }
    }

    public static class WeatherEvents {
        @SubscribeEvent
        public static void rainListener(){

        }
    }
}
