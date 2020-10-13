package minecraftbyexample.my_tool;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class MyTool extends ItemSword {
    public MyTool(ToolMaterial material){
        super(material);
        this.setCreativeTab(CreativeTabs.TOOLS);
    }
}
