
package JAVA.SECTION_32_InstanceofWordInJava.domain;


public class Manager extends Employee { 
    private String department;
    
    public Manager(String department){
        this.department = department;
    }
    
    public String obtainDetails(){
        return "Obtaining details of Manager";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    
}
