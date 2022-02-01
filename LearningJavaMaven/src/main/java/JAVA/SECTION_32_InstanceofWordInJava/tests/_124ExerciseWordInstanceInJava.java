
package JAVA.SECTION_32_InstanceofWordInJava.tests;

import JAVA.SECTION_32_InstanceofWordInJava.domain.Employee;
import JAVA.SECTION_32_InstanceofWordInJava.domain.Manager;

public class _124ExerciseWordInstanceInJava {
    
    public static void main(String[] args) {
        
        Employee employee = new Employee();
        
        employee = new Manager("sistemas department");
        determinateType(employee);
        //employee = new Manager("sistemas department");
        
    }
    
    
    public static void determinateType(Employee employee) {
        
        
        //instanceof is used to check if we can make a convertion types is a sure way
        if(employee instanceof Manager){ 
            System.out.println("It is of Manager type");
            
            
            //-------------------the first way to convert
            //an objetct type parent cannot acces to clild class
            //if we want to access to method of child clas, we need to convert to child object but only if it is instance of a child class
            Manager manager = (Manager) employee;
            System.out.println("manager = " + manager.getDepartment());         
            
            
            
            
            
            
            //-------------------the second way to convert
            //the converting in fly of IDE netbeans
            //((Manager) employee).getDepartment();
            
        }
        else if(employee instanceof Employee){ //more generic types
            System.out.println("It is of Employee type");
            
            //it will make an error
            //the error is not detected in compilation time, but yeah in runtime
            //we can not conver a parent class to a child class
            Manager manager = (Manager) employee;
            System.out.println("manager = " + manager.getDepartment());   
            
            
            //the viewed previously reafirm the polimorfism, where the polimorfism only can be seen in runtime not in compilation time
            
            
            
        }
        else if (employee instanceof Object){
            System.out.println("It is of Object type");
            
            //in this case, an parent object cannot access to methods of a child class
        }
        
    }
    
}
