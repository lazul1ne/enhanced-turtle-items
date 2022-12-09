package com.drakon.eti.item;


import com.drakon.eti.EnhancedTurtleItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item TURTLE_IRON_HELMET = registerItem("turtle_iron_helmet",
            new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EnhancedTurtleItems.MOD_ID, name), item);
    }
    public static void registerModItems() {
        EnhancedTurtleItems.LOGGER.debug("Registering Mod Items for " + EnhancedTurtleItems.MOD_ID);
    }
}
