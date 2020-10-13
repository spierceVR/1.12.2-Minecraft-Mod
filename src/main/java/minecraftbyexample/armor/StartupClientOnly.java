package minecraftbyexample.armor;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupClientOnly
{
    public static void preInitClientOnly()
    {
        // This step is necessary in order to make your block render properly when it is an item (i.e. in the inventory
        //   or in your hand or thrown on the ground).
        // It must be done on client only, and must be done after the block has been created in Common.preinit().
        ModelResourceLocation itemBlockModelResourceLocation = new ModelResourceLocation("minecraftbyexample:my_chestplate", "inventory");
        final int DEFAULT_ITEM_SUBTYPE = 0;
        ModelLoader.setCustomModelResourceLocation(StartupCommon.myChestplate, DEFAULT_ITEM_SUBTYPE, itemBlockModelResourceLocation);

        ModelResourceLocation itemBlockModelResourceLocation2 = new ModelResourceLocation("minecraftbyexample:my_helmet", "inventory");
        ModelLoader.setCustomModelResourceLocation(StartupCommon.myHelmet, DEFAULT_ITEM_SUBTYPE, itemBlockModelResourceLocation2);

        ModelResourceLocation itemBlockModelResourceLocation3 = new ModelResourceLocation("minecraftbyexample:my_leggings", "inventory");
        ModelLoader.setCustomModelResourceLocation(StartupCommon.myLeggings, DEFAULT_ITEM_SUBTYPE, itemBlockModelResourceLocation3);

        ModelResourceLocation itemBlockModelResourceLocation4 = new ModelResourceLocation("minecraftbyexample:my_boots", "inventory");
        ModelLoader.setCustomModelResourceLocation(StartupCommon.myBoots, DEFAULT_ITEM_SUBTYPE, itemBlockModelResourceLocation4);

    }

    public static void initClientOnly()
    {
    }

    public static void postInitClientOnly()
    {
    }
}
