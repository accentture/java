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
public class Student {
    private String name;
    private String rollNo;
    
    public void setName(String n){
        name = n;
    } 
    public String getName(){
        return name;
    }
    public void setRollNo(String rn){
        rollNo = rn;
    }
    public String getRollNo(){
        return rollNo;
    }
}
