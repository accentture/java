
package JAVA.SECTION_35_AbstractClasses.domain;

public class Rectangle extends GeometricFigure{
    
    public Rectangle(String typeFigure){
        super(typeFigure);
    }
    
    //implement the abastract method is similar to override, but really it is not overriding
    //when we implements an abstract method not use abstract keyword again
    @Override
    public void draw(){
                                                //getClass: getting type of class
                                                //getSimpleName: getting name of class
        System.out.println("It is imprimed a : " + this.getClass().getSimpleName());
    }
    
    
}
