package resources;

import resources.pojos.Official;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/authors/{authorId}/books")
public class BooksResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("authorId") Integer authorId) {

        List<Official> officials = new ArrayList<Official>();
        officials.add(new Official(1, "Cien años de soledad", "1234", authorId));
        officials.add(new Official(2, "El coronel no tiene quien le escriba", "1234", authorId));

        return Response.ok()
                .entity(officials)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("authorId") Integer authorId, Official official) {

        official.setBookId(3);

        return Response.status(Response.Status.CREATED)
                .entity(official)
                .build();
    }

}
