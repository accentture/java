package mx.com.gm.HiSpirng2.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


/*
    --with @Data, we convert our classe in an Java Bean

*/
@Data
@Entity //Entity decorator must come from JPA not from Hibernate
@Table(name="persons")
public class Person implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //strategy to generate the primary key
    @Column(name = "id")
    private Long idPerson;
    
    private String name;
    private String surnames;
    private String email;
    private String phone;
}
