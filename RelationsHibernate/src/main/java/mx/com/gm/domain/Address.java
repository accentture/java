
package mx.com.gm.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addresses")
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GenerateValue(strategy = GenerationType.IDENTITY) : it indicates that the database side will generate the primary key, it is not necessary but with this code we formalizing the way that the primary is formed
    //we use type Integer, that will allow to manage null value in the primary key
    @Column(name = "id_address") //Column : to indicate the real name in our database
    private Integer idAddress;
    
    private String street;
    
    @Column(name = "no_street")
    private String noStreet;
    
    private String country;
    
    //we create a constructor to accomplish with standard of java beans
    public Address(){
        
    }

    public Integer getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }

    public String getStreet() {
        return street;
    }

    

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNoStreet() {
        return noStreet;
    }

    public void setNoStreet(String noStreet) {
        this.noStreet = noStreet;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public Address(Integer idAddress){
        this.idAddress = idAddress;
    }
    @Override
    public String toString() {
        return "Address{" + "idAddress=" + idAddress + ", street=" + street + ", noStreet=" + noStreet + ", country=" + country + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.idAddress);
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
        final Address other = (Address) obj;
        if (!Objects.equals(this.idAddress, other.idAddress)) {
            return false;
        }
        return true;
    }
    
}
