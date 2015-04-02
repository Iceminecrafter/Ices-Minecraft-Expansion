package com.iceminecrafter.IME.proxy;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.iceminecrafter.IME.IcesMinecraftExpansion;
import com.iceminecrafter.IME.MFCOilShale;
import com.iceminecrafter.IME.Entity.EntityMechon_M69;
import com.iceminecrafter.IME.Mob.EntityMFC;
import com.iceminecrafter.IME.Mob.RenderMechon_M69;
import com.iceminecrafter.IME.Models.Mechon_M69;
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

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;





public class CommonProxy {
	

	
	//armour material
	
		public static ArmorMaterial MFCAluminiumArmorMat = EnumHelper.addArmorMaterial("MFCAluminiumArmorMat", 15, new int[] {2, 5, 3, 1}, 10);
		public static ArmorMaterial MFCBismuthArmorMat = EnumHelper.addArmorMaterial("MFCBismuthArmorMat", 15, new int[] {2, 5, 3, 1}, 10);
		public static ArmorMaterial MFCCalciumArmorMat = EnumHelper.addArmorMaterial("MFCCalciumArmorMat", 15, new int[] {2, 5, 3, 1}, 10);
		public static ArmorMaterial MFCCobaltArmorMat = EnumHelper.addArmorMaterial("MFCCobaltArmorMat", 15, new int[] {2, 5, 3, 1}, 10);
		public static ArmorMaterial MFCCopperArmorMat = EnumHelper.addArmorMaterial("MFCCopperArmorMat", 15, new int[] {2, 5, 3, 1}, 10);
		public static ArmorMaterial MFCLeadArmorMat = EnumHelper.addArmorMaterial("MFCLeadArmorMat", 15, new int[] {2, 5, 3, 1}, 10);
		public static ArmorMaterial MFCMagnesiumArmorMat = EnumHelper.addArmorMaterial("MFCMagnesiumArmorMat", 15, new int[] {2, 5, 3, 1}, 10);
		public static ArmorMaterial MFCNickelArmorMat = EnumHelper.addArmorMaterial("MFCNickelArmorMat", 15, new int[] {2, 5, 3, 1}, 10);
		public static ArmorMaterial MFCOsmiumArmorMat = EnumHelper.addArmorMaterial("MFCOsmiumArmorMat", 15, new int[] {2, 5, 3, 1}, 10);
		public static ArmorMaterial MFCPlatinumArmorMat = EnumHelper.addArmorMaterial("MFCPlatinumArmorMat", 15, new int[] {2, 5, 3, 1}, 10);
		public static ArmorMaterial MFCSilverArmorMat = EnumHelper.addArmorMaterial("MFCSilverArmorMat", 15, new int[] {2, 5, 3, 1}, 10);
		public static ArmorMaterial MFCTinArmorMat = EnumHelper.addArmorMaterial("MFCTinArmorMat", 15, new int[] {2, 5, 3, 1}, 10);
		public static ArmorMaterial MFCTungstenArmorMat = EnumHelper.addArmorMaterial("MFCTungstenArmorMat", 15, new int[] {2, 5, 3, 1}, 10);
		public static ArmorMaterial MFCZincArmorMat = EnumHelper.addArmorMaterial("MFCZincArmorMat", 15, new int[] {2, 5, 3, 1}, 10);
		
		
		//tool material
		
		public static ToolMaterial MFCAluminiumMat = EnumHelper.addToolMaterial("MFCAluminiumMat", 3, 200, 5.0F, 3.0F, 3);
		public static ToolMaterial MFCBismuthMat = EnumHelper.addToolMaterial("MFCBismuthMat", 3, 300, 5.0F, 4.0F, 2);
		public static ToolMaterial MFCCalciumMat = EnumHelper.addToolMaterial("MFCCalciumMat", 2, 100, 6.0F, 3.0F, 5);
		public static ToolMaterial MFCCobaltMat = EnumHelper.addToolMaterial("MFCCobaltMat", 4, 450, 7.0F, 6.0F, 2);
		public static ToolMaterial MFCCopperMat = EnumHelper.addToolMaterial("MFCCopperMat", 2, 200, 5.0F, 3.0F, 3);
		public static ToolMaterial MFCLeadMat = EnumHelper.addToolMaterial("MFCLeadMat", 2, 200, 5.0F, 3.0F, 3);
		public static ToolMaterial MFCMagnesiumMat = EnumHelper.addToolMaterial("MFCMagnesiumMat", 2, 200, 5.0F, 3.0F, 3);
		public static ToolMaterial MFCNickelMat = EnumHelper.addToolMaterial("MFCNickelMat", 2, 200, 5.0F, 3.0F, 3);
		public static ToolMaterial MFCOsmiumMat = EnumHelper.addToolMaterial("MFCOsmiumMat", 3, 200, 5.0F, 3.0F, 3);
		public static ToolMaterial MFCPlatinumMat = EnumHelper.addToolMaterial("MFCPlatinumMat", 3, 200, 5.0F, 3.0F, 3);
		public static ToolMaterial MFCSilverMat = EnumHelper.addToolMaterial("MFCSilverMat", 3, 200, 5.0F, 3.0F, 3);
		public static ToolMaterial MFCTinMat = EnumHelper.addToolMaterial("MFCTinMat", 2, 200, 5.0F, 3.0F, 3);
		public static ToolMaterial MFCTungstenMat = EnumHelper.addToolMaterial("MFCTungstenMat", 3, 200, 5.0F, 3.0F, 3);
		public static ToolMaterial MFCZincMat = EnumHelper.addToolMaterial("MFCZincMat", 2, 200, 5.0F, 3.0F, 3);
		
		//ChestID
		
		public static int MFCAluminiumchestplateID;
		public static int MFCBismuthchestplateID;
		public static int MFCCalciumchestplateID;
		public static int MFCCobaltchestplateID;
		public static int MFCCopperchestplateID;
		public static int MFCLeadchestplateID;
		public static int MFCMagnesiumchestplateID;
		public static int MFCNickelchestplateID;
		public static int MFCOsmiumchestplateID;
		public static int MFCPlatinumchestplateID;
		public static int MFCSilverchestplateID;
		public static int MFCTinchestplateID;
		public static int MFCTungstenchestplateID;
		public static int MFCZincchestplateID;
		
		
		
		
		//HelmID
		
		public static int MFCAluminiumhelmetID;
		public static int MFCBismuthhelmetID;
		public static int MFCCalciumhelmetID;
		public static int MFCCobalthelmetID;
		public static int MFCCopperhelmetID;
		public static int MFCLeadhelmetID;
		public static int MFCMagnesiumhelmetID;
		public static int MFCNickelhelmetID;
		public static int MFCOsmiumhelmetID;
		public static int MFCPlatinumhelmetID;
		public static int MFCSilverhelmetID;
		public static int MFCTinhelmetID;
		public static int MFCTungstenhelmetID;
		public static int MFCZinchelmetID;
		
		
		
		//LegsID
		
		public static int MFCAluminiumleggingsID;
		public static int MFCBismuthleggingsID;
		public static int MFCCalciumleggingsID;
		public static int MFCCobaltleggingsID;
		public static int MFCCopperleggingsID;
		public static int MFCLeadleggingsID;
		public static int MFCMagnesiumleggingsID;
		public static int MFCNickelleggingsID;
		public static int MFCOsmiumleggingsID;
		public static int MFCPlatinumleggingsID;
		public static int MFCSilverleggingsID;
		public static int MFCTinleggingsID;
		public static int MFCTungstenleggingsID;
		public static int MFCZincleggingsID;
		
		
		
		//BootsID
		
		public static int MFCAluminiumbootsID;
		public static int MFCBismuthbootsID;
		public static int MFCCalciumbootsID;
		public static int MFCCobaltbootsID;
		public static int MFCCopperbootsID;
		public static int MFCLeadbootsID;
		public static int MFCMagnesiumbootsID;
		public static int MFCNickelbootsID;
		public static int MFCOsmiumbootsID;
		public static int MFCPlatinumbootsID;
		public static int MFCSilverbootsID;
		public static int MFCTinbootsID;
		public static int MFCTungstenbootsID;
		public static int MFCZincbootsID;
		
		
		
		
		
		
		
		
		
		
		public static MFCGeneration MFCWorldGen = new MFCGeneration();

		//Blocks - Metal
		
		public static Block mfcorealuminium;
		public static Block mfcorebismuth;
		public static Block mfcorecalcium;
		public static Block mfcorecobalt;
		public static Block mfcorecopper;
		public static Block mfcorelead;
		public static Block mfcoremagnesium;
		public static Block mfcorenickel;
		public static Block mfcoreplatinum;
		public static Block mfcoreosmium;
		public static Block mfcoresilver;
		public static Block mfcoretin;
		public static Block mfcoretungsten;
		public static Block mfcorezinc;
		public static Block mfcorecinnabar;
		public static Block mfcorechromium;
		


		//Items - Metal
		
		public static Item mfcingotaluminium;
		public static Item mfcingotbismuth;
		public static Item mfcingotcalcium;
		public static Item mfcingotcobalt;
		public static Item mfcingotcopper;
		public static Item mfcingotlead;
		public static Item mfcingotmagnesium;
		public static Item mfcingotnickel;
		public static Item mfcingotplatinum;
		public static Item mfcingotosmium;
		public static Item mfcingotsilver;
		public static Item mfcingottin;
		public static Item mfcingottungsten;
		public static Item mfcingotzinc;
		public static Item mfccrystalcinnabar;
		public static Item mfcalloycast;
		public static Item mfcrawalloycast;
		public static Item mfcingotchromium;
		public static Item mfcingotbrass;
		public static Item mfcingotbrasscast;

		//Aluminium Armour
		
		public static Item MFCAluminiumHelmet = new MFCAluminiumArmor(MFCAluminiumArmorMat, MFCAluminiumhelmetID, 0).setUnlocalizedName("MFCAluminiumHelmet").setTextureName("metalforgecraft" + ":AluminiumHelmet");
		public static Item MFCAluminiumChestplate = new MFCAluminiumArmor(MFCAluminiumArmorMat, MFCAluminiumchestplateID, 1).setUnlocalizedName("MFCAluminiumChestplate").setTextureName("metalforgecraft" + ":AluminiumChestplate");
		public static Item MFCAluminiumLeggings = new MFCAluminiumArmor(MFCAluminiumArmorMat, MFCAluminiumleggingsID, 2).setUnlocalizedName("MFCAluminiumLeggings").setTextureName("metalforgecraft" + ":AluminiumLeggings");
		public static Item MFCAluminiumBoots = new MFCAluminiumArmor(MFCAluminiumArmorMat, MFCAluminiumbootsID, 3).setUnlocalizedName("MFCAluminiumBoots").setTextureName("metalforgecraft" + ":AluminiumBoots");

		//Bismuth Armour
		
		public static Item MFCBismuthHelmet = new MFCBismuthArmor(MFCBismuthArmorMat, MFCBismuthhelmetID, 0).setUnlocalizedName("MFCBismuthHelmet").setTextureName("metalforgecraft" + ":BismuthHelmet");
		public static Item MFCBismuthChestplate = new MFCBismuthArmor(MFCBismuthArmorMat, MFCBismuthchestplateID, 1).setUnlocalizedName("MFCBismuthChestplate").setTextureName("metalforgecraft" + ":BismuthChestplate");
		public static Item MFCBismuthLeggings = new MFCBismuthArmor(MFCBismuthArmorMat, MFCBismuthleggingsID, 2).setUnlocalizedName("MFCBismuthLeggings").setTextureName("metalforgecraft" + ":BismuthLeggings");
		public static Item MFCBismuthBoots = new MFCBismuthArmor(MFCBismuthArmorMat, MFCBismuthbootsID, 3).setUnlocalizedName("MFCBismuthBoots").setTextureName("metalforgecraft" + ":BismuthBoots");

		//Zinc Armour
		
		public static Item MFCZincHelmet = new MFCZincArmor(MFCZincArmorMat, MFCZinchelmetID, 0).setUnlocalizedName("MFCZincHelmet").setTextureName("metalforgecraft" + ":ZincHelmet");
		public static Item MFCZincChestplate = new MFCZincArmor(MFCZincArmorMat, MFCZincchestplateID, 1).setUnlocalizedName("MFCZincChestplate").setTextureName("metalforgecraft" + ":ZincChestplate");
		public static Item MFCZincLeggings = new MFCZincArmor(MFCZincArmorMat, MFCZincleggingsID, 2).setUnlocalizedName("MFCZincLeggings").setTextureName("metalforgecraft" + ":ZincLeggings");
		public static Item MFCZincBoots = new MFCZincArmor(MFCZincArmorMat, MFCZincbootsID, 3).setUnlocalizedName("MFCZincBoots").setTextureName("metalforgecraft" + ":ZincBoots");

		//Calcium Armour
		
		public static Item MFCCalciumHelmet = new MFCCalciumArmor(MFCCalciumArmorMat, MFCCalciumhelmetID, 0).setUnlocalizedName("MFCCalciumHelmet").setTextureName("metalforgecraft" + ":CalciumHelmet");
		public static Item MFCCalciumChestplate = new MFCCalciumArmor(MFCCalciumArmorMat, MFCCalciumchestplateID, 1).setUnlocalizedName("MFCCalciumChestplate").setTextureName("metalforgecraft" + ":CalciumChestplate");
		public static Item MFCCalciumLeggings = new MFCCalciumArmor(MFCCalciumArmorMat, MFCCalciumleggingsID, 2).setUnlocalizedName("MFCCalciumLeggings").setTextureName("metalforgecraft" + ":CalciumLeggings");
		public static Item MFCCalciumBoots = new MFCCalciumArmor(MFCCalciumArmorMat, MFCCalciumbootsID, 3).setUnlocalizedName("MFCCalciumBoots").setTextureName("metalforgecraft" + ":CalciumBoots");

		//Cobalt Armour
		
		public static Item MFCCobaltHelmet = new MFCCobaltArmor(MFCCobaltArmorMat, MFCCobalthelmetID, 0).setUnlocalizedName("MFCCobaltHelmet").setTextureName("metalforgecraft" + ":CobaltHelmet");
		public static Item MFCCobaltChestplate = new MFCCobaltArmor(MFCCobaltArmorMat, MFCCobaltchestplateID, 1).setUnlocalizedName("MFCCobaltChestplate").setTextureName("metalforgecraft" + ":CobaltChestplate");
		public static Item MFCCobaltLeggings = new MFCCobaltArmor(MFCCobaltArmorMat, MFCCobaltleggingsID, 2).setUnlocalizedName("MFCCobaltLeggings").setTextureName("metalforgecraft" + ":CobaltLeggings");
		public static Item MFCCobaltBoots = new MFCCobaltArmor(MFCCobaltArmorMat, MFCCobaltbootsID, 3).setUnlocalizedName("MFCCobaltBoots").setTextureName("metalforgecraft" + ":CobaltBoots");

		//Copper Armour
		
		public static Item MFCCopperHelmet = new MFCCopperArmor(MFCCopperArmorMat, MFCCopperhelmetID, 0).setUnlocalizedName("MFCCopperHelmet").setTextureName("metalforgecraft" + ":CopperHelmet");
		public static Item MFCCopperChestplate = new MFCCopperArmor(MFCCopperArmorMat, MFCCopperchestplateID, 1).setUnlocalizedName("MFCCopperChestplate").setTextureName("metalforgecraft" + ":CopperChestplate");
		public static Item MFCCopperLeggings = new MFCCopperArmor(MFCCopperArmorMat, MFCCopperleggingsID, 2).setUnlocalizedName("MFCCopperLeggings").setTextureName("metalforgecraft" + ":CopperLeggings");
		public static Item MFCCopperBoots = new MFCCopperArmor(MFCCopperArmorMat, MFCCopperbootsID, 3).setUnlocalizedName("MFCCopperBoots").setTextureName("metalforgecraft" + ":CopperBoots");

		//Lead  Armour
		
		public static Item MFCLeadHelmet = new MFCLeadArmor(MFCLeadArmorMat, MFCLeadhelmetID, 0).setUnlocalizedName("MFCLeadHelmet").setTextureName("metalforgecraft" + ":LeadHelmet");
		public static Item MFCLeadChestplate = new MFCLeadArmor(MFCLeadArmorMat, MFCLeadchestplateID, 1).setUnlocalizedName("MFCLeadChestplate").setTextureName("metalforgecraft" + ":LeadChestplate");
		public static Item MFCLeadLeggings = new MFCLeadArmor(MFCLeadArmorMat, MFCLeadleggingsID, 2).setUnlocalizedName("MFCLeadLeggings").setTextureName("metalforgecraft" + ":LeadLeggings");
		public static Item MFCLeadBoots = new MFCLeadArmor(MFCLeadArmorMat, MFCLeadbootsID, 3).setUnlocalizedName("MFCLeadBoots").setTextureName("metalforgecraft" + ":LeadBoots");

		//Magnesium Armour
		
		public static Item MFCMagnesiumHelmet = new MFCMagnesiumArmor(MFCMagnesiumArmorMat, MFCMagnesiumhelmetID, 0).setUnlocalizedName("MFCMagnesiumHelmet").setTextureName("metalforgecraft" + ":MagnesiumHelmet");
		public static Item MFCMagnesiumChestplate = new MFCMagnesiumArmor(MFCMagnesiumArmorMat, MFCMagnesiumchestplateID, 1).setUnlocalizedName("MFCMagnesiumChestplate").setTextureName("metalforgecraft" + ":MagnesiumChestplate");
		public static Item MFCMagnesiumLeggings = new MFCMagnesiumArmor(MFCMagnesiumArmorMat, MFCMagnesiumleggingsID, 2).setUnlocalizedName("MFCMagnesiumLeggings").setTextureName("metalforgecraft" + ":MagnesiumLeggings");
		public static Item MFCMagnesiumBoots = new MFCMagnesiumArmor(MFCMagnesiumArmorMat, MFCMagnesiumbootsID, 3).setUnlocalizedName("MFCMagnesiumBoots").setTextureName("metalforgecraft" + ":MagnesiumBoots");

		//Nickel Armour
		
		public static Item MFCNickelHelmet = new MFCNickelArmor(MFCNickelArmorMat, MFCNickelhelmetID, 0).setUnlocalizedName("MFCNickelHelmet").setTextureName("metalforgecraft" + ":NickelHelmet");
		public static Item MFCNickelChestplate = new MFCNickelArmor(MFCNickelArmorMat, MFCNickelchestplateID, 1).setUnlocalizedName("MFCNickelChestplate").setTextureName("metalforgecraft" + ":NickelChestplate");
		public static Item MFCNickelLeggings = new MFCNickelArmor(MFCNickelArmorMat, MFCNickelleggingsID, 2).setUnlocalizedName("MFCNickelLeggings").setTextureName("metalforgecraft" + ":NickelLeggings");
		public static Item MFCNickelBoots = new MFCNickelArmor(MFCNickelArmorMat, MFCNickelbootsID, 3).setUnlocalizedName("MFCNickelBoots").setTextureName("metalforgecraft" + ":NickelBoots");

		//Osmium Armour
		
		public static Item MFCOsmiumHelmet = new MFCOsmiumArmor(MFCOsmiumArmorMat, MFCOsmiumhelmetID, 0).setUnlocalizedName("MFCOsmiumHelmet").setTextureName("metalforgecraft" + ":OsmiumHelmet");
		public static Item MFCOsmiumChestplate = new MFCOsmiumArmor(MFCOsmiumArmorMat, MFCOsmiumchestplateID, 1).setUnlocalizedName("MFCOsmiumChestplate").setTextureName("metalforgecraft" + ":OsmiumChestplate");
		public static Item MFCOsmiumLeggings = new MFCOsmiumArmor(MFCOsmiumArmorMat, MFCOsmiumleggingsID, 2).setUnlocalizedName("MFCOsmiumLeggings").setTextureName("metalforgecraft" + ":OsmiumLeggins");
		public static Item MFCOsmiumBoots = new MFCOsmiumArmor(MFCOsmiumArmorMat, MFCOsmiumbootsID, 3).setUnlocalizedName("MFCOsmiumBoots").setTextureName("metalforgecraft" + ":OsmiumBoots");

		//Platinum Armour
		
		public static Item MFCPlatinumHelmet = new MFCPlatinumArmor(MFCPlatinumArmorMat, MFCPlatinumhelmetID, 0).setUnlocalizedName("MFCPlatinumHelmet").setTextureName("metalforgecraft" + ":PlatinumHelmet");
		public static Item MFCPlatinumChestplate = new MFCPlatinumArmor(MFCPlatinumArmorMat, MFCPlatinumchestplateID, 1).setUnlocalizedName("MFCPlatinumChestplate").setTextureName("metalforgecraft" + ":PlatinumChestplate");
		public static Item MFCPlatinumLeggings = new MFCPlatinumArmor(MFCPlatinumArmorMat, MFCPlatinumleggingsID, 2).setUnlocalizedName("MFCPlatinumLeggings").setTextureName("metalforgecraft" + ":PlatinumLeggings");
		public static Item MFCPlatinumBoots = new MFCPlatinumArmor(MFCPlatinumArmorMat, MFCPlatinumbootsID, 3).setUnlocalizedName("MFCPlatinumBoots").setTextureName("metalforgecraft" + ":PlatinumBoots");

		//Silver Armour
		
		public static Item MFCSilverHelmet = new MFCSilverArmor(MFCSilverArmorMat, MFCSilverhelmetID, 0).setUnlocalizedName("MFCSilverHelmet").setTextureName("metalforgecraft" + ":SilverHelmet");
		public static Item MFCSilverChestplate = new MFCSilverArmor(MFCSilverArmorMat, MFCSilverchestplateID, 1).setUnlocalizedName("MFCSilverChestplate").setTextureName("metalforgecraft" + ":SilverChestplate");
		public static Item MFCSilverLeggings = new MFCSilverArmor(MFCSilverArmorMat, MFCSilverleggingsID, 2).setUnlocalizedName("MFCSilverLeggings").setTextureName("metalforgecraft" + ":SilverLeggings");
		public static Item MFCSilverBoots = new MFCSilverArmor(MFCSilverArmorMat, MFCSilverbootsID, 3).setUnlocalizedName("MFCSilverBoots").setTextureName("metalforgecraft" + ":SilverBoots");

		//Tin Armour
		
		public static Item MFCTinHelmet = new MFCTinArmor(MFCTinArmorMat, MFCTinhelmetID, 0).setUnlocalizedName("MFCTinHelmet").setTextureName("metalforgecraft" + ":TinHelmet");
		public static Item MFCTinChestplate = new MFCTinArmor(MFCTinArmorMat, MFCTinchestplateID, 1).setUnlocalizedName("MFCTinChestplate").setTextureName("metalforgecraft" + ":TinChestplate");
		public static Item MFCTinLeggings = new MFCTinArmor(MFCTinArmorMat, MFCTinleggingsID, 2).setUnlocalizedName("MFCTinLeggings").setTextureName("metalforgecraft" + ":TinLeggings");
		public static Item MFCTinBoots = new MFCTinArmor(MFCTinArmorMat, MFCTinbootsID, 3).setUnlocalizedName("MFCTinBoots").setTextureName("metalforgecraft" + ":TinBoots");

		//Tungsten Armour
		
		public static Item MFCTungstenHelmet = new MFCTungstenArmor(MFCTungstenArmorMat, MFCTungstenhelmetID, 0).setUnlocalizedName("MFCTungstenHelmet").setTextureName("metalforgecraft" + ":TungstenHelmet");
		public static Item MFCTungstenChestplate = new MFCTungstenArmor(MFCTungstenArmorMat, MFCTungstenchestplateID, 1).setUnlocalizedName("MFCTungstenChestplate").setTextureName("metalforgecraft" + ":TungstenChestplate");
		public static Item MFCTungstenLeggings = new MFCTungstenArmor(MFCTungstenArmorMat, MFCTungstenleggingsID, 2).setUnlocalizedName("MFCTungstenLeggings").setTextureName("metalforgecraft" + ":TungstenLeggings");
		public static Item MFCTungstenBoots = new MFCTungstenArmor(MFCTungstenArmorMat, MFCTungstenbootsID, 3).setUnlocalizedName("MFCTungstenBoots").setTextureName("metalforgecraft" + ":TungstenBoots");
		


		

		//Aluminium tools
		
		public static Item MFCAluminiumAxe = new MFCAluminiumAxe(MFCAluminiumMat).setUnlocalizedName("MFCAluminiumAxe").setTextureName("metalforgecraft" + ":AluminiumAxe");
		public static Item MFCAluminiumSword = new MFCAluminiumSword(MFCAluminiumMat).setUnlocalizedName("MFCAluminiumSword").setTextureName("metalforgecraft" + ":AluminiumSword");
		public static Item MFCAluminiumShovel = new MFCAluminiumShovel(MFCAluminiumMat).setUnlocalizedName("MFCAluminiumShovel").setTextureName("metalforgecraft" + ":AluminiumShovel");
		public static Item MFCAluminiumPickaxe = new MFCAluminiumPickaxe(MFCAluminiumMat).setUnlocalizedName("MFCAluminiumPickaxe").setTextureName("metalforgecraft" + ":AluminiumPickaxe");
		public static Item MFCAluminiumHoe = new MFCAluminiumHoe(MFCAluminiumMat).setUnlocalizedName("MFCAluminiumHoe").setTextureName("metalforgecraft" + ":AluminiumHoe");

		//Bismuth tools
		
		public static Item MFCBismuthAxe = new MFCBismuthAxe(MFCBismuthMat).setUnlocalizedName("MFCBismuthAxe").setTextureName("metalforgecraft" + ":BismuthAxe");
		public static Item MFCBismuthSword = new MFCBismuthSword(MFCBismuthMat).setUnlocalizedName("MFCBismuthSword").setTextureName("metalforgecraft" + ":BismuthSword");
		public static Item MFCBismuthShovel = new MFCBismuthShovel(MFCBismuthMat).setUnlocalizedName("MFCBismuthShovel").setTextureName("metalforgecraft" + ":BismuthShovel");
		public static Item MFCBismuthPickaxe = new MFCBismuthPickaxe(MFCBismuthMat).setUnlocalizedName("MFCBismuthPickaxe").setTextureName("metalforgecraft" + ":BismuthPickaxe");
		public static Item MFCBismuthHoe = new MFCBismuthHoe(MFCBismuthMat).setUnlocalizedName("MFCBismuthHoe").setTextureName("metalforgecraft" + ":BismuthHoe");

		//Calcium tools
		
		public static Item MFCCalciumAxe = new MFCCalciumAxe(MFCCalciumMat).setUnlocalizedName("MFCCalciumAxe").setTextureName("metalforgecraft" + ":CalciumAxe");
		public static Item MFCCalciumSword = new MFCCalciumSword(MFCCalciumMat).setUnlocalizedName("MFCCalciumSword").setTextureName("metalforgecraft" + ":CalciumSword");
		public static Item MFCCalciumShovel = new MFCCalciumShovel(MFCCalciumMat).setUnlocalizedName("MFCCalciumShovel").setTextureName("metalforgecraft" + ":CalciumShovel");
		public static Item MFCCalciumPickaxe = new MFCCalciumPickaxe(MFCCalciumMat).setUnlocalizedName("MFCCalciumPickaxe").setTextureName("metalforgecraft" + ":CalciumPickaxe");
		public static Item MFCCalciumHoe = new MFCCalciumHoe(MFCCalciumMat).setUnlocalizedName("MFCCalciumHoe").setTextureName("metalforgecraft" + ":CalciumHoe");

		//Coblat tools
		
		public static Item MFCCobaltAxe = new MFCCobaltAxe(MFCCobaltMat).setUnlocalizedName("MFCCobaltAxe").setTextureName("metalforgecraft" + ":CobaltAxe");
		public static Item MFCCobaltSword = new MFCCobaltSword(MFCCobaltMat).setUnlocalizedName("MFCCobaltSword").setTextureName("metalforgecraft" + ":CobaltSword");
		public static Item MFCCobaltShovel = new MFCCobaltShovel(MFCCobaltMat).setUnlocalizedName("MFCCobaltShovel").setTextureName("metalforgecraft" + ":CobaltShovel");
		public static Item MFCCobaltPickaxe = new MFCCobaltPickaxe(MFCCobaltMat).setUnlocalizedName("MFCCobaltPickaxe").setTextureName("metalforgecraft" + ":CobaltHoe");
		public static Item MFCCobaltHoe = new MFCCobaltHoe(MFCCobaltMat).setUnlocalizedName("MFCCobaltHoe").setTextureName("metalforgecraft" + ":");

		//Copper tools
		
		public static Item MFCCopperAxe = new MFCCopperAxe(MFCCopperMat).setUnlocalizedName("MFCCopperAxe").setTextureName("metalforgecraft" + ":CopperAxe");
		public static Item MFCCopperSword = new MFCCopperSword(MFCCopperMat).setUnlocalizedName("MFCCopperSword").setTextureName("metalforgecraft" + ":CopperSword");
		public static Item MFCCopperShovel = new MFCCopperShovel(MFCCopperMat).setUnlocalizedName("MFCCopperShovel").setTextureName("metalforgecraft" + ":CopperShovel");
		public static Item MFCCopperPickaxe = new MFCCopperPickaxe(MFCCopperMat).setUnlocalizedName("MFCCopperPickaxe").setTextureName("metalforgecraft" + ":CopperPickaxe");
		public static Item MFCCopperHoe = new MFCCopperHoe(MFCCopperMat).setUnlocalizedName("MFCCopperHoe").setTextureName("metalforgecraft" + ":CopperHoe");

		//Nickel tools
		
		public static Item MFCLeadAxe = new MFCLeadAxe(MFCLeadMat).setUnlocalizedName("MFCLeadAxe").setTextureName("metalforgecraft" + ":LeadAxe");
		public static Item MFCLeadSword = new MFCLeadSword(MFCLeadMat).setUnlocalizedName("MFCLeadSword").setTextureName("metalforgecraft" + ":LeadSword");
		public static Item MFCLeadShovel = new MFCLeadShovel(MFCLeadMat).setUnlocalizedName("MFCLeadShovel").setTextureName("metalforgecraft" + ":LeadShovel");
		public static Item MFCLeadPickaxe = new MFCLeadPickaxe(MFCLeadMat).setUnlocalizedName("MFCLeadPickaxe").setTextureName("metalforgecraft" + ":LeadHoe");
		public static Item MFCLeadHoe = new MFCLeadHoe(MFCLeadMat).setUnlocalizedName("MFCLeadHoe").setTextureName("metalforgecraft" + ":");

		//Nickel tools
		
		public static Item MFCMagnesiumAxe = new MFCMagnesiumAxe(MFCMagnesiumMat).setUnlocalizedName("MFCMagnesiumAxe").setTextureName("metalforgecraft" + ":MagnesiumAxe");
		public static Item MFCMagnesiumSword = new MFCMagnesiumSword(MFCMagnesiumMat).setUnlocalizedName("MFCMagnesiumSword").setTextureName("metalforgecraft" + ":MagnesiumSword");
		public static Item MFCMagnesiumShovel = new MFCMagnesiumShovel(MFCMagnesiumMat).setUnlocalizedName("MFCMagnesiumShovel").setTextureName("metalforgecraft" + ":MagnesiumShovel");
		public static Item MFCMagnesiumPickaxe = new MFCMagnesiumPickaxe(MFCMagnesiumMat).setUnlocalizedName("MFCMagnesiumPickaxe").setTextureName("metalforgecraft" + ":MagnesiumPickaxe");
		public static Item MFCMagnesiumHoe = new MFCMagnesiumHoe(MFCMagnesiumMat).setUnlocalizedName("MFCMagnesiumHoe").setTextureName("metalforgecraft" + ":MagnesiumHoe");
		
		//Nickel tools
		
		public static Item MFCNickelAxe = new MFCNickelAxe(MFCNickelMat).setUnlocalizedName("MFCNickelAxe").setTextureName("metalforgecraft" + ":NickelAxe");
		public static Item MFCNickelSword = new MFCNickelSword(MFCNickelMat).setUnlocalizedName("MFCNickelSword").setTextureName("metalforgecraft" + ":NickelSword");
		public static Item MFCNickelShovel = new MFCNickelShovel(MFCNickelMat).setUnlocalizedName("MFCNickelShovel").setTextureName("metalforgecraft" + ":NickelShovel");
		public static Item MFCNickelPickaxe = new MFCNickelPickaxe(MFCNickelMat).setUnlocalizedName("MFCNickelPickaxe").setTextureName("metalforgecraft" + ":NickelPickaxe");
		public static Item MFCNickelHoe = new MFCNickelHoe(MFCNickelMat).setUnlocalizedName("MFCNickelHoe").setTextureName("metalforgecraft" + ":NickelHoe");
		
		//Osmium tools
		
		public static Item MFCOsmiumAxe = new MFCOsmiumAxe(MFCOsmiumMat).setUnlocalizedName("MFCOsmiumAxe").setTextureName("metalforgecraft" + ":OsmiumAxe");
		public static Item MFCOsmiumSword = new MFCOsmiumSword(MFCOsmiumMat).setUnlocalizedName("MFCOsmiumSword").setTextureName("metalforgecraft" + ":OsmiumSword");
		public static Item MFCOsmiumShovel = new MFCOsmiumShovel(MFCOsmiumMat).setUnlocalizedName("MFCOsmiumShovel").setTextureName("metalforgecraft" + ":OsmiumShovel");
		public static Item MFCOsmiumPickaxe = new MFCOsmiumPickaxe(MFCOsmiumMat).setUnlocalizedName("MFCOsmiumPickaxe").setTextureName("metalforgecraft" + ":OsmiumPickaxe");
		public static Item MFCOsmiumHoe = new MFCOsmiumHoe(MFCOsmiumMat).setUnlocalizedName("MFCOsmiumHoe").setTextureName("metalforgecraft" + ":OsmiumHoe");
		
		//Platinum tools
		
		public static Item MFCPlatinumAxe = new MFCPlatinumAxe(MFCPlatinumMat).setUnlocalizedName("MFCPlatinumAxe").setTextureName("metalforgecraft" + ":PlatinumAxe");
		public static Item MFCPlatinumSword = new MFCPlatinumSword(MFCPlatinumMat).setUnlocalizedName("MFCPlatinumSword").setTextureName("metalforgecraft" + ":PlatinumSword");
		public static Item MFCPlatinumShovel = new MFCPlatinumShovel(MFCPlatinumMat).setUnlocalizedName("MFCPlatinumShovel").setTextureName("metalforgecraft" + ":PlatinumShovel");
		public static Item MFCPlatinumPickaxe = new MFCPlatinumPickaxe(MFCPlatinumMat).setUnlocalizedName("MFCPlatinumPickaxe").setTextureName("metalforgecraft" + ":PlatinumPickaxe");
		public static Item MFCPlatinumHoe = new MFCPlatinumHoe(MFCPlatinumMat).setUnlocalizedName("MFCPlatinumHoe").setTextureName("metalforgecraft" + ":PlatinumHoe");
		
		//Silver tools
		
		public static Item MFCSilverAxe = new MFCSilverAxe(MFCSilverMat).setUnlocalizedName("MFCSilverAxe").setTextureName("metalforgecraft" + ":SilverAxe");
		public static Item MFCSilverSword = new MFCSilverSword(MFCSilverMat).setUnlocalizedName("MFCSilverSword").setTextureName("metalforgecraft" + ":SilverSword");
		public static Item MFCSilverShovel = new MFCSilverShovel(MFCSilverMat).setUnlocalizedName("MFCSilverShovel").setTextureName("metalforgecraft" + ":SilverShovel");
		public static Item MFCSilverPickaxe = new MFCSilverPickaxe(MFCSilverMat).setUnlocalizedName("MFCSilverPickaxe").setTextureName("metalforgecraft" + ":SilverPickaxe");
		public static Item MFCSilverHoe = new MFCSilverHoe(MFCSilverMat).setUnlocalizedName("MFCSilverHoe").setTextureName("metalforgecraft" + ":SilverHoe");
		
		//Tin tools
		
		public static Item MFCTinAxe = new MFCTinAxe(MFCTinMat).setUnlocalizedName("MFCTinAxe").setTextureName("metalforgecraft" + ":TinAxe");
		public static Item MFCTinSword = new MFCTinSword(MFCTinMat).setUnlocalizedName("MFCTinSword").setTextureName("metalforgecraft" + ":TinSword");
		public static Item MFCTinShovel = new MFCTinShovel(MFCTinMat).setUnlocalizedName("MFCTinShovel").setTextureName("metalforgecraft" + ":TinShovel");
		public static Item MFCTinPickaxe = new MFCTinPickaxe(MFCTinMat).setUnlocalizedName("MFCTinPickaxe").setTextureName("metalforgecraft" + ":TinPickaxe");
		public static Item MFCTinHoe = new MFCTinHoe(MFCTinMat).setUnlocalizedName("MFCTinHoe").setTextureName("metalforgecraft" + ":TinHoe");
		
		//Tungsten tools
		
		public static Item MFCTungstenAxe = new MFCTungstenAxe(MFCTungstenMat).setUnlocalizedName("MFCTungstenAxe").setTextureName("metalforgecraft" + ":TungstenAxe");
		public static Item MFCTungstenSword = new MFCTungstenSword(MFCTungstenMat).setUnlocalizedName("MFCTungstenSword").setTextureName("metalforgecraft" + ":TungstenSword");
		public static Item MFCTungstenShovel = new MFCTungstenShovel(MFCTungstenMat).setUnlocalizedName("MFCTungstenShovel").setTextureName("metalforgecraft" + ":TungstenShovel");
		public static Item MFCTungstenPickaxe = new MFCTungstenPickaxe(MFCTungstenMat).setUnlocalizedName("MFCTungstenPickaxe").setTextureName("metalforgecraft" + ":TungstenPickaxe");
		public static Item MFCTungstenHoe = new MFCTungstenHoe(MFCTungstenMat).setUnlocalizedName("MFCTungstenHoe").setTextureName("metalforgecraft" + ":TungstenHoe");
		
		//Zinc tools
		
		public static Item MFCZincAxe = new MFCZincAxe(MFCZincMat).setUnlocalizedName("MFCZincAxe").setTextureName("metalforgecraft" + ":ZincAxe");
		public static Item MFCZincSword = new MFCZincSword(MFCZincMat).setUnlocalizedName("MFCZincSword").setTextureName("metalforgecraft" + ":ZincSword");
		public static Item MFCZincShovel = new MFCZincShovel(MFCZincMat).setUnlocalizedName("MFCZincShovel").setTextureName("metalforgecraft" + ":ZincShovel");
		public static Item MFCZincPickaxe = new MFCZincPickaxe(MFCZincMat).setUnlocalizedName("MFCZincPickaxe").setTextureName("metalforgecraft" + ":ZincPickaxe");
		public static Item MFCZincHoe = new MFCZincHoe(MFCZincMat).setUnlocalizedName("MFCZincHoe").setTextureName("metalforgecraft" + ":ZincHoe");
		

		
		//Healing herbs
		
			public static Item MFCAloe;
			public static Item MFCArnica;
			public static Item MFCGinger;
			public static Item MFCPepermint;
			public static Item MFCPeperminttea;
			public static Item MFCPepermintoil;
			public static Item MFCTeatreeoil;
			public static Item MFCHerbaltea;
			
			public static Block MFCAloevera;
			public static Block MFCArnicaflower;
			public static Block MFCWildGinger;
			public static Block MFCWildPeppermint;
			
			//Machines
			public static Block MFCSmelter;
			public static Block MFCSmelteractive;
			
			//Fluids
			public static Block MFCCrudeOil;
			public static Fluid CrudeOil;
			public static Material materialOil;
			
			public static Item MFCOilBucket;
			
			public static Block MFCSolidCrudeOil;
			public static Block MFCOilShale;
			
			
			public static Block MFCShaleOil;
			public static Fluid ShaleOil;
			
			public static Item MFCShaleOilBucket;
			
			public static CreativeTabs MFC = new CreativeTabs("Ices Minecraft Expansion"){
				public Item getTabIconItem() {
					return Items.minecart;
				}
				
			};
			
	
	
	public void preinit(FMLPreInitializationEvent e){
		//Fluid related (Do in order)
				CrudeOil = new Fluid("CrudeOil").setDensity(2000);
				FluidRegistry.registerFluid(CrudeOil);
				materialOil = new MaterialLiquid(MapColor.obsidianColor);
				MFCCrudeOil = new MFCCrudeOil(CrudeOil, materialOil).setBlockName("MFCCrudeOil").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":CrudeOilStill");
				GameRegistry.registerBlock(MFCCrudeOil, "MFCCrudeOil");
				
				MFCOilBucket = new MFCOilBucket(MFCCrudeOil).setUnlocalizedName("MFCOilBucket").setMaxStackSize(1).setContainerItem(Items.bucket).setTextureName("metalforgecraft" + ":OilBucket");
				GameRegistry.registerItem(MFCOilBucket, "MFCOilBucket");
				
				MFCSolidCrudeOil = new MFCSolidCrudeOil().setBlockName("MFCSolidCrudeOil").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":CrudeOilStill");
				GameRegistry.registerBlock(MFCSolidCrudeOil, "MFCSolidCrudeOil");
				MFCOilShale = new MFCOilShale().setBlockName("MFCOilShale").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":OilShale");
				GameRegistry.registerBlock(MFCOilShale, "MFCOilShale");
				
				
				ShaleOil = new Fluid("ShaleOil").setDensity(2000);
				FluidRegistry.registerFluid(ShaleOil);
				MFCShaleOil = new MFCShaleOil(ShaleOil, materialOil).setBlockName("MFCShaleOil").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":CrudeOilStill");
				GameRegistry.registerBlock(MFCShaleOil, "MFCShaleOil");
				
				MFCShaleOilBucket = new MFCShaleOilBucket(MFCShaleOil).setUnlocalizedName("MFCShaleOilBucket").setMaxStackSize(1).setContainerItem(Items.bucket).setTextureName("metalforgecraft" + ":OilBucket");
				GameRegistry.registerItem(MFCShaleOilBucket, "MFCShaleOilBucket");
				
				//Machines
				MFCSmelter = new MFCSmelter(false).setBlockName("MFCSmelter").setCreativeTab(MFC).setStepSound(Block.soundTypeStone).setBlockTextureName("metalforgecraft" + ":Smelteroff");
				GameRegistry.registerBlock(MFCSmelter, "MFCSmelter");
				MFCSmelteractive = new MFCSmelter(true).setBlockName("MFCSmelterActive").setStepSound(Block.soundTypeStone).setBlockTextureName("metalforgecraft" + ":Smelteron");
				GameRegistry.registerBlock(MFCSmelteractive, "MFCSmelterActive");
				
				

				
				
				//Herbs - Items
				
				MFCAloe = new MFCAloe(1, 0.2F, false).setUnlocalizedName("MFCAloe").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":Aloe");
				GameRegistry.registerItem(MFCAloe, "MFCAloe");
				
				MFCArnica = new MFCArnica(1, 0.2F, false).setUnlocalizedName("MFCArnica").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":Arnica");
				GameRegistry.registerItem(MFCArnica, "MFCArnica");
				
				MFCGinger = new MFCGinger(1, 0.2F, false).setUnlocalizedName("MFCGinger").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":Ginger");
				GameRegistry.registerItem(MFCGinger, "MFCGinger");
				
				MFCPepermint = new MFCPepermint(1, 0.2F, false).setUnlocalizedName("MFCPepermint").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":Peppermint");
				GameRegistry.registerItem(MFCPepermint, "MFCPepermint");
				
				MFCPeperminttea = new MFCPeperminttea(1, 0.2F, false).setUnlocalizedName("MFCPeperminttea").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":Pepperminttea");
				GameRegistry.registerItem(MFCPeperminttea, "MFCPeperminttea");
				
				MFCPepermintoil = new MFCPepermintoil(1, 0.2F, false).setUnlocalizedName("MFCPepermintoil").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":Peppermintoil");
				GameRegistry.registerItem(MFCPepermintoil, "MFCPepermintoil");
				
				MFCTeatreeoil = new MFCTeatreeoil(1, 0.2F, false).setUnlocalizedName("MFCTeatreeoil").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":Teatreeoil");
				GameRegistry.registerItem(MFCTeatreeoil, "MFCTeatreeoil");
				
				MFCHerbaltea = new MFCHerbaltea(6, 1.0F, false).setUnlocalizedName("MFCHerbaltea").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":Herbaltea");
				GameRegistry.registerItem(MFCHerbaltea, "MFCHerbaltea");
				
				//Herbs - Blocks
				
				//MFCAloevera = new MFCAloevera(9010).setBlockName("MFCAloevera").setCreativeTab(MFC).setHardness(0).setStepSound(Block.soundTypeGrass).setBlockTextureName("metalforgecraft" + ":Aloevera");
				//GameRegistry.registerBlock(MFCAloevera, "MFCAloevera");
				
				//MFCArnicaflower = new MFCArnicaflower(9011).setBlockName("MFCArnicaflower").setCreativeTab(MFC).setHardness(0).setStepSound(Block.soundTypeGrass).setBlockTextureName("metalforgecraft" + ":Arnicaflower");
				//GameRegistry.registerBlock(MFCArnicaflower, "MFCArnicaflower");
				
				//MFCWildGinger = new MFCWildGinger(9013).setBlockName("MFCWildGinger").setCreativeTab(MFC).setHardness(0).setStepSound(Block.soundTypeGrass).setBlockTextureName("metalforgecraft" + ":WildGinger");
				//GameRegistry.registerBlock(MFCWildGinger, "MFCWildGinger");
				
				//MFCWildPeppermint = new MFCWildPeppermint(9014).setBlockName("MFCWildPeppermint").setCreativeTab(MFC).setHardness(0).setStepSound(Block.soundTypeGrass).setBlockTextureName("metalforgecraft" + ":WildPeppermint");
				//GameRegistry.registerBlock(MFCWildPeppermint, "MFCWildPeppermint");
				
				
				
				
				
				
				
				
				
				//Items - Metal
				
				mfcingotbrass = new Item().setUnlocalizedName("mfcingotbrass").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_brass");
				GameRegistry.registerItem(mfcingotbrass, "mfcingotbrass");
				
				mfcingotbrasscast = new Item().setUnlocalizedName("mfcingotbrasscast").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_brasscast");
				GameRegistry.registerItem(mfcingotbrasscast, "mfcingotbrasscast");
				
				mfcingotchromium = new Item().setUnlocalizedName("mfcingotchromium").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_chromium");
				GameRegistry.registerItem(mfcingotchromium, "mfcingotchromium");
				
				mfcingotaluminium = new Item().setUnlocalizedName("mfcingotaluminium").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_aluminium");
				GameRegistry.registerItem(mfcingotaluminium, "mfcingotaluminium");
				
				mfcingotbismuth = new Item().setUnlocalizedName("mfcingotbismuth").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_bismuth");
				GameRegistry.registerItem(mfcingotbismuth, "mfcingotbismuth");
				
				mfcingotcalcium = new Item().setUnlocalizedName("mfcingotcalcium").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_calcium");
				GameRegistry.registerItem(mfcingotcalcium, "mfcingotcalcium");
				
				mfcingotcobalt = new Item().setUnlocalizedName("mfcingotcobalt").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_cobalt");
				GameRegistry.registerItem(mfcingotcobalt, "mfcingotcobalt");
				
				mfcingotcopper = new Item().setUnlocalizedName("mfcingotcopper").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_copper");
				GameRegistry.registerItem(mfcingotcopper, "mfcingotcopper");
				
				mfcingotlead = new Item().setUnlocalizedName("mfcingotlead").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_lead");
				GameRegistry.registerItem(mfcingotlead, "mfcingotlead");
				
				mfcingotmagnesium = new Item().setUnlocalizedName("mfcingotmagnesium").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_magnesium");
				GameRegistry.registerItem(mfcingotmagnesium, "mfcingotmagnesium");
				
				mfcingotnickel = new Item().setUnlocalizedName("mfcingotnickel").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_nickel");
				GameRegistry.registerItem(mfcingotnickel, "mfcingotnickel");
				
				mfcingotplatinum = new Item().setUnlocalizedName("mfcingotplatinum").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_platinum");
				GameRegistry.registerItem(mfcingotplatinum, "mfcingotplatinum");
				
				mfcingotosmium = new Item().setUnlocalizedName("mfcingotosmium").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_osmium");
				GameRegistry.registerItem(mfcingotosmium, "mfcingotosmium");
				
				mfcingotsilver = new Item().setUnlocalizedName("mfcingotsilver").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_silver");
				GameRegistry.registerItem(mfcingotsilver, "mfcingotsilver");
				
				mfcingottin = new Item().setUnlocalizedName("mfcingottin").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_tin");
				GameRegistry.registerItem(mfcingottin, "mfcingottin");
				
				mfcingottungsten = new Item().setUnlocalizedName("mfcingottungsten").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_tungsten");
				GameRegistry.registerItem(mfcingottungsten, "mfcingottungsten");
				
				mfcingotzinc = new Item().setUnlocalizedName("mfcingotzinc").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":ingot_zinc");
				GameRegistry.registerItem(mfcingotzinc, "mfcingotzinc");
				
				mfccrystalcinnabar = new Item().setUnlocalizedName("mfccrystalcinnabar").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":gem_cinnabar");
				GameRegistry.registerItem(mfccrystalcinnabar, "mfccrystalcinnabar");
				
				mfcalloycast = new Item().setUnlocalizedName("mfcalloycast").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":cast_alloy");
				GameRegistry.registerItem(mfcalloycast, "mfcalloycast");
				
				mfcrawalloycast = new Item().setUnlocalizedName("mfcrawalloycast").setCreativeTab(MFC).setTextureName("metalforgecraft" + ":cast_rawalloy");
				GameRegistry.registerItem(mfcrawalloycast, "mfcrawalloycast");
				
				//Armour
				
				
				MFCAluminiumHelmet = new MFCAluminiumArmor(MFCAluminiumArmorMat, MFCAluminiumhelmetID, 0).setUnlocalizedName("MFCAluminiumHelmet").setTextureName("metalforgecraft" + ":AluminiumHelmet");
				MFCAluminiumChestplate = new MFCAluminiumArmor(MFCAluminiumArmorMat, MFCAluminiumchestplateID, 1).setUnlocalizedName("MFCAluminiumChestplate").setTextureName("metalforgecraft" + ":AluminiumChestplate");
				MFCAluminiumLeggings = new MFCAluminiumArmor(MFCAluminiumArmorMat, MFCAluminiumleggingsID, 2).setUnlocalizedName("MFCAluminiumLeggings").setTextureName("metalforgecraft" + ":AluminiumLeggings");
				MFCAluminiumBoots = new MFCAluminiumArmor(MFCAluminiumArmorMat, MFCAluminiumbootsID, 3).setUnlocalizedName("MFCAluminiumBoots").setTextureName("metalforgecraft" + ":AluminiumBoots");
				
				MFCBismuthHelmet = new MFCBismuthArmor(MFCBismuthArmorMat, MFCBismuthhelmetID, 0).setUnlocalizedName("MFCBismuthHelmet").setTextureName("metalforgecraft" + ":BismuthHelmet");
				MFCBismuthChestplate = new MFCBismuthArmor(MFCBismuthArmorMat, MFCBismuthchestplateID, 1).setUnlocalizedName("MFCBismuthChestplate").setTextureName("metalforgecraft" + ":BismuthChestplate");
				MFCBismuthLeggings = new MFCBismuthArmor(MFCBismuthArmorMat, MFCBismuthleggingsID, 2).setUnlocalizedName("MFCBismuthLeggings").setTextureName("metalforgecraft" + ":BismuthLeggings");
				MFCBismuthBoots = new MFCBismuthArmor(MFCBismuthArmorMat, MFCBismuthbootsID, 3).setUnlocalizedName("MFCBismuthBoots").setTextureName("metalforgecraft" + ":BismuthBoots");
				
				MFCZincHelmet = new MFCZincArmor(MFCZincArmorMat, MFCZinchelmetID, 0).setUnlocalizedName("MFCZincHelmet").setTextureName("metalforgecraft" + ":ZincHelmet");
				MFCZincChestplate = new MFCZincArmor(MFCZincArmorMat, MFCZincchestplateID, 1).setUnlocalizedName("MFCZincChestplate").setTextureName("metalforgecraft" + ":ZincChestplate");
				MFCZincLeggings = new MFCZincArmor(MFCZincArmorMat, MFCZincleggingsID, 2).setUnlocalizedName("MFCZincLeggings").setTextureName("metalforgecraft" + ":ZincLeggings");
				MFCZincBoots = new MFCZincArmor(MFCZincArmorMat, MFCZincbootsID, 3).setUnlocalizedName("MFCZincBoots").setTextureName("metalforgecraft" + ":ZincBoots");
				
				MFCCalciumHelmet = new MFCCalciumArmor(MFCCalciumArmorMat, MFCCalciumhelmetID, 0).setUnlocalizedName("MFCCalciumHelmet").setTextureName("metalforgecraft" + ":CalciumHelmet");
				MFCCalciumChestplate = new MFCCalciumArmor(MFCCalciumArmorMat, MFCCalciumchestplateID, 1).setUnlocalizedName("MFCCalciumChestplate").setTextureName("metalforgecraft" + ":CalciumChestplate");
				MFCCalciumLeggings = new MFCCalciumArmor(MFCCalciumArmorMat, MFCCalciumleggingsID, 2).setUnlocalizedName("MFCCalciumLeggings").setTextureName("metalforgecraft" + ":CalciumLeggings");
				MFCCalciumBoots = new MFCCalciumArmor(MFCCalciumArmorMat, MFCCalciumbootsID, 3).setUnlocalizedName("MFCCalciumBoots").setTextureName("metalforgecraft" + ":CalciumBoots");
				
				MFCCobaltHelmet = new MFCCobaltArmor(MFCCobaltArmorMat, MFCCobalthelmetID, 0).setUnlocalizedName("MFCCobaltHelmet").setTextureName("metalforgecraft" + ":CobaltHelmet");
				MFCCobaltChestplate = new MFCCobaltArmor(MFCCobaltArmorMat, MFCCobaltchestplateID, 1).setUnlocalizedName("MFCCobaltChestplate").setTextureName("metalforgecraft" + ":CobaltChestplate");
				MFCCobaltLeggings = new MFCCobaltArmor(MFCCobaltArmorMat, MFCCobaltleggingsID, 2).setUnlocalizedName("MFCCobaltLeggings").setTextureName("metalforgecraft" + ":CobaltLeggings");
				MFCCobaltBoots = new MFCCobaltArmor(MFCCobaltArmorMat, MFCCobaltbootsID, 3).setUnlocalizedName("MFCCobaltBoots").setTextureName("metalforgecraft" + ":CobaltBoots");
				
				MFCCopperHelmet = new MFCCopperArmor(MFCCopperArmorMat, MFCCopperhelmetID, 0).setUnlocalizedName("MFCCopperHelmet").setTextureName("metalforgecraft" + ":CopperHelmet");
				MFCCopperChestplate = new MFCCopperArmor(MFCCopperArmorMat, MFCCopperchestplateID, 1).setUnlocalizedName("MFCCopperChestplate").setTextureName("metalforgecraft" + ":CopperChestplate");
				MFCCopperLeggings = new MFCCopperArmor(MFCCopperArmorMat, MFCCopperleggingsID, 2).setUnlocalizedName("MFCCopperLeggings").setTextureName("metalforgecraft" + ":CopperLeggings");
				MFCCopperBoots = new MFCCopperArmor(MFCCopperArmorMat, MFCCopperbootsID, 3).setUnlocalizedName("MFCCopperBoots").setTextureName("metalforgecraft" + ":CopperBoots");
				
				MFCLeadHelmet = new MFCLeadArmor(MFCLeadArmorMat, MFCLeadhelmetID, 0).setUnlocalizedName("MFCLeadHelmet").setTextureName("metalforgecraft" + ":LeadHelmet");
				MFCLeadChestplate = new MFCLeadArmor(MFCLeadArmorMat, MFCLeadchestplateID, 1).setUnlocalizedName("MFCLeadChestplate").setTextureName("metalforgecraft" + ":LeadChestplate");
				MFCLeadLeggings = new MFCLeadArmor(MFCLeadArmorMat, MFCLeadleggingsID, 2).setUnlocalizedName("MFCLeadLeggings").setTextureName("metalforgecraft" + ":LeadLeggings");
				MFCLeadBoots = new MFCLeadArmor(MFCLeadArmorMat, MFCLeadbootsID, 3).setUnlocalizedName("MFCLeadBoots").setTextureName("metalforgecraft" + ":LeadBoots");
				
				MFCMagnesiumHelmet = new MFCMagnesiumArmor(MFCMagnesiumArmorMat, MFCMagnesiumhelmetID, 0).setUnlocalizedName("MFCMagnesiumHelmet").setTextureName("metalforgecraft" + ":MagnesiumHelmet");
				MFCMagnesiumChestplate = new MFCMagnesiumArmor(MFCMagnesiumArmorMat, MFCMagnesiumchestplateID, 1).setUnlocalizedName("MFCMagnesiumChestplate").setTextureName("metalforgecraft" + ":MagnesiumChestplate");
				MFCMagnesiumLeggings = new MFCMagnesiumArmor(MFCMagnesiumArmorMat, MFCMagnesiumleggingsID, 2).setUnlocalizedName("MFCMagnesiumLeggings").setTextureName("metalforgecraft" + ":MagnesiumLeggings");
				MFCMagnesiumBoots = new MFCMagnesiumArmor(MFCMagnesiumArmorMat, MFCMagnesiumbootsID, 3).setUnlocalizedName("MFCMagnesiumBoots").setTextureName("metalforgecraft" + ":MagnesiumBoots");
				
				MFCNickelHelmet = new MFCNickelArmor(MFCNickelArmorMat, MFCNickelhelmetID, 0).setUnlocalizedName("MFCNickelHelmet").setTextureName("metalforgecraft" + ":NickelHelmet");
				MFCNickelChestplate = new MFCNickelArmor(MFCNickelArmorMat, MFCNickelchestplateID, 1).setUnlocalizedName("MFCNickelChestplate").setTextureName("metalforgecraft" + ":NickelChestplate");
				MFCNickelLeggings = new MFCNickelArmor(MFCNickelArmorMat, MFCNickelleggingsID, 2).setUnlocalizedName("MFCNickelLeggings").setTextureName("metalforgecraft" + ":NickelLeggings");
				MFCNickelBoots = new MFCNickelArmor(MFCNickelArmorMat, MFCNickelbootsID, 3).setUnlocalizedName("MFCNickelBoots").setTextureName("metalforgecraft" + ":NickelBoots");
				
				MFCOsmiumHelmet = new MFCOsmiumArmor(MFCOsmiumArmorMat, MFCOsmiumhelmetID, 0).setUnlocalizedName("MFCOsmiumHelmet").setTextureName("metalforgecraft" + ":OsmiumHelmet");
				MFCOsmiumChestplate = new MFCOsmiumArmor(MFCOsmiumArmorMat, MFCOsmiumchestplateID, 1).setUnlocalizedName("MFCOsmiumChestplate").setTextureName("metalforgecraft" + ":OsmiumChestplate");
				MFCOsmiumLeggings = new MFCOsmiumArmor(MFCOsmiumArmorMat, MFCOsmiumleggingsID, 2).setUnlocalizedName("MFCOsmiumLeggings").setTextureName("metalforgecraft" + ":OsmiumLeggings");
				MFCOsmiumBoots = new MFCOsmiumArmor(MFCOsmiumArmorMat, MFCOsmiumbootsID, 3).setUnlocalizedName("MFCOsmiumBoots").setTextureName("metalforgecraft" + ":OsmiumBoots");
				
				MFCPlatinumHelmet = new MFCPlatinumArmor(MFCPlatinumArmorMat, MFCPlatinumhelmetID, 0).setUnlocalizedName("MFCPlatinumHelmet").setTextureName("metalforgecraft" + ":PlatinumHelmet");
				MFCPlatinumChestplate = new MFCPlatinumArmor(MFCPlatinumArmorMat, MFCPlatinumchestplateID, 1).setUnlocalizedName("MFCPlatinumChestplate").setTextureName("metalforgecraft" + ":PlatinumChestplate");
				MFCPlatinumLeggings = new MFCPlatinumArmor(MFCPlatinumArmorMat, MFCPlatinumleggingsID, 2).setUnlocalizedName("MFCPlatinumLeggings").setTextureName("metalforgecraft" + ":PlatinumLeggings");
				MFCPlatinumBoots = new MFCPlatinumArmor(MFCPlatinumArmorMat, MFCPlatinumbootsID, 3).setUnlocalizedName("MFCPlatinumBoots").setTextureName("metalforgecraft" + ":PlatinumBoots");
				
				MFCSilverHelmet = new MFCSilverArmor(MFCSilverArmorMat, MFCSilverhelmetID, 0).setUnlocalizedName("MFCSilverHelmet").setTextureName("metalforgecraft" + ":SilverHelmet");
				MFCSilverChestplate = new MFCSilverArmor(MFCSilverArmorMat, MFCSilverchestplateID, 1).setUnlocalizedName("MFCSilverChestplate").setTextureName("metalforgecraft" + ":SilverChestplate");
				MFCSilverLeggings = new MFCSilverArmor(MFCSilverArmorMat, MFCSilverleggingsID, 2).setUnlocalizedName("MFCSilverLeggings").setTextureName("metalforgecraft" + ":SilverLeggings");
				MFCSilverBoots = new MFCSilverArmor(MFCSilverArmorMat, MFCSilverbootsID, 3).setUnlocalizedName("MFCSilverBoots").setTextureName("metalforgecraft" + ":SilverBoots");
				
				MFCTinHelmet = new MFCTinArmor(MFCTinArmorMat, MFCTinhelmetID, 0).setUnlocalizedName("MFCTinHelmet").setTextureName("metalforgecraft" + ":TinHelmet");
				MFCTinChestplate = new MFCTinArmor(MFCTinArmorMat, MFCTinchestplateID, 1).setUnlocalizedName("MFCTinChestplate").setTextureName("metalforgecraft" + ":TinChestplate");
				MFCTinLeggings = new MFCTinArmor(MFCTinArmorMat, MFCTinleggingsID, 2).setUnlocalizedName("MFCTinLeggings").setTextureName("metalforgecraft" + ":TinLeggings");
				MFCTinBoots = new MFCTinArmor(MFCTinArmorMat, MFCTinbootsID, 3).setUnlocalizedName("MFCTinBoots").setTextureName("metalforgecraft" + ":TinBoots");
				
				MFCTungstenHelmet = new MFCTungstenArmor(MFCTungstenArmorMat, MFCTungstenhelmetID, 0).setUnlocalizedName("MFCTungstenHelmet").setTextureName("metalforgecraft" + ":TungstenHelmet");
				MFCTungstenChestplate = new MFCTungstenArmor(MFCTungstenArmorMat, MFCTungstenchestplateID, 1).setUnlocalizedName("MFCTungstenChestplate").setTextureName("metalforgecraft" + ":TungstenChestplate");
				MFCTungstenLeggings = new MFCTungstenArmor(MFCTungstenArmorMat, MFCTungstenleggingsID, 2).setUnlocalizedName("MFCTungstenLeggings").setTextureName("metalforgecraft" + ":TungstenLeggings");
				MFCTungstenBoots = new MFCTungstenArmor(MFCTungstenArmorMat, MFCTungstenbootsID, 3).setUnlocalizedName("MFCTungstenBoots").setTextureName("metalforgecraft" + ":TungstenBoots");
				
				
				//Tools
				
				MFCAluminiumAxe = new MFCAluminiumAxe(MFCAluminiumMat).setUnlocalizedName("MFCAluminiumAxe").setTextureName("metalforgecraft" + ":AluminiumAxe");
				MFCAluminiumSword = new MFCAluminiumSword(MFCAluminiumMat).setUnlocalizedName("MFCAluminiumSword").setTextureName("metalforgecraft" + ":AluminiumSword");
				MFCAluminiumShovel = new MFCAluminiumShovel(MFCAluminiumMat).setUnlocalizedName("MFCAluminiumShovel").setTextureName("metalforgecraft" + ":AluminiumShovel");
				MFCAluminiumPickaxe = new MFCAluminiumPickaxe(MFCAluminiumMat).setUnlocalizedName("MFCAluminiumPickaxe").setTextureName("metalforgecraft" + ":AluminiumPickaxe");
				MFCAluminiumHoe = new MFCAluminiumHoe(MFCAluminiumMat).setUnlocalizedName("MFCAluminiumHoe").setTextureName("metalforgecraft" + ":AluminiumHoe");
				
				MFCBismuthAxe = new MFCBismuthAxe(MFCBismuthMat).setUnlocalizedName("MFCBismuthAxe").setTextureName("metalforgecraft" + ":BismuthAxe");
				MFCBismuthSword = new MFCBismuthSword(MFCBismuthMat).setUnlocalizedName("MFCBismuthSword").setTextureName("metalforgecraft" + ":BismuthSword");
				MFCBismuthShovel = new MFCBismuthShovel(MFCBismuthMat).setUnlocalizedName("MFCBismuthShovel").setTextureName("metalforgecraft" + ":BismuthShovel");
				MFCBismuthPickaxe = new MFCBismuthPickaxe(MFCBismuthMat).setUnlocalizedName("MFCBismuthPickaxe").setTextureName("metalforgecraft" + ":BismuthPickaxe");
				MFCBismuthHoe = new MFCBismuthHoe(MFCBismuthMat).setUnlocalizedName("MFCBismuthHoe").setTextureName("metalforgecraft" + ":BismuthHoe");
				
				MFCCalciumAxe = new MFCCalciumAxe(MFCCalciumMat).setUnlocalizedName("MFCCalciumAxe").setTextureName("metalforgecraft" + ":CalciumAxe");
				MFCCalciumSword = new MFCCalciumSword(MFCCalciumMat).setUnlocalizedName("MFCCalciumSword").setTextureName("metalforgecraft" + ":CalciumSword");
				MFCCalciumShovel = new MFCCalciumShovel(MFCCalciumMat).setUnlocalizedName("MFCCalciumShovel").setTextureName("metalforgecraft" + ":CalciumShovel");
				MFCCalciumPickaxe = new MFCCalciumPickaxe(MFCCalciumMat).setUnlocalizedName("MFCCalciumPickaxe").setTextureName("metalforgecraft" + ":CalciumPickaxe");
				MFCCalciumHoe = new MFCCalciumHoe(MFCCalciumMat).setUnlocalizedName("MFCCalciumHoe").setTextureName("metalforgecraft" + ":CalciumHoe");
				
				MFCCobaltAxe = new MFCCobaltAxe(MFCCobaltMat).setUnlocalizedName("MFCCobaltAxe").setTextureName("metalforgecraft" + ":CobaltAxe");
				MFCCobaltSword = new MFCCobaltSword(MFCCobaltMat).setUnlocalizedName("MFCCobaltSword").setTextureName("metalforgecraft" + ":CobaltSword");
				MFCCobaltShovel = new MFCCobaltShovel(MFCCobaltMat).setUnlocalizedName("MFCCobaltShovel").setTextureName("metalforgecraft" + ":CobaltShovel");
				MFCCobaltPickaxe = new MFCCobaltPickaxe(MFCCobaltMat).setUnlocalizedName("MFCCobaltPickaxe").setTextureName("metalforgecraft" + ":CobaltPickaxe");
				MFCCobaltHoe = new MFCCobaltHoe(MFCCobaltMat).setUnlocalizedName("MFCCobaltHoe").setTextureName("metalforgecraft" + ":CobaltHoe");
				
				MFCCopperAxe = new MFCCopperAxe(MFCCopperMat).setUnlocalizedName("MFCCopperAxe").setTextureName("metalforgecraft" + ":CopperAxe");
				MFCCopperSword = new MFCCopperSword(MFCCopperMat).setUnlocalizedName("MFCCopperSword").setTextureName("metalforgecraft" + ":CopperSword");
				MFCCopperShovel = new MFCCopperShovel(MFCCopperMat).setUnlocalizedName("MFCCopperShovel").setTextureName("metalforgecraft" + ":CopperShovel");
				MFCCopperPickaxe = new MFCCopperPickaxe(MFCCopperMat).setUnlocalizedName("MFCCopperPickaxe").setTextureName("metalforgecraft" + ":CopperPickaxe");
				MFCCopperHoe = new MFCCopperHoe(MFCCopperMat).setUnlocalizedName("MFCCopperHoe").setTextureName("metalforgecraft" + ":CopperHoe");
				
				MFCLeadAxe = new MFCLeadAxe(MFCLeadMat).setUnlocalizedName("MFCLeadAxe").setTextureName("metalforgecraft" + ":LeadAxe");
				MFCLeadSword = new MFCLeadSword(MFCLeadMat).setUnlocalizedName("MFCLeadSword").setTextureName("metalforgecraft" + ":LeadSword");
				MFCLeadShovel = new MFCLeadShovel(MFCLeadMat).setUnlocalizedName("MFCLeadShovel").setTextureName("metalforgecraft" + ":LeadShovel");
				MFCLeadPickaxe = new MFCLeadPickaxe(MFCLeadMat).setUnlocalizedName("MFCLeadPickaxe").setTextureName("metalforgecraft" + ":LeadPickaxe");
				MFCLeadHoe = new MFCLeadHoe(MFCLeadMat).setUnlocalizedName("MFCLeadHoe").setTextureName("metalforgecraft" + ":LeadHoe");
				
				MFCMagnesiumAxe = new MFCMagnesiumAxe(MFCMagnesiumMat).setUnlocalizedName("MFCMagnesiumAxe").setTextureName("metalforgecraft" + ":MagnesiumAxe");
				MFCMagnesiumSword = new MFCMagnesiumSword(MFCMagnesiumMat).setUnlocalizedName("MFCMagnesiumSword").setTextureName("metalforgecraft" + ":MagnesiumSword");
				MFCMagnesiumShovel = new MFCMagnesiumShovel(MFCMagnesiumMat).setUnlocalizedName("MFCMagnesiumShovel").setTextureName("metalforgecraft" + ":MagnesiumShovel");
				MFCMagnesiumPickaxe = new MFCMagnesiumPickaxe(MFCMagnesiumMat).setUnlocalizedName("MFCMagnesiumPickaxe").setTextureName("metalforgecraft" + ":MagnesiumPickaxe");
				MFCMagnesiumHoe = new MFCMagnesiumHoe(MFCMagnesiumMat).setUnlocalizedName("MFCMagnesiumHoe").setTextureName("metalforgecraft" + ":MagnesiumHoe");
				
				MFCNickelAxe = new MFCNickelAxe(MFCNickelMat).setUnlocalizedName("MFCNickelAxe").setTextureName("metalforgecraft" + ":NickelAxe");
				MFCNickelSword = new MFCNickelSword(MFCNickelMat).setUnlocalizedName("MFCNickelSword").setTextureName("metalforgecraft" + ":NickelSword");
				MFCNickelShovel = new MFCNickelShovel(MFCNickelMat).setUnlocalizedName("MFCNickelShovel").setTextureName("metalforgecraft" + ":NickelShovel");
				MFCNickelPickaxe = new MFCNickelPickaxe(MFCNickelMat).setUnlocalizedName("MFCNickelPickaxe").setTextureName("metalforgecraft" + ":NickelPickaxe");
				MFCNickelHoe = new MFCNickelHoe(MFCNickelMat).setUnlocalizedName("MFCNickelHoe").setTextureName("metalforgecraft" + ":NickelHoe");
				
				MFCOsmiumAxe = new MFCOsmiumAxe(MFCOsmiumMat).setUnlocalizedName("MFCOsmiumAxe").setTextureName("metalforgecraft" + ":OsmiumAxe");
				MFCOsmiumSword = new MFCOsmiumSword(MFCOsmiumMat).setUnlocalizedName("MFCOsmiumSword").setTextureName("metalforgecraft" + ":OsmiumSword");
				MFCOsmiumShovel = new MFCOsmiumShovel(MFCOsmiumMat).setUnlocalizedName("MFCOsmiumShovel").setTextureName("metalforgecraft" + ":OsmiumShovel");
				MFCOsmiumPickaxe = new MFCOsmiumPickaxe(MFCOsmiumMat).setUnlocalizedName("MFCOsmiumPickaxe").setTextureName("metalforgecraft" + ":OsmiumPickaxe");
				MFCOsmiumHoe = new MFCOsmiumHoe(MFCOsmiumMat).setUnlocalizedName("MFCOsmiumHoe").setTextureName("metalforgecraft" + ":OsmiumHoe");
				
				MFCPlatinumAxe = new MFCPlatinumAxe(MFCPlatinumMat).setUnlocalizedName("MFCPlatinumAxe").setTextureName("metalforgecraft" + ":PlatinumAxe");
				MFCPlatinumSword = new MFCPlatinumSword(MFCPlatinumMat).setUnlocalizedName("MFCPlatinumSword").setTextureName("metalforgecraft" + ":PlatinumSword");
				MFCPlatinumShovel = new MFCPlatinumShovel(MFCPlatinumMat).setUnlocalizedName("MFCPlatinumShovel").setTextureName("metalforgecraft" + ":PlatinumShovel");
				MFCPlatinumPickaxe = new MFCPlatinumPickaxe(MFCPlatinumMat).setUnlocalizedName("MFCPlatinumPickaxe").setTextureName("metalforgecraft" + ":PlatinumPickaxe");
				MFCPlatinumHoe = new MFCPlatinumHoe(MFCPlatinumMat).setUnlocalizedName("MFCPlatinumHoe").setTextureName("metalforgecraft" + ":PlatinumHoe");
				
				MFCSilverAxe = new MFCSilverAxe(MFCSilverMat).setUnlocalizedName("MFCSilverAxe").setTextureName("metalforgecraft" + ":SilverAxe");
				MFCSilverSword = new MFCSilverSword(MFCSilverMat).setUnlocalizedName("MFCSilverSword").setTextureName("metalforgecraft" + ":SilverSword");
				MFCSilverShovel = new MFCSilverShovel(MFCSilverMat).setUnlocalizedName("MFCSilverShovel").setTextureName("metalforgecraft" + ":SilverShovel");
				MFCSilverPickaxe = new MFCSilverPickaxe(MFCSilverMat).setUnlocalizedName("MFCSilverPickaxe").setTextureName("metalforgecraft" + ":SilverPickaxe");
				MFCSilverHoe = new MFCSilverHoe(MFCSilverMat).setUnlocalizedName("MFCSilverHoe").setTextureName("metalforgecraft" + ":SilverHoe");
				
				MFCTinAxe = new MFCTinAxe(MFCTinMat).setUnlocalizedName("MFCTinAxe").setTextureName("metalforgecraft" + ":TinAxe");
				MFCTinSword = new MFCTinSword(MFCTinMat).setUnlocalizedName("MFCTinSword").setTextureName("metalforgecraft" + ":TinSword");
				MFCTinShovel = new MFCTinShovel(MFCTinMat).setUnlocalizedName("MFCTinShovel").setTextureName("metalforgecraft" + ":TinShovel");
				MFCTinPickaxe = new MFCTinPickaxe(MFCTinMat).setUnlocalizedName("MFCTinPickaxe").setTextureName("metalforgecraft" + ":TinPickaxe");
				MFCTinHoe = new MFCTinHoe(MFCTinMat).setUnlocalizedName("MFCTinHoe").setTextureName("metalforgecraft" + ":TinHoe");
				
				MFCTungstenAxe = new MFCTungstenAxe(MFCTungstenMat).setUnlocalizedName("MFCTungstenAxe").setTextureName("metalforgecraft" + ":TungstenAxe");
				MFCTungstenSword = new MFCTungstenSword(MFCTungstenMat).setUnlocalizedName("MFCTungstenSword").setTextureName("metalforgecraft" + ":TungstenSword");
				MFCTungstenShovel = new MFCTungstenShovel(MFCTungstenMat).setUnlocalizedName("MFCTungstenShovel").setTextureName("metalforgecraft" + ":TungstenShovel");
				MFCTungstenPickaxe = new MFCTungstenPickaxe(MFCTungstenMat).setUnlocalizedName("MFCTungstenPickaxe").setTextureName("metalforgecraft" + ":TungstenPickaxe");
				MFCTungstenHoe = new MFCTungstenHoe(MFCTungstenMat).setUnlocalizedName("MFCTungstenHoe").setTextureName("metalforgecraft" + ":TungstenHoe");
				
				MFCZincAxe = new MFCZincAxe(MFCZincMat).setUnlocalizedName("MFCZincAxe").setTextureName("metalforgecraft" + ":ZincAxe");
				MFCZincSword = new MFCZincSword(MFCZincMat).setUnlocalizedName("MFCZincSword").setTextureName("metalforgecraft" + ":ZincSword");
				MFCZincShovel = new MFCZincShovel(MFCZincMat).setUnlocalizedName("MFCZincShovel").setTextureName("metalforgecraft" + ":ZincShovel");
				MFCZincPickaxe = new MFCZincPickaxe(MFCZincMat).setUnlocalizedName("MFCZincPickaxe").setTextureName("metalforgecraft" + ":ZincPickaxe");
				MFCZincHoe = new MFCZincHoe(MFCZincMat).setUnlocalizedName("MFCZincHoe").setTextureName("metalforgecraft" + ":ZincHoe");
				
				//Tool registry
				
				GameRegistry.registerItem(MFCAluminiumAxe, "MFCAluminiumAxe");
				GameRegistry.registerItem(MFCAluminiumSword, "MFCAluminiumSword");
				GameRegistry.registerItem(MFCAluminiumShovel, "MFCAluminiumShovel");
				GameRegistry.registerItem(MFCAluminiumPickaxe, "MFCAluminiumPickaxe");
				GameRegistry.registerItem(MFCAluminiumHoe, "MFCAluminiumHoe");
				
				GameRegistry.registerItem(MFCBismuthAxe, "MFCBismuthAxe");
				GameRegistry.registerItem(MFCBismuthSword, "MFCBismuthSword");
				GameRegistry.registerItem(MFCBismuthShovel, "MFCBismuthShovel");
				GameRegistry.registerItem(MFCBismuthPickaxe, "MFCBismuthPickaxe");
				GameRegistry.registerItem(MFCBismuthHoe, "MFCBismuthHoe");
				
				GameRegistry.registerItem(MFCCalciumAxe, "MFCCalciumAxe");
				GameRegistry.registerItem(MFCCalciumSword, "MFCCalciumSword");
				GameRegistry.registerItem(MFCCalciumShovel, "MFCCalciumShovel");
				GameRegistry.registerItem(MFCCalciumPickaxe, "MFCCalciumPickaxe");
				GameRegistry.registerItem(MFCCalciumHoe, "MFCCalciumHoe");
				
				GameRegistry.registerItem(MFCCobaltAxe, "MFCCobaltAxe");
				GameRegistry.registerItem(MFCCobaltSword, "MFCCobaltSword");
				GameRegistry.registerItem(MFCCobaltShovel, "MFCCobaltShovel");
				GameRegistry.registerItem(MFCCobaltPickaxe, "MFCCobaltPickaxe");
				GameRegistry.registerItem(MFCCobaltHoe, "MFCCobaltHoe");
				
				GameRegistry.registerItem(MFCCopperAxe, "MFCCopperAxe");
				GameRegistry.registerItem(MFCCopperSword, "MFCCopperSword");
				GameRegistry.registerItem(MFCCopperShovel, "MFCCopperShovel");
				GameRegistry.registerItem(MFCCopperPickaxe, "MFCCopperPickaxe");
				GameRegistry.registerItem(MFCCopperHoe, "MFCCopperHoe");
				
				GameRegistry.registerItem(MFCLeadAxe, "MFCLeadAxe");
				GameRegistry.registerItem(MFCLeadSword, "MFCLeadSword");
				GameRegistry.registerItem(MFCLeadShovel, "MFCLeadShovel");
				GameRegistry.registerItem(MFCLeadPickaxe, "MFCLeadPickaxe");
				GameRegistry.registerItem(MFCLeadHoe, "MFCLeadHoe");
				
				GameRegistry.registerItem(MFCMagnesiumAxe, "MFCMagnesiumAxe");
				GameRegistry.registerItem(MFCMagnesiumSword, "MFCMagnesiumSword");
				GameRegistry.registerItem(MFCMagnesiumShovel, "MFCMagnesiumShovel");
				GameRegistry.registerItem(MFCMagnesiumPickaxe, "MFCMagnesiumPickaxe");
				GameRegistry.registerItem(MFCMagnesiumHoe, "MFCMagnesiumHoe");
				
				GameRegistry.registerItem(MFCNickelAxe, "MFCNickelAxe");
				GameRegistry.registerItem(MFCNickelSword, "MFCNickelSword");
				GameRegistry.registerItem(MFCNickelShovel, "MFCNickelShovel");
				GameRegistry.registerItem(MFCNickelPickaxe, "MFCNickelPickaxe");
				GameRegistry.registerItem(MFCNickelHoe, "MFCNickelHoe");
				
				GameRegistry.registerItem(MFCOsmiumAxe, "MFCOsmiumAxe");
				GameRegistry.registerItem(MFCOsmiumSword, "MFCOsmiumSword");
				GameRegistry.registerItem(MFCOsmiumShovel, "MFCOsmiumShovel");
				GameRegistry.registerItem(MFCOsmiumPickaxe, "MFCOsmiumPickaxe");
				GameRegistry.registerItem(MFCOsmiumHoe, "MFCOsmiumHoe");
				
				GameRegistry.registerItem(MFCPlatinumAxe, "MFCPlatinumAxe");
				GameRegistry.registerItem(MFCPlatinumSword, "MFCPlatinumSword");
				GameRegistry.registerItem(MFCPlatinumShovel, "MFCPlatinumShovel");
				GameRegistry.registerItem(MFCPlatinumPickaxe, "MFCPlatinumPickaxe");
				GameRegistry.registerItem(MFCPlatinumHoe, "MFCPlatinumHoe");
				
				GameRegistry.registerItem(MFCSilverAxe, "MFCSilverAxe");
				GameRegistry.registerItem(MFCSilverSword, "MFCSilverSword");
				GameRegistry.registerItem(MFCSilverShovel, "MFCSilverShovel");
				GameRegistry.registerItem(MFCSilverPickaxe, "MFCSilverPickaxe");
				GameRegistry.registerItem(MFCSilverHoe, "MFCSilverHoe");
				
				GameRegistry.registerItem(MFCTinAxe, "MFCTinAxe");
				GameRegistry.registerItem(MFCTinSword, "MFCTinSword");
				GameRegistry.registerItem(MFCTinShovel, "MFCTinShovel");
				GameRegistry.registerItem(MFCTinPickaxe, "MFCTinPickaxe");
				GameRegistry.registerItem(MFCTinHoe, "MFCTinHoe");
				
				GameRegistry.registerItem(MFCTungstenAxe, "MFCTungstenAxe");
				GameRegistry.registerItem(MFCTungstenSword, "MFCTungstenSword");
				GameRegistry.registerItem(MFCTungstenShovel, "MFCTungstenShovel");
				GameRegistry.registerItem(MFCTungstenPickaxe, "MFCTungstenPickaxe");
				GameRegistry.registerItem(MFCTungstenHoe, "MFCTungstenHoe");
				
				GameRegistry.registerItem(MFCZincAxe, "MFCZincAxe");
				GameRegistry.registerItem(MFCZincSword, "MFCZincSword");
				GameRegistry.registerItem(MFCZincShovel, "MFCZincShovel");
				GameRegistry.registerItem(MFCZincPickaxe, "MFCZincPickaxe");
				GameRegistry.registerItem(MFCZincHoe, "MFCZincHoe");
				
				//Armour registry
				
				GameRegistry.registerItem(MFCAluminiumHelmet, "MFCAluminiumHelmet");
				GameRegistry.registerItem(MFCAluminiumLeggings, "MFCAluminiumLeggings");
				GameRegistry.registerItem(MFCAluminiumChestplate, "MFCAluminiumChestplate");
				GameRegistry.registerItem(MFCAluminiumBoots, "MFCAluminiumBoots");

				GameRegistry.registerItem(MFCBismuthHelmet, "MFCBismuthHelmet");
				GameRegistry.registerItem(MFCBismuthLeggings, "MFCBismuthLeggings");
				GameRegistry.registerItem(MFCBismuthChestplate, "MFCBismuthChestplate");
				GameRegistry.registerItem(MFCBismuthBoots, "MFCBismuthBoots");

				GameRegistry.registerItem(MFCCalciumHelmet, "MFCCalciumHelmet");
				GameRegistry.registerItem(MFCCalciumLeggings, "MFCCalciumLeggings");
				GameRegistry.registerItem(MFCCalciumChestplate, "MFCCalciumChestplate");
				GameRegistry.registerItem(MFCCalciumBoots, "MFCCalciumBoots");
				
				GameRegistry.registerItem(MFCCobaltHelmet, "MFCCobaltHelmet");
				GameRegistry.registerItem(MFCCobaltLeggings, "MFCCobaltLeggings");
				GameRegistry.registerItem(MFCCobaltChestplate, "MFCCobaltChestplate");
				GameRegistry.registerItem(MFCCobaltBoots, "MFCCobaltBoots");
				
				GameRegistry.registerItem(MFCCopperHelmet, "MFCCopperHelmet");
				GameRegistry.registerItem(MFCCopperLeggings, "MFCCopperLeggings");
				GameRegistry.registerItem(MFCCopperChestplate, "MFCCopperChestplate");
				GameRegistry.registerItem(MFCCopperBoots, "MFCCopperBoots");
				
				GameRegistry.registerItem(MFCLeadHelmet, "MFCLeadHelmet");
				GameRegistry.registerItem(MFCLeadLeggings, "MFCLeadLeggings");
				GameRegistry.registerItem(MFCLeadChestplate, "MFCLeadChestplate");
				GameRegistry.registerItem(MFCLeadBoots, "MFCLeadBoots");
				
				GameRegistry.registerItem(MFCMagnesiumHelmet, "MFCMagnesiumHelmet");
				GameRegistry.registerItem(MFCMagnesiumLeggings, "MFCMagnesiumLeggings");
				GameRegistry.registerItem(MFCMagnesiumChestplate, "MFCMagnesiumChestplate");
				GameRegistry.registerItem(MFCMagnesiumBoots, "MFCMagnesiumBoots");
				
				GameRegistry.registerItem(MFCNickelHelmet, "MFCNickelHelmet");
				GameRegistry.registerItem(MFCNickelLeggings, "MFCNickelLeggings");
				GameRegistry.registerItem(MFCNickelChestplate, "MFCNickelChestplate");
				GameRegistry.registerItem(MFCNickelBoots, "MFCNickelBoots");
				
				GameRegistry.registerItem(MFCOsmiumHelmet, "MFCOsmiumHelmet");
				GameRegistry.registerItem(MFCOsmiumLeggings, "MFCOsmiumLeggings");
				GameRegistry.registerItem(MFCOsmiumChestplate, "MFCOsmiumChestplate");
				GameRegistry.registerItem(MFCOsmiumBoots, "MFCOsmiumBoots");
				
				GameRegistry.registerItem(MFCPlatinumHelmet, "MFCPlatinumHelmet");
				GameRegistry.registerItem(MFCPlatinumLeggings, "MFCPlatinumLeggings");
				GameRegistry.registerItem(MFCPlatinumChestplate, "MFCPlatinumChestplate");
				GameRegistry.registerItem(MFCPlatinumBoots, "MFCPlatinumBoots");
				
				GameRegistry.registerItem(MFCSilverHelmet, "MFCSilverHelmet");
				GameRegistry.registerItem(MFCSilverLeggings, "MFCSilverLeggings");
				GameRegistry.registerItem(MFCSilverChestplate, "MFCSilverChestplate");
				GameRegistry.registerItem(MFCSilverBoots, "MFCSilverBoots");
				
				GameRegistry.registerItem(MFCTinHelmet, "MFCTinHelmet");
				GameRegistry.registerItem(MFCTinLeggings, "MFCTinLeggings");
				GameRegistry.registerItem(MFCTinChestplate, "MFCTinChestplate");
				GameRegistry.registerItem(MFCTinBoots, "MFCTinBoots");
				
				GameRegistry.registerItem(MFCTungstenHelmet, "MFCTungstenHelmet");
				GameRegistry.registerItem(MFCTungstenLeggings, "MFCTungstenLeggings");
				GameRegistry.registerItem(MFCTungstenChestplate, "MFCTungstenChestplate");
				GameRegistry.registerItem(MFCTungstenBoots, "MFCTungstenBoots");
				
				GameRegistry.registerItem(MFCZincHelmet, "MFCZincHelmet");
				GameRegistry.registerItem(MFCZincLeggings, "MFCZincLeggings");
				GameRegistry.registerItem(MFCZincChestplate, "MFCZincChestplate");
				GameRegistry.registerItem(MFCZincBoots, "MFCZincBoots");
				
				
				
				
				
				
				//Ores
				
				mfcorealuminium = new MFCOreAluminium().setBlockName("mfcorealuminium").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":ore_bauxite").setHardness(2).setStepSound(Block.soundTypeStone).setResistance(15);
				GameRegistry.registerBlock(mfcorealuminium, "mfcorealuminium");
				
				mfcorebismuth = new MFCOreBismuth().setBlockName("mfcorebismuth").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":ore_bismite").setHardness(2).setStepSound(Block.soundTypeStone).setResistance(15);
				GameRegistry.registerBlock(mfcorebismuth, "mfcorebismuth");
				
				mfcorecalcium = new MFCOreCalcium().setBlockName("mfcorecalcium").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":ore_flurite").setHardness(2).setStepSound(Block.soundTypeStone).setResistance(15);
				GameRegistry.registerBlock(mfcorecalcium, "mfcorecalcium");
				
				mfcorecobalt = new MFCOreCobalt().setBlockName("mfcorecobalt").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":ore_cobalt").setHardness(5).setStepSound(Block.soundTypeStone).setResistance(20);
				GameRegistry.registerBlock(mfcorecobalt, "mfcorecobalt");
				
				mfcorecopper = new MFCOreCopper().setBlockName("mfcorecopper").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":ore_chalcocite").setHardness(2).setStepSound(Block.soundTypeStone).setResistance(15);
				GameRegistry.registerBlock(mfcorecopper, "mfcorecopper");
				
				mfcorelead = new MFCOreLead().setBlockName("mfcorelead").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":ore_galena").setHardness(2).setStepSound(Block.soundTypeStone).setResistance(15);
				GameRegistry.registerBlock(mfcorelead, "mfcorelead");
				
				mfcoremagnesium = new MFCOreMagnesium().setBlockName("mfcoremagnesium").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":ore_magnesium").setHardness(2).setStepSound(Block.soundTypeStone).setResistance(15);
				GameRegistry.registerBlock(mfcoremagnesium, "mfcoremagnesium");
				
				mfcorenickel = new MFCOreNickel().setBlockName("mfcorenickel").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":ore_nickel").setHardness(2).setStepSound(Block.soundTypeStone).setResistance(15);
				GameRegistry.registerBlock(mfcorenickel, "mfcorenickel");
				
				mfcoreosmium = new MFCOreOsmium().setBlockName("mfcoreosmium").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":ore_osmium").setHardness(2).setStepSound(Block.soundTypeStone).setResistance(15);
				GameRegistry.registerBlock(mfcoreosmium, "mfcoreosmium");
				
				mfcoreplatinum = new MFCOrePlatinum().setBlockName("mfcoreplatinum").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":ore_alluvium").setHardness(2).setStepSound(Block.soundTypeStone).setResistance(15);
				GameRegistry.registerBlock(mfcoreplatinum, "mfcoreplatinum");
				
				mfcoresilver = new MFCOreSilver().setBlockName("mfcoresilver").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":ore_silver").setHardness(2).setStepSound(Block.soundTypeStone).setResistance(15);
				GameRegistry.registerBlock(mfcoresilver, "mfcoresilver");
				
				mfcoretin = new MFCOreTin().setBlockName("mfcoretin").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":ore_cassiterite").setHardness(2).setStepSound(Block.soundTypeStone).setResistance(15);
				GameRegistry.registerBlock(mfcoretin, "mfcoretin");
				
				mfcoretungsten = new MFCOreTungsten().setBlockName("mfcoretungsten").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":ore_wolframite").setHardness(2).setStepSound(Block.soundTypeStone).setResistance(15);
				GameRegistry.registerBlock(mfcoretungsten, "mfcoretungsten");
				
				mfcorezinc = new MFCOreZinc().setBlockName("mfcorezinc").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":ore_sphalerite").setHardness(2).setStepSound(Block.soundTypeStone).setResistance(15);
				GameRegistry.registerBlock(mfcorezinc, "mfcorezinc");
				
				mfcorecinnabar = new MFCOreCinnabar().setBlockName("mfcorecinnabar").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":ore_cinnabar").setHardness(2).setStepSound(Block.soundTypeStone).setResistance(15);
				GameRegistry.registerBlock(mfcorecinnabar, "mfcorecinnabar");
				
				mfcorechromium = new MFCOreChromium().setBlockName("mfcorechromium").setCreativeTab(MFC).setBlockTextureName("metalforgecraft" + ":ore_chromium").setHardness(2).setStepSound(Block.soundTypeStone).setResistance(15);
				GameRegistry.registerBlock(mfcorechromium, "mfcorechromium");
				
				
				
				MinecraftForge.EVENT_BUS.register(new MFCFillBucketEvent());
	}
	
	
	public void init(FMLInitializationEvent e){
		FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(CrudeOil.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(MFCOilBucket), new ItemStack(Items.bucket)));
		FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(ShaleOil.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(MFCShaleOilBucket), new ItemStack(Items.bucket)));
		
		//Ore Dictionary
		
		OreDictionary.registerOre("ingotAluminium", mfcingotaluminium);
		OreDictionary.registerOre("ingotBismuth", mfcingotbismuth);
		OreDictionary.registerOre("ingotCalcium", mfcingotcalcium);
		OreDictionary.registerOre("ingotCobalt", mfcingotcobalt);
		OreDictionary.registerOre("ingotCopper", mfcingotcopper);
		OreDictionary.registerOre("ingotLead", mfcingotlead);
		OreDictionary.registerOre("ingotMagnesium", mfcingotmagnesium);
		OreDictionary.registerOre("ingotNickel", mfcingotnickel);
		OreDictionary.registerOre("ingotOsmium", mfcingotosmium);
		OreDictionary.registerOre("ingotPlatinum", mfcingotplatinum);
		OreDictionary.registerOre("ingotSilver", mfcingotsilver);
		OreDictionary.registerOre("ingotTin", mfcingottin);
		OreDictionary.registerOre("ingotTungsten", mfcingottungsten);
		OreDictionary.registerOre("oreCinnabar", mfccrystalcinnabar);
		OreDictionary.registerOre("oreCinnabar", mfcorecinnabar);
		OreDictionary.registerOre("ingotZinc", mfcingotzinc);
		
		OreDictionary.registerOre("oreAluminium", mfcorealuminium);
		OreDictionary.registerOre("oreBismuth", mfcorebismuth);
		OreDictionary.registerOre("oreCalcium", mfcorecalcium);
		OreDictionary.registerOre("oreCobalt", mfcorecobalt);
		OreDictionary.registerOre("oreCopper", mfcorecopper);
		OreDictionary.registerOre("oreLead", mfcorelead);
		OreDictionary.registerOre("oreMagnesium", mfcoremagnesium);
		OreDictionary.registerOre("oreNickel", mfcorenickel);
		OreDictionary.registerOre("oreOsmium", mfcoreosmium);
		OreDictionary.registerOre("orePlatinum", mfcoreplatinum);
		OreDictionary.registerOre("oreSilver", mfcoresilver);
		OreDictionary.registerOre("oreTin", mfcoretin);
		OreDictionary.registerOre("oreTungsten", mfcoretungsten);
		OreDictionary.registerOre("oreZinc", mfcorezinc);
		OreDictionary.registerOre("oil", MFCCrudeOil);
		OreDictionary.registerOre("oil", MFCShaleOil);
		
		//Smelting recipies
		
		
				GameRegistry.registerWorldGenerator(MFCWorldGen, 5);
				
				GameRegistry.addSmelting(mfcorealuminium, new ItemStack(mfcingotaluminium), 2F);
				
				GameRegistry.addSmelting(mfcorebismuth, new ItemStack(mfcingotbismuth), 2F);
				
				GameRegistry.addSmelting(mfcorecalcium, new ItemStack(mfcingotcalcium), 2F);
				
				GameRegistry.addSmelting(mfcorecopper, new ItemStack(mfcingotcopper), 2F);
				
				GameRegistry.addSmelting(mfcorecobalt, new ItemStack(mfcingotcobalt), 2F);
				
				GameRegistry.addSmelting(mfcorelead, new ItemStack(mfcingotlead), 2F);
				
				GameRegistry.addSmelting(mfcoremagnesium, new ItemStack(mfcingotmagnesium), 2F);
				
				GameRegistry.addSmelting(mfcorenickel, new ItemStack(mfcingotnickel), 2F);
				
				GameRegistry.addSmelting(mfcoreosmium, new ItemStack(mfcingotosmium), 2F);
				
				GameRegistry.addSmelting(mfcoreplatinum, new ItemStack(mfcingotplatinum), 2F);
				
				GameRegistry.addSmelting(mfcoresilver, new ItemStack(mfcingotsilver), 2F);
				
				GameRegistry.addSmelting(mfcoretin, new ItemStack(mfcingottin), 2F);
				
				GameRegistry.addSmelting(mfcoretungsten, new ItemStack(mfcingottungsten), 2F);
				
				GameRegistry.addSmelting(mfcorezinc, new ItemStack(mfcingotzinc), 2F);
				
				GameRegistry.addSmelting(mfcrawalloycast, new ItemStack(mfcalloycast), 1F);
				
				GameRegistry.addSmelting(mfcingotbrasscast, new ItemStack(mfcingotbrass, 2), 1F);
				
				
				// GameRegistry.addRecipe(new ShapedOreRecipe(mfcingotaluminium, true, new Object[]{"FF", Character.valueOf('F'), "ingotCopper"}));
				
				
				
				//Recipies
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCAluminiumAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotAluminium", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCAluminiumAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotAluminium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCBismuthAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotBismuth", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCBismuthAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotBismuth", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCalciumAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotCalcium", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCalciumAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotCalcium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCobaltAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotCobalt", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCobaltAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotCobalt", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCopperAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotCopper", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCopperAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotCopper", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCLeadAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotLead", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCLeadAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotLead", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCMagnesiumAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotMagnesium", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCMagnesiumAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotMagnesium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCNickelAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotNickel", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCNickelAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotNickel", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCOsmiumAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotOsmium", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCOsmiumAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotOsmium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCPlatinumAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotPlatinum", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCPlatinumAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotPlatinum", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCSilverAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotSilver", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCSilverAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotSilver", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTinAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotTin", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTinAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotTin", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTungstenAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotTungsten", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTungstenAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotTungsten", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCZincAxe, true, new Object[]{"XX ","XS "," S ",'X', "ingotZinc", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCZincAxe, true, new Object[]{" XX"," SX"," S ",'X', "ingotZinc", 'S', Item.itemRegistry.getObject("stick")} ));
				
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCAluminiumPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotAluminium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCBismuthPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotBismuth", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCalciumPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotCalcium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCobaltPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotCobalt", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCopperPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotCopper", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCLeadPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotLead", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCMagnesiumPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotMagnesium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCNickelPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotNickel", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCOsmiumPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotOsmium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCPlatinumPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotPlatinum", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCSilverPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotSilver", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTinPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotTin", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTungstenPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotTungsten", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCZincPickaxe, true, new Object[]{"XXX"," S "," S ",'X', "ingotZinc", 'S', Item.itemRegistry.getObject("stick")} ));
			
				
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCAluminiumHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotAluminium", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCAluminiumHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotAluminium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCBismuthHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotBismuth", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCBismuthHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotBismuth", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCalciumHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotCalcium", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCalciumHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotCalcium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCobaltHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotCobalt", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCobaltHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotCobalt", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCopperHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotCopper", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCopperHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotCopper", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCLeadHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotLead", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCLeadHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotLead", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCMagnesiumHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotMagnesium", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCMagnesiumHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotMagnesium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCNickelHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotNickel", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCNickelHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotNickel", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCOsmiumHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotOsmium", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCOsmiumHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotOsmium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCPlatinumHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotPlatinum", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCPlatinumHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotPlatinum", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCSilverHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotSilver", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCSilverHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotSilver", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTinHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotTin", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTinHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotTin", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTungstenHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotTungsten", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTungstenHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotTungsten", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCZincHoe, true, new Object[]{"XX "," S "," S ",'X', "ingotZinc", 'S', Item.itemRegistry.getObject("stick")} ));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCZincHoe, true, new Object[]{" XX"," S "," S ",'X', "ingotZinc", 'S', Item.itemRegistry.getObject("stick")} ));
				
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCAluminiumShovel, true, new Object[]{" X "," S "," S ",'X', "ingotAluminium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCBismuthShovel, true, new Object[]{" X "," S "," S ",'X', "ingotBismuth", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCalciumShovel, true, new Object[]{" X "," S "," S ",'X', "ingotCalcium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCobaltShovel, true, new Object[]{" X "," S "," S ",'X', "ingotCobalt", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCopperShovel, true, new Object[]{" X "," S "," S ",'X', "ingotCopper", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCLeadShovel, true, new Object[]{" X "," S "," S ",'X', "ingotLead", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCMagnesiumShovel, true, new Object[]{" X "," S "," S ",'X', "ingotMagnesium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCNickelShovel, true, new Object[]{" X "," S "," S ",'X', "ingotNickel", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCOsmiumShovel, true, new Object[]{" X "," S "," S ",'X', "ingotOsmium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCPlatinumShovel, true, new Object[]{" X "," S "," S ",'X', "ingotPlatinum", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCSilverShovel, true, new Object[]{" X "," S "," S ",'X', "ingotSilver", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTinShovel, true, new Object[]{" X "," S "," S ",'X', "ingotTin", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTungstenShovel, true, new Object[]{" X "," S "," S ",'X', "ingotTungsten", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCZincShovel, true, new Object[]{" X "," S "," S ",'X', "ingotZinc", 'S', Item.itemRegistry.getObject("stick")} ));
			
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCAluminiumSword, true, new Object[]{" X "," X "," S ",'X', "ingotAluminium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCBismuthSword, true, new Object[]{" X "," X "," S ",'X', "ingotBismuth", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCalciumSword, true, new Object[]{" X "," X "," S ",'X', "ingotCalcium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCobaltSword, true, new Object[]{" X "," X "," S ",'X', "ingotCobalt", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCopperSword, true, new Object[]{" X "," X "," S ",'X', "ingotCopper", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCLeadSword, true, new Object[]{" X "," X "," S ",'X', "ingotLead", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCMagnesiumSword, true, new Object[]{" X "," X "," S ",'X', "ingotMagnesium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCNickelSword, true, new Object[]{" X "," X "," S ",'X', "ingotNickel", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCOsmiumSword, true, new Object[]{" X "," X "," S ",'X', "ingotOsmium", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCPlatinumSword, true, new Object[]{" X "," X "," S ",'X', "ingotPlatinum", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCSilverSword, true, new Object[]{" X "," X "," S ",'X', "ingotSilver", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTinSword, true, new Object[]{" X "," X "," S ",'X', "ingotTin", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTungstenSword, true, new Object[]{" X "," X "," S ",'X', "ingotTungsten", 'S', Item.itemRegistry.getObject("stick")} ));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCZincSword, true, new Object[]{" X "," X "," S ",'X', "ingotZinc", 'S', Item.itemRegistry.getObject("stick")} ));
			
				
				GameRegistry.addRecipe(new ShapedOreRecipe(mfcrawalloycast, true, new Object[]{"x x","xxx","   ",'x',Item.itemRegistry.getObject("clay_ball")}));
				GameRegistry.addRecipe(new ShapedOreRecipe(mfcrawalloycast, true, new Object[]{"   ","x x","xxx",'x',Item.itemRegistry.getObject("clay_ball")}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCAluminiumHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotAluminium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCAluminiumHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotAluminium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCAluminiumChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotAluminium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCAluminiumLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotAluminium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCAluminiumBoots, true, new Object[]{"x x","x x","   ",'x',"ingotAluminium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCAluminiumBoots, true, new Object[]{"   ","x x","x x",'x',"ingotAluminium"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCBismuthHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotBismuth"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCBismuthHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotBismuth"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCBismuthChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotBismuth"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCBismuthLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotBismuth"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCBismuthBoots, true, new Object[]{"x x","x x","   ",'x',"ingotBismuth"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCBismuthBoots, true, new Object[]{"   ","x x","x x",'x',"ingotBismuth"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCalciumHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotCalcium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCalciumHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotCalcium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCalciumChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotCalcium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCalciumLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotCalcium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCalciumBoots, true, new Object[]{"x x","x x","   ",'x',"ingotCalcium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCalciumBoots, true, new Object[]{"   ","x x","x x",'x',"ingotCalcium"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCobaltHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotCobalt"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCobaltHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotCobalt"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCobaltChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotCobalt"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCobaltLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotCobalt"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCobaltBoots, true, new Object[]{"x x","x x","   ",'x',"ingotCobalt"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCobaltBoots, true, new Object[]{"   ","x x","x x",'x',"ingotCobalt"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCopperHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotCopper"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCopperHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotCopper"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCopperChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotCopper"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCopperLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotCopper"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCopperBoots, true, new Object[]{"x x","x x","   ",'x',"ingotCopper"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCCopperBoots, true, new Object[]{"   ","x x","x x",'x',"ingotCopper"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCLeadHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotLead"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCLeadHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotLead"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCLeadChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotLead"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCLeadLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotLead"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCLeadBoots, true, new Object[]{"x x","x x","   ",'x',"ingotLead"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCLeadBoots, true, new Object[]{"   ","x x","x x",'x',"ingotLead"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCMagnesiumHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotMagnesium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCMagnesiumHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotMagnesium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCMagnesiumChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotMagnesium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCMagnesiumLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotMagnesium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCMagnesiumBoots, true, new Object[]{"x x","x x","   ",'x',"ingotMagnesium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCMagnesiumBoots, true, new Object[]{"   ","x x","x x",'x',"ingotMagnesium"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCNickelHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotNickel"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCNickelHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotNickel"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCNickelChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotNickel"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCNickelLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotNickel"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCNickelBoots, true, new Object[]{"x x","x x","   ",'x',"ingotNickel"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCNickelBoots, true, new Object[]{"   ","x x","x x",'x',"ingotNickel"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCOsmiumHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotOsmium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCOsmiumHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotOsmium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCOsmiumChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotOsmium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCOsmiumLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotOsmium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCOsmiumBoots, true, new Object[]{"x x","x x","   ",'x',"ingotOsmium"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCOsmiumBoots, true, new Object[]{"   ","x x","x x",'x',"ingotOsmium"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCPlatinumHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotPlatinum"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCPlatinumHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotPlatinum"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCPlatinumChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotPlatinum"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCPlatinumLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotPlatinum"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCPlatinumBoots, true, new Object[]{"x x","x x","   ",'x',"ingotPlatinum"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCPlatinumBoots, true, new Object[]{"   ","x x","x x",'x',"ingotPlatinum"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCSilverHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotSilver"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCSilverHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotSilver"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCSilverChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotSilver"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCSilverLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotSilver"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCSilverBoots, true, new Object[]{"x x","x x","   ",'x',"ingotSilver"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCSilverBoots, true, new Object[]{"   ","x x","x x",'x',"ingotSilver"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTinHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotTin"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTinHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotTin"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTinChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotTin"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTinLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotTin"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTinBoots, true, new Object[]{"x x","x x","   ",'x',"ingotTin"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTinBoots, true, new Object[]{"   ","x x","x x",'x',"ingotTin"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTungstenHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotTungsten"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTungstenHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotTungsten"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTungstenChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotTungsten"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTungstenLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotTungsten"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTungstenBoots, true, new Object[]{"x x","x x","   ",'x',"ingotTungsten"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCTungstenBoots, true, new Object[]{"   ","x x","x x",'x',"ingotTungsten"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCZincHelmet, true, new Object[]{"xxx","x x","   ",'x',"ingotZinc"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCZincHelmet, true, new Object[]{"   ","xxx","x x",'x',"ingotZinc"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCZincChestplate, true, new Object[]{"x x","xxx","xxx",'x',"ingotZinc"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCZincLeggings, true, new Object[]{"xxx","x x","x x",'x',"ingotZinc"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCZincBoots, true, new Object[]{"x x","x x","   ",'x',"ingotZinc"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(MFCZincBoots, true, new Object[]{"   ","x x","x x",'x',"ingotZinc"}));
				
				GameRegistry.addRecipe(new ItemStack(MFCSmelter, 1), new Object[]{"XXX","X X","XNX",'X',Blocks.stonebrick, 'N', Blocks.netherrack});
				
				GameRegistry.addShapelessRecipe(new ItemStack(MFCPeperminttea), new Object[] {Items.glass_bottle, MFCPepermint});
				GameRegistry.addShapelessRecipe(new ItemStack(MFCPepermintoil), new Object[] {Items.glass_bottle, MFCPepermint, MFCPepermint});
				GameRegistry.addShapelessRecipe(new ItemStack(MFCHerbaltea), new Object[] {Items.glass_bottle, MFCPepermintoil, MFCAloe, MFCArnica, MFCTeatreeoil, MFCGinger});
				//Shapeless OreDict recipies
				GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(mfcingotbrasscast, 1), new Object[] {"ingotZinc", "ingotCopper", "ingotCopper", mfcalloycast}));
				
				MinecraftForge.addGrassSeed(new ItemStack(MFCAloe), 1);
				MinecraftForge.addGrassSeed(new ItemStack(MFCPepermint), 1);
				MinecraftForge.addGrassSeed(new ItemStack(MFCArnica), 1);
	}
	
	public void postinit(FMLPostInitializationEvent e){
		
	}
	
	
	public void registerRenderThings(){
		
	}
	public void registerNetworkStuff(){
		NetworkRegistry.INSTANCE.registerGuiHandler(IcesMinecraftExpansion.modInstance, new com.iceminecrafter.IME.handler.MFCGuiHandler());
		NetworkRegistry.INSTANCE.registerGuiHandler(IcesMinecraftExpansion.modInstance, new MFCGuiHandler());
	}
	
	public void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityMFCSmelter.class, IcesMinecraftExpansion.modid);
	}

}
