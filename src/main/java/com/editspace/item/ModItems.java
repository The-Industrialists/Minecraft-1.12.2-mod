package com.editspace.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemBase chewry = new ItemBase("chewry").setCreativeTab(CreativeTabs.MATERIALS);


    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                chewry
        );
    }

    public static void registerModels() {
        chewry.registerItemModel();
    }
}
