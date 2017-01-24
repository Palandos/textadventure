package rest.api;

/**
 * Created by daniel on 23.01.17.
 */

import data.api.AttributeService;
import data.api.CharacterService;
import data.model.Character;
import data.service.AttributeServiceImpl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("character")
@Produces(MediaType.APPLICATION_JSON)
public class CharacterRestService {

    private CharacterService characterService;

    @GET
    @Path("creation")
    public Character cleanCharacter() {

        return characterService.cleanCharacter();

    }

}
