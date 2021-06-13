package edu.unbosque.ProyectoFinal_backend.jpa.entities;

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





    public Visit(int visi_id, String create_at, String type, String description) {
        this.visi_id = visi_id;
        this.create_at = create_at;
        this.type = type;
        this.description = description;
    }

    public Visit() {
    }
}
