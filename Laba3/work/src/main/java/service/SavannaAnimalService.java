package service;

import javax.ws.rs.*;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.persistence.Id;

import savanna.Savanna;
import savanna.SavannaAnimal;


@Path("/animal")
public class SavannaAnimalService {

    @Inject
    private Savanna savanna;


    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public SavannaAnimal getSavannaAnimal(@PathParam("id") Integer id) {
        return savanna.getSavannaAnimal(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateSavannaAnimal(SavannaAnimal savannaAnimal) {
        savanna.updateSavannaAnimal(savannaAnimal);
        return Response.status(200).entity("Good").build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createSavannaAnimal(SavannaAnimal savannaAnimal) {
        savanna.addSavannaAnimal(savannaAnimal);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteSavannaAnimal(@PathParam("id") Integer id) {
        savanna.deleteSavannaAnimal(id);
        return Response.status(200).entity("Good").build();
    }
}
