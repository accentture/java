/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_34_ObjectClassInJava.domain;

import JAVA.SECTION_33_ObjectCasting.domain.*;
import java.util.Objects;

/**
 *
 * @author LENOVO
 */
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

    //the hashCodeme method provided from Object Class
    //the hash is created using the value of attribures of every object
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
        return hash;
    }

    
    //method equals provided from Object class
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    

}
