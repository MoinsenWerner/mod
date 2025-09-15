package de.darkthrone.kingdom;

import java.util.HashMap;
import java.util.Map;

public class KingdomManager {
    private static final Map<String, Kingdom> KINGDOMS = new HashMap<>();

    public static void addKingdom(String name) {
        KINGDOMS.put(name, new Kingdom(name));
    }

    public static void removeKingdom(String name) {
        KINGDOMS.remove(name);
    }

    public static boolean exists(String name) {
        return KINGDOMS.containsKey(name);
    }
}
