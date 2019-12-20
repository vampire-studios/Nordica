package io.github.vampirestudios.nordica;

import io.github.vampirestudios.nordica.init.NEntities;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Nordica implements ModInitializer {

    public static final String NAME = "Nordica";
    public static final String MOD_ID = "nordica";
    public static final String VERSION = "0.1.0";
    public static final Logger LOGGER = LogManager.getLogger(NAME);

    @Override
    public void onInitialize() {
        LOGGER.info("You're now running " + NAME + " v" + VERSION);

        NEntities.init();
    }

}