package net.drakon.enhancedturtleitems.item;

import net.drakon.enhancedturtleitems.EtiMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    TURTLE_LEATHER_HELMET("turtle_leather_helmet", 30, new int[]{1, 4, 5, 3}, 12, SoundEvents.ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.of(ModItems.TEST.get());
    }), TURTLE_CHAINMAIL_HELMET("turtle_chainmail_helmet", 40, new int[]{1, 4, 5, 4}, 12, SoundEvents.ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.of(ModItems.TEST.get());
    }), TURTLE_GOLD_HELMET("turtle_gold_helmet", 32, new int[]{1, 4, 5, 4}, 24, SoundEvents.ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.of(ModItems.TEST.get());
    }), TURTLE_IRON_HELMET("turtle_iron_helmet", 40, new int[]{1, 4, 5, 4}, 13, SoundEvents.ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.of(ModItems.TEST.get());
    }), TURTLE_DIAMOND_HELMET("turtle_diamond_helmet", 58, new int[]{1, 4, 5, 5}, 14, SoundEvents.ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.of(ModItems.TEST.get());
    }), TURTLE_NETHERITE_HELMET("turtle_netherite_helmet", 62, new int[]{1, 4, 5, 5}, 15, SoundEvents.ARMOR_EQUIP_TURTLE, 0.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.TEST.get());
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_,
                      SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return EtiMod.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}