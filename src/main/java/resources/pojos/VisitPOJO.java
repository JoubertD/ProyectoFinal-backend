package resources.pojos;

public class VisitPOJO {

    private int visit_Id;

    private String created_At;

    private String type;

    private String description;

    private int vet_Id;

    private int pet_Id;

    public VisitPOJO() {
    }

    public VisitPOJO(int visit_Id, String created_At, String type, String description, int vet_Id, int pet_Id) {
        this.visit_Id = visit_Id;
        this.created_At = created_At;
        this.type = type;
        this.description = description;
        this.vet_Id = vet_Id;
        this.pet_Id = pet_Id;

    }

    public int getVisit_Id() {
        return visit_Id;
    }

    public void setVisit_Id(int visit_Id) {
        this.visit_Id = visit_Id;
    }

    public String getCreated_At() {
        return created_At;
    }

    public void setCreated_At(String created_At) {
        this.created_At = created_At;
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

    public int getVet_Id() {
        return vet_Id;
    }

    public void setVet_Id(int vet_Id) {
        this.vet_Id = vet_Id;
    }

    public int getPet_Id() {
        return pet_Id;
    }

    public void setPet_Id(int pet_Id) {
        this.pet_Id = pet_Id;
    }
}
