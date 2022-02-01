package JAVA.SECTION_48_ConnectionPooling.domain;

public class PersonDTO {
    
    //mapping database to java class
    private int id;
    private String name;
    private String surnames;
    private String email;
    private int phone;

    
    
    public PersonDTO() {
    }

    //constructor to get person from database
    public PersonDTO(int id) {
        this.id = id;
    }

    //constuctor to create a new record in database
    public PersonDTO(String name, String surnames, String email, int phone) {
        this.name = name;
        this.surnames = surnames;
        this.email = email;
        this.phone = phone;
    }
    
    //constructor to update record
    public PersonDTO(int id, String name, String surnames, String email, int phone) {
        this.id = id;
        this.name = name;
        this.surnames = surnames;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", surnames=" + surnames + ", email=" + email + ", phone=" + phone + '}';
    }
    
    
}
