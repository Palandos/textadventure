package data.service;

import data.api.AttributeService;
import data.model.Attribute;

import javax.ejb.EJB;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 23.01.17.
 */

@EJB
public class AttributeServiceImpl implements AttributeService {

    public List<Attribute> createAttributeList() {
        List<Attribute> attributeList = new ArrayList<Attribute>();

        attributeList.add(new Attribute("Stärke"));
        attributeList.add(new Attribute("Gewandheit"));
        attributeList.add(new Attribute("Intelligenz"));
        attributeList.add(new Attribute("Aussehen"));
        attributeList.add(new Attribute("Charisma"));
        attributeList.add(new Attribute("Konstitution"));

        return attributeList;
    }

}
