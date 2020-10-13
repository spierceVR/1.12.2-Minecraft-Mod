package minecraftbyexample.my_entity;

import minecraftbyexample.armor.StartupCommon;
import minecraftbyexample.my_entity.render.RenderMyEntity;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class StartupClientOnly {


    public static void preInitClientOnly() {
        RenderingRegistry.registerEntityRenderingHandler(MyEntity.class, RenderMyEntity.FACTORY);
    }
    public static void initClientOnly() {

    }
    public static void postInitClientOnly() {
    }
}
