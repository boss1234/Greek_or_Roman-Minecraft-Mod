package greek_or_roman;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ZeusIron extends Item
{
	public ZeusIron(int par1)
	{
		super(par1);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public void func_94581_a(IconRegister iconReg)
	{
	         iconIndex = iconReg.func_94245_a("greek_or_roman:ZeusIron");
	}
	
}
