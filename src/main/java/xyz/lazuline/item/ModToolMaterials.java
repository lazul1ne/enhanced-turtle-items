package xyz.lazuline.item;

import java.util.function.Supplier;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

public enum ModToolMaterials implements ToolMaterial {
	TURTLE_IRON(MiningLevels.IRON, 250, 8.0F, 2.0F, 18, () -> Ingredient.ofItems(Items.IRON_INGOT)),
	TURTLE_DIAMOND(MiningLevels.DIAMOND, 1561, 10.0F, 3.0F, 14, () -> Ingredient.ofItems(Items.DIAMOND)),
	TURTLE_GOLD(MiningLevels.WOOD, 32, 15.0F, 0.0F, 26, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
	TURTLE_NETHERITE(MiningLevels.NETHERITE, 2031, 11.0F, 4.0F, 19, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

	private final int miningLevel;
	private final int itemDurability;
	private final float miningSpeed;
	private final float attackDamage;
	private final int enchantability;
	private final Lazy<Ingredient> repairIngredient;

	private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
		this.miningLevel = miningLevel;
		this.itemDurability = itemDurability;
		this.miningSpeed = miningSpeed;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairIngredient = new Lazy<>(repairIngredient);
	}

	@Override
	public int getDurability() {
		return this.itemDurability + (this.itemDurability / 2); // Using this workaround since it's not a double, unlike when you try to multiply it by 1.5.
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return this.miningSpeed;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage + 1;
	}

	@Override
	public int getMiningLevel() {
		return this.miningLevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}
}


