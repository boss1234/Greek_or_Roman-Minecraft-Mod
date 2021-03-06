package greek_or_roman.common;

import greek_or_roman.Greek_or_Roman;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenerator_Greek_or_Roman implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId)
		{
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateEnd(World world, Random random, int chunkX, int chunkZ)
	{
		
	}

	private void generateSurface(World world, Random random, int chunkX, int chunkZ)
	{
		for(int i = 0; i < 5; i++)
		{
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(12);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(Greek_or_Roman.Jupiterium.blockID, 4)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
		for(int i = 0; i < 12; i++)
		{
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(40);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(Greek_or_Roman.Celestial_Bronze.blockID, 8)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
		for(int i = 0; i < 9; i++)
		{
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(20);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(Greek_or_Roman.Imperial_Gold.blockID, 8)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

	private void generateNether(World world, Random random, int chunkX, int chunkZ)
	{
		for(int i = 0; i < 20; i++)
		{
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(256);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(Greek_or_Roman.Plutonium.blockID, 4)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}
}