package minecraftbyexample.my_entity;

import minecraftbyexample.MinecraftByExample;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;


public class StartupCommon {
    public static MyEntity myEntity;

    public static void preInitCommon()
    {
        EntityRegistry.registerModEntity(new ResourceLocation(MinecraftByExample.MODID + ":" + "poggers_zombie.json"), MyEntity.class, "poggers_zombie", 11, MinecraftByExample.instance,
                20, 1, true, 4119711, 16722493);

        EntityRegistry.addSpawn(MyEntity.class, 100, 3, 5, EnumCreatureType.MONSTER, Biomes.PLAINS, Biomes.ICE_PLAINS);

      //  LootTableList.register(EntityWeirdZombie.LOOT);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }
}
