package resources.pojos;

public class VetPOJO {

    private String username;

    private String name;

    private String address;

    private String neighbourhood;

    public VetPOJO() {
    }

    public VetPOJO(String username, String name, String address, String neighbourhood) {
        this.username = username;
        this.name = name;
        this.address = address;
        this.neighbourhood = neighbourhood;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }
}
