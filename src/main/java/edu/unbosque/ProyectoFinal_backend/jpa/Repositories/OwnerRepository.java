package edu.unbosque.ProyectoFinal_backend.jpa.Repositories;



import edu.unbosque.ProyectoFinal_backend.jpa.entities.Owner;

import java.util.Optional;

public interface OwnerRepository {

    Optional<Owner> save(Owner owner);

    Optional<Owner> update(Integer ownerId, String address, String neighbourhood);
}
