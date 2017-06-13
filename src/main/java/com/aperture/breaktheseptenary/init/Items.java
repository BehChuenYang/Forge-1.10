package com.aperture.breaktheseptenary.init;

        import com.aperture.breaktheseptenary.item.IHempSeed;
        import com.aperture.breaktheseptenary.item.Template;
        import net.minecraft.creativetab.CreativeTabs;
        import net.minecraft.item.Item;
        import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by YangYang on 20/5/2017.
 */
public class Items {
    public static Template hemp,ingotCopper,hempfiber;
    public static IHempSeed hempSeed;
    public static void init(){
        hemp = register(new Template("hemp").setCreativeTab(CreativeTabs.MATERIALS));
        ingotCopper = register(new Template("ingotCopper").setCreativeTab(CreativeTabs.MATERIALS));
        hempfiber=register(new Template("hempfiber").setCreativeTab(CreativeTabs.MATERIALS));
        hempSeed = register(new IHempSeed());
    }
    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemModelProvider) {
            ((ItemModelProvider)item).registerItemModel(item);
        }

        return item;
    }

}
