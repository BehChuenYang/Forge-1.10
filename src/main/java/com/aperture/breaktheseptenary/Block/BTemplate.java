package com.aperture.breaktheseptenary.Block;

import com.aperture.breaktheseptenary.Main;
import com.aperture.breaktheseptenary.init.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/**
 * Created by YangYang on 21/5/2017.
 */

public class BTemplate extends Block  implements ItemModelProvider {
    protected String name;
    public BTemplate(Material material, String name) {
        super(material);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }
    @Override
    public void registerItemModel(Item itemBlock) {
        Main.proxy.registerItemRenderer(itemBlock, 0, name);
    }
    @Override
    public BTemplate setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}