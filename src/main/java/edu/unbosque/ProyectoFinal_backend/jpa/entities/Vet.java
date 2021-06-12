package edu.unbosque.ProyectoFinal_backend.jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Vet")
public class Vet {
    @OneToMany(mappedBy = "vet", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    List<Visit> visits = new ArrayList<>();


    @OneToOne(cascade =CascadeType.ALL)
    @Id
    @JoinColumn(name="username")
    UserApp userapp;

    @Column(name="address")
    String address;

    @Column(name="neighbothood")
    String neighbothood;

    public Vet(UserApp userapp, String address, String neighbothood) {
        this.userapp = userapp;
        this.address = address;
        this.neighbothood = neighbothood;
    }

    public Vet() {
    }
}
