package com.aperture.breaktheseptenary.Block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import static net.minecraft.block.material.Material.*;

/**
 * Created by YangYang on 21/5/2017.
 */
public class OreTemplate extends BTemplate {
    public OreTemplate(String name){
        super(Material.ROCK,name);
        setHardness(3f);
        setResistance(5f);
    }
    @Override
    public OreTemplate setCreativeTab(CreativeTabs tab){
        super.setCreativeTab(tab);
        return this;
    }
}
