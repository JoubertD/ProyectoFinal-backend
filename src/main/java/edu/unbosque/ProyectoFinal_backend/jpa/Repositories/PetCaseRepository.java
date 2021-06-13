package edu.unbosque.ProyectoFinal_backend.jpa.Repositories;




import edu.unbosque.ProyectoFinal_backend.jpa.entities.PetCase;

import java.util.Optional;

public interface PetCaseRepository {

    Optional<PetCase> save(PetCase petCase);
}
