package net.drakon.enhancedturtleitems.item;

import net.drakon.enhancedturtleitems.EtiMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
//import net.drakon.enhancedturtleitems.EtiClientMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ETIGROUP = FabricItemGroupBuilder.build(new Identifier(EtiMod.MOD_ID, "eti"),
            () -> new ItemStack(ModItems.TEST));
}
