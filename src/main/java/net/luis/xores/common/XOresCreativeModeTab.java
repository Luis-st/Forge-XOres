package net.luis.xores.common;

import java.util.function.Supplier;

import net.luis.xores.XOres;
import net.luis.xores.init.XOresBlockItems;
import net.luis.xores.init.XOresItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemStack;

/**
 * extension of {@link CreativeModeTab}, used for all mod {@link Item}s<br>
 * for the  {@link Properties#tab()}
 * 
 * @author Luis-st
 * 
 * @see {@link CreativeModeTab}
 * @see {@link XOresItems}
 * @see {@link XOresBlockItems}
 * @see {@link XOres}
 */

public class XOresCreativeModeTab extends CreativeModeTab {

	/**
	 * the icon of the {@link CreativeXOreseTab} as an {@link Supplier},<br>
	 * since the icon needs to be lazy load
	 */
	private final Supplier<? extends Item> icon;
	
	/**
	 * constructor for the {@link XOresCreativeModeTab}
	 */
	public XOresCreativeModeTab(String name, Supplier<? extends Item> icon) {
		super(name);
		this.icon = icon;
	}

	/**
	 * getter for the icon of the tab
	 * @return the {@link XOresCreativeXOreseTab#icon} as an {@link ItemStack}
	 */
	@Override
	public ItemStack makeIcon() {
		return new ItemStack(this.icon.get());
	}
	
}
