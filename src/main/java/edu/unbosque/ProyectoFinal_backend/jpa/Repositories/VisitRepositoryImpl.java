package edu.unbosque.ProyectoFinal_backend.jpa.Repositories;


import edu.unbosque.ProyectoFinal_backend.jpa.entities.Pet;
import edu.unbosque.ProyectoFinal_backend.jpa.entities.PetCase;
import edu.unbosque.ProyectoFinal_backend.jpa.entities.Vet;
import edu.unbosque.ProyectoFinal_backend.jpa.entities.Visit;

import javax.persistence.EntityManager;
import java.util.Optional;

public class VisitRepositoryImpl implements VisitRepository {

    private EntityManager entityManager;

    public VisitRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Visit> save(Integer petId, String vetUsername, String created_at, String type, String description){
        try {
            entityManager.getTransaction().begin();
            Vet vet = entityManager.find(Vet.class, vetUsername);
            Pet pet = entityManager.find(Pet.class, petId);
            Visit v = new Visit(created_at,type,description);
            vet.addVisit(v);
            pet.addVisit(v);
            v.setPet(pet);
            v.setVet(vet);
            entityManager.persist(v);
            entityManager.getTransaction().commit();
            return Optional.of(v);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
