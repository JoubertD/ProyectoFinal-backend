//package resources;
//
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
//@Path("/owners/{personId}/pets/{id}")
//public class PetResource {
//
//    @PUT
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response modify(@PathParam("personId") Integer personId, @PathParam("id") Integer id, PetPOJO pet) {
//
//        return Response.ok()
//                .entity(pet)
//                .build();
//    }
//
//    @DELETE
//    public Response delete(@PathParam("personId") Integer personId, @PathParam("id") Integer id) {
//
//        return Response.noContent()
//                .build();
//    }
//
//}