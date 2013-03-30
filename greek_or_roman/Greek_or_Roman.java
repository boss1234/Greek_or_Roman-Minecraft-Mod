package greek_or_roman;

import greek_or_roman.common.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "lionbryce_Greek_Or_Roman", name = "Greek_Or_Roman", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Greek_or_Roman 
	{
	@SidedProxy(clientSide = "Greek_or_Roman.ClientProxyGreek_or_Roman",
				serverSide = "Greek_or_Roman.common.commonProxyGreek_or_Roman")
	public static ClientProxy_Greek_or_Roman proxy = new ClientProxy_Greek_or_Roman();
	
	
	public static EnumToolMaterial ZI = EnumHelper.addToolMaterial("ZI", 3, 20000, 12.0F, 10, 10);
	public static EnumToolMaterial HI = EnumHelper.addToolMaterial("HI", 3, 25000, 9.0F, 9, 10);
	public static EnumToolMaterial CB = EnumHelper.addToolMaterial("CB", 3, 17500, 8.5F, 7, 10);
	public static EnumToolMaterial IG = EnumHelper.addToolMaterial("IG", 3, 17000, 10.5F, 9, 10);

	
	public static Block Celestial_Bronze;
	public static Block Imperial_Gold;
	public static Block Jupiterium;
	public static Block Plutonium;	
	public static Item ZeusIron;
	public static Item Ambrosia;
	public static Item PerfectAmbrosia;
	public static Item HadesIron;
	public static Item HadesIronSword;
	public static Item ZeusIronSword;
	public static Item HadesIronPickaxe;
	public static Item ZeusIronPickaxe;
	public static Item ZeusBolt;
	public static Item LightningBow;
	
    public static DamageSource causeZeusBoltDamage(ZeusBoltEntity entityArrow, Entity par1Entity)
    {
        return (new EntityDamageSourceIndirect("ZeusBolt", entityArrow, par1Entity)).setProjectile();
    }
	
    
	int JupiteriumID = 1000;
	int ZeusIronID = 1001;
	int PlutoniumID = 1002;
	int AmbrosiaID = 1003;
	int PerfectAmbrosiaID = 1004;
	int HadesIronID = 1005;
	int HadesIronSwordID = 1006;
	int ZeusIronSwordID = 1007;
	int HadesIronPickaxeID = 1008;
	int ZeusIronPickaxeID = 1009;
	int ZeusBoltID = 1010;
	int LightningBowID = 1011;
	int Celestial_BronzeID = 1012;
	int Imperial_GoldID = 1013;
	@Init
	public void load(FMLInitializationEvent event)
	{
		Jupiterium = new Jupiterium(JupiteriumID, Material.iron).setUnlocalizedName("Jupiterium").setHardness(2.5f).setLightValue(0.5f).setCreativeTab(CreativeTabs.tabBlock);
		ZeusIron = new ZeusIron(ZeusIronID).setUnlocalizedName("Zeus Iron").setCreativeTab(CreativeTabs.tabMaterials);
		Plutonium = new Plutonium(PlutoniumID, Material.iron).setUnlocalizedName("Plutonium").setHardness(2.5f).setCreativeTab(CreativeTabs.tabBlock);
		Ambrosia = new Ambrosia(AmbrosiaID, 10, 2.0f, true).setUnlocalizedName("Ambrosia").setCreativeTab(CreativeTabs.tabFood);
		PerfectAmbrosia = new PerfectAmbrosia(PerfectAmbrosiaID, 20, 2.0f, true).setUnlocalizedName("PerfectAmbrosia").setCreativeTab(CreativeTabs.tabFood);
		HadesIron = new HadesIron(HadesIronID).setUnlocalizedName("Hades Iron").setCreativeTab(CreativeTabs.tabMaterials);
		ZeusIronSword = new ZeusIronSword(ZeusIronSwordID, ZI).setUnlocalizedName("ZeusIronSword").setCreativeTab(CreativeTabs.tabCombat);
		HadesIronSword = new HadesIronSword(HadesIronSwordID, HI).setUnlocalizedName("HadesIronSword").setCreativeTab(CreativeTabs.tabCombat);
		HadesIronPickaxe = new HadesIronPickaxe(HadesIronPickaxeID, HI).setUnlocalizedName("HadesIronPickaxe").setCreativeTab(CreativeTabs.tabTools);
		ZeusIronPickaxe = new ZeusIronPickaxe(ZeusIronPickaxeID, ZI).setUnlocalizedName("ZeusIronPickaxe").setCreativeTab(CreativeTabs.tabTools);
		ZeusBolt = new Item(ZeusBoltID).setUnlocalizedName("ZeusBolt").setCreativeTab(CreativeTabs.tabCombat);
		LightningBow = new LightningBow(LightningBowID).setUnlocalizedName("LightningBow").setCreativeTab(CreativeTabs.tabCombat);
		Celestial_Bronze = new Celestial_Bronze(Celestial_BronzeID, Material.iron).setUnlocalizedName("C_Bronze");
		Imperial_Gold = new Imperial_Gold(Imperial_GoldID, Material.iron).setUnlocalizedName("I_Gold");

		gameRegisters();
		languageRegisters();
		CraftingRecipes();
		
		proxy.registerRenders();
		
		GameRegistry.registerWorldGenerator(new WorldGenerator_Greek_or_Roman());
		
		GameRegistry.addSmelting(JupiteriumID, new ItemStack(ZeusIron, 1), 2.5f);
		GameRegistry.addSmelting(PlutoniumID, new ItemStack (HadesIron, 1), 3.0f);
		
		RenderingRegistry.registerEntityRenderingHandler(ZeusBoltEntity.class, new ZeusBoltRender());
		
	}
	
	private static void CraftingRecipes()
	{
		
		GameRegistry.addRecipe(new ItemStack(Greek_or_Roman.Ambrosia), new Object[]
				{
					"BPB","BPC","BPB",
					'B', Item.beefCooked,
					'P', Item.porkCooked,
					'C', Item.carrot,
				});
		
		GameRegistry.addRecipe(new ItemStack(Greek_or_Roman.Ambrosia), new Object[]
				{
					"PBP","PBC","PBP",
					'B', Item.beefCooked,
					'P', Item.porkCooked,
					'C', Item.carrot,
				});
		
		GameRegistry.addRecipe(new ItemStack(Greek_or_Roman.PerfectAmbrosia), new Object[]
				{
					"ggg","gAg","ggg",
					'A', Ambrosia,
					'g', Item.goldNugget,
				});
		GameRegistry.addRecipe(new ItemStack(Greek_or_Roman.ZeusIronPickaxe), new Object[]
				{
					"ZZZ"," S "," S ",
					'S', Item.stick,
					'Z', ZeusIron,
				});
		GameRegistry.addRecipe(new ItemStack(Greek_or_Roman.HadesIronPickaxe), new Object[]
				{
					"HHH"," S "," S  ",
					'S', Item.stick,
					'H', HadesIron,
				});
		GameRegistry.addRecipe(new ItemStack(Greek_or_Roman.HadesIronSword), new Object[]
				{
					" H "," H "," S ",
					'S', Item.stick,
					'H', HadesIron,
				});
		GameRegistry.addRecipe(new ItemStack(Greek_or_Roman.ZeusIronSword), new Object[]
				{
					" Z "," Z "," S ",
					'S', Item.stick,
					'Z', ZeusIron,
				});	
		GameRegistry.addRecipe(new ItemStack(Greek_or_Roman.LightningBow), new Object[]
				{
					" ZS","Z s"," ZS",
					'S', Item.silk,
					'Z', ZeusIron,
				});
		GameRegistry.addRecipe(new ItemStack(Greek_or_Roman.ZeusBolt, 2), new Object[]
				{
					" Z "," A ","   ",
					'A', Item.arrow,
					'Z', ZeusIron,
				});
	}
		
	private static void gameRegisters()
	{
		GameRegistry.registerBlock(Imperial_Gold, "Imperial Gold");
		
		GameRegistry.registerBlock(Celestial_Bronze, "Celestial Bronze");
		
		GameRegistry.registerBlock(Jupiterium, "Jupiterium Ore");
		
		GameRegistry.registerBlock(Plutonium, "Plutonium Ore");
		
		GameRegistry.registerItem(ZeusIron, "Zeus Iron");
		
		GameRegistry.registerItem(Ambrosia, "Bad Ambrosia");
		
		GameRegistry.registerItem(PerfectAmbrosia, "PerfectAmbrosia");
		
		GameRegistry.registerItem(HadesIron, "Hades Iron");
		
		GameRegistry.registerItem(HadesIronPickaxe, "Hades Iron Pickaxe");
		
		GameRegistry.registerItem(ZeusIronPickaxe, "Zeus Iron Pickaxe");
		
		GameRegistry.registerItem(LightningBow, "Lightning Bow");
		
		GameRegistry.registerItem(ZeusBolt, "Zues Bolt");
	}
	
	private static void languageRegisters()
	{
		LanguageRegistry.addName(Imperial_Gold, "Imperial Gold");
		
		LanguageRegistry.addName(Celestial_Bronze, "Celestial Bronze");
		
		LanguageRegistry.addName(Jupiterium, "Jupiterium Ore");
		
		LanguageRegistry.addName(Plutonium, "Plutonium Ore");
		
		LanguageRegistry.addName(ZeusIron, "Zeus Iron");
		
		LanguageRegistry.addName(Ambrosia, "Bad Ambrosia");
		
		LanguageRegistry.addName(PerfectAmbrosia, "PerfectAmbrosia");
		
		LanguageRegistry.addName(HadesIron, "Hades Iron");
		
		LanguageRegistry.addName(HadesIronSword, "Hades Iron Sword");
		
		LanguageRegistry.addName(HadesIronPickaxe, "Hades iron Pickaxe");
		
		LanguageRegistry.addName(ZeusIronPickaxe, "Zeus Iron Pickaxe");
		
		LanguageRegistry.addName(ZeusBolt, "Zues Bolt");
		
		LanguageRegistry.addName(LightningBow, "Lightning Bow");
	}
}
