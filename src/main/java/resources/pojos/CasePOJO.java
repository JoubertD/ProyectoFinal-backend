package resources.pojos;

public class CasePOJO {

    private int case_id;

    private String created_At;

    private String type;

    private String description;

    private int pet_Id;

    public CasePOJO() {
    }

    public CasePOJO(int case_id, String created_At, String type, String description, int pet_Id)  {
        this.case_id = case_id;
        this.created_At = created_At;
        this.type = type;
        this.description = description;
        this.pet_Id = pet_Id;
    }

    public int getCase_id() {
        return case_id;
    }

    public void setCase_id(int case_id) {
        this.case_id = case_id;
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

    public int getPet_Id() {
        return pet_Id;
    }

    public void setPet_Id(int pet_Id) {
        this.pet_Id = pet_Id;
    }
}
