
package com.drakon.eti.item;

import com.drakon.eti.EnhancedTurtleItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TURTLETAB = FabricItemGroupBuilder.build(
            new Identifier(EnhancedTurtleItems.MOD_ID, "turtle"), () -> new ItemStack(ModItems.TURTLE_IRON_HELMET));
}
