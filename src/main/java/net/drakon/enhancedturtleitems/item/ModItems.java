package net.drakon.enhancedturtleitems.item;

import net.drakon.enhancedturtleitems.EtiMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;

//import net.minecraft.item.Item;
//import net.minecraft.item.ShovelItem;
//import net.minecraft.item.SwordItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    public static final Item TURTLE_IRON_HELMET = registerItem("turtle_iron_helmet",
            new ArmorItem(ModArmorMaterials.TURTLE_IRON_HELMET, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.ETIGROUP)));
    public static final Item TEST = registerItem("test",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EtiMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EtiMod.LOGGER.info("Registering Mod Items for " + EtiMod.MOD_ID);
    }
}
