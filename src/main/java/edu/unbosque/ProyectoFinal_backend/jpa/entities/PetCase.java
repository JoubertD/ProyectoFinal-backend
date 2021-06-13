package edu.unbosque.ProyectoFinal_backend.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name="PetCase")
public class PetCase {
    @ManyToOne
    @JoinColumn(name = "pet_id")
    Pet pet;

    @Id
    @GeneratedValue
    @Column(name="case_id")
    int Case_id;

    @Column(name="created_at")
    String created_at;

    @Column(name="type")
    String type;

    @Column(name="description")
    String description;



    public PetCase(int case_id, String created_at, String type, String description) {
        Case_id = case_id;
        this.created_at = created_at;
        this.type = type;
        this.description = description;

    }

    public PetCase() {
    }
}
