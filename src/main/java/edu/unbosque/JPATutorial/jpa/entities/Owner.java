package edu.unbosque.JPATutorial.jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Owner")

public class Owner {
    @OneToMany(mappedBy = "owner", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    List<Pet> pets = new ArrayList<>();

    @OneToOne(cascade =CascadeType.ALL)
    @Id
    @JoinColumn(name="username")
    UserApp userapp;



    @Column(name="person_id")
    int person_id;

    @Column(name="name")
    String name;

    @Column(name="address")
    String address;

    @Column(name="neighborhood")
    String neighborhood;

    public Owner(UserApp userapp, int person_id, String name, String address, String neighborhood) {
        this.userapp = userapp;
        this.person_id = person_id;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }

    public Owner() {
    }
}