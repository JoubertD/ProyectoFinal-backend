package resources;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Random;

@Path("/owners/{personId}/pets/{petId}/case")
public class CaseResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("personId") Integer personId, @PathParam("petId") Integer petId, CasePOJO Tcase) {
        Random r = new Random();
        Tcase.setCase_id(r.nextInt(100));

        return Response.status(Response.Status.CREATED)
                .entity(Tcase)
                .build();
    }



}