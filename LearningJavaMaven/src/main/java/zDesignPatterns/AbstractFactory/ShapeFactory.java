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
public class ShapeFactory extends AbstractFactory{
    public Shape getShape(String typeShape){
        
        if(typeShape.equalsIgnoreCase("RECTANGLE")){
            System.out.println("feoooooooooooooo " + typeShape);
            return new Rectangle();
        }else if(typeShape.equalsIgnoreCase("SQUARE")){
            
            return new Square();
        }
        return null;
    }
}
