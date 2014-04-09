package org.nxs.kingdomcraft;

import org.nxs.kingdomcraft.common.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = KingdomCraft.MOD_ID, name = KingdomCraft.MOD_NAME, version = KingdomCraft.MOD_VERSION)
public class KingdomCraft {
	public static final String MOD_ID = "KingdomCraft";
	public static final String MOD_NAME = "Kingdom Craft";
	public static final String MOD_VERSION = "0.1B";
	public static final String CLIENT_PROXY = "org.nxs.kingdomcraft.client.ClientProxy";
	public static final String SERVER_PROXY = "org.nxs.kingdomcraft.common.CommonProxy";
	public static final String RESOURCE_PATH = "kingdomcraft:";

	@SidedProxy(clientSide = KingdomCraft.CLIENT_PROXY, serverSide = KingdomCraft.SERVER_PROXY)
	public static CommonProxy proxy;

	@Instance("KingdomCraft")
	public static KingdomCraft modInstance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.registerRenderThings();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}