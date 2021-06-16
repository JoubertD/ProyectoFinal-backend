package edu.unbosque.ProyectoFinal_backend.jpa.services;


import edu.unbosque.ProyectoFinal_backend.jpa.Repositories.OwnerRepository;
import edu.unbosque.ProyectoFinal_backend.jpa.Repositories.OwnerRepositoryImpl;
import edu.unbosque.ProyectoFinal_backend.jpa.Repositories.PetRepository;
import edu.unbosque.ProyectoFinal_backend.jpa.Repositories.PetRepositoryImpl;
import edu.unbosque.ProyectoFinal_backend.jpa.entities.Owner;
import edu.unbosque.ProyectoFinal_backend.jpa.entities.Pet;
import edu.unbosque.ProyectoFinal_backend.jpa.entities.UserApp;
import resources.pojos.OwnerPOJO;
import resources.pojos.PetPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;

@Stateless
public class PetService {

    PetRepository petRepository;

    public Optional<PetPOJO> createPet(String username,String microchip, String species, String race, String size, String sex, String picture, String name) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        petRepository = new PetRepositoryImpl(entityManager);


        Optional<Pet> persistedPet = petRepository.save(username,new Pet(microchip, species, race, size, sex, picture, name));

        entityManager.close();
        entityManagerFactory.close();

        if (persistedPet.isPresent()) {
            return Optional.of(new PetPOJO());
        } else {
            return Optional.empty();
        }

    }

    public Optional<PetPOJO> updatePet(String username,int petId, String microchip, String species, String race, String size, String sex, String picture, String name) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        petRepository = new PetRepositoryImpl(entityManager);


        Optional<Pet> updatedPet = petRepository.update(username,petId,microchip,  species,  race,  size,  sex,  picture,name);

        entityManager.close();
        entityManagerFactory.close();

        if (updatedPet.isPresent()) {
            return Optional.of(new PetPOJO());
        } else {
            return Optional.empty();
        }

    }

}
