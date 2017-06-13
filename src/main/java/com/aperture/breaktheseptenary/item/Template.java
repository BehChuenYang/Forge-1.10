package com.aperture.breaktheseptenary.item;

import com.aperture.breaktheseptenary.Main;
import com.aperture.breaktheseptenary.init.ItemModelProvider;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by YangYang on 21/5/2017.
 */
public class Template extends Item implements ItemModelProvider {

    protected String name;

    public Template(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }
    @Override
    public void registerItemModel(Item item) {
        Main.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public Template setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
