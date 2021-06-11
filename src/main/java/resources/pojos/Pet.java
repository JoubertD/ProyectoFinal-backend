package resources.pojos;

public class Pet {

    private String microchip;
    private String name;
    private String species;
    private String race;
    private String size;
    private String sex;
    private String picture;

    public Pet(String chip,String nombre, String especie, String raza, String tamaño, String sexo, String foto){
        microchip = chip;
        name = nombre;
        species = especie;
        race = raza;
        size = tamaño;
        sex = sexo;
        picture = foto;
    }

    public String getMicrochip() {
        return microchip;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
