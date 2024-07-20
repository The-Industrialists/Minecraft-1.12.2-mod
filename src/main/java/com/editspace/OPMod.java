package com.editspace;

import com.editspace.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod(
	modid = OPMod.MODID,
	name = OPMod.NAME,
	version = OPMod.VERSION
)
public class OPMod {
	public static final String MODID = "opmod";
	public static final String NAME = "Op mod D edition";
	public static final String VERSION = "0.0.1";
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);

	@SidedProxy(serverSide = "com.editspace.proxy.CommonProxy", clientSide = "com.editspace.proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		LOGGER.info("Hello, world!");
	}




	@EventBusSubscriber
	public static class RegistrationHandler{



	}
}
