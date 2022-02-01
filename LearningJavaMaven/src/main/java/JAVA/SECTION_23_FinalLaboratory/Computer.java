/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_23_FinalLaboratory;

//java
import java.util.ArrayList;
import java.util.Scanner;

import JAVA.SECTION_23_FinalLaboratory.Component;

/**
 *
 * @author Tom
 */
public class Computer {
    
    int totalItems;
    Scanner console = new Scanner(System.in);
    ArrayList<Component> componentCollection = new ArrayList<Component>();
    public Computer(){
        
    }
    public void assembleComponents(Component theComponent){
        componentCollection.add(theComponent);
    }
    public void turnOnComponents(){
        for(Component c:componentCollection){
            c.turnOnDevice();
        }
    }
    public void useComponent(String component){
        int index = 0;
        for(Component c: componentCollection){
            if(c.getName() == component){
                executeTask(index);
                break;
            } 
            index++;
        }
    }
    public void executeTask(int componentId){
        String component = componentCollection.get(componentId).getName();
        String text;
        
        System.out.println("Wellcome I am the " + component + " : " );
        System.out.println("What is your task: ");
        text = console.nextLine();
        
        System.out.println("Executing: " + text);
    }
}



