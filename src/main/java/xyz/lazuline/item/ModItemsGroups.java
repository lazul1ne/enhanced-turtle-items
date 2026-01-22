package xyz.lazuline.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.lazuline.EnhancedTurtleItems;

public class ModItemsGroups {
    public static final ItemGroup ETI_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EnhancedTurtleItems.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eti"))
                    .icon(() -> new ItemStack(ModItems.TEST)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TURTLE_GOLD_SWORD);
                        entries.add(ModItems.TURTLE_IRON_SWORD);
                        entries.add(ModItems.TURTLE_DIAMOND_SWORD);
                        entries.add(ModItems.TURTLE_NETHERITE_SWORD);
                        entries.add(ModItems.TURTLE_SWORD);

                        entries.add(ModItems.TURTLE_GOLD_PICKAXE);
                        entries.add(ModItems.TURTLE_IRON_PICKAXE);
                        entries.add(ModItems.TURTLE_DIAMOND_PICKAXE);
                        entries.add(ModItems.TURTLE_NETHERITE_PICKAXE);

                        entries.add(ModItems.TURTLE_GOLD_SHOVEL);
                        entries.add(ModItems.TURTLE_IRON_SHOVEL);
                        entries.add(ModItems.TURTLE_DIAMOND_SHOVEL);
                        entries.add(ModItems.TURTLE_NETHERITE_SHOVEL);

                        entries.add(ModItems.TURTLE_GOLD_AXE);
                        entries.add(ModItems.TURTLE_IRON_AXE);
                        entries.add(ModItems.TURTLE_DIAMOND_AXE);
                        entries.add(ModItems.TURTLE_NETHERITE_AXE);

                        entries.add(ModItems.TURTLE_GOLD_HOE);
                        entries.add(ModItems.TURTLE_IRON_HOE);
                        entries.add(ModItems.TURTLE_DIAMOND_HOE);
                        entries.add(ModItems.TURTLE_NETHERITE_HOE);


                        entries.add(ModItems.TURTLE_LEATHER_HELMET);
                        entries.add(ModItems.TURTLE_CHAINMAIL_HELMET);
                        entries.add(ModItems.TURTLE_GOLD_HELMET);
                        entries.add(ModItems.TURTLE_IRON_HELMET);
                        entries.add(ModItems.TURTLE_DIAMOND_HELMET);
                        entries.add(ModItems.TURTLE_NETHERITE_HELMET);

                        entries.add(ModItems.TURTLE_INGOT);
                        entries.add(ModItems.TURTLE_UPGRADE_SMITHING_TEMPLATE);

                        //entries.add(Items.DIAMOND);


                    }).build());
    public static void registerItemGroups() {
        EnhancedTurtleItems.LOGGER.info("Registering Item Groups for " + EnhancedTurtleItems.MOD_ID);

    }
}
