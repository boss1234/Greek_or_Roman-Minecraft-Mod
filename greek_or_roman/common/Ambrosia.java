package greek_or_roman.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class Ambrosia extends ItemFood
{

	public Ambrosia(int par1, int par2, float par3, boolean par4)
	{
		super(par1, par2, par3, par4);
        this.setPotionEffect(Potion.regeneration.id, 120, 2, 0.50f);
        this.setPotionEffect(Potion.poison.id, 120, 1, 1.0f);
        this.setPotionEffect(Potion.regeneration.id, 120, 1, 1.0f);
        this.setPotionEffect(Potion.poison.id, 120, 2, 0.25f);
	}
	
    @Override
    public void updateIcons(IconRegister iconRegister)
    {
             iconIndex = iconRegister.registerIcon("Greek_or_Roman:BadAmbrosia");
    }
}
