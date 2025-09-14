package de.darkthrone;

import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(DarkThrone.MOD_ID)
public class DarkThrone {
    public static final String MOD_ID = "darkthrone";
    private static final Logger LOGGER = LoggerFactory.getLogger(DarkThrone.class);

    public DarkThrone() {
        LOGGER.info("Dark Throne mod initialisiert");
    }
}