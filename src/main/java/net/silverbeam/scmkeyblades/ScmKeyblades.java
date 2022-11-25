package net.silverbeam.scmkeyblades;

import net.fabricmc.api.ModInitializer;
import net.silverbeam.scmkeyblades.block.ModBlocks;
import net.silverbeam.scmkeyblades.item.ModItems;
import net.silverbeam.scmkeyblades.world.feature.ModConfiguredFeatures;
import net.silverbeam.scmkeyblades.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScmKeyblades implements ModInitializer {
	public static final String MOD_ID = "scm-keyblades";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModOreGeneration.generateOres();
	}
}
