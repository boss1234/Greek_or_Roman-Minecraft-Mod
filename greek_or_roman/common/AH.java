package greek_or_roman.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class AH extends ItemFood
{

    public AH(int par1, int par2, float par3, boolean par4)
    {
        super(par1, par2, par3, par4);
        this.setPotionEffect(Potion.regeneration.id, 60000000, 10, 1.0f);
        this.setPotionEffect(Potion.resistance.id, 60000000, 10, 1.0f);
        this.setPotionEffect(Potion.fireResistance.id, 60000000, 10, 1.0f);
        this.setPotionEffect(Potion.nightVision.id, 60000000, 1, 1.0f);
        this.setPotionEffect(Potion.waterBreathing.id, 60000000, 1, 1.0f);
    }
    
    @Override
    public void updateIcons(IconRegister iconRegister)
    {
             iconIndex = iconRegister.registerIcon("Greek_or_Roman:AppleOfImmortallity");
    }
}
