package com.iceminecrafter.IME.proxy;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.Entity.EntityMechon_M69;
import com.iceminecrafter.IME.Mob.EntityMFC;
import com.iceminecrafter.IME.Mob.RenderMechon_M69;
import com.iceminecrafter.IME.Models.Mechon_M69;
import com.iceminecrafter.IME.handler.MFCGuiHandler;
import com.iceminecrafter.IME.tileentity.TileEntityMFCSmelter;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void registerRenderThings(){
			
	}
	public void registerNetworkStuff(){
		NetworkRegistry.INSTANCE.registerGuiHandler(IcesMinecraftExpansion.modInstance, new com.iceminecrafter.IME.handler.MFCGuiHandler());

	}
	
	public void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityMFCSmelter.class, IcesMinecraftExpansion.modid);
	}
	public void preinit(FMLPreInitializationEvent e){

		EntityMFC.EntityRegistry();
		GameRegistry.registerBlock(IcesMinecraftExpansion.MFCCrudeOil, "MFCCrudeOil");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCOilBucket, "MFCOilBucket");
		GameRegistry.registerBlock(IcesMinecraftExpansion.MFCSolidCrudeOil, "MFCSolidCrudeOil");
		GameRegistry.registerBlock(IcesMinecraftExpansion.MFCOilShale, "MFCOilShale");
		GameRegistry.registerBlock(IcesMinecraftExpansion.MFCShaleOil, "MFCShaleOil");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCShaleOilBucket, "MFCShaleOilBucket");
		GameRegistry.registerBlock(IcesMinecraftExpansion.MFCSmelter, "MFCSmelter");
		GameRegistry.registerBlock(IcesMinecraftExpansion.MFCSmelteractive, "MFCSmelterActive");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCArnica, "MFCArnica");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCGinger, "MFCGinger");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCPepermint, "MFCPepermint");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCPeperminttea, "MFCPeperminttea");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCPepermintoil, "MFCPepermintoil");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTeatreeoil, "MFCTeatreeoil");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCHerbaltea, "MFCHerbaltea");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingotbrass, "mfcingotbrass");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingotbrasscast, "mfcingotbrasscast");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingotchromium, "mfcingotchromium");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingotaluminium, "mfcingotaluminium");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingotbismuth, "mfcingotbismuth");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingotcalcium, "mfcingotcalcium");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingotcobalt, "mfcingotcobalt");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingotcopper, "mfcingotcopper");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingotlead, "mfcingotlead");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingotmagnesium, "mfcingotmagnesium");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingotnickel, "mfcingotnickel");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingotplatinum, "mfcingotplatinum");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingotosmium, "mfcingotosmium");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingotsilver, "mfcingotsilver");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingottin, "mfcingottin");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingottungsten, "mfcingottungsten");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcingotzinc, "mfcingotzinc");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfccrystalcinnabar, "mfccrystalcinnabar");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcalloycast, "mfcalloycast");
		GameRegistry.registerItem(IcesMinecraftExpansion.mfcrawalloycast, "mfcrawalloycast");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCAluminiumAxe, "MFCAluminiumAxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCAluminiumSword, "MFCAluminiumSword");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCAluminiumShovel, "MFCAluminiumShovel");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCAluminiumPickaxe, "MFCAluminiumPickaxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCAluminiumHoe, "MFCAluminiumHoe");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCBismuthAxe, "MFCBismuthAxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCBismuthSword, "MFCBismuthSword");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCBismuthShovel, "MFCBismuthShovel");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCBismuthPickaxe, "MFCBismuthPickaxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCBismuthHoe, "MFCBismuthHoe");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCalciumAxe, "MFCCalciumAxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCalciumSword, "MFCCalciumSword");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCalciumShovel, "MFCCalciumShovel");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCalciumPickaxe, "MFCCalciumPickaxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCalciumHoe, "MFCCalciumHoe");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCobaltAxe, "MFCCobaltAxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCobaltSword, "MFCCobaltSword");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCobaltShovel, "MFCCobaltShovel");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCobaltPickaxe, "MFCCobaltPickaxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCobaltHoe, "MFCCobaltHoe");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCopperAxe, "MFCCopperAxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCopperSword, "MFCCopperSword");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCopperShovel, "MFCCopperShovel");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCopperPickaxe, "MFCCopperPickaxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCopperHoe, "MFCCopperHoe");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCLeadAxe, "MFCLeadAxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCLeadSword, "MFCLeadSword");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCLeadShovel, "MFCLeadShovel");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCLeadPickaxe, "MFCLeadPickaxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCLeadHoe, "MFCLeadHoe");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCMagnesiumAxe, "MFCMagnesiumAxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCMagnesiumSword, "MFCMagnesiumSword");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCMagnesiumShovel, "MFCMagnesiumShovel");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCMagnesiumPickaxe, "MFCMagnesiumPickaxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCMagnesiumHoe, "MFCMagnesiumHoe");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCNickelAxe, "MFCNickelAxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCNickelSword, "MFCNickelSword");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCNickelShovel, "MFCNickelShovel");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCNickelPickaxe, "MFCNickelPickaxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCNickelHoe, "MFCNickelHoe");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCOsmiumAxe, "MFCOsmiumAxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCOsmiumSword, "MFCOsmiumSword");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCOsmiumShovel, "MFCOsmiumShovel");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCOsmiumPickaxe, "MFCOsmiumPickaxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCOsmiumHoe, "MFCOsmiumHoe");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCPlatinumAxe, "MFCPlatinumAxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCPlatinumSword, "MFCPlatinumSword");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCPlatinumShovel, "MFCPlatinumShovel");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCPlatinumPickaxe, "MFCPlatinumPickaxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCPlatinumHoe, "MFCPlatinumHoe");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCSilverAxe, "MFCSilverAxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCSilverSword, "MFCSilverSword");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCSilverShovel, "MFCSilverShovel");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCSilverPickaxe, "MFCSilverPickaxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCSilverHoe, "MFCSilverHoe");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTinAxe, "MFCTinAxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTinSword, "MFCTinSword");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTinShovel, "MFCTinShovel");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTinPickaxe, "MFCTinPickaxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTinHoe, "MFCTinHoe");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTungstenAxe, "MFCTungstenAxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTungstenSword, "MFCTungstenSword");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTungstenShovel, "MFCTungstenShovel");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTungstenPickaxe, "MFCTungstenPickaxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTungstenHoe, "MFCTungstenHoe");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCZincAxe, "MFCZincAxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCZincSword, "MFCZincSword");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCZincShovel, "MFCZincShovel");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCZincPickaxe, "MFCZincPickaxe");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCZincHoe, "MFCZincHoe");
		
		//Armour registry
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCAluminiumHelmet, "MFCAluminiumHelmet");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCAluminiumLeggings, "MFCAluminiumLeggings");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCAluminiumChestplate, "MFCAluminiumChestplate");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCAluminiumBoots, "MFCAluminiumBoots");

		GameRegistry.registerItem(IcesMinecraftExpansion.MFCBismuthHelmet, "MFCBismuthHelmet");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCBismuthLeggings, "MFCBismuthLeggings");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCBismuthChestplate, "MFCBismuthChestplate");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCBismuthBoots, "MFCBismuthBoots");

		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCalciumHelmet, "MFCCalciumHelmet");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCalciumLeggings, "MFCCalciumLeggings");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCalciumChestplate, "MFCCalciumChestplate");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCalciumBoots, "MFCCalciumBoots");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCobaltHelmet, "MFCCobaltHelmet");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCobaltLeggings, "MFCCobaltLeggings");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCobaltChestplate, "MFCCobaltChestplate");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCobaltBoots, "MFCCobaltBoots");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCopperHelmet, "MFCCopperHelmet");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCopperLeggings, "MFCCopperLeggings");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCopperChestplate, "MFCCopperChestplate");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCCopperBoots, "MFCCopperBoots");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCLeadHelmet, "MFCLeadHelmet");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCLeadLeggings, "MFCLeadLeggings");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCLeadChestplate, "MFCLeadChestplate");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCLeadBoots, "MFCLeadBoots");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCMagnesiumHelmet, "MFCMagnesiumHelmet");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCMagnesiumLeggings, "MFCMagnesiumLeggings");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCMagnesiumChestplate, "MFCMagnesiumChestplate");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCMagnesiumBoots, "MFCMagnesiumBoots");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCNickelHelmet, "MFCNickelHelmet");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCNickelLeggings, "MFCNickelLeggings");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCNickelChestplate, "MFCNickelChestplate");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCNickelBoots, "MFCNickelBoots");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCOsmiumHelmet, "MFCOsmiumHelmet");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCOsmiumLeggings, "MFCOsmiumLeggings");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCOsmiumChestplate, "MFCOsmiumChestplate");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCOsmiumBoots, "MFCOsmiumBoots");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCPlatinumHelmet, "MFCPlatinumHelmet");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCPlatinumLeggings, "MFCPlatinumLeggings");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCPlatinumChestplate, "MFCPlatinumChestplate");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCPlatinumBoots, "MFCPlatinumBoots");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCSilverHelmet, "MFCSilverHelmet");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCSilverLeggings, "MFCSilverLeggings");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCSilverChestplate, "MFCSilverChestplate");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCSilverBoots, "MFCSilverBoots");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTinHelmet, "MFCTinHelmet");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTinLeggings, "MFCTinLeggings");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTinChestplate, "MFCTinChestplate");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTinBoots, "MFCTinBoots");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTungstenHelmet, "MFCTungstenHelmet");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTungstenLeggings, "MFCTungstenLeggings");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTungstenChestplate, "MFCTungstenChestplate");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCTungstenBoots, "MFCTungstenBoots");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCZincHelmet, "MFCZincHelmet");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCZincLeggings, "MFCZincLeggings");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCZincChestplate, "MFCZincChestplate");
		GameRegistry.registerItem(IcesMinecraftExpansion.MFCZincBoots, "MFCZincBoots");
		
		
		GameRegistry.registerBlock(IcesMinecraftExpansion.mfcorealuminium, "mfcorealuminium");
		GameRegistry.registerBlock(IcesMinecraftExpansion.mfcorebismuth, "mfcorebismuth");
		GameRegistry.registerBlock(IcesMinecraftExpansion.mfcorecalcium, "mfcorecalcium");
		GameRegistry.registerBlock(IcesMinecraftExpansion.mfcorecobalt, "mfcorecobalt");
		GameRegistry.registerBlock(IcesMinecraftExpansion.mfcorecopper, "mfcorecopper");
		GameRegistry.registerBlock(IcesMinecraftExpansion.mfcorelead, "mfcorelead");
		GameRegistry.registerBlock(IcesMinecraftExpansion.mfcoremagnesium, "mfcoremagnesium");
		GameRegistry.registerBlock(IcesMinecraftExpansion.mfcorenickel, "mfcorenickel");
		GameRegistry.registerBlock(IcesMinecraftExpansion.mfcoreosmium, "mfcoreosmium");
		GameRegistry.registerBlock(IcesMinecraftExpansion.mfcoreplatinum, "mfcoreplatinum");
		GameRegistry.registerBlock(IcesMinecraftExpansion.mfcoresilver, "mfcoresilver");
		GameRegistry.registerBlock(IcesMinecraftExpansion.mfcoretin, "mfcoretin");
		GameRegistry.registerBlock(IcesMinecraftExpansion.mfcoretungsten, "mfcoretungsten");
		GameRegistry.registerBlock(IcesMinecraftExpansion.mfcorezinc, "mfcorezinc");
		GameRegistry.registerBlock(IcesMinecraftExpansion.mfcorecinnabar, "mfcorecinnabar");
		GameRegistry.registerBlock(IcesMinecraftExpansion.mfcorechromium, "mfcorechromium");
		
		
		FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(IcesMinecraftExpansion.CrudeOil.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(IcesMinecraftExpansion.MFCOilBucket), new ItemStack(Items.bucket)));
		FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(IcesMinecraftExpansion.ShaleOil.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(IcesMinecraftExpansion.MFCShaleOilBucket), new ItemStack(Items.bucket)));
		
		
		
		GameRegistry.registerItem(IcesMinecraftExpansion.OilyClay, "OilyClay");
		GameRegistry.registerItem(IcesMinecraftExpansion.OilySand, "OilySand");
		
		//Hearthstone Card Pack
		GameRegistry.registerItem(IcesMinecraftExpansion.HSNormalCardPack, "HSNormalCardPack");
		GameRegistry.registerItem(IcesMinecraftExpansion.HSGvGCardPack, "HSGvSGCardPack");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.HSNormalCardCommon, "HSNormalCardCommon");
		GameRegistry.registerItem(IcesMinecraftExpansion.HSNormalCardRare, "HSNormalCardRare");
		GameRegistry.registerItem(IcesMinecraftExpansion.HSNormalCardEpic, "HSNormalCardEpic");
		GameRegistry.registerItem(IcesMinecraftExpansion.HSNormalCardLegendary, "HSNormalCardLegendary");
		
		GameRegistry.registerItem(IcesMinecraftExpansion.HSGvGCardCommon, "HSGvGCardCommon");
		GameRegistry.registerItem(IcesMinecraftExpansion.HSGvGCardRare, "HSGvGCardRare");
		GameRegistry.registerItem(IcesMinecraftExpansion.HSGvGCardEpic, "HSGvGCardEpic");
		GameRegistry.registerItem(IcesMinecraftExpansion.HSGvGCardLegendary, "HSGvGCardLegendary");
		
		
		//Hearthstone Cards - Normal - Common
		
		
		
		//Hearthstone Cards - Normal - Rare
		
		
		//Hearthstone Cards - Normal - Epic 
		
		
		//Hearthstone Cards - Normal - Legendary
		
		
		
		
		
		
		
		
		//Hearthstone Cards - Goblins Vs Gnomes - Common
		
		
		
		//Hearthstone Cards - Goblins Vs Gnomes - Rare
		
		
		
		//Hearthstone Cards - Goblins Vs Gnomes - Epic
		
		
		
		
		//Hearthstone Cards - Goblins Vs Gnomes - Legendary
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void init(FMLInitializationEvent e){
		//Ore Dictionary
		
				OreDictionary.registerOre("ingotAluminum", IcesMinecraftExpansion.mfcingotaluminium);
				OreDictionary.registerOre("ingotBismuth", IcesMinecraftExpansion.mfcingotbismuth);
				OreDictionary.registerOre("ingotCalcium", IcesMinecraftExpansion.mfcingotcalcium);
				OreDictionary.registerOre("ingotCobalt", IcesMinecraftExpansion.mfcingotcobalt);
				OreDictionary.registerOre("ingotCopper", IcesMinecraftExpansion.mfcingotcopper);
				OreDictionary.registerOre("ingotLead", IcesMinecraftExpansion.mfcingotlead);
				OreDictionary.registerOre("ingotMagnesium", IcesMinecraftExpansion.mfcingotmagnesium);
				OreDictionary.registerOre("ingotNickel", IcesMinecraftExpansion.mfcingotnickel);
				OreDictionary.registerOre("ingotOsmium", IcesMinecraftExpansion.mfcingotosmium);
				OreDictionary.registerOre("ingotPlatinum", IcesMinecraftExpansion.mfcingotplatinum);
				OreDictionary.registerOre("ingotSilver", IcesMinecraftExpansion.mfcingotsilver);
				OreDictionary.registerOre("ingotTin", IcesMinecraftExpansion.mfcingottin);
				OreDictionary.registerOre("ingotTungsten", IcesMinecraftExpansion.mfcingottungsten);
				OreDictionary.registerOre("oreCinnabar", IcesMinecraftExpansion.mfccrystalcinnabar);
				OreDictionary.registerOre("oreCinnabar", IcesMinecraftExpansion.mfcorecinnabar);
				OreDictionary.registerOre("ingotZinc", IcesMinecraftExpansion.mfcingotzinc);
				
				OreDictionary.registerOre("oreAluminium", IcesMinecraftExpansion.mfcorealuminium);
				OreDictionary.registerOre("oreBismuth", IcesMinecraftExpansion.mfcorebismuth);
				OreDictionary.registerOre("oreCalcium", IcesMinecraftExpansion.mfcorecalcium);
				OreDictionary.registerOre("oreCobalt", IcesMinecraftExpansion.mfcorecobalt);
				OreDictionary.registerOre("oreCopper", IcesMinecraftExpansion.mfcorecopper);
				OreDictionary.registerOre("oreLead", IcesMinecraftExpansion.mfcorelead);
				OreDictionary.registerOre("oreMagnesium", IcesMinecraftExpansion.mfcoremagnesium);
				OreDictionary.registerOre("oreNickel", IcesMinecraftExpansion.mfcorenickel);
				OreDictionary.registerOre("oreOsmium", IcesMinecraftExpansion.mfcoreosmium);
				OreDictionary.registerOre("orePlatinum", IcesMinecraftExpansion.mfcoreplatinum);
				OreDictionary.registerOre("oreSilver", IcesMinecraftExpansion.mfcoresilver);
				OreDictionary.registerOre("oreTin", IcesMinecraftExpansion.mfcoretin);
				OreDictionary.registerOre("oreTungsten", IcesMinecraftExpansion.mfcoretungsten);
				OreDictionary.registerOre("oreZinc", IcesMinecraftExpansion.mfcorezinc);
				OreDictionary.registerOre("oil", IcesMinecraftExpansion.MFCCrudeOil);
				OreDictionary.registerOre("oil", IcesMinecraftExpansion.MFCShaleOil);
				
				//Smelting recipies
				
				
				GameRegistry.registerWorldGenerator(IcesMinecraftExpansion.MFCWorldGen, 5);
				
				GameRegistry.addSmelting(IcesMinecraftExpansion.mfcorealuminium, new ItemStack(IcesMinecraftExpansion.mfcingotaluminium), 2F);
				
				GameRegistry.addSmelting(IcesMinecraftExpansion.mfcorebismuth, new ItemStack(IcesMinecraftExpansion.mfcingotbismuth), 2F);
				
				GameRegistry.addSmelting(IcesMinecraftExpansion.mfcorecalcium, new ItemStack(IcesMinecraftExpansion.mfcingotcalcium), 2F);
				
				GameRegistry.addSmelting(IcesMinecraftExpansion.mfcorecopper, new ItemStack(IcesMinecraftExpansion.mfcingotcopper), 2F);
				
				GameRegistry.addSmelting(IcesMinecraftExpansion.mfcorecobalt, new ItemStack(IcesMinecraftExpansion.mfcingotcobalt), 2F);
				
				GameRegistry.addSmelting(IcesMinecraftExpansion.mfcorelead, new ItemStack(IcesMinecraftExpansion.mfcingotlead), 2F);
				
				GameRegistry.addSmelting(IcesMinecraftExpansion.mfcoremagnesium, new ItemStack(IcesMinecraftExpansion.mfcingotmagnesium), 2F);
				
				GameRegistry.addSmelting(IcesMinecraftExpansion.mfcorenickel, new ItemStack(IcesMinecraftExpansion.mfcingotnickel), 2F);
				
				GameRegistry.addSmelting(IcesMinecraftExpansion.mfcoreosmium, new ItemStack(IcesMinecraftExpansion.mfcingotosmium), 2F);
				
				GameRegistry.addSmelting(IcesMinecraftExpansion.mfcoreplatinum, new ItemStack(IcesMinecraftExpansion.mfcingotplatinum), 2F);
				
				GameRegistry.addSmelting(IcesMinecraftExpansion.mfcoresilver, new ItemStack(IcesMinecraftExpansion.mfcingotsilver), 2F);
				
				GameRegistry.addSmelting(IcesMinecraftExpansion.mfcoretin, new ItemStack(IcesMinecraftExpansion.mfcingottin), 2F);
				
				GameRegistry.addSmelting(IcesMinecraftExpansion.mfcoretungsten, new ItemStack(IcesMinecraftExpansion.mfcingottungsten), 2F);
				
				GameRegistry.addSmelting(IcesMinecraftExpansion.mfcorezinc, new ItemStack(IcesMinecraftExpansion.mfcingotzinc), 2F);
				
				GameRegistry.addSmelting(IcesMinecraftExpansion.mfcrawalloycast, new ItemStack(IcesMinecraftExpansion.mfcalloycast), 1F);
				
				GameRegistry.addSmelting(IcesMinecraftExpansion.mfcingotbrasscast, new ItemStack(IcesMinecraftExpansion.mfcingotbrass, 2), 1F);
				
				
				// GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.mfcingotaluminium, true, new Object[]{"FF", Character.valueOf('F'), "ingotCopper"}));
				
//Recipies
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCAluminiumAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotAluminium", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCAluminiumAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotAluminium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCBismuthAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotBismuth", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCBismuthAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotBismuth", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCalciumAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotCalcium", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCalciumAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotCalcium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCobaltAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotCobalt", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCobaltAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotCobalt", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCopperAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotCopper", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCopperAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotCopper", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCLeadAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotLead", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCLeadAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotLead", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCMagnesiumAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotMagnesium", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCMagnesiumAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotMagnesium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCNickelAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotNickel", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCNickelAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotNickel", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCOsmiumAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotOsmium", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCOsmiumAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotOsmium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCPlatinumAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotPlatinum", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCPlatinumAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotPlatinum", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCSilverAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotSilver", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCSilverAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotSilver", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTinAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotTin", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTinAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotTin", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTungstenAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotTungsten", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTungstenAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotTungsten", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCZincAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotZinc", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCZincAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotZinc", 'S', Item.itemRegistry.getObject("stick")} ));
				
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCAluminiumPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotAluminium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCBismuthPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotBismuth", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCalciumPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotCalcium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCobaltPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotCobalt", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCopperPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotCopper", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCLeadPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotLead", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCMagnesiumPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotMagnesium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCNickelPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotNickel", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCOsmiumPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotOsmium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCPlatinumPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotPlatinum", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCSilverPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotSilver", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTinPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotTin", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTungstenPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotTungsten", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCZincPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotZinc", 'S', Item.itemRegistry.getObject("stick")} ));
			
				
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCAluminiumHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotAluminium", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCAluminiumHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotAluminium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCBismuthHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotBismuth", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCBismuthHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotBismuth", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCalciumHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotCalcium", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCalciumHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotCalcium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCobaltHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotCobalt", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCobaltHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotCobalt", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCopperHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotCopper", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCopperHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotCopper", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCLeadHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotLead", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCLeadHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotLead", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCMagnesiumHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotMagnesium", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCMagnesiumHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotMagnesium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCNickelHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotNickel", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCNickelHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotNickel", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCOsmiumHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotOsmium", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCOsmiumHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotOsmium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCPlatinumHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotPlatinum", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCPlatinumHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotPlatinum", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCSilverHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotSilver", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCSilverHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotSilver", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTinHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotTin", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTinHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotTin", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTungstenHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotTungsten", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTungstenHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotTungsten", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCZincHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotZinc", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCZincHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotZinc", 'S', Item.itemRegistry.getObject("stick")} ));
				
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCAluminiumShovel, true, new Object[]{" X "," S "," S ",'X', "ingotAluminium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCBismuthShovel, true, new Object[]{" X "," S "," S ",'X', "ingotBismuth", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCalciumShovel, true, new Object[]{" X "," S "," S ",'X', "ingotCalcium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCobaltShovel, true, new Object[]{" X "," S "," S ",'X', "ingotCobalt", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCopperShovel, true, new Object[]{" X "," S "," S ",'X', "ingotCopper", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCLeadShovel, true, new Object[]{" X "," S "," S ",'X', "ingotLead", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCMagnesiumShovel, true, new Object[]{" X "," S "," S ",'X', "ingotMagnesium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCNickelShovel, true, new Object[]{" X "," S "," S ",'X', "ingotNickel", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCOsmiumShovel, true, new Object[]{" X "," S "," S ",'X', "ingotOsmium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCPlatinumShovel, true, new Object[]{" X "," S "," S ",'X', "ingotPlatinum", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCSilverShovel, true, new Object[]{" X "," S "," S ",'X', "ingotSilver", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTinShovel, true, new Object[]{" X "," S "," S ",'X', "ingotTin", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTungstenShovel, true, new Object[]{" X "," S "," S ",'X', "ingotTungsten", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCZincShovel, true, new Object[]{" X "," S "," S ",'X', "ingotZinc", 'S', Item.itemRegistry.getObject("stick")} ));
			
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCAluminiumSword, true, new Object[]{" X "," X "," S ",'X', "ingotAluminium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCBismuthSword, true, new Object[]{" X "," X "," S ",'X', "ingotBismuth", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCalciumSword, true, new Object[]{" X "," X "," S ",'X', "ingotCalcium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCobaltSword, true, new Object[]{" X "," X "," S ",'X', "ingotCobalt", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCopperSword, true, new Object[]{" X "," X "," S ",'X', "ingotCopper", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCLeadSword, true, new Object[]{" X "," X "," S ",'X', "ingotLead", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCMagnesiumSword, true, new Object[]{" X "," X "," S ",'X', "ingotMagnesium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCNickelSword, true, new Object[]{" X "," X "," S ",'X', "ingotNickel", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCOsmiumSword, true, new Object[]{" X "," X "," S ",'X', "ingotOsmium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCPlatinumSword, true, new Object[]{" X "," X "," S ",'X', "ingotPlatinum", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCSilverSword, true, new Object[]{" X "," X "," S ",'X', "ingotSilver", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTinSword, true, new Object[]{" X "," X "," S ",'X', "ingotTin", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTungstenSword, true, new Object[]{" X "," X "," S ",'X', "ingotTungsten", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCZincSword, true, new Object[]{" X "," X "," S ",'X', "ingotZinc", 'S', Item.itemRegistry.getObject("stick")} ));
			
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.mfcrawalloycast, true, new Object[]{"x x","xxx","   ",'x',Item.itemRegistry.getObject("clay_ball")}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.mfcrawalloycast, true, new Object[]{"   ","x x","xxx",'x',Item.itemRegistry.getObject("clay_ball")}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCAluminiumHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotAluminium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCAluminiumHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotAluminium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCAluminiumChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotAluminium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCAluminiumLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotAluminium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCAluminiumBoots, true, new Object[]{"x x","x x","   ",'x',"ingotAluminium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCAluminiumBoots, true, new Object[]{"   ","x x","x x",'x',"ingotAluminium"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCBismuthHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotBismuth"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCBismuthHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotBismuth"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCBismuthChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotBismuth"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCBismuthLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotBismuth"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCBismuthBoots, true, new Object[]{"x x","x x","   ",'x',"ingotBismuth"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCBismuthBoots, true, new Object[]{"   ","x x","x x",'x',"ingotBismuth"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCalciumHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotCalcium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCalciumHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotCalcium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCalciumChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotCalcium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCalciumLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotCalcium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCalciumBoots, true, new Object[]{"x x","x x","   ",'x',"ingotCalcium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCalciumBoots, true, new Object[]{"   ","x x","x x",'x',"ingotCalcium"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCobaltHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotCobalt"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCobaltHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotCobalt"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCobaltChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotCobalt"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCobaltLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotCobalt"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCobaltBoots, true, new Object[]{"x x","x x","   ",'x',"ingotCobalt"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCobaltBoots, true, new Object[]{"   ","x x","x x",'x',"ingotCobalt"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCopperHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotCopper"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCopperHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotCopper"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCopperChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotCopper"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCopperLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotCopper"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCopperBoots, true, new Object[]{"x x","x x","   ",'x',"ingotCopper"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCCopperBoots, true, new Object[]{"   ","x x","x x",'x',"ingotCopper"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCLeadHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotLead"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCLeadHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotLead"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCLeadChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotLead"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCLeadLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotLead"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCLeadBoots, true, new Object[]{"x x","x x","   ",'x',"ingotLead"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCLeadBoots, true, new Object[]{"   ","x x","x x",'x',"ingotLead"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCMagnesiumHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotMagnesium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCMagnesiumHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotMagnesium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCMagnesiumChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotMagnesium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCMagnesiumLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotMagnesium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCMagnesiumBoots, true, new Object[]{"x x","x x","   ",'x',"ingotMagnesium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCMagnesiumBoots, true, new Object[]{"   ","x x","x x",'x',"ingotMagnesium"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCNickelHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotNickel"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCNickelHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotNickel"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCNickelChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotNickel"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCNickelLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotNickel"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCNickelBoots, true, new Object[]{"x x","x x","   ",'x',"ingotNickel"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCNickelBoots, true, new Object[]{"   ","x x","x x",'x',"ingotNickel"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCOsmiumHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotOsmium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCOsmiumHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotOsmium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCOsmiumChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotOsmium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCOsmiumLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotOsmium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCOsmiumBoots, true, new Object[]{"x x","x x","   ",'x',"ingotOsmium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCOsmiumBoots, true, new Object[]{"   ","x x","x x",'x',"ingotOsmium"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCPlatinumHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotPlatinum"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCPlatinumHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotPlatinum"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCPlatinumChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotPlatinum"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCPlatinumLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotPlatinum"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCPlatinumBoots, true, new Object[]{"x x","x x","   ",'x',"ingotPlatinum"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCPlatinumBoots, true, new Object[]{"   ","x x","x x",'x',"ingotPlatinum"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCSilverHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotSilver"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCSilverHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotSilver"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCSilverChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotSilver"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCSilverLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotSilver"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCSilverBoots, true, new Object[]{"x x","x x","   ",'x',"ingotSilver"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCSilverBoots, true, new Object[]{"   ","x x","x x",'x',"ingotSilver"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTinHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotTin"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTinHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotTin"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTinChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotTin"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTinLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotTin"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTinBoots, true, new Object[]{"x x","x x","   ",'x',"ingotTin"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTinBoots, true, new Object[]{"   ","x x","x x",'x',"ingotTin"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTungstenHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotTungsten"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTungstenHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotTungsten"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTungstenChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotTungsten"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTungstenLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotTungsten"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTungstenBoots, true, new Object[]{"x x","x x","   ",'x',"ingotTungsten"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCTungstenBoots, true, new Object[]{"   ","x x","x x",'x',"ingotTungsten"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCZincHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotZinc"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCZincHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotZinc"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCZincChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotZinc"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCZincLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotZinc"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCZincBoots, true, new Object[]{"x x","x x","   ",'x',"ingotZinc"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(IcesMinecraftExpansion.MFCZincBoots, true, new Object[]{"   ","x x","x x",'x',"ingotZinc"}));
				
				GameRegistry.addRecipe(new ItemStack(IcesMinecraftExpansion.MFCSmelter, 1), new Object[]{"XXX","X X","XNX",'X',Blocks.stonebrick, 'N', Blocks.netherrack});
				
				GameRegistry.addShapelessRecipe(new ItemStack(IcesMinecraftExpansion.MFCPeperminttea), new Object[] {Items.glass_bottle, IcesMinecraftExpansion.MFCPepermint});
				GameRegistry.addShapelessRecipe(new ItemStack(IcesMinecraftExpansion.MFCPepermintoil), new Object[] {Items.glass_bottle, IcesMinecraftExpansion.MFCPepermint, IcesMinecraftExpansion.MFCPepermint});
				GameRegistry.addShapelessRecipe(new ItemStack(IcesMinecraftExpansion.MFCHerbaltea), new Object[] {Items.glass_bottle, IcesMinecraftExpansion.MFCPepermintoil, IcesMinecraftExpansion.MFCAloe, IcesMinecraftExpansion.MFCArnica, IcesMinecraftExpansion.MFCTeatreeoil, IcesMinecraftExpansion.MFCGinger});
				//Shapeless OreDict recipies
				GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(IcesMinecraftExpansion.mfcingotbrasscast, 1), new Object[] {"ingotZinc", "ingotCopper", "ingotCopper", IcesMinecraftExpansion.mfcalloycast}));
				
				MinecraftForge.addGrassSeed(new ItemStack(IcesMinecraftExpansion.MFCAloe), 1);
				MinecraftForge.addGrassSeed(new ItemStack(IcesMinecraftExpansion.MFCPepermint), 1);
				MinecraftForge.addGrassSeed(new ItemStack(IcesMinecraftExpansion.MFCArnica), 1);
	}
	public void postinit(FMLPostInitializationEvent e){
		
	}
}
