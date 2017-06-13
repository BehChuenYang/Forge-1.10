package com.aperture.breaktheseptenary.init;

import com.aperture.breaktheseptenary.Block.BCropHemp;
import com.aperture.breaktheseptenary.Block.BTemplate;
import com.aperture.breaktheseptenary.Block.OreTemplate;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by YangYang on 21/5/2017.
 */
public class Blocks{
public static BCropHemp cropHemp;
public static OreTemplate oreCopper;
    public static void init(){
       oreCopper = register(new OreTemplate("orecopper").setCreativeTab(CreativeTabs.MATERIALS));
       cropHemp = register(new BCropHemp(), null);
    }
    private static <T extends Block>T register(T Block, ItemBlock block){
        if(block==null) {
        }else{
            GameRegistry.register(Block);
            GameRegistry.register(block);
            if(Block instanceof ItemModelProvider)((ItemModelProvider)Block).registerItemModel(block);
        }
        return Block;
    }
    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
