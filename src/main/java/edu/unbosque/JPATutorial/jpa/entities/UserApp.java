package edu.unbosque.JPATutorial.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name="UserApp")

public class UserApp {
   @OneToOne(mappedBy = "user")
    Vet vet;

   @OneToOne(mappedBy = "user")
   Official official;

   @OneToOne(mappedBy = "user")
    Owner owner;

    @Id
    @Column(name="username")

     String username;

    @Column(name="password")
    String password;

    @Column(name="email")
    String email;

    @Column(name="role")
    String role;

    public UserApp(String username, String password, String email, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public UserApp() {
    }

}


