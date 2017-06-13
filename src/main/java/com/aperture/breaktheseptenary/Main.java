package com.aperture.breaktheseptenary;

import com.aperture.breaktheseptenary.Block.BCropHemp;
import com.aperture.breaktheseptenary.Proxy.CommonProxy;
import com.aperture.breaktheseptenary.init.Blocks;
import com.aperture.breaktheseptenary.init.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import static net.minecraftforge.fml.common.registry.GameRegistry.register;

@Mod(modid = BackEnd.MODID, name=BackEnd.NAME,version = BackEnd.VERSION,acceptedMinecraftVersions = BackEnd.VERSIONS)
public class  Main{
    @Mod.Instance
    public static Main instance;
    @SidedProxy(clientSide=BackEnd.CLIENT_PROXY_CLASS,serverSide = BackEnd.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    Blocks.init();
    Items.init();
    }
    public void init(FMLInitializationEvent event){
    }
    public void postInit(FMLPostInitializationEvent event){
    }

}
