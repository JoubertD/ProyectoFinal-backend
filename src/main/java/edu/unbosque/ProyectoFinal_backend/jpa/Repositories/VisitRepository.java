package edu.unbosque.ProyectoFinal_backend.jpa.Repositories;




import edu.unbosque.ProyectoFinal_backend.jpa.entities.PetCase;
import edu.unbosque.ProyectoFinal_backend.jpa.entities.Visit;

import java.util.Optional;

public interface VisitRepository {

    Optional<Visit> save(Integer petId, String vetUsername, String created_at, String type, String description);
}
