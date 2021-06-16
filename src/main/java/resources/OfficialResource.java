package resources;

import edu.unbosque.ProyectoFinal_backend.jpa.services.OwnerService;
import resources.pojos.OwnerPOJO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
@Path("app/{username}/list-owners")
public class OfficialResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Logged

    public Response list(@PathParam("username") String username){
        OwnerService o = new OwnerService();
        List<OwnerPOJO> owners = o.listOwners();

        return Response.status(Response.Status.OK)
                .entity(owners)
                .build();
    }



}
