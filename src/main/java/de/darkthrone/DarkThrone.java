package de.darkthrone;

import de.darkthrone.command.ModCommands;
import de.darkthrone.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(DarkThrone.MOD_ID)
public class DarkThrone {
    public static final String MOD_ID = "darkthrone";
    private static final Logger LOGGER = LoggerFactory.getLogger(DarkThrone.class);

    public DarkThrone() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(modBus);

        MinecraftForge.EVENT_BUS.addListener(this::onRegisterCommands);

        LOGGER.info("Dark Throne mod initialisiert");
    }

    private void onRegisterCommands(RegisterCommandsEvent event) {
        ModCommands.register(event.getDispatcher());
    }
}
