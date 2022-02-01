/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zDesignPatterns.AbstractFactory;

/*
    --abstract methods cannot be instatiated, but they can be subclassed
    --when a class is an abstract class, the subclass usually provides provides implementations for the all abstract methods in its parent class

*/
public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}
