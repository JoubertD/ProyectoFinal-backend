package resources;


import edu.unbosque.ProyectoFinal_backend.jpa.services.CaseService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Random;

@Path("app/owners/{username}/pets/{petId}/case")
public class CaseResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("username") String username, @PathParam("petId") Integer petId,
                           @QueryParam("created_at") String created_at,
                           @QueryParam("type") String type,
                           @QueryParam("description") String description) {

        CaseService c = new CaseService();
        c.createCase(username,  petId,  created_at,  type,  description);


        return Response.status(Response.Status.CREATED)
                .entity("D")
                .build();
    }



}