package minecraftbyexample.my_tool;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class StartupCommon {
    public static MyTool myTool;  // this holds the unique instance of your block

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
        //final Item.ToolMaterial TOOL_MATERIAL = Item.ToolMaterial.DIAMOND;
        // to define your own tool material:
        final Item.ToolMaterial TOOL_MATERIAL = EnumHelper.addToolMaterial("TOOL_MATERIAL", 3, 3000, 20.0f, 30.0f, 22);
        myTool = (MyTool)(new MyTool(TOOL_MATERIAL));
        myTool.setUnlocalizedName("my_tool_unlocalised_name");
        myTool.setRegistryName("my_tool_registry_name");
        ForgeRegistries.ITEMS.register(myTool);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }

}
