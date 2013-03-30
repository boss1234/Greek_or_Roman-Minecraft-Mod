package greek_or_roman.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class Celestial_Bronze extends Block
{

	public Celestial_Bronze(int id, Material iron)
	{
		super(id, iron);
		this.setCreativeTab(CreativeTabs.tabBlock);	
	}
	
    @Override
    public void registerIcons(IconRegister reg)
    {
    	this.blockIcon = reg.registerIcon("greek_or_roman:C_Bronze");
    }
	
	public int idDropped(int par1, Random rand, int par2)
	{
		return this.blockID;
	}
	
	public int quantityDropped(Random rand)
	{
		return rand.nextInt(2);
	}
	
}
