
package mx.com.gm.domain;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import java.io.Serializable;


@Entity //converting a java class in an entity
@Table(name = "persons") // this notation help to find table with there are problems due to uppercase and lowercase
                         //this notation is not required, but it is very usefull
public class Person implements Serializable{
    
    private static final long serializableVersionUID = 1L;
    
    //we use this decorator to indicate how is the column in the database
    @Column(name="id")
    @Id
    private int idPerson;

    //in this case name match with database field, therefore we don't use Column decorator
    private String name;
    
    private String surnames;
    
    private String email;
    
    private String phone;

    public Person(){
        
    }
     
    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" + "idPerson=" + idPerson + ", name=" + name + ", surnames=" + surnames + ", email=" + email + ", phone=" + phone + '}';
    }
    
    
    
   
}
