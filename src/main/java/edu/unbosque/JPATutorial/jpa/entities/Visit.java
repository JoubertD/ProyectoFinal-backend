package edu.unbosque.JPATutorial.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name="Visit")


public class Visit {
    @ManyToOne
    @JoinColumn(name="pet_id")

    Pet pet;
    @ManyToOne
    @JoinColumn(name = "vet_id")
    Vet vet;

    @Id
    @Column(name="visit_id")
    int visi_id;
    @Column(name="create_at")
    String create_at;

    @Column(name="type")
    String type;

    @Column(name="description")
    String description;

    @Column(name="vet_id")
    int vet_id;

    @Column(name="pet_id")
    int pet_id;

    public Visit(int visi_id, String create_at, String type, String description, int vet_id, int pet_id) {
        this.visi_id = visi_id;
        this.create_at = create_at;
        this.type = type;
        this.description = description;
        this.vet_id = vet_id;
        this.pet_id = pet_id;
    }

    public Visit() {
    }
}
