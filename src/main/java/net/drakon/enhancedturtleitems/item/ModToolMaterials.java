package net.drakon.enhancedturtleitems.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
  TURTLE_GOLD(MiningLevels.STONE, 132, 10.0f, 3.5f, 36, () -> {
        return Ingredient.ofItems(ModItems.TEST);
    }),  TURTLE_IRON(MiningLevels.IRON, 350, 10.0f, 5.5f, 25, () -> {
        return Ingredient.ofItems(ModItems.TEST);
    }),  TURTLE_DIAMOND(MiningLevels.DIAMOND, 1661, 10.0f, 6.5f, 27, () -> {
        return Ingredient.ofItems(ModItems.TEST);
    }),  TURTLE_NETHERITE(MiningLevels.NETHERITE, 2131, 10.0f, 7.5f, 30, () -> {
        return Ingredient.ofItems(ModItems.TEST);
});

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
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
