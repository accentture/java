
package JAVA.SECTION_35_AbstractClasses.test;

import JAVA.SECTION_35_AbstractClasses.domain.GeometricFigure;
import JAVA.SECTION_35_AbstractClasses.domain.*;


public class TestAbstractClasses {
    public static void main(String[] args) {
        //we cannot to instance an object of abstract class
        //sometimes is convenient to mark a class as abstract even if it has not an abstract method, it with the finallity to not instantiate a class
        
        //GeometricFigure = new GeometricFigure();  x -> we cannot instantiate parent classes        
        //a finallity if OOP is create code the most generic possible       
     
        
        GeometricFigure figure = new Rectangle("Rectangle");
        figure.draw();
    }
     
    
}
