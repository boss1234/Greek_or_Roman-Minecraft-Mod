package greek_or_roman.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class Ambrosia extends ItemFood
{

	public Ambrosia(int par1, int par2, float par3, boolean par4)
	{
		super(par1, par2, par3, par4);
	}
	
    @Override
    public void updateIcons(IconRegister iconRegister)
    {
             iconIndex = iconRegister.registerIcon("Greek_or_Roman:BadAmbrosia");
    }
}
