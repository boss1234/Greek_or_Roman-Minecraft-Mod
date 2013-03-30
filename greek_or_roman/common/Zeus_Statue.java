package greek_or_roman.common;

import java.util.Map;

import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.src.*;

public class Zeus_Statue extends BaseMod
{

	public String getVersion()
	{
		return "Zeus Statue Mob";
	}

	public void load()
	{
		ModLoader.addEntityTracker(this, Zeus_StatueEntity.class, 137, 56, 78, true);
		ModLoader.registerEntityID(Zeus_StatueEntity.class, "Zeus_Statue", 137);
	}
    public void addRenderer(Map map)
    {
    	map.put(Zeus_StatueEntity.class, new RenderBiped(new Zeus_StatueModel(), 0.5F));
    }
}
