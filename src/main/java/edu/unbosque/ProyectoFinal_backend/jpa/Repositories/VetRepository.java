package edu.unbosque.ProyectoFinal_backend.jpa.Repositories;



import edu.unbosque.ProyectoFinal_backend.jpa.entities.Vet;

import java.util.Optional;

public interface VetRepository {

    Optional<Vet> save(Vet vet);
}
