package minecraftbyexample;

import minecraftbyexample.dimensions.BiomeCopper;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit {
    public static final Biome COPPER = new BiomeCopper();

    public static void registerBiomes(){
        initBiomes(COPPER, "copper", BiomeManager.BiomeType.WARM, BiomeDictionary.Type.HILLS, BiomeDictionary.Type.DRY, BiomeDictionary.Type.MOUNTAIN);
    }

    private static Biome initBiomes(Biome biome, String name, BiomeManager.BiomeType biomeType, BiomeDictionary.Type... types){
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        System.out.println("Biome Registered");
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addBiome(biomeType, new BiomeManager.BiomeEntry(biome, 10));
        BiomeManager.addSpawnBiome(biome);
        System.out.println("Biomed added");
        return biome;
    }
}
