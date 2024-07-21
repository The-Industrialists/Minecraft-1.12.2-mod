package com.editspace;


import com.editspace.item.ItemChewrySword;
import com.editspace.materials.OPModMaterials;
import com.editspace.util.RegistryUtil;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
@EventBusSubscriber(modid = OPMOD.MODID)
public class RegistrationHandler {


    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                RegistryUtil.setItemName(new Item(), "chewry").setCreativeTab(OPMOD.OP_MOD_TAB),
                RegistryUtil.setItemName(new ItemChewrySword(OPModMaterials.CHEWRY_TOOL), "chewry_sword").setCreativeTab(OPMOD.OP_MOD_TAB)

        };

        event.getRegistry().registerAll(items);
    }
}
