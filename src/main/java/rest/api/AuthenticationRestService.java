package rest.api;

import data.api.UserService;
import data.model.User;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by daniel on 24.01.17.
 */

@Stateless
@Path("login")
@Produces(MediaType.APPLICATION_JSON)
public class AuthenticationRestService {

    private UserService userService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public boolean acceptLogin(rest.model.User user) {
        return userService.loginAccept(user.getUsername(), user.getPassword());
    }

}
