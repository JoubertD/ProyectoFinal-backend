package edu.unbosque.ProyectoFinal_backend.jpa.Repositories;



import edu.unbosque.ProyectoFinal_backend.jpa.entities.Pet;
import edu.unbosque.ProyectoFinal_backend.jpa.entities.PetCase;

import javax.persistence.EntityManager;
import java.util.Optional;

public class PetCaseRepositoryImpl implements PetCaseRepository {

    private EntityManager entityManager;

    public PetCaseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<PetCase> save(PetCase petCase) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(petCase);
            entityManager.getTransaction().commit();
            return Optional.of(petCase);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
