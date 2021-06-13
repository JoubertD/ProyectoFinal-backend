package edu.unbosque.ProyectoFinal_backend.jpa.services;


import edu.unbosque.ProyectoFinal_backend.jpa.Repositories.OwnerRepository;
import edu.unbosque.ProyectoFinal_backend.jpa.Repositories.OwnerRepositoryImpl;
import resources.pojos.OwnerPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;

@Stateless
public class OwnerService {

    OwnerRepository ownerRepository;

    public Optional<OwnerPOJO> createOwner(OwnerPOJO ownerPOJO) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        ownerRepository = new OwnerRepositoryImpl(entityManager);

        OwnerPOJO owner = new OwnerPOJO(ownerPOJO.getEmail(), ownerPOJO.getPassword(), ownerPOJO.getEmail(),
                ownerPOJO.getPerson_id(), ownerPOJO.getName(), ownerPOJO.getAddress(), ownerPOJO.getNeighborhood());
        Optional<OwnerPOJO> persistedOwner = ownerRepository.save(owner);

        entityManager.close();
        entityManagerFactory.close();

        if (persistedOwner.isPresent()) {
            return Optional.of(new OwnerPOJO(persistedOwner.get().getUsername(),
                    persistedOwner.get().getPassword(),
                    persistedOwner.get().getEmail(),
                    persistedOwner.get().getPersonId(),
                    persistedOwner.get().getName(),
                    persistedOwner.get().getAddress(),
                    persistedOwner.get().getNeighborhood()));
        } else {
            return Optional.empty();
        }

    }

}
