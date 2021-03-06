package net.luis.xores.world.item;

import java.util.function.Supplier;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

/**
 * 
 * @author Luis-st
 *
 */

public class XOresCreativeModeTab extends CreativeModeTab {
	
	private final Supplier<? extends Item> icon;
	
	public XOresCreativeModeTab(String name, Supplier<? extends Item> icon) {
		super(name);
		this.icon = icon;
	}
	
	@Override
	public ItemStack makeIcon() {
		return new ItemStack(this.icon.get());
	}
	
}
