package de.darkthrone;

import de.darkthrone.command.ModCommands;
import de.darkthrone.item.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(DarkThrone.MOD_ID)
public class DarkThrone {
    public static final String MOD_ID = "darkthrone";
    private static final Logger LOGGER = LoggerFactory.getLogger(DarkThrone.class);

    public DarkThrone() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(bus);
        ModCommands.register();
        LOGGER.info("DarkThrone initialized");
    }
}
