
package JAVA.SECTION_37_ManagingJavaBeans.domain;
import java.io.Serializable;



/*
    --to consider a class a Java Beans need accomplish some features:
        --the constructor must be empty
        --evey attribute must be an private attribute
        --every private attibute must has getter and seter associated
        --must to implement an interface named serializable

        --this serializable inteface will allows to send our class to differentes computers
        --if a class is an java bean, then other frameworks as Hibernate and Spring will able to use our JavaBean, otherwise other technologies will not able to use our JavaBean

        --an object must be seriarizable when it is necessary to transfer our objet to other server
        --when an object is seralizable, this classe is converted to ones an zeros (bites)
        --all about this process is done automatically by the server java that we are using

*/
public class PersonBean implements Serializable {
    private String name;
    private String surname;
    
    
    //other technologies will not know how many params has our class, therefore it is mandatory has an empty constructor, and it constructor must be public
    
    public PersonBean(){
        
    }
    
    public PersonBean(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "PersonBean{" + "name=" + name + ", surname=" + surname + '}';
    }
        
}
