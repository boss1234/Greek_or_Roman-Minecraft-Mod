package greek_or_roman.common;

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
	
    @Override
    public void updateIcons(IconRegister iconRegister)
    {
             iconIndex = iconRegister.registerIcon("Greek_or_Roman:ZeusIron");
    }
	
}
