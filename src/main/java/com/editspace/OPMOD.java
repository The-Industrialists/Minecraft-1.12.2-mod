package com.editspace;

import net.minecraftforge.fml.common.Mod;
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
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		LOGGER.info("Hello, world!");
	}
}
