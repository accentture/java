package JAVA.SECTION_46_TranscantionsManagament.domain;

import JAVA.SECTION_45_JDBCManagament.domain.*;


//it is know as entity class also
//it is know as Data Access Object (DAO), it is a pattern design

//every entity class will have a DAO class associated
public class Person {
    
    //mapping database to java class
    private int id;
    private String name;
    private String surnames;
    private String email;
    private int phone;

    
    
    public Person() {
    }

    //constructor to get person from database
    public Person(int id) {
        this.id = id;
    }

    //constuctor to create a new record in database
    public Person(String name, String surnames, String email, int phone) {
        this.name = name;
        this.surnames = surnames;
        this.email = email;
        this.phone = phone;
    }
    
    //constructor to update record
    public Person(int id, String name, String surnames, String email, int phone) {
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
