package com.editspace;

import com.editspace.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class OpModTab extends CreativeTabs {

    public OpModTab() {
        super(OPMOD.MODID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.CHEWRY);
    }
}
