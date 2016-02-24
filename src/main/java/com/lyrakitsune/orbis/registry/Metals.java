package com.lyrakitsune.orbis.registry;

import com.lyrakitsune.orbis.main.Orbis;
import com.lyrakitsune.orbis.shinies.gemJade;
import com.lyrakitsune.orbis.shinies.gemRuby;
import com.lyrakitsune.orbis.shinies.gemSapphire;
import com.lyrakitsune.orbis.shinies.ingotUranium;
import com.lyrakitsune.orbis.shinies.ingotCopper;
import com.lyrakitsune.orbis.shinies.ingotDeus;
import com.lyrakitsune.orbis.shinies.ingotLead;
import com.lyrakitsune.orbis.shinies.ingotNickel;
import com.lyrakitsune.orbis.shinies.ingotSilver;
import com.lyrakitsune.orbis.shinies.ingotTin;
import com.lyrakitsune.orbis.shinies.ingotZinc;
import com.lyrakitsune.orbis.shinies.surfaceQuartz;

import net.minecraft.item.Item;

public class Metals {
	
	//Raw Metals
	public static Item ingotCopper;
	public static Item ingotTin;
	public static Item ingotZinc;
	public static Item ingotLead;
	public static Item ingotNickel;
	public static Item ingotSilver;
	public static Item ingotDeus;
	public static Item ingotMercury;
	public static Item ingotPink; 
	
	//Other
	public static Item surfaceQuartz;
	public static Item ingotUranium;
	
	//Gems
	public static Item gemRuby;
	public static Item gemSapphire;
	public static Item gemJade;
	
	//Alloys
	public static Item alloySteel;
	public static Item alloyBronze;
	public static Item alloyBrass;
	public static Item alloyInvar;
	public static Item alloyElectrum;
	public static Item alloyNano;
	public static Item alloyYummy;
	public static Item alloyMithril;
	public static Item alloyAquarium;
	
	//Dusts
	public static Item dustCopper;
	public static Item dustTin;
	public static Item dustZinc;
	public static Item dustLead;
	public static Item dustNickel;
	public static Item dustSilver;
	public static Item dustIron;
	public static Item dustGold;
	public static Item dustCoal;
	public static Item dustDiamond;
	public static Item dustQuartz;
	public static Item dustRuby;
	public static Item dustSapphire;
	public static Item dustJade; 
	public static Item dustUranium;
	public static Item dustSurfaceQuartz;
	public static Item dustDeus;
	public static Item dustNikolite;
	public static Item dustSteel;
	public static Item dustBronze;
	public static Item dustBrass;
	public static Item dustInvar;
	public static Item dustElectrum;
	public static Item dustNano;
	
	public static void inut()
	{
		//Raw Metals
		ingotCopper = new ingotCopper().setUnlocalizedName("ingotCopper").setCreativeTab(Orbis.tabOrbis);
		ingotTin = new ingotTin().setUnlocalizedName("ingotTin").setCreativeTab(Orbis.tabOrbis);
		ingotZinc = new ingotZinc().setUnlocalizedName("ingotZinc").setCreativeTab(Orbis.tabOrbis);
		ingotLead = new ingotLead().setUnlocalizedName("ingotLead").setCreativeTab(Orbis.tabOrbis);
		ingotNickel = new ingotNickel().setUnlocalizedName("ingotNickel").setCreativeTab(Orbis.tabOrbis);
		ingotSilver = new ingotSilver().setUnlocalizedName("ingotSilver").setCreativeTab(Orbis.tabOrbis);
		ingotDeus = new ingotDeus().setUnlocalizedName("ingotDeus").setCreativeTab(Orbis.tabOrbis);
		
		//Others
		surfaceQuartz = new surfaceQuartz().setUnlocalizedName("surfaceQuartz").setCreativeTab(Orbis.tabOrbis);
		ingotUranium = new ingotUranium().setUnlocalizedName("ingotUranium").setCreativeTab(Orbis.tabOrbis);
		
		//Gems
		gemRuby = new gemRuby().setUnlocalizedName("gemRuby").setCreativeTab(Orbis.tabOrbis);
		gemSapphire = new gemSapphire().setUnlocalizedName("gemSapphire").setCreativeTab(Orbis.tabOrbis);
		gemJade = new gemJade().setUnlocalizedName("gemJade").setCreativeTab(Orbis.tabOrbis);
		
		//
	}
}