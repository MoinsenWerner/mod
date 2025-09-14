package de.darkthrone;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(DarkThrone.MOD_ID)
public class DarkThrone {
    public static final String MOD_ID = "darkthrone";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DarkThrone() {
        LOGGER.info("Dark Throne mod initialisiert");
    }
}
