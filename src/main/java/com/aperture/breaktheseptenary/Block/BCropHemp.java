package com.aperture.breaktheseptenary.Block;

/**
 * Created by YangYang on 13/6/2017.
 */

import com.aperture.breaktheseptenary.init.Blocks;
import com.aperture.breaktheseptenary.init.Items;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BCropHemp extends BlockCrops {

    public BCropHemp() {
        setUnlocalizedName("crophemp");
        setRegistryName("crophemp");
    }

    @Override
    protected Item getSeed() {
        return Items.hempSeed;
    }

    @Override
    protected Item getCrop(){
        return Items.hempfiber;
    }

}