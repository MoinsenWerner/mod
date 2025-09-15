package de.darkthrone.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import de.darkthrone.ability.AbilityManager;
import de.darkthrone.ability.AbilityType;
import de.darkthrone.kingdom.KingdomManager;

/**
 * Registers the basic commands described in docs/PLAN.md. The implementations
 * are placeholders that log to the server console.
 */
public class ModCommands {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        // Ability change command
        dispatcher.register(Commands.literal("ability")
            .requires(src -> src.hasPermission(2))
            .then(Commands.literal("change")
                .then(Commands.argument("player", EntityArgument.player())
                    .then(Commands.argument("ability", StringArgumentType.word())
                        .executes(ctx -> {
                            ServerPlayer target = EntityArgument.getPlayer(ctx, "player");
                            String abilityName = StringArgumentType.getString(ctx, "ability").toUpperCase();
                            try {
                                AbilityType ability = AbilityType.valueOf(abilityName);
                                AbilityManager.setAbility(target, ability);
                                ctx.getSource().sendSuccess(() ->
                                    Component.literal(target.getName().getString() + " set to ability " + ability), true);
                            } catch (IllegalArgumentException ex) {
                                ctx.getSource().sendFailure(() ->
                                    Component.literal("Unknown ability: " + abilityName));
                            }
                            return 1;
                        })))))
        );

        // Kingdom creation/deletion
        dispatcher.register(Commands.literal("kingdom")
            .requires(src -> src.hasPermission(2))
            .then(Commands.argument("name", StringArgumentType.word())
                .then(Commands.literal("set")
                    .executes(ctx -> {
                        String name = StringArgumentType.getString(ctx, "name");
                        KingdomManager.createKingdom(name);
                        ctx.getSource().sendSuccess(() ->
                            Component.literal("Kingdom " + name + " created"), true);
                        return 1;
                    }))
                .then(Commands.literal("del")
                    .executes(ctx -> {
                        String name = StringArgumentType.getString(ctx, "name");
                        KingdomManager.deleteKingdom(name);
                        ctx.getSource().sendSuccess(() ->
                            Component.literal("Kingdom " + name + " deleted"), true);
                        return 1;
                    })))));

        // Delkingdom shortcut
        dispatcher.register(Commands.literal("delkingdom")
            .requires(src -> src.hasPermission(2))
            .then(Commands.argument("name", StringArgumentType.word())
                .executes(ctx -> {
                    String name = StringArgumentType.getString(ctx, "name");
                    KingdomManager.deleteKingdom(name);
                    ctx.getSource().sendSuccess(() ->
                        Component.literal("Kingdom " + name + " deleted"), true);
                    return 1;
                })));

        // NoPVP command placeholder
        dispatcher.register(Commands.literal("nopvp")
            .requires(src -> src.hasPermission(2))
            .executes(ctx -> {
                ctx.getSource().sendSuccess(() -> Component.literal("No-PvP zone defined"), true);
                return 1;
            }));

        // Career command placeholder
        dispatcher.register(Commands.literal("career")
            .then(Commands.argument("position", StringArgumentType.word())
                .executes(ctx -> {
                    String pos = StringArgumentType.getString(ctx, "position");
                    ctx.getSource().sendSuccess(() -> Component.literal("Position set to " + pos), true);
                    return 1;
                })
                .then(Commands.argument("player", EntityArgument.player())
                    .executes(ctx -> {
                        String pos = StringArgumentType.getString(ctx, "position");
                        ServerPlayer target = EntityArgument.getPlayer(ctx, "player");
                        ctx.getSource().sendSuccess(() -> Component.literal("Position " + pos + " set for " + target.getName().getString()), true);
                        return 1;
                    }))));

        // Vote king placeholder
        dispatcher.register(Commands.literal("vote")
            .then(Commands.literal("king")
                .then(Commands.argument("player", EntityArgument.player())
                    .executes(ctx -> {
                        ServerPlayer target = EntityArgument.getPlayer(ctx, "player");
                        ctx.getSource().sendSuccess(() -> Component.literal("Voted for " + target.getName().getString()), true);
                        return 1;
                    }))));

        // War/peace/joinwar placeholders
        dispatcher.register(Commands.literal("war")
            .then(Commands.argument("kingdom", StringArgumentType.word())
                .executes(ctx -> {
                    String name = StringArgumentType.getString(ctx, "kingdom");
                    ctx.getSource().sendSuccess(() -> Component.literal("War declared on " + name), true);
                    return 1;
                })));

        dispatcher.register(Commands.literal("peace")
            .then(Commands.argument("kingdom", StringArgumentType.word())
                .executes(ctx -> {
                    String name = StringArgumentType.getString(ctx, "kingdom");
                    ctx.getSource().sendSuccess(() -> Component.literal("Peace made with " + name), true);
                    return 1;
                })));

        dispatcher.register(Commands.literal("joinwar")
            .then(Commands.argument("kingdom", StringArgumentType.word())
                .executes(ctx -> {
                    String name = StringArgumentType.getString(ctx, "kingdom");
                    ctx.getSource().sendSuccess(() -> Component.literal("Joined war against " + name), true);
                    return 1;
                })));

        // Exil command placeholder
        dispatcher.register(Commands.literal("exil")
            .then(Commands.argument("player", EntityArgument.player())
                .executes(ctx -> {
                    ServerPlayer target = EntityArgument.getPlayer(ctx, "player");
                    ctx.getSource().sendSuccess(() -> Component.literal(target.getName().getString() + " exiled"), true);
                    return 1;
                })));

        // Horse command placeholder
        dispatcher.register(Commands.literal("horse")
            .executes(ctx -> {
                ctx.getSource().sendSuccess(() -> Component.literal("Horse summoned"), true);
                return 1;
            }));

        // Knight equip command placeholder
        dispatcher.register(Commands.literal("knight")
            .then(Commands.literal("equip")
                .executes(ctx -> {
                    ctx.getSource().sendSuccess(() -> Component.literal("Knight equipment granted"), true);
                    return 1;
                })));
    }
}
