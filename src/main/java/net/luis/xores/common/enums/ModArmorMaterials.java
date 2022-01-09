package net.luis.xores.common.enums;

import java.util.function.Supplier;

import net.luis.xores.XOres;
import net.luis.xores.init.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

/**
 * 
 * @author Luis-st
 *
 */

public enum ModArmorMaterials implements ArmorMaterial {

	JADE("jade", 15, new int[] {2, 5, 6, 2}, 10, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
		return Ingredient.of(ModItems.JADE_INGOT.get());
	}),
	BLAZING("blazing", 0, new int[] {3, 6, 7, 3}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
		return Ingredient.of(ModItems.BLAZING_INGOT.get());
	}),
	SAPHIRE("saphire", 35, new int[] {3, 6, 8, 3}, 12, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.1F, () -> {
		return Ingredient.of(ModItems.SAPHIRE_INGOT.get());
	}),
	LIMONITE("limonite", 44, new int[] {4, 5, 9, 4}, 15, SoundEvents.ARMOR_EQUIP_IRON, 3.0F, 0.2F, () -> {
		return Ingredient.of(ModItems.LIMONITE_INGOT.get());
	}),
	ENDERITE("enderite", 51, new int[] {6, 8, 12, 6}, 26, SoundEvents.ARMOR_EQUIP_NETHERITE, 5.0F, 0.3F, () -> {
		return Ingredient.of(Items.BARRIER);
	}),
	NIGHT("night", 59, new int[] {7, 11, 15, 7}, 35, SoundEvents.ARMOR_EQUIP_NETHERITE, 8.0F, 0.4F, () -> {
		return Ingredient.of(Items.BARRIER);
	});
	
	protected static final int[] DURABILITY_PER_SLOT = new int[] {13, 15, 16, 11}; // Boots, Leggings, Chestplate, Helmet
	protected final String name;
	protected final int durabilityMultiplier;
	protected final int[] slotProtections;
	protected final int enchantmentValue;
	protected final SoundEvent sound;
	protected final float toughness;
	protected final float knockbackResistance;
	protected final Supplier<Ingredient> repairIngredient;

	private ModArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
		this.name = XOres.MOD_ID + ":" + name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.slotProtections = slotProtections;
		this.enchantmentValue = enchantmentValue;
		this.sound = sound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public int getDurabilityForSlot(EquipmentSlot equipmentSlot) {
		return DURABILITY_PER_SLOT[equipmentSlot.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot equipmentSlot) {
		return this.slotProtections[equipmentSlot.getIndex()];
	}
	
	@Override
	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.sound;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
	
	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}

}
