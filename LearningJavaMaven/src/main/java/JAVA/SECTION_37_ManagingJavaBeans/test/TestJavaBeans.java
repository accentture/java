
package JAVA.SECTION_37_ManagingJavaBeans.test;

import JAVA.SECTION_37_ManagingJavaBeans.domain.PersonBean;


public class TestJavaBeans {
    
    public static void main(String[] args) {
        
        // ============ all this code is how the technologies more advanced use our javaBean
        
        //instantiaging our class java bean that will be used for other technologies
        PersonBean person = new PersonBean();
        person.setName("Juan");
        person.setSurname("Díaz");
        
        System.out.println("person = " + person);
        System.out.println("person name = " + person.getName());
        System.out.println("person surname = " + person.getSurname());
    }
    
}
