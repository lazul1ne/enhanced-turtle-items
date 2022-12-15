package net.drakon.enhancedturtleitems.item;

import net.drakon.enhancedturtleitems.EtiMod;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {

    TURTLE_LEATHER_HELMET("turtle_leather_helmet", 30, new int[]{1, 4, 5, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.TEST);
    }), TURTLE_CHAINMAIL_HELMET("turtle_chainmail_helmet", 40, new int[]{1, 4, 5, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.TEST);
    }), TURTLE_GOLD_HELMET("turtle_gold_helmet", 32, new int[]{1, 4, 5, 4}, 24, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.TEST);
    }), TURTLE_IRON_HELMET("turtle_iron_helmet", 40, new int[]{1, 4, 5, 4}, 13, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.TEST);
    }), TURTLE_DIAMOND_HELMET("turtle_diamond_helmet", 58, new int[]{1, 4, 5, 5}, 14, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.TEST);
    }), TURTLE_NETHERITE_HELMET("turtle_netherite_helmet", 62, new int[]{1, 4, 5, 5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, 1.0F, () -> {
        return Ingredient.ofItems(ModItems.TEST);
    });


    private static final int[] BASE_DURABILITY;
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    @SuppressWarnings("deprecation")
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy<Ingredient>(repairIngredientSupplier);
    }

    private static final int[] PROTECTION_VALUES = new int[]{3, 6, 8, 3};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    static {
        BASE_DURABILITY = new int[]{13, 15, 16, 11};

    }
}

