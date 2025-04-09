package xyz.lazuline;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.lazuline.item.ModItems;
import xyz.lazuline.item.ModItemsGroups;
import xyz.lazuline.util.ModLootTableModifers;

public class EnhancedTurtleItems implements ModInitializer {
	public static final String MOD_ID = "eti";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello from ETI :3");
		ModItems.RegisterModItems();
		ModItemsGroups.registerItemGroups();
		ModLootTableModifers.motifyLootTables();
	}
}
