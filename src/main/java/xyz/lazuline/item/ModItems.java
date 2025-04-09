package xyz.lazuline.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.lazuline.EnhancedTurtleItems;
import xyz.lazuline.item.custom.ModArmorItem;

import static net.minecraft.item.Items.DIAMOND;
import static net.minecraft.item.Items.register;

public class ModItems {
   // other
    public static final Item TEST = registerItem("test", new Item(new FabricItemSettings()));
    public static final Item TURTLE_INGOT = registerItem("turtle_ingot", new Item(new FabricItemSettings()));
    public static final Item TURTLE_UPGRADE_SMITHING_TEMPLATE = registerItem("turtle_upgrade_smithing_template", new Item(new FabricItemSettings()));

    // swords
    public static final Item TURTLE_GOLD_SWORD = registerItem("turtle_gold_sword", new SwordItem(ModToolMaterials.TURTLE_GOLD, 3, -2.4F, new Item.Settings()));
    public static final Item TURTLE_IRON_SWORD = registerItem("turtle_iron_sword", new SwordItem(ModToolMaterials.TURTLE_IRON, 3, -2.4F, new Item.Settings()));
    public static final Item TURTLE_DIAMOND_SWORD = registerItem("turtle_diamond_sword", new SwordItem(ModToolMaterials.TURTLE_DIAMOND, 3, -2.4F, new Item.Settings()));
    public static final Item TURTLE_NETHERITE_SWORD = registerItem("turtle_netherite_sword", new SwordItem(ModToolMaterials.TURTLE_NETHERITE, 3, -2.4F, new Item.Settings().fireproof()));

    // pickaxes
    public static final Item TURTLE_GOLD_PICKAXE = registerItem("turtle_gold_pickaxe", new PickaxeItem(ModToolMaterials.TURTLE_GOLD, 1, -2.8F, new Item.Settings()));
    public static final Item TURTLE_IRON_PICKAXE = registerItem("turtle_iron_pickaxe", new PickaxeItem(ModToolMaterials.TURTLE_IRON, 1, -2.8F, new Item.Settings()));
    public static final Item TURTLE_DIAMOND_PICKAXE = registerItem("turtle_diamond_pickaxe", new PickaxeItem(ModToolMaterials.TURTLE_DIAMOND, 1, -2.8F, new Item.Settings()));
    public static final Item TURTLE_NETHERITE_PICKAXE = registerItem("turtle_netherite_pickaxe", new PickaxeItem(ModToolMaterials.TURTLE_NETHERITE, 1, -2.8F, new Item.Settings()));

    // shovels
    public static final Item TURTLE_GOLD_SHOVEL = registerItem("turtle_gold_shovel", new ShovelItem(ModToolMaterials.TURTLE_GOLD, 1, -3F, new Item.Settings()));
    public static final Item TURTLE_IRON_SHOVEL = registerItem("turtle_iron_shovel", new ShovelItem(ModToolMaterials.TURTLE_IRON, 1, -3F, new Item.Settings()));
    public static final Item TURTLE_DIAMOND_SHOVEL = registerItem("turtle_diamond_shovel", new ShovelItem(ModToolMaterials.TURTLE_DIAMOND, 1, -3F, new Item.Settings()));
    public static final Item TURTLE_NETHERITE_SHOVEL = registerItem("turtle_netherite_shovel", new ShovelItem(ModToolMaterials.TURTLE_NETHERITE, 1, -3F, new Item.Settings()));

    // axes
    public static final Item TURTLE_GOLD_AXE = registerItem("turtle_gold_axe", new AxeItem(ModToolMaterials.TURTLE_GOLD, 7, -3F, new Item.Settings()));
    public static final Item TURTLE_IRON_AXE = registerItem("turtle_iron_axe", new AxeItem(ModToolMaterials.TURTLE_IRON, 6, -3F, new Item.Settings()));
    public static final Item TURTLE_DIAMOND_AXE = registerItem("turtle_diamond_axe", new AxeItem(ModToolMaterials.TURTLE_DIAMOND, 6, -3F, new Item.Settings()));
    public static final Item TURTLE_NETHERITE_AXE = registerItem("turtle_netherite_axe", new AxeItem(ModToolMaterials.TURTLE_NETHERITE, 6, -3F, new Item.Settings()));

    // hoes
    public static final Item TURTLE_GOLD_HOE = registerItem("turtle_gold_hoe", new HoeItem(ModToolMaterials.TURTLE_GOLD, 0, 0.0F, new Item.Settings()));
    public static final Item TURTLE_IRON_HOE = registerItem("turtle_iron_hoe", new HoeItem(ModToolMaterials.TURTLE_IRON, -2, 0.0F, new Item.Settings()));
    public static final Item TURTLE_DIAMOND_HOE = registerItem("turtle_diamond_hoe", new HoeItem(ModToolMaterials.TURTLE_DIAMOND, -3, 0.0F, new Item.Settings()));
    public static final Item TURTLE_NETHERITE_HOE = registerItem("turtle_netherite_hoe", new HoeItem(ModToolMaterials.TURTLE_NETHERITE, -4, 0.0F, new Item.Settings()));

    // helmets
    //public static final Item TURTLE_LEATHER_HELMET = registerItem("turtle_leather_helmet", new ModArmorItem(ModArmorMaterials.TURTLE_LEATHER, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item TURTLE_CHAINMAIL_HELMET = registerItem("turtle_chainmail_helmet", new ModArmorItem(ModArmorMaterials.TURTLE_CHAIN, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item TURTLE_GOLD_HELMET = registerItem("turtle_gold_helmet", new ModArmorItem(ModArmorMaterials.TURTLE_GOLD, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item TURTLE_IRON_HELMET = registerItem("turtle_iron_helmet", new ModArmorItem(ModArmorMaterials.TURTLE_IRON, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item TURTLE_DIAMOND_HELMET = registerItem("turtle_diamond_helmet", new ModArmorItem(ModArmorMaterials.TURTLE_DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item TURTLE_NETHERITE_HELMET = registerItem("turtle_netherite_helmet", new ModArmorItem(ModArmorMaterials.TURTLE_NETHERITE, ArmorItem.Type.HELMET, new Item.Settings().fireproof()));

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries){
        entries.add(TURTLE_GOLD_SWORD);
        entries.add(TURTLE_IRON_SWORD);
        entries.add(TURTLE_DIAMOND_SWORD);
        entries.add(TURTLE_NETHERITE_SWORD);
        //
        entries.add(TURTLE_GOLD_AXE);
        entries.add(TURTLE_IRON_AXE);
        entries.add(TURTLE_DIAMOND_AXE);
        entries.add(TURTLE_NETHERITE_AXE);

    }
    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries){

        entries.add(TURTLE_GOLD_SHOVEL);
        entries.add(TURTLE_IRON_SHOVEL);
        entries.add(TURTLE_DIAMOND_SHOVEL);
        entries.add(TURTLE_NETHERITE_SHOVEL);
        //
        entries.add(TURTLE_GOLD_PICKAXE);
        entries.add(TURTLE_IRON_PICKAXE);
        entries.add(TURTLE_DIAMOND_PICKAXE);
        entries.add(TURTLE_NETHERITE_PICKAXE);
        //
        entries.add(TURTLE_GOLD_AXE);
        entries.add(TURTLE_IRON_AXE);
        entries.add(TURTLE_DIAMOND_AXE);
        entries.add(TURTLE_NETHERITE_AXE);


        entries.add(TURTLE_GOLD_HOE);
        entries.add(TURTLE_IRON_HOE);
        entries.add(TURTLE_DIAMOND_HOE);
        entries.add(TURTLE_NETHERITE_HOE);


    }


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(EnhancedTurtleItems.MOD_ID, name), item);
    }

    public static void RegisterModItems(){
        EnhancedTurtleItems.LOGGER.info("Registering Mod Items for "+ EnhancedTurtleItems.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);

    }

}
