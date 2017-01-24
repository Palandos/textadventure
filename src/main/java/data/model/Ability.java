package data.model;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by daniel on 23.01.17.
 */
public class Ability implements Serializable{

    private final UUID id = UUID.randomUUID();

    private String name;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
