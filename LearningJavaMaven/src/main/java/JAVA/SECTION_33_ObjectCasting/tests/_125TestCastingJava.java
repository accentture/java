
package JAVA.SECTION_33_ObjectCasting.tests;

//import JAVA.SECTION_33_ObjectCasting.domain.Employee;
//import JAVA.SECTION_33_ObjectCasting.domain.Manager;

//other way to import all classes from a package
import JAVA.SECTION_33_ObjectCasting.domain.*;

public class _125TestCastingJava {
    
    /*
        --downcasting: convert an parent object to an object with reference to child ojbect
        --upcasting: convert and child object to an objec with reference to parent object
    */
    public static void main(String[] args) {
        
        
        //declaring variable, it is not loaded in the memory
        //it is loaded in memeory when we use it
        Employee employee;
        
        
        //it is UPCASTING, it is not necessay make a explicity conversion
        employee = new Writter("Juan", 1223.5, WritingType.CLASSIC);
//        System.out.println("employee = " + employee);
        
                        //we are using a object type parent but we can use a mehtod of child class
                        //it is taking as priority the method of child class
                        //if we make ctrl + click in the method, it will arribe to method parent, it is due that the polimorfism cannot be defined in compilation time, the polimorfism is defined in runtime
        System.out.println(employee.getDetails());
        
        
        
        //converting  a parent class to child clas (DOWNCASTING)
       // ((Writter) employee).getWrittingType();
        
        //other way to make DOWNCASTING, it is neccesary make a conversion
        Writter writter = (Writter) employee;
        writter.getWrittingType();
        
        //the types with more bites support types with less bites
    }
    
    
    
    

    
}
