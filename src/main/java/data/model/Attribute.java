package data.model;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by daniel on 23.01.17.
 */
public class Attribute implements Serializable{

    private final UUID id = UUID.randomUUID();

    private String name;
    private int value = 0;

    public Attribute(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
