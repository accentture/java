package JAVA.SECTION_34_ObjectClassInJava.test;

import JAVA.SECTION_34_ObjectClassInJava.domain.Employee;

public class TestObjectClass {
    /*
        --the object class has the next methods:
            --toString():string
            --equals():boolean
            --hashCode():int
    
    */
    public static void main(String[] args) {
        
        //==================== IMPORTANT ====================
        //to remember that the objects store references in memory
        //when we write new word, we are requesting a new reference in memory
        
        Employee employee1 = new Employee("Juan", 5000);
        Employee employee2 = new Employee("juan", 5000);
        
        //when we check this equality, we check equal reference in memory
        if(employee1 == employee2){
            System.out.println("The objects has equal reference in memory");
        }
        else{
            System.out.println("The objects has NOT equal reference in memory");
        }
        
        
        //checking if the content of objects are equals
        if(employee1.equals(employee2)){
            System.out.println("\n The objects are equals in content");
        }
        else{
            System.out.println("\n The objects are not equals in content");
        }
        
        
        //if the equals() method return true for two objects, the hashCode() method return true equal for 2 objets
        if(employee1.hashCode() == employee2.hashCode()){
            System.out.println("\nnThe value hash code is equals");
        }
        else{
            System.out.println("\nThe value hashCode is different");
        }
        
        
        //thanks to hashCode() method we can order our objects quickly, for that is recommendable that domain objects implements toString(), equals() and hashCode(), it is to say implements the methods more basic of Object Class, thise methods will allow the comapisons faster        
        
        
        
    }
    
    
    
}
