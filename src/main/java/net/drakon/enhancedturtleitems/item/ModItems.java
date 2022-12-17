package net.drakon.enhancedturtleitems.item;

import net.drakon.enhancedturtleitems.EtiMod;
import net.drakon.enhancedturtleitems.item.custom.ModArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, EtiMod.MOD_ID);


    public static final RegistryObject<Item> TURTLE_LEATHER_HELMET = ITEMS.register("turtle_leather_helmet",
        () -> new ArmorItem(ModArmorMaterials.TURTLE_LEATHER_HELMET, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.ETIGROUP)));

    public static final RegistryObject<Item> TURTLE_CHAINMAIL_HELMET = ITEMS.register("turtle_chainmail_helmet",
        () -> new ArmorItem(ModArmorMaterials.TURTLE_CHAINMAIL_HELMET, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.ETIGROUP)));

    public static final RegistryObject<Item> TURTLE_GOLD_HELMET = ITEMS.register("turtle_gold_helmet",
        () -> new ArmorItem(ModArmorMaterials.TURTLE_GOLD_HELMET, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.ETIGROUP)));

    public static final RegistryObject<Item> TURTLE_IRON_HELMET = ITEMS.register("turtle_iron_helmet",
        () -> new ArmorItem(ModArmorMaterials.TURTLE_IRON_HELMET, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.ETIGROUP)));

    public static final RegistryObject<Item> TURTLE_DIAMOND_HELMET = ITEMS.register("turtle_diamond_helmet",
        () -> new ModArmorItem(ModArmorMaterials.TURTLE_DIAMOND_HELMET, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.ETIGROUP)));

    public static final RegistryObject<Item> TURTLE_NETHERITE_HELMET = ITEMS.register("turtle_netherite_helmet",
        () -> new ArmorItem(ModArmorMaterials.TURTLE_NETHERITE_HELMET, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.ETIGROUP)));


    public static final RegistryObject<Item> TEST = ITEMS.register("test",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ETIGROUP)));

    public static final RegistryObject<Item> TURTLE_INGOT = ITEMS.register("turtle_ingot",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ETIGROUP)));






    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
