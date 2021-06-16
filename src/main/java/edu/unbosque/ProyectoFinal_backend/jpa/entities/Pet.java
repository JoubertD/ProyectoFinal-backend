package edu.unbosque.ProyectoFinal_backend.jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Pet")

public class Pet {
    @OneToMany(mappedBy="pet", cascade = CascadeType.ALL)
    private List<PetCase> cases = new ArrayList<>();

    @OneToMany(mappedBy="pet", cascade = CascadeType.ALL)
    private List<Visit> visits = new ArrayList<>();

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "username", referencedColumnName = "username", nullable = false)
    private Owner owner;

    @Id
    @GeneratedValue
    @Column(name="pet_id")
    private Integer pet_id;

    @Column(name="microchip")
    private String microchip;

    @Column(name="species")
    private String species;

    @Column(name="race")
    private String race;

    @Column(name="size")
    private String size;

    @Column(name="sex")
    private String sex;

    @Column(name="picture")
    private String picture;


    public Pet() {
    }

    public Pet(String microchip, String species, String race, String size, String sex, String picture, Owner owner) {
        this.microchip = microchip;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
        this.owner = owner;

    }

    public Pet(String microchip, String species, String race, String size, String sex, String picture) {
        this.microchip = microchip;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;


    }

    public void addCase(PetCase petcase){
        this.cases.add(petcase);
    }

    public List<PetCase> getCases() {
        return cases;
    }

    public void setCases(List<PetCase> cases) {
        this.cases = cases;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Integer getPet_id() {
        return pet_id;
    }

    public void setPet_id(Integer pet_id) {
        this.pet_id = pet_id;
    }

    public String getMicrochip() {
        return microchip;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void addVisit(Visit visit){
        visits.add(visit);
    }
}
