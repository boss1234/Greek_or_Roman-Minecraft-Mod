package greek_or_roman.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class PerfectAmbrosia extends ItemFood
{

	public PerfectAmbrosia(int par1, int par2, float par3, boolean par4)
	{
		super(par1, par2, par3, par4);
	}
	
	public void func_94581_a(IconRegister iconReg)
	{
	         iconIndex = iconReg.func_94245_a("greek_or_roman:Ambrosia");
	
	}
}
