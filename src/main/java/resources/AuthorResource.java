package resources;

import resources.pojos.UserApp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/authors/{id}")
public class AuthorResource {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("id") Integer id, UserApp userApp) {

        return Response.ok()
                .entity(userApp)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("id") Integer id) {

        return Response.noContent()
                .build();
    }

}
