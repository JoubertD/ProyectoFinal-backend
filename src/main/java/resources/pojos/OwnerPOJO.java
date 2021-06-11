package resources.pojos;

import java.util.List;

public class OwnerPOJO {
    private int person_id;

    private String name;

    private String address;

    private String neighborhood;

    private List<String> pet;

    public OwnerPOJO() {
    }

    public OwnerPOJO(int person_id, String name, String address, String neighborhood, List<String> pet) {
        this.person_id = person_id;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
        this.pet = pet;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public List<String> getPet() {
        return pet;
    }

    public void setPet(List<String> pet) {
        this.pet = pet;
    }
}
