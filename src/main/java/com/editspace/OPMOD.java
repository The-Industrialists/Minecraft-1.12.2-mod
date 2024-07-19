package com.editspace;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
	modid = OPMOD.MODID,
	name = OPMOD.NAME,
	version = OPMOD.VERSION
)
public class OPMOD {
	public static final String MODID = "editspace";
	public static final String NAME = "Op mod";
	public static final String VERSION = "0.0.1";

	@Mod.Instance(MODID)
	public static OPMOD Instance;
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);


	public static final CreativeTabs OP_MOD_TAB = new OpModTab();

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {


	}

	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		LOGGER.info("Hello, world!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
