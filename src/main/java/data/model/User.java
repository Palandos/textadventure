package data.model;

import data.model.Character;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by daniel on 23.01.17.
 */
public class User {

    private final UUID id = UUID.randomUUID();

    private String username;
    private String name;
    private Date registrationDate;
    private Date lastOnline;
    private Date birthDate;
    private String password;
    private boolean premiumUser;
    private boolean active;

    private List<Character> characterList;

    public User() {}

    public List<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
    }
}
