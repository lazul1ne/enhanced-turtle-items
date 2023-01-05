package net.drakon.enhancedturtleitems;

import net.drakon.enhancedturtleitems.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class EtiMod implements ModInitializer {
	public static final String MOD_ID = "eti";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}

