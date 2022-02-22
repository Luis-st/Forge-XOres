package net.luis.xores;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.luis.xores.common.XOresCreativeModeTab;
import net.luis.xores.init.MaterialSets;
import net.luis.xores.init.XOresBlockItems;
import net.luis.xores.init.XOresBlocks;
import net.luis.xores.init.XOresGlobalLootModifiers;
import net.luis.xores.init.XOresItems;
import net.luis.xores.init.XOresMaterialSets;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

/**
 * main mod class, register all {@link DeferredRegister}
 * 
 * @author Luis-st
 */

@Mod(XOres.MOD_ID)
public class XOres {
	
	/**
	 * {@link XOres} mod id
	 */
	public static final String MOD_ID = "xores";
	
	/**
	 * internal Logger
	 */
	public static final Logger LOGGER = LogManager.getLogger(XOres.class);
	
	/**
	 * {@link CreativeModeTab} for all mod {@link Item}s
	 * 
	 * @see {@link XOresItems}
	 * @see {@link XOresBlockItems}
	 */
	public static final CreativeModeTab XORES_TAB = new XOresCreativeModeTab("xores", XOresItems.LIMONITE_PICKAXE);
	
	/**
	 * constructor for the {@link XOres}
	 */
	public XOres() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		XOresBlocks.BLOCKS.register(modEventBus);
		XOresBlockItems.ITEMS.register(modEventBus);
		XOresItems.ITEMS.register(modEventBus);
		MaterialSets.MATERIALS.register(modEventBus);
		XOresMaterialSets.MATERIALS.register(modEventBus);	
		XOresGlobalLootModifiers.LOOT_MODIFIERS.register(modEventBus);
	}
	
}
