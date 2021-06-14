package edu.unbosque.ProyectoFinal_backend.jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Pet")

public class Pet {
    @OneToMany(mappedBy="pet", cascade = CascadeType.ALL)
    private List<PetCase> cases = new ArrayList<>();

    @OneToMany(mappedBy="pet", cascade = CascadeType.ALL)
    private List<Visit> visits = new ArrayList<>();

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", referencedColumnName = "username")
    private Owner owner;

    @Id
    @GeneratedValue
    @Column(name="pet_id")
    private Integer pet_id;

    @Column(name="microchip")
    private String microchip;

    @Column(name="species")
    private String species;

    @Column(name="race")
    private String race;

    @Column(name="size")
    private String size;

    @Column(name="sex")
    private String sex;

    @Column(name="picture")
    private String picture;


    public Pet() {
    }

    public Pet(int pet_id, String microchip, String species, String race, String size, String sex, String picture, int owner_id) {
        this.pet_id = pet_id;
        this.microchip = microchip;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;

    }


}
