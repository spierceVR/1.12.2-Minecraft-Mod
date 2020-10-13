package minecraftbyexample.dimensions;

import minecraftbyexample.my_entity.MyEntity;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeCopper extends Biome {

    public BiomeCopper() {
        super(new BiomeProperties("Copper").setBaseHeight(1.2F).setWaterColor(3145710).setTemperature(0.6F).setHeightVariation(1.5F));

        fillerBlock = minecraftbyexample.block_my.StartupCommon.blockMy.getDefaultState();

        this.decorator.ironGen = new WorldGenMinable(minecraftbyexample.block_my.StartupCommon.blockMy.getDefaultState(), 10);
        this.decorator.treesPerChunk = 1;

        this.spawnableCaveCreatureList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCreatureList.add(new SpawnListEntry(MyEntity.class, 10, 3, 10));
    }
}
