package edu.unbosque.JPATutorial.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name="Official")

public class Official {
    @OneToOne(cascade =CascadeType.ALL)
    @Id
    @JoinColumn(name="username")
    UserApp userapp;

    @Column(name="name")
    String name;

    public Official(UserApp userapp, String name) {
        this.userapp = userapp;
        this.name = name;
    }

    public Official() {
    }
}
