package com.aperture.breaktheseptenary.Proxy;

import net.minecraft.item.Item;

/**
 * Created by YangYang on 20/5/2017.
 */
public interface CommonProxy {
    void registerItemRenderer(Item item, int meta, String id);

}
