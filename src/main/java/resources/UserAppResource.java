package resources;

import edu.unbosque.ProyectoFinal_backend.jpa.services.OwnerService;
import edu.unbosque.ProyectoFinal_backend.jpa.services.UserAppService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/app")
public class UserAppResource {



    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public Response create(@QueryParam("username") String username
            , @QueryParam("password") String password ,
            @QueryParam("email") String email,
            @QueryParam("role") String role,
              @QueryParam("name") String name
            , @QueryParam("neighbourhood") String neighbourhood ,
             @QueryParam("address") String address) {

        UserAppService u = new UserAppService();
        u.create(username,password,email,role);
//
        OwnerService o = new OwnerService();
        o.createOwner(name, address, neighbourhood, u.getUser(username,password));

        return Response.status(Response.Status.CREATED)
                .entity("User created!!!")
                .build();
    }

}