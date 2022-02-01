/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_23_FinalLaboratory;
import JAVA.SECTION_23_FinalLaboratory.Computer;
import JAVA.SECTION_23_FinalLaboratory.Component;
/**
 *
 * @author Tom
 */
public class Order {
    
    public static void main(String[] args) {
        
    }
    
    private static Computer computer;
    
    //constructor
    public Order(Computer c){
        computer = c;
    }
    public static void runComputer(){
        System.out.println("feo");
        createComponents();
        computer.turnOnComponents();
    }
    public static void createComponents(){
        Component mouse = new Component("mouse", "My work is move an arrow", "MIHAVA", 50);
        Component monitor = new Component("monitor", "My work is the user interface", "MIHAVA", 500);
        Component keyboard = new Component("keyboard", "My work is write sentences", "MIHAVA", 80);
        Component motherboard = new Component("motherboard", "My work is process data", "MIHAVA", 800);
        Component webcam = new Component("webcam", "My work is social connection", "MIHAVA", 120);
        
        computer.assembleComponents(mouse);
        computer.assembleComponents(monitor);
        computer.assembleComponents(keyboard);
        computer.assembleComponents(motherboard);
        computer.assembleComponents(webcam);
    }
    public static void useComputer(String component){
        computer.useComponent(component);
    }
}
