/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_23_FinalLaboratory;

import JAVA.SECTION_23_FinalLaboratory.Order;
import JAVA.SECTION_23_FinalLaboratory.Computer;
        
/**
 *
 * @author Tom
 */
public class WorldComputer {
    public static void main(String[] args) {
        System.out.println("feo");
        Computer computerPol = new Computer();
        Order order = new Order(computerPol); 
        
        //prints
        order.runComputer();
        order.useComputer("mouse");
        order.useComputer("keyboard");
        order.useComputer("monitor");
        order.useComputer("motherboard");
        order.useComputer("webcam");
        
    }
}
