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
    public Optional<PetCase> save(String username, Integer petId, String created_at, String type, String description) {

        try {
            entityManager.getTransaction().begin();
            Pet pet = entityManager.find(Pet.class, petId);
            PetCase Pcase = new PetCase(created_at,type,description);
            pet.addCase(Pcase);
            Pcase.setPet(pet);
            entityManager.persist(Pcase);
            entityManager.getTransaction().commit();
            return Optional.of(Pcase);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
