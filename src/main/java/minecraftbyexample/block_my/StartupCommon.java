package minecraftbyexample.block_my;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class StartupCommon {
    public static BlockMy blockMy;  // this holds the unique instance of your block
    public static ItemBlock itemBlockMy;  // this holds the unique instance of the ItemBlock corresponding to your block

    public static void preInitCommon()
    {
        // each instance of your block should have two names:
        // 1) a registry name that is used to uniquely identify this block.  Should be unique within your mod.  use lower case.
        // 2) an 'unlocalised name' that is used to retrieve the text name of your block in the player's language.  For example-
        //    the unlocalised name might be "water", which is printed on the user's screen as "Wasser" in German or
        //    "aqua" in Italian.
        //
        //    Multiple blocks can have the same unlocalised name - for example
        //  +----RegistryName----+---UnlocalisedName----+
        //  |  flowing_water     +       water          |
        //  |  stationary_water  +       water          |
        //  +--------------------+----------------------+
        //
        blockMy = (BlockMy)(new BlockMy().setUnlocalizedName("block_my_unlocalised_name"));
        blockMy.setRegistryName("block_my_registry_name");
        ForgeRegistries.BLOCKS.register(blockMy);

        // We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
        itemBlockMy = new ItemBlock(blockMy);
        itemBlockMy.setRegistryName(blockMy.getRegistryName());
        ForgeRegistries.ITEMS.register(itemBlockMy);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }

}
