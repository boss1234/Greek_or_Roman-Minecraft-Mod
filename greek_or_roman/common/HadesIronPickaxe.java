package greek_or_roman.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class HadesIronPickaxe extends ItemPickaxe{

	public HadesIronPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}
	
	public void func_94581_a(IconRegister iconReg)
	{
	         iconIndex = iconReg.func_94245_a("greek_or_roman:HadeIronPickaxe");
	}
	
}
