package com.hammer.sickle;

import com.hammer.sickle.Proxy.Common;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import static net.minecraftforge.fml.common.registry.GameRegistry.register;

@Mod(modid = "hs", name="Hammer and Sickle",version = "1.9-1.10_ALPHA",acceptedMinecraftVersions = "[1.9.4,1.10.2]")
public class Main{
    @Mod.Instance("hs")
    public static Main instance;
    @SidedProxy(clientSide="com.hammer.sickle.Proxy.Client", serverSide = "com.hammer.sickle.Proxy.Server")
    public static Common proxy;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
    }

}
