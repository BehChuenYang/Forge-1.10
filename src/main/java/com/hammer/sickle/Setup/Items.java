package com.hammer.sickle.Setup;

import com.hammer.sickle.Items.itemhilt;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by YangYang on 15/6/2017.
 */
public class Items {
    public static Item hilt;
    public static void init(){
    hilt=new itemhilt();
    }
    //register things
    public static void reg(){
    GameRegistry.register(hilt);
    }
    //register renderers
    public static void regrenders(){
    regrender(hilt);
    }
    private static void regrender(Item item){

    }
}
