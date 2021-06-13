package edu.unbosque.ProyectoFinal_backend.jpa.Repositories;



import edu.unbosque.ProyectoFinal_backend.jpa.entities.Owner;

import java.util.Optional;

public interface OwnerRepository {

    Optional<Owner> save(Owner owner);
}
