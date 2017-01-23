package data.model;

import java.util.List;
import java.util.UUID;

/**
 * Created by daniel on 23.01.17.
 */
public class Character {

    private final UUID id = UUID.randomUUID();

    private String name;
    private int strenght;
    private int dexterity;
    private int intelligence;
    private int charisma;
    private int appearance;
    private List<Ability> abilityList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
