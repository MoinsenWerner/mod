package de.darkthrone.kingdom;

import java.util.HashMap;
import java.util.Map;

/**
 * Registry for all kingdoms on the server. Real persistence is not implemented
 * but can be added later.
 */
public class KingdomManager {
    private static final Map<String, Kingdom> kingdoms = new HashMap<>();

    public static Kingdom createKingdom(String name) {
        return kingdoms.computeIfAbsent(name, Kingdom::new);
    }

    public static void deleteKingdom(String name) {
        kingdoms.remove(name);
    }

    public static Kingdom getKingdom(String name) {
        return kingdoms.get(name);
    }
}
