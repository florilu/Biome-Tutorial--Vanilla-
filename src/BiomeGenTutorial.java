package net.minecraft.src;

import java.util.Random;

public class BiomeGenTutorial extends BiomeGenBase
{
    public BiomeGenTutorial(int par1)
    {
        super(par1);
        this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 5, 4, 4)); //This string spawns Wolfes
        this.theBiomeDecorator.treesPerChunk = 10; //This string sets, how many trees can be generated in one chunk
        this.theBiomeDecorator.grassPerChunk = 2; //This string sets, how many grass (high grass) can be in one chunk.
        this.topBlock = (byte)Block.blockDiamond.blockID;//This string sets the topblock, here is it a Block made of diamond
        this.fillerBlock = (byte)Block.blockDiamond.blockID;
    }

    /**
     * Gets a WorldGen appropriate for this biome.
     */
    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return (WorldGenerator)(par1Random.nextInt(5) == 0 ? this.worldGeneratorForest : (par1Random.nextInt(10) == 0 ? this.worldGeneratorBigTree : this.worldGeneratorTrees)); //this string sets which tree generator the biome uses for trees.
    }
}
