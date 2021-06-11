package resources.pojos;

public class PetPOJO {

    private int pet_id;

    private String microchip;

    private String name;

    private String species;

    private String race;

    private String size;

    private String sex;

    private String image;

    private OwnerPOJO owner;

    private int owner_Id;

    public PetPOJO() {
    }

    public PetPOJO(int pet_id, String microchip, String name, String species, String race, String size, String sex, String image, OwnerPOJO owner, int owner_Id) {
        this.pet_id = pet_id;
        this.microchip = microchip;
        this.name = name;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.image = image;
        this.owner = owner;
        this.owner_Id = owner_Id;
    }

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getOwner_Id() {
        return owner_Id;
    }

    public void setOwner_Id(int owner_Id) {
        this.owner_Id = owner_Id;
    }

    public OwnerPOJO getOwner() {
        return owner;
    }

    public void setOwner(OwnerPOJO owner) {
        this.owner = owner;
    }
}
