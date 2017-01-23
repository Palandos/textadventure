package data.model;

import java.util.UUID;

/**
 * Created by daniel on 23.01.17.
 */
public class Ability {

    private final UUID id = UUID.randomUUID();

    private String name;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
