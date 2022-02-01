
package JAVA.SECTION_33_ObjectCasting.domain;


public class Manager extends Employee { 
    private String department;   
    
    public Manager(String name,double salary, String department){
        super(name, salary);
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
