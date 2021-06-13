package edu.unbosque.ProyectoFinal_backend.jpa.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Owner")

public class Owner implements Serializable {
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    List<Pet> pets = new ArrayList<Pet>();

    @Id
    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name="username")
    UserApp user;


    @GeneratedValue
    @Column(name="person_id", nullable = false)
    Integer person_id;

    @Column(name="name")
    String name;

    @Column(name="address")
    String address;

    @Column(name="neighborhood")
    String neighborhood;

    public Owner(UserApp userapp, String name, String address, String neighborhood) {
        this.user = userapp;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }

    public Owner() {
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public UserApp getUserapp() {
        return user;
    }

    public void setUserapp(UserApp userapp) {
        this.user = userapp;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
}