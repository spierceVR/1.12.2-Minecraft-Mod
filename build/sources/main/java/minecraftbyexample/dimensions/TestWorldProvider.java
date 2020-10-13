package minecraftbyexample.dimensions;

import minecraftbyexample.BiomeInit;
import minecraftbyexample.ModDimensions;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class TestWorldProvider extends WorldProvider {

    public TestWorldProvider(){
        this.biomeProvider = new BiomeProviderSingle(BiomeInit.COPPER);
    }
    @Override
    public DimensionType getDimensionType() {
        return ModDimensions.testDimensionType;
    }

    @Override
    public String getSaveFolder() {
        return "TEST";
    }

    @Override
    public IChunkGenerator createChunkGenerator() {
        return new TestChunkGenerator(world);
    }
}
