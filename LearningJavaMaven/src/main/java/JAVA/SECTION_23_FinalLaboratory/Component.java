/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_23_FinalLaboratory;

/**
 *
 * @author Tom
 */

public class Component {
    private String name;
    private String description;
    private String store;
    private int price;
    
    Component(String n, String d, String s, int p){
        name = n;
        description = d;
        store = s;
        price = p;
        
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getStore(){
        return store;
    }
    public int getPrice(){
        return price;
    }
    public void turnOnDevice(){
        System.out.println(this.name + " working!"); 
    }

    
}
