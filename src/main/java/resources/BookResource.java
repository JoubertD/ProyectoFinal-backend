package resources;

import resources.pojos.Official;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/authors/{authorId}/books/{id}")
public class BookResource {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("authorId") Integer authorId, @PathParam("id") Integer id, Official official) {

        return Response.ok()
                .entity(official)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("authorId") Integer authorId, @PathParam("id") Integer id) {

        return Response.noContent()
                .build();
    }

}
