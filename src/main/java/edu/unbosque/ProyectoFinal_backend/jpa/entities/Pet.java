package edu.unbosque.ProyectoFinal_backend.jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Pet")
public class Pet {
    @OneToMany(mappedBy="pet", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PetCase> cases = new ArrayList<>();

    @OneToMany(mappedBy="pet", cascade = CascadeType.ALL)
    private List<Visit> visits = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "person_id",referencedColumnName = "person_id")
    private Owner owner;

    @Id
    @GeneratedValue
    @Column(name="pet_id")
    private int pet_id;

    @Column(name="microschip")
    private String microschip;

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



    public Pet(int pet_id, String microschip, String species, String race, String size, String sex, String picture, int owner_id) {
        this.pet_id = pet_id;
        this.microschip = microschip;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;

    }

    public Pet() {
    }
}
