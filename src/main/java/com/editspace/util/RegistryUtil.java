package com.editspace.util;

import com.editspace.OPMOD;
import net.minecraft.item.Item;

public class RegistryUtil {
    public static Item setItemName(final Item item, final String name) {
        item.setRegistryName(OPMOD.MODID, name).setTranslationKey(OPMOD.MODID + "." + name);
        return item;
    }
}
