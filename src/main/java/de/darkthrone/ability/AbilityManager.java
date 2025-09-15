package de.darkthrone.ability;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AbilityManager {
    private static final Map<UUID, AbilityType> ABILITIES = new HashMap<>();

    public static void setAbility(UUID player, AbilityType type) {
        ABILITIES.put(player, type);
    }

    public static AbilityType getAbility(UUID player) {
        return ABILITIES.getOrDefault(player, AbilityType.NONE);
    }
}
