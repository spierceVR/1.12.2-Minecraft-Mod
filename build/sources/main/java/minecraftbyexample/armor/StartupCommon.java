package minecraftbyexample.armor;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class StartupCommon {
    public static MyChestplate myChestplate;
    public static MyHelmet myHelmet;
    public static MyLeggings myLeggings;
    public static MyBoots myBoots;


    public static void preInitCommon()
    {
        int damageReduction[] = {3,3,3,3};
        final ItemArmor.ArmorMaterial ARMOR_MATERIAL = EnumHelper.addArmorMaterial("ARMOR_MATERIAL", "minecraftbyexample:my_armor", 2000, damageReduction, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
        myChestplate = (MyChestplate) (new MyChestplate(ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST));
        myChestplate.setUnlocalizedName("my_chestplate_unlocalised_name");
        myChestplate.setRegistryName("my_chestplate_registry_name");
        ForgeRegistries.ITEMS.register(myChestplate);

        myHelmet = (MyHelmet) (new MyHelmet(ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD));
        myHelmet.setUnlocalizedName("my_helmet_unlocalised_name");
        myHelmet.setRegistryName("my_helmet_registry_name");
        ForgeRegistries.ITEMS.register(myHelmet);

        myLeggings = (MyLeggings) (new MyLeggings(ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS));
        myLeggings.setUnlocalizedName("my_leggings_unlocalised_name");
        myLeggings.setRegistryName("my_leggings_registry_name");
        ForgeRegistries.ITEMS.register(myLeggings);

        myBoots = (MyBoots) (new MyBoots(ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET));
        myBoots.setUnlocalizedName("my_boots_unlocalised_name");
        myBoots.setRegistryName("my_boots_registry_name");
        ForgeRegistries.ITEMS.register(myBoots);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }
}