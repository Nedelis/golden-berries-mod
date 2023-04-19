package com.github.nedelis.goldenberries;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoldenBerries implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("goldenberries");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
