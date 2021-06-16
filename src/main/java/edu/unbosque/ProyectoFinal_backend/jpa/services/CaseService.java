package edu.unbosque.ProyectoFinal_backend.jpa.services;

import edu.unbosque.ProyectoFinal_backend.jpa.Repositories.PetCaseRepository;
import edu.unbosque.ProyectoFinal_backend.jpa.Repositories.PetCaseRepositoryImpl;
import edu.unbosque.ProyectoFinal_backend.jpa.entities.PetCase;
import resources.pojos.PetCasePOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;

@Stateless
public class CaseService {

    PetCaseRepository caseRepository;

    public Optional<PetCasePOJO> createCase(String username, Integer petId, String created_at, String type, String description) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        caseRepository = new PetCaseRepositoryImpl(entityManager);


        Optional<PetCase> persistedPetCase = caseRepository.save(username,  petId,  created_at,  type,  description);

        entityManager.close();
        entityManagerFactory.close();

        if (persistedPetCase.isPresent()) {
            return Optional.of(new PetCasePOJO());
        } else {
            return Optional.empty();
        }

    }



}
