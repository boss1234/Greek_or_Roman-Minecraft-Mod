package greek_or_roman.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class PerfectAmbrosia extends ItemFood
{

	public PerfectAmbrosia(int par1, int par2, float par3, boolean par4)
	{
		super(par1, par2, par3, par4);
        this.setAlwaysEdible();
        this.setPotionEffect(Potion.regeneration.id, 600, 3, 1.0f);
        this.setPotionEffect(Potion.poison.id, 600, 2, 0.1f);
	}
	
    @Override
    public void updateIcons(IconRegister iconRegister)
    {
             iconIndex = iconRegister.registerIcon("Greek_or_Roman:Ambrosia");
    }
}
