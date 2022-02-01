/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_20_ArraysInJava;


class Student {
    public int roll_no;
    public String name;
    
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Arrays2OfClasses {
    public static void main(String[] args) {
        Student arr[];
        arr = new Student[5];
        
        arr[0] = new Student(0, "feo");
        arr[1] = new Student(1, "sol");
        arr[2] = new Student(2, "kabel");
        arr[3] = new Student(3, "pol");
        arr[4] = new Student(4, "korah");
        
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element" + " " + i + " = " + arr[i].name );
        }
    }
}
//I stayed here: Multidimensional Arrays