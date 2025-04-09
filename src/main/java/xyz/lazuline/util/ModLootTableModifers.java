package xyz.lazuline.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import xyz.lazuline.item.ModItems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.loot.entry.LootPoolEntry;


public class ModLootTableModifers {
    public static final Identifier BURIED_TREASURE_ID =
            new Identifier("minecraft","chests/buried_treasure");
    private static final Identifier SUSPICIOUS_SAND_ID =
            new Identifier("minecraft", "archaeology/desert_pyramid");
    public static void motifyLootTables(){
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(BURIED_TREASURE_ID.equals(id)) {



                LootPool.Builder poolBuilder = LootPool.builder()


                        .rolls(ConstantLootNumberProvider.create(1))


                        .conditionally(RandomChanceLootCondition.builder(0.75f)) // Drops 100% of the time


                        .with(ItemEntry.builder(ModItems.TURTLE_UPGRADE_SMITHING_TEMPLATE))


                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());





                tableBuilder.pool(poolBuilder.build());


            }
        });


        LootTableEvents.REPLACE.register((resourceManager, lootManager, id, original, source) -> {


            if(SUSPICIOUS_SAND_ID.equals(id)) {


                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));


                entries.add(ItemEntry.builder(ModItems.TURTLE_UPGRADE_SMITHING_TEMPLATE).build());





                LootPool.Builder pool = LootPool.builder().with(entries);


                return LootTable.builder().pool(pool).build();


            }





            return null;


        });
    }
}
