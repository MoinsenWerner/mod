package de.darkthrone.item;

import de.darkthrone.DarkThrone;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    private static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(Registries.ITEM, DarkThrone.MOD_ID);

    public static final RegistryObject<Item> PASS =
        ITEMS.register("pass", () ->
            new PassItem(new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse(DarkThrone.MOD_ID + ":pass")))
                .stacksTo(1))
        );

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
