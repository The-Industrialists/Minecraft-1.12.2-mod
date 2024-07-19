package com.editspace;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
@EventBusSubscriber(modid = OPMOD.MODID)
public class RegistrationHandler {


    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                new Item().setRegistryName(OPMOD.MODID, "chewry").setTranslationKey(OPMOD.MODID + "." + "chewry").setCreativeTab(CreativeTabs.MISC)
        };

        event.getRegistry().registerAll(items);
    }
}
