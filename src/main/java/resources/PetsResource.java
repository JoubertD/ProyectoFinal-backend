//package resources;
//
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import java.util.ArrayList;
//import java.util.List;
//
//@Path("/owners/{person_Id}/pets")
//public class PetsResource {
//
//
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response list(@PathParam("person_Id") Integer person_id
//                        ,@DefaultValue("0") @QueryParam("id") Integer petId,
//                         @QueryParam("microchip") String microchip,
//                         @QueryParam("name") String name ,
//                         @QueryParam("specie") String specie,
//                         @QueryParam("race") String race,
//                         @QueryParam("size") String size,
//                         @QueryParam("sex") String sex) {
//
//        int type = 0;
//
//        if(petId != 0){
//            type = 1;
//        }else if(petId == 0 && microchip != null
//                && name == null && specie == null
//                && race == null && size == null
//                && sex == null){
//            type = 2;
//        }else if(petId == 0 && microchip == null
//                && name != null && specie == null
//                && race == null && size == null
//                && sex == null){
//            type = 3;
//        }else if(petId == 0 && microchip == null
//                && name == null && specie != null
//                && race == null && size == null
//                && sex == null){
//            type = 4;
//        }else if(petId == 0 && microchip == null
//                && name == null && specie == null
//                && race != null && size == null
//                && sex == null){
//            type = 5;
//        }else if(petId == 0 && microchip == null
//                && name == null && specie == null
//                && race == null && size != null
//                && sex == null){
//            type = 6;
//        }else if(petId == 0 && microchip == null
//                && name == null && specie == null
//                && race == null && size == null
//                && sex != null){
//            type = 7;
//        }
//
//        List<PetPOJO> pets = new ArrayList<PetPOJO>();
//
//        OwnerPOJO owner1 = new OwnerPOJO(person_id, "David Jose Nogales León",
//                "Diagonal 200 3950" , "Bogotá" , null);
//        PetPOJO pet1 = new PetPOJO(1, "MAAAA5421" , "James" , "Feline" , "Abisinio" , "Big" ,
//                "Male" , "James.jpg"  , new OwnerPOJO(), person_id);
//        owner1.setPet(new ArrayList<String>());
//        owner1.getPet().add(pet1.getName());
//        pet1.setOwner(owner1);
//
//        pets.add(pet1);
//
//        OwnerPOJO owner2 = new OwnerPOJO(person_id, "Mario Carrilo",
//                "Diagonal 200 39508646" , "Caracas" , null);
//        PetPOJO pet2 = new PetPOJO(2, "246534654" , "Olivia" , "Canine" , "Husky" , "Medium" ,
//                "Female" , "husky.jpg" , new OwnerPOJO(), person_id);
//        owner2.setPet(new ArrayList<String>());
//        owner2.getPet().add(pet2.getName());
//        pet2.setOwner(owner2);
//
//        pets.add(pet2);
//
//        PetPOJO found;
//
//        for (PetPOJO pet: pets) {
//            System.out.println("id:" + type);
//            if(type == 1){
//                if(petId == pet.getPet_id()){
//                    found = pet;
//                    return Response.ok()
//                            .entity(found)
//                            .build();
//                }
//            }else if(type == 2){
//                if(microchip.equalsIgnoreCase(pet.getMicrochip())){
//
//                    found = pet;
//                    return Response.ok()
//                            .entity(found)
//                            .build();
//                }
//            }else if(type == 3){
//                if(name.equalsIgnoreCase(pet.getName())){
//                    found = pet;
//                    return Response.ok()
//                            .entity(found)
//                            .build();
//                }
//            }else if(type == 4){
//                if(specie.equalsIgnoreCase(pet.getSpecies())) {
//                    found = pet;
//                    return Response.ok()
//                            .entity(found)
//                            .build();
//                    }
//                }else if(type == 5) {
//                    if (race.equalsIgnoreCase(pet.getRace())) {
//                        found = pet;
//                        return Response.ok()
//                                .entity(found)
//                                .build();
//                        }
//                    } else if (type == 6) {
//                        if (size.equalsIgnoreCase(pet.getSize())) {
//                            found = pet;
//                            return Response.ok()
//                                    .entity(found)
//                                    .build();
//                            }
//                        } else if (type == 7) {
//                            if (sex.equalsIgnoreCase(pet.getSex())) {
//                                found = pet;
//                                return Response.ok()
//                                        .entity(found)
//                                        .build();
//                                 }
//                            } else {
//                                return Response.status(Response.Status.OK).
//                                        entity(pets)
//                                        .build();
//                            }
//                        }
//                        return Response.status(Response.Status.NOT_FOUND).
//                                entity("Owner Not Found")
//                                .build();
//
//
//
//
//    }
//
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response create(@PathParam("person_Id") Integer personId, PetPOJO p) {
//
//        p.setPet_id(3);
//
//        return Response.status(Response.Status.CREATED)
//                .entity(p)
//                .build();
//    }
//
//
//
//
//
//
//
//
//
//}
