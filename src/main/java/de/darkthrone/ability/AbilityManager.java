package de.darkthrone.ability;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import net.minecraft.world.entity.player.Player;

/**
 * Tracks the selected ability for each player. Logic for training or cooldown
 * reductions is intentionally left unimplemented and can be expanded later.
 */
public class AbilityManager {
    private static final Map<UUID, AbilityType> abilities = new HashMap<>();

    public static void setAbility(Player player, AbilityType ability) {
        abilities.put(player.getUUID(), ability);
    }

    public static AbilityType getAbility(Player player) {
        return abilities.get(player.getUUID());
    }
}
