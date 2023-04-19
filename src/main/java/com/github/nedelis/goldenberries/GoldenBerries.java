package com.github.nedelis.goldenberries;

import com.github.nedelis.goldenberries.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoldenBerries implements ModInitializer {
	public static final String MOD_ID = "goldenberries";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
