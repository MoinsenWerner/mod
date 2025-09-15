package de.darkthrone.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import de.darkthrone.ability.AbilityManager;
import de.darkthrone.ability.AbilityType;
import de.darkthrone.kingdom.KingdomManager;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ModCommands {

    public static void register() {
        // no-op; classloading triggers event bus registration
    }

    @SubscribeEvent
    public static void onRegister(RegisterCommandsEvent event) {
        CommandDispatcher<CommandSourceStack> dispatcher = event.getDispatcher();

        dispatcher.register(
            Commands.literal("ability")
                .then(Commands.literal("set")
                    .then(Commands.argument("ability", StringArgumentType.word())
                        .executes(ctx -> {
                            AbilityType type;
                            try {
                                type = AbilityType.valueOf(StringArgumentType.getString(ctx, "ability").toUpperCase());
                            } catch (IllegalArgumentException e) {
                                return 0;
                            }
                            AbilityManager.setAbility(ctx.getSource().getPlayerOrException().getUUID(), type);
                            return 1;
                        })))
                .then(Commands.literal("get")
                    .executes(ctx -> {
                        AbilityType type = AbilityManager.getAbility(ctx.getSource().getPlayerOrException().getUUID());
                        ctx.getSource().sendSuccess(() -> Component.literal(type.name()), false);
                        return 1;
                    }))
        );

        dispatcher.register(
            Commands.literal("kingdom")
                .then(Commands.literal("create")
                    .then(Commands.argument("name", StringArgumentType.word())
                        .executes(ctx -> {
                            KingdomManager.addKingdom(StringArgumentType.getString(ctx, "name"));
                            return 1;
                        })))
                .then(Commands.literal("delete")
                    .then(Commands.argument("name", StringArgumentType.word())
                        .executes(ctx -> {
                            KingdomManager.removeKingdom(StringArgumentType.getString(ctx, "name"));
                            return 1;
                        })))
        );
    }
}
