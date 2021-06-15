package edu.unbosque.ProyectoFinal_backend.jpa.Repositories;



import edu.unbosque.ProyectoFinal_backend.jpa.entities.Owner;
import edu.unbosque.ProyectoFinal_backend.jpa.entities.Pet;

import javax.persistence.EntityManager;
import java.util.Optional;

public class PetRepositoryImpl implements PetRepository {

    private EntityManager entityManager;

    public PetRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Pet> save(String username, Pet pet) {
        Owner o = entityManager.find(Owner.class , username);
        try {
            entityManager.getTransaction().begin();
            o.addPet(pet);
            pet.setOwner(o);


            entityManager.persist(pet);
            entityManager.getTransaction().commit();
            return Optional.of(pet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public Optional<Pet> update(int petId, String microchip, String species, String race, String size, String sex, String picture) {

        try {
            Pet pet = entityManager.find(Pet.class, petId);
            entityManager.getTransaction().begin();

            pet.setMicrochip(microchip);
            pet.setSpecies(species);
            pet.setRace(race);
            pet.setSize(size);
            pet.setSex(sex);
            pet.setPicture(picture);

            entityManager.getTransaction().commit();
            return Optional.of(pet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }


}
