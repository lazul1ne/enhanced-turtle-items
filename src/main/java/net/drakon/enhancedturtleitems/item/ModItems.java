package net.drakon.enhancedturtleitems.item;

import net.drakon.enhancedturtleitems.EtiMod;
import net.drakon.enhancedturtleitems.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;

//import net.minecraft.item.Item;
//import net.minecraft.item.ShovelItem;
//import net.minecraft.item.SwordItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {




    public static final Item TURTLE_LEATHER_HELMET = registerItem("turtle_leather_helmet",
        new ArmorItem(ModArmorMaterials.TURTLE_LEATHER_HELMET, EquipmentSlot.HEAD,
            new FabricItemSettings().group(ModItemGroup.ETIGROUP)));

    public static final Item TURTLE_CHAINMAIL_HELMET = registerItem("turtle_chainmail_helmet",
        new ArmorItem(ModArmorMaterials.TURTLE_CHAINMAIL_HELMET, EquipmentSlot.HEAD,

            new FabricItemSettings().group(ModItemGroup.ETIGROUP)));
    public static final Item TURTLE_GOLD_HELMET = registerItem("turtle_gold_helmet",
        new ArmorItem(ModArmorMaterials.TURTLE_GOLD_HELMET, EquipmentSlot.HEAD,
            new FabricItemSettings().group(ModItemGroup.ETIGROUP)));

    public static final Item TURTLE_IRON_HELMET = registerItem("turtle_iron_helmet",
            new ArmorItem(ModArmorMaterials.TURTLE_IRON_HELMET, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.ETIGROUP)));

    public static final Item TURTLE_DIAMOND_HELMET = registerItem("turtle_diamond_helmet",
        new ModArmorItem(ModArmorMaterials.TURTLE_DIAMOND_HELMET, EquipmentSlot.HEAD,
            new FabricItemSettings().group(ModItemGroup.ETIGROUP)));


    public static final Item TURTLE_NETHERITE_HELMET = registerItem("turtle_netherite_helmet",
        new ArmorItem(ModArmorMaterials.TURTLE_NETHERITE_HELMET, EquipmentSlot.HEAD,
            new FabricItemSettings().group(ModItemGroup.ETIGROUP)));

    public static final Item TEST = registerItem("test",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item TURTLE_INGOT = registerItem("turtle_ingot",
        new Item(new FabricItemSettings().group(ModItemGroup.ETIGROUP)));

    public static final Item TURTLE_GOLD_SWORD = registerItem("turtle_gold_sword",
        new SwordItem(ModToolMaterials.TURTLE_GOLD, 0, -2.25f,
            new FabricItemSettings().group(ModItemGroup.ETIGROUP)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EtiMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EtiMod.LOGGER.info("Registering Mod Items for " + EtiMod.MOD_ID);
    }
}
