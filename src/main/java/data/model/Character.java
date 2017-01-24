package data.model;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * Created by daniel on 23.01.17.
 */
public class Character implements Serializable {

    private final UUID id = UUID.randomUUID();

    private String name;
    private List<Attribute> attributeList;
    private List<Ability> abilityList;

    public Character() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ability> getAbilityList() {
        return abilityList;
    }

    public void setAbilityList(List<Ability> abilityList) {
        this.abilityList = abilityList;
    }

    public List<Attribute> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(List<Attribute> attributeList) {
        this.attributeList = attributeList;
    }
}
