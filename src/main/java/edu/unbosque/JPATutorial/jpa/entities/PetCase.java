package edu.unbosque.JPATutorial.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name="Owner")
public class PetCase {
    @ManyToOne()
    @JoinColumn(name = "pet_id")
    Pet pet;

    @Id
    @Column(name="case_id")
    int Case_id;

    @Column(name="created_at")
    String created_at;

    @Column(name="type")
    String type;

    @Column(name="description")
    String description;

    @Column(name="pet_id")
    int pet_id;

    public PetCase(int case_id, String created_at, String type, String description, int pet_id) {
        Case_id = case_id;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
        this.pet_id = pet_id;
    }

    public PetCase() {
    }
}
