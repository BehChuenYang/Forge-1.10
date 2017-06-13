package com.aperture.breaktheseptenary.item;

import com.aperture.breaktheseptenary.Block.BCropHemp;
import com.aperture.breaktheseptenary.Main;
import com.aperture.breaktheseptenary.init.ItemModelProvider;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
/**
 * Created by YangYang on 13/6/2017.
 */
public class IHempSeed extends ItemSeeds implements ItemModelProvider {

    public IHempSeed() {
        super(com.aperture.breaktheseptenary.init.Blocks.cropHemp, net.minecraft.init.Blocks.FARMLAND);
        setUnlocalizedName("hempseed");
        setRegistryName("hempseed");
    }

    @Override
    public void registerItemModel(Item item) {
        Main.proxy.registerItemRenderer(item, 0, "hempseed");
    }

}