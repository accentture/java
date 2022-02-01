
package JAVA.SECTION_33_ObjectCasting.domain;

import java.util.Objects;

public class Employee {
    String name;
    double salary;
    
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getDetails(){
        return null;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + '}';
    }
    
    //implementing hashCode and equals method of Object class, following the best practices

    @Override
    //in hashCode we must sure that its result the most possible is not reapeated
    //there are some cases where even objects with differents values are repeated
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name); //making a calcule with values of every Object
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        //checking if this has the same reference in memory that obj param
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        //getClass() is between Object class and return the Object type that we are using
        if (getClass() != obj.getClass()) {
            return false;
        }
        
                            //making a cast to child object
        final Employee other = (Employee) obj;
        
        //comparing values more no references
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        
        //comparing strings more no references
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}
