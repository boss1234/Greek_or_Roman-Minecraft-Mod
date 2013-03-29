package greek_or_roman;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class Jupiterium extends Block
{

	public Jupiterium(int id, Material iron)
	{
		super(id, iron);
		this.setCreativeTab(CreativeTabs.tabBlock);	
	}
	
	@Override
	public void func_94332_a(IconRegister iconReg)
	{
		this.field_94336_cN = iconReg.func_94245_a("greek_or_roman:jupiterium");
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
