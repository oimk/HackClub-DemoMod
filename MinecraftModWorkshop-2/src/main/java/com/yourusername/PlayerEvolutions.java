package com.yourusername;

import com.aidenj.playerevolutions.util.RegistryHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("playerevolutions")
public class PlayerEvolutions {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "playerevolutions";

    public PlayerEvolutions(){
            FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
            FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
            RegistryHandler.init();
            MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup (final FMLCommonSetupEvent event) {

    }
    private void doClientStuff(final FMLClientSetupEvent event) {

    }
    public static final ItemGroup TAB = new ItemGroup("Playerevolutions"){
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.RUBY.get());
        }
    };
}
