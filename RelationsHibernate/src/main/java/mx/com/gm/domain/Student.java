package mx.com.gm.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="students")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_student")
    private Integer idStudent;

    private String names;

    private String surnames;

    //this mapping is unidirectional
    //referencedColumnName = "id_address" : referencing to column of address 
    @JoinColumn(name = "id_address", referencedColumnName = "id_address")//JoinColumn: to specify the the column that join both tables
    
                                         //TO PERSIST DATA IN CASCADE                                   
    @ManyToOne(cascade = CascadeType.ALL) //cascade = CascadeType.ALL  : to configurate persistence in cascade, it will allow save information for student table and address table
    private Address address;

    @JoinColumn(name = "id_contact", referencedColumnName = "id_contact")
    @ManyToOne(cascade = CascadeType.ALL)
    private Contact contact;
    
    //this mapping is bidirectional
    @OneToMany(mappedBy="student")//mappedBy="student" : the relationship is mapped by alumn attribute
    private List<Asignation> asignations;

    public Student() {
    }

    public Student(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public Integer getIdStudent() {
        return idStudent;
    }
    
    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Asignation> getAsigntations() {
        return asignations;
    }

    public void setAsigntations(List<Asignation> asigntations) {
        this.asignations = asigntations;
    }
    

    @Override
    //for to string method we includes foreign tables
    //when we work with list, it is not recommendable to add the list to toString() method
    public String toString() {
        return "Student{" + "idStudent=" + idStudent + ", names=" + names + ", surnames=" + surnames + ", address=" + address + ", contact=" + contact + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.idStudent);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.idStudent, other.idStudent)) {
            return false;
        }
        return true;
    }

}
