package net.luis.xores.world.fixer;

import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.eventbus.api.Event;

/**
 * {@link VanillaFixer} defines a class that is used to manipulate vanilla logic<br>
 * via {@link ForgeHooks}, {@link Event}s or mixin<br>
 * <br>
 * if you want to use this for your own case, implements this interface<br>
 * into your class and do there what ever you want. Create inside the class<br>
 * a {@code static final} field. This instance should then overwrite the<br>
 * {@link VanillaFixer#init()} method.
 * <pre> {@code
 * 	public static final SomeFixer INSTANCE = new SomeFixer() {
 * 		@Override
 * 		public void init() {
 * 			// do your init stuff of the VanillaFixer here
 * 		}
 * 	}
 * } </pre>
 * 
 * @author Luis-st
 */

public interface VanillaFixer {
	
	/**
	 * use to register the stuff of the {@link VanillaFixer}
	 */
	default void init() {
		
	}
	
}