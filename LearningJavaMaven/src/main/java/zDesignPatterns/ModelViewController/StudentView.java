/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zDesignPatterns.ModelViewController;

/**
 *
 * @author Tom
 */
public class StudentView {
    public void printStudentDetails(String name, String rollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + name);
        System.out.println("RollNo" + rollNo);
    }
    
}
