package com.iceminecrafter.IME;


import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.iceminecrafter.IME.Entity.EntityMFCCharger;
import com.iceminecrafter.IME.Entity.EntityMFCChub;
import com.iceminecrafter.IME.Entity.EntityMFCDSpitter;
import com.iceminecrafter.IME.Entity.EntityMFCDukeofFlies;
import com.iceminecrafter.IME.Entity.EntityMFCFly;
import com.iceminecrafter.IME.Entity.EntityMFCGurgling;
import com.iceminecrafter.IME.Entity.EntityMFCLargeFly;
import com.iceminecrafter.IME.Entity.EntityMFCMaggot;
import com.iceminecrafter.IME.Entity.EntityMFCSpitter;
import com.iceminecrafter.IME.Entity.EntityMechon_M69;
import com.iceminecrafter.IME.Mob.EntityMFC;
import com.iceminecrafter.IME.Mob.RenderMFCCharger;
import com.iceminecrafter.IME.Mob.RenderMFCChub;
import com.iceminecrafter.IME.Mob.RenderMFCDSpitter;
import com.iceminecrafter.IME.Mob.RenderMFCDukeofFlies;
import com.iceminecrafter.IME.Mob.RenderMFCFly;
import com.iceminecrafter.IME.Mob.RenderMFCGurgling;
import com.iceminecrafter.IME.Mob.RenderMFCLargeFly;
import com.iceminecrafter.IME.Mob.RenderMFCMaggot;
import com.iceminecrafter.IME.Mob.RenderMFCSpitter;
import com.iceminecrafter.IME.Mob.RenderMechon_M69;
import com.iceminecrafter.IME.Models.Charger;
import com.iceminecrafter.IME.Models.Chub;
import com.iceminecrafter.IME.Models.DSpitter;
import com.iceminecrafter.IME.Models.Duke_Of_Flies;
import com.iceminecrafter.IME.Models.Fly;
import com.iceminecrafter.IME.Models.Gurgling;
import com.iceminecrafter.IME.Models.Large_Fly;
import com.iceminecrafter.IME.Models.Maggot;
import com.iceminecrafter.IME.Models.Mechon_M69;
import com.iceminecrafter.IME.Models.Spitter;
import com.iceminecrafter.IME.armor.MFCAluminiumArmor;
import com.iceminecrafter.IME.armor.MFCBismuthArmor;
import com.iceminecrafter.IME.armor.MFCCalciumArmor;
import com.iceminecrafter.IME.armor.MFCCobaltArmor;
import com.iceminecrafter.IME.armor.MFCCopperArmor;
import com.iceminecrafter.IME.armor.MFCLeadArmor;
import com.iceminecrafter.IME.armor.MFCMagnesiumArmor;
import com.iceminecrafter.IME.armor.MFCNickelArmor;
import com.iceminecrafter.IME.armor.MFCOsmiumArmor;
import com.iceminecrafter.IME.armor.MFCPlatinumArmor;
import com.iceminecrafter.IME.armor.MFCSilverArmor;
import com.iceminecrafter.IME.armor.MFCTinArmor;
import com.iceminecrafter.IME.armor.MFCTungstenArmor;
import com.iceminecrafter.IME.armor.MFCZincArmor;
import com.iceminecrafter.IME.blocks.MFCBlockCrudeOil;
import com.iceminecrafter.IME.blocks.MFCCrudeOil;
import com.iceminecrafter.IME.blocks.MFCOreAluminium;
import com.iceminecrafter.IME.blocks.MFCOreBismuth;
import com.iceminecrafter.IME.blocks.MFCOreCalcium;
import com.iceminecrafter.IME.blocks.MFCOreChromium;
import com.iceminecrafter.IME.blocks.MFCOreCinnabar;
import com.iceminecrafter.IME.blocks.MFCOreCobalt;
import com.iceminecrafter.IME.blocks.MFCOreCopper;
import com.iceminecrafter.IME.blocks.MFCOreLead;
import com.iceminecrafter.IME.blocks.MFCOreMagnesium;
import com.iceminecrafter.IME.blocks.MFCOreNickel;
import com.iceminecrafter.IME.blocks.MFCOreOsmium;
import com.iceminecrafter.IME.blocks.MFCOrePlatinum;
import com.iceminecrafter.IME.blocks.MFCOreSilver;
import com.iceminecrafter.IME.blocks.MFCOreTin;
import com.iceminecrafter.IME.blocks.MFCOreTungsten;
import com.iceminecrafter.IME.blocks.MFCOreZinc;
import com.iceminecrafter.IME.blocks.MFCShaleOil;
import com.iceminecrafter.IME.blocks.MFCSmelter;
import com.iceminecrafter.IME.blocks.MFCSolidCrudeOil;
import com.iceminecrafter.IME.event.MFCFillBucketEvent;
import com.iceminecrafter.IME.gen.MFCGeneration;
import com.iceminecrafter.IME.handler.MFCGuiHandler;
import com.iceminecrafter.IME.items.MFCOilBucket;
import com.iceminecrafter.IME.items.MFCShaleOilBucket;
import com.iceminecrafter.IME.items.herbs.MFCAloe;
import com.iceminecrafter.IME.items.herbs.MFCArnica;
import com.iceminecrafter.IME.items.herbs.MFCGinger;
import com.iceminecrafter.IME.items.herbs.MFCHerbaltea;
import com.iceminecrafter.IME.items.herbs.MFCPepermint;
import com.iceminecrafter.IME.items.herbs.MFCPepermintoil;
import com.iceminecrafter.IME.items.herbs.MFCPeperminttea;
import com.iceminecrafter.IME.items.herbs.MFCTeatreeoil;
import com.iceminecrafter.IME.proxy.ClientProxy;
import com.iceminecrafter.IME.proxy.CommonProxy;
import com.iceminecrafter.IME.tileentity.TileEntityMFCSmelter;
import com.iceminecrafter.IME.tools.MFCAluminiumAxe;
import com.iceminecrafter.IME.tools.MFCAluminiumHoe;
import com.iceminecrafter.IME.tools.MFCAluminiumPickaxe;
import com.iceminecrafter.IME.tools.MFCAluminiumShovel;
import com.iceminecrafter.IME.tools.MFCAluminiumSword;
import com.iceminecrafter.IME.tools.MFCBismuthAxe;
import com.iceminecrafter.IME.tools.MFCBismuthHoe;
import com.iceminecrafter.IME.tools.MFCBismuthPickaxe;
import com.iceminecrafter.IME.tools.MFCBismuthShovel;
import com.iceminecrafter.IME.tools.MFCBismuthSword;
import com.iceminecrafter.IME.tools.MFCCalciumAxe;
import com.iceminecrafter.IME.tools.MFCCalciumHoe;
import com.iceminecrafter.IME.tools.MFCCalciumPickaxe;
import com.iceminecrafter.IME.tools.MFCCalciumShovel;
import com.iceminecrafter.IME.tools.MFCCalciumSword;
import com.iceminecrafter.IME.tools.MFCCobaltAxe;
import com.iceminecrafter.IME.tools.MFCCobaltHoe;
import com.iceminecrafter.IME.tools.MFCCobaltPickaxe;
import com.iceminecrafter.IME.tools.MFCCobaltShovel;
import com.iceminecrafter.IME.tools.MFCCobaltSword;
import com.iceminecrafter.IME.tools.MFCCopperAxe;
import com.iceminecrafter.IME.tools.MFCCopperHoe;
import com.iceminecrafter.IME.tools.MFCCopperPickaxe;
import com.iceminecrafter.IME.tools.MFCCopperShovel;
import com.iceminecrafter.IME.tools.MFCCopperSword;
import com.iceminecrafter.IME.tools.MFCLeadAxe;
import com.iceminecrafter.IME.tools.MFCLeadHoe;
import com.iceminecrafter.IME.tools.MFCLeadPickaxe;
import com.iceminecrafter.IME.tools.MFCLeadShovel;
import com.iceminecrafter.IME.tools.MFCLeadSword;
import com.iceminecrafter.IME.tools.MFCMagnesiumAxe;
import com.iceminecrafter.IME.tools.MFCMagnesiumHoe;
import com.iceminecrafter.IME.tools.MFCMagnesiumPickaxe;
import com.iceminecrafter.IME.tools.MFCMagnesiumShovel;
import com.iceminecrafter.IME.tools.MFCMagnesiumSword;
import com.iceminecrafter.IME.tools.MFCNickelAxe;
import com.iceminecrafter.IME.tools.MFCNickelHoe;
import com.iceminecrafter.IME.tools.MFCNickelPickaxe;
import com.iceminecrafter.IME.tools.MFCNickelShovel;
import com.iceminecrafter.IME.tools.MFCNickelSword;
import com.iceminecrafter.IME.tools.MFCOsmiumAxe;
import com.iceminecrafter.IME.tools.MFCOsmiumHoe;
import com.iceminecrafter.IME.tools.MFCOsmiumPickaxe;
import com.iceminecrafter.IME.tools.MFCOsmiumShovel;
import com.iceminecrafter.IME.tools.MFCOsmiumSword;
import com.iceminecrafter.IME.tools.MFCPlatinumAxe;
import com.iceminecrafter.IME.tools.MFCPlatinumHoe;
import com.iceminecrafter.IME.tools.MFCPlatinumPickaxe;
import com.iceminecrafter.IME.tools.MFCPlatinumShovel;
import com.iceminecrafter.IME.tools.MFCPlatinumSword;
import com.iceminecrafter.IME.tools.MFCSilverAxe;
import com.iceminecrafter.IME.tools.MFCSilverHoe;
import com.iceminecrafter.IME.tools.MFCSilverPickaxe;
import com.iceminecrafter.IME.tools.MFCSilverShovel;
import com.iceminecrafter.IME.tools.MFCSilverSword;
import com.iceminecrafter.IME.tools.MFCTinAxe;
import com.iceminecrafter.IME.tools.MFCTinHoe;
import com.iceminecrafter.IME.tools.MFCTinPickaxe;
import com.iceminecrafter.IME.tools.MFCTinShovel;
import com.iceminecrafter.IME.tools.MFCTinSword;
import com.iceminecrafter.IME.tools.MFCTungstenAxe;
import com.iceminecrafter.IME.tools.MFCTungstenHoe;
import com.iceminecrafter.IME.tools.MFCTungstenPickaxe;
import com.iceminecrafter.IME.tools.MFCTungstenShovel;
import com.iceminecrafter.IME.tools.MFCTungstenSword;
import com.iceminecrafter.IME.tools.MFCZincAxe;
import com.iceminecrafter.IME.tools.MFCZincHoe;
import com.iceminecrafter.IME.tools.MFCZincPickaxe;
import com.iceminecrafter.IME.tools.MFCZincShovel;
import com.iceminecrafter.IME.tools.MFCZincSword;




















import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = IcesMinecraftExpansion.modid, name = IcesMinecraftExpansion.name, version = IcesMinecraftExpansion.version)

public class IcesMinecraftExpansion{
	
	public static CommonProxy serverproxy;
	public static ClientProxy clientproxy;
	@Instance(IcesMinecraftExpansion.modid)
	public static IcesMinecraftExpansion modInstance;
	

	
	
	@SidedProxy(clientSide="com.iceminecrafter.IME.proxy.ClientProxy", serverSide="com.iceminecrafter.IME.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	
	public static final String modid = "IME";
	public static final String name = "Ice's Minecraft Expansion";
	public static final String version = "1.7.10-03.15-1.0a";
	
	
	
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		

		proxy.preinit(e);
		proxy.registerNetworkStuff();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e){
		System.out.println("[IME]: How many times do i make science jokes, periodically");
		proxy.init(e);
		proxy.registerTileEntities();
		proxy.registerRenderThings();

	
		
		

		
	}
	
	public void postinit(FMLPostInitializationEvent e){
		proxy.postinit(e);
	}
}


