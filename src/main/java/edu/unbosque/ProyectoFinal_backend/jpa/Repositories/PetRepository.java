package edu.unbosque.ProyectoFinal_backend.jpa.Repositories;


import edu.unbosque.ProyectoFinal_backend.jpa.entities.Pet;


import java.util.Optional;

public interface PetRepository {

    Optional<Pet> save(Pet pet);
}
