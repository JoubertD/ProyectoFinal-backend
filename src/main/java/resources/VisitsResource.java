package resources;


import edu.unbosque.ProyectoFinal_backend.jpa.services.VisitService;
import resources.pojos.VisitPOJO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Path("app/{username}/owners/pets/{pet_id}/visits")
public class VisitsResource {


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("username") String username,
            @PathParam("pet_id") Integer pet_id,
            @QueryParam("created_at") String created_at,
            @QueryParam("type") String type,
            @QueryParam("description") String description) {

        VisitService v = new VisitService();
        v.createVisit(username, pet_id, created_at, type, description);


        return Response.status(Response.Status.CREATED)
                .entity("Visit was created")
                .build();
    }
}