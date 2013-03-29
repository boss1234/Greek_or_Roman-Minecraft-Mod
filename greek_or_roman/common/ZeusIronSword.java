package greek_or_roman.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ZeusIronSword extends ItemSword
{

	public ZeusIronSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}
	
	public void func_94581_a(IconRegister iconReg)
	{
	         iconIndex = iconReg.func_94245_a("greek_or_roman:ZeusIronSword");
	}
	
}
