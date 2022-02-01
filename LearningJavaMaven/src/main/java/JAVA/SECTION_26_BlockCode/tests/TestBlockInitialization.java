
package JAVA.SECTION_26_BlockCode.tests;

import JAVA.SECTION_26_BlockCode.domain.Person;


public class TestBlockInitialization {
    public static void main(String[] args) {
        Person person1 = new Person(); 
        
        //we can see the memory direction where the class is loaded
        System.out.println("person1" + person1); //person1JAVA.SECTION_26_BlockCode.domain.Person@27082746
        
        
        System.out.println(" ");
        System.out.println(" ");
        Person person2 = new Person(); 
        System.out.println("person2" + person2);
    }
}
