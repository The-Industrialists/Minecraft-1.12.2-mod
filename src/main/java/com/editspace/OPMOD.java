package com.editspace;

import com.editspace.proxy.CommonProxy;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
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

	@SidedProxy(serverSide = "com.editspace.proxy.CommonProxy", clientSide = "com.editspace.proxy.ClientProxy")
	public static CommonProxy proxy;


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
