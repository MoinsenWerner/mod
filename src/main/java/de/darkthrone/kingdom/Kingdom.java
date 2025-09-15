package de.darkthrone.kingdom;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Simple data holder for kingdom members. Real position handling and persistence
 * are intentionally omitted.
 */
public class Kingdom {
    private final String name;
    private final Set<UUID> members = new HashSet<>();

    public Kingdom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<UUID> getMembers() {
        return members;
    }
}
