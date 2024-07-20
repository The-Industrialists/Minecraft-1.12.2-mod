package com.editspace.proxy;

import com.editspace.OPMod;


import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;


public class ClientProxy extends CommonProxy{

    @Override
    public void registerItemRenderer(Item item, int metadataValue, String itemId) {
        ModelLoader.setCustomModelResourceLocation(item, metadataValue, new ModelResourceLocation(OPMod.MODID + ":" + itemId, "inventory"));
    }
}

