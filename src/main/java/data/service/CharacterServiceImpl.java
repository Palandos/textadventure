package data.service;

import data.api.AttributeService;
import data.api.CharacterService;
import data.model.Attribute;
import data.model.Character;

import javax.ejb.EJB;
import java.util.List;

/**
 * Created by daniel on 23.01.17.
 */


public class CharacterServiceImpl implements CharacterService {

    private AttributeService attributeService;

    public Character cleanCharacter() {
        Character character = new Character();

        List<Attribute> attributeList = attributeService.createAttributeList();
        character.setAttributeList(attributeList);

        return character;
    }

}
