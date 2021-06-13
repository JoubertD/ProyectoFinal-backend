package edu.unbosque.ProyectoFinal_backend.jpa.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Vet")
public class Vet implements Serializable {
    @OneToMany(mappedBy = "vet", cascade = CascadeType.ALL)
    List<Visit> visits = new ArrayList<>();


    @OneToOne(cascade =CascadeType.ALL)
    @Id
    @JoinColumn(name="username")
    UserApp user;

    @Column(name="address")
    String address;

    @Column(name="neighbothood")
    String neighbothood;

    public Vet(UserApp userapp, String address, String neighbothood) {
        this.user = userapp;
        this.address = address;
        this.neighbothood = neighbothood;
    }

    public Vet() {
    }
}
