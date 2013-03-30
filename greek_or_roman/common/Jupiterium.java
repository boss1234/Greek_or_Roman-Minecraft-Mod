package greek_or_roman.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class Jupiterium extends Block
{

	public Jupiterium(int id, Material mat)
	{
		super(id, mat);
		this.setCreativeTab(CreativeTabs.tabBlock);	
	}
	
    @Override
    public void registerIcons(IconRegister reg)
    {
    	this.blockIcon = reg.registerIcon("greek_or_roman:Jupiterium");
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
