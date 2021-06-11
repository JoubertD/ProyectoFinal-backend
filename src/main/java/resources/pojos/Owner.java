package resources.pojos;

public class Owner {
    private String person_id;
    private String name;
    private String address;
    private String neighborhood;
    public Owner(String persona,String nombre,String adres, String neighborhoo){

        person_id = persona;
        name = nombre;
        address = adres;
        neighborhood = neighborhoo;
    }

    public String getPerson_id() {
        return person_id;
    }

    public void setPerson_id(String person_id) {
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
}
