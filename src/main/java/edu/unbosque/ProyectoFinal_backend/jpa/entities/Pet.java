package edu.unbosque.ProyectoFinal_backend.jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Pet")
public class Pet {
    @OneToMany(mappedBy="pet",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    List<PetCase> cases = new ArrayList<>();

    @OneToMany(mappedBy="pet",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    List<Visit> visits = new ArrayList<>();





    @ManyToOne()
    @JoinColumn(name = "owner_id")
    Owner owner;

    @Id
    @Column(name="pet_id")
    int pet_id;

    @Column(name="microschip")
    String microschip;

    @Column(name="species")
    String species;

    @Column(name="race")
    String race;

    @Column(name="size")
    String size;

    @Column(name="sex")
    String sex;

    @Column(name="picture")
    String picture;

    @Column(name="owner_id")
    int owner_id;

    public Pet(int pet_id, String microschip, String species, String race, String size, String sex, String picture, int owner_id) {
        this.pet_id = pet_id;
        this.microschip = microschip;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
        this.owner_id = owner_id;
    }

    public Pet() {
    }
}
