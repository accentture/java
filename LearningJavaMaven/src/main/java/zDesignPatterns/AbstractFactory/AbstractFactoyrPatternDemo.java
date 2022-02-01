/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zDesignPatterns.AbstractFactory;

/**
 *
 * @author Tom
 */
public class AbstractFactoyrPatternDemo {
    public static void main(String[] args) {
        FactoryProducer abstractFactory = new FactoryProducer();
        
        //rounded shapes
        AbstractFactory roundedFactory = abstractFactory.getFactory(true);
        Shape roundedRectangle =roundedFactory.getShape("rectangle");
        roundedRectangle.draw();
        
        Shape roundedSquare =roundedFactory.getShape("square");
        roundedSquare.draw();
        
        //no rounded shapes
        AbstractFactory normalFactory = abstractFactory.getFactory(false);
        Shape normalRectangle = normalFactory.getShape("rectangle");
        normalRectangle.draw();
        
        Shape normalSquare = normalFactory.getShape("square");
        System.out.println(normalSquare);
        normalSquare.draw();
    }
}
