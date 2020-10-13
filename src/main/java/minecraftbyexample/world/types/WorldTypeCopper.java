package minecraftbyexample.world.types;

import minecraftbyexample.BiomeInit;
import minecraftbyexample.dimensions.TestChunkGenerator;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class WorldTypeCopper extends WorldType {

    public WorldTypeCopper() {
        super("Copper");
    }

    @Override
    public BiomeProvider getBiomeProvider(World world){
        return new BiomeProviderSingle(BiomeInit.COPPER);
    }

    @Override
    public IChunkGenerator getChunkGenerator(World world, String generatorOptions)
    {
        return new TestChunkGenerator(world);
    }
}
