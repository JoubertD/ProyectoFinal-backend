package edu.unbosque.ProyectoFinal_backend.jpa.Repositories;


import edu.unbosque.ProyectoFinal_backend.jpa.entities.Pet;


import java.util.Optional;

public interface PetRepository {

    Optional<Pet> save(String username, Pet pet);

    Optional<Pet> update(int petId, String microchip, String species, String race, String size, String sex, String picture);
}
