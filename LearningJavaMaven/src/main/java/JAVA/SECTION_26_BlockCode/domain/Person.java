
package JAVA.SECTION_26_BlockCode.domain;


public class Person {
    /*
        --exiswts 2 block types:
            1. static initalization block
            1. no static initalization block
    
         --both block are executed before to constructor
    
    */
    private final int idPersona;
    private static int couterPersons;
    
    
    //static initialization block, it block is executed before to a no static initialization block
    //this block is executed one time, only to load the clas in memory
    static {
        System.out.println("Executing static block");
        
        //we can initilizate te static variables
        ++Person.couterPersons;
    }
    
    //no static initialization block, it is executed before our constructor of class
    {
    
        //it is called also dynamic context
        //with this no static block, it will act as a constructor of class
        System.out.println("Execting no static block");
        System.out.println("--------------------checking idPersona" + couterPersons);
        this.idPersona = Person.couterPersons++;
    }

    @Override
    public String toString() {
        return "Person{" + "idPersona=" + idPersona + '}';
    }
    
    public Person(){
        System.out.println("Executing constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }
    
    
}
