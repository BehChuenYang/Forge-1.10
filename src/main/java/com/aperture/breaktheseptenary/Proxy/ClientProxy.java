package com.aperture.breaktheseptenary.Proxy;

import com.aperture.breaktheseptenary.init.Items;
import com.aperture.breaktheseptenary.item.Template;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by YangYang on 20/5/2017.
 */
public class ClientProxy implements CommonProxy{
    @Override
    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
