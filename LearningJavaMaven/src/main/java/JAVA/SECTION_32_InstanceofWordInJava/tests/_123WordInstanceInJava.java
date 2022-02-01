
package JAVA.SECTION_32_InstanceofWordInJava.tests;

import JAVA.SECTION_32_InstanceofWordInJava.domain.Employee;
import JAVA.SECTION_32_InstanceofWordInJava.domain.Manager;

public class _123WordInstanceInJava {
    
    public static void main(String[] args) {
        
        Employee employee = new Employee();
        
        employee = new Manager("sistemas department");
        determinateType(employee);
        
    }
    
    
    /*
        --instance of word allows to determinate the type in runtime
        --de que tipo es cierta referencia a la cual está apuntando cierta variable
        --una cosa es el tipo de la variable, y otra cosa es el tipo al cual está apuntando en memoria
    */
    
    public static void determinateType(Employee employee) {
        
        //commonly instaceOf is used to ask
        //it is asking if the employee variable is pointing to an object in memory of type Manager
        if(employee instanceof Manager){ //if a condtion else if we must use the most specific type
            System.out.println("It is of Manager type");
            
        }
        else if(employee instanceof Employee){ //more generic types
            System.out.println("It is of Employee type");
            
        }
        else if (employee instanceof Object){
            System.out.println("It is of Object type");
        }
        
    }
    
}
