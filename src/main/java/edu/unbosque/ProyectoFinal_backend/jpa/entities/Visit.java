package edu.unbosque.ProyectoFinal_backend.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name="Visit")


public class Visit {
    @ManyToOne
    @JoinColumn(name="pet_id",  nullable = false)
    Pet pet;

    @ManyToOne
    @JoinColumn(name = "vet_id")
    Vet vet;

    @Id
    @GeneratedValue
    @Column(name="visit_id")
    int visit_id;


    @Column(name="created_at", nullable = false)
    String created_at;

    @Column(name="type")
    String type;

    @Column(name="description")
    String description;





    public Visit( String created_at, String type, String description) {
        this.created_at = created_at;
        this.type = type;
        this.description = description;
    }

    public Visit() {
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public int getVisi_id() {
        return visit_id;
    }

    public void setVisi_id(int visit_id) {
        this.visit_id = visit_id;
    }

    public String getCreate_at() {
        return created_at;
    }

    public void setCreate_at(String create_at) {
        this.created_at = create_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
