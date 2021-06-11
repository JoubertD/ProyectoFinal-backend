package resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("owners")
public class OwnersResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@DefaultValue("0") @QueryParam("id") int person_id,
                         @QueryParam("neighbourhood") String neighbourhood
            , @QueryParam("name") String name) {

        int type = 0;

        if (person_id != 0) {
            type = 1;
        } else if (person_id == 0 && name == null && neighbourhood != null) {
            type = 2;
        } else if (person_id == 0 && neighbourhood == null && name != null) {
            type = 3;
        } else {
            type = 0;
        }

        List<PetPOJO> list1 = new ArrayList<PetPOJO>();
        list1.add(new PetPOJO());

        List<OwnerPOJO> owners = new ArrayList<OwnerPOJO>();

        OwnerPOJO owner1 = new OwnerPOJO(1, "David Jose Nogales León",
                "Diagonal 200 3950", "Bogotá", new ArrayList<String>());
        PetPOJO pet1 = new PetPOJO(1, "MAAAA5421", "James", "Feline", "Abisinio", "Big",
                "Male", "James.jpg", new OwnerPOJO(), 1);

        PetPOJO pet2 = new PetPOJO(2, "MAAAA5422", "Olivia", "Canine", "Husky", "Medium",
                "Female", "husky.jpg", new OwnerPOJO(), 1);


        owner1.getPet().add(pet1.getName());
        owner1.getPet().add(pet2.getName());
        pet1.setOwner(owner1);
        pet2.setOwner(owner1);
        owners.add(owner1);

        OwnerPOJO owner2 = new OwnerPOJO(2, "David Jose Nogales León",
                "Diagonal 200 3950", "Bogotá", new ArrayList<String>());
        pet1 = new PetPOJO(1, "MAAAA5421", "Fernand", "Feline", "Siberiano", "Big",
                "Male", "Fernand.jpg", new OwnerPOJO(), 2);

        pet2 = new PetPOJO(2, "MAAAA5422", "Marin", "Canine", "Husky", "Big",
                "Female", "husky2.jpg", new OwnerPOJO(), 2);


        owner2.getPet().add(pet1.getName());
        owner2.getPet().add(pet2.getName());
        pet1.setOwner(owner2);
        pet2.setOwner(owner2);
        owners.add(owner2);


        owners.add(new OwnerPOJO(3, "Daniela Pereira",
                "calle 200 2800", "Santander", null));
        owners.add(new OwnerPOJO(4, "Roberto Gomez",
                "calle 200 7000", "Cali", null));
        OwnerPOJO found = null;

        for (OwnerPOJO owner : owners) {

            if (type == 1) {
                if (person_id == owner.getPerson_id()) {
                    found = owner;
                    return Response.ok()
                            .entity(found)
                            .build();
                }
            } else if (type == 2) {
                if (neighbourhood.equals(owner.getNeighborhood())) {
                    found = owner;
                    return Response.ok()
                            .entity(found)
                            .build();
                }
            } else if (type == 3) {
                if (name.equals(owner.getName())) {
                    found = owner;
                    return Response.ok()
                            .entity(found)
                            .build();
                }
            } else {
                return Response.status(Response.Status.OK).
                        entity(owners)
                        .build();
            }
        }
        return Response.status(Response.Status.NOT_FOUND).
                entity("Owner Not Found")
                .build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(OwnerPOJO o) {
        List<OwnerPOJO> owners = new ArrayList<OwnerPOJO>();
        o.setPerson_id(3);
        owners.add(o);

        return Response.status(Response.Status.CREATED)
                .entity(o)
                .build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listByNeighbourhood() {


        return Response.status(Response.Status.NOT_FOUND).
                entity("holaaaaaaaaaa")
                .build();




    }




}
