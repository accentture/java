
package JAVA.SECTION_35_AbstractClasses.domain;

/*
        --the abstract keyword is used to define methods that has not any implementation
        --if the class has at least a abstract class, then the class must be marked as abstract
        --we can mark an abstract class without has a abstract method
    
        --an abstract method is used when the method is very generic according to the enveloping class
        --if the child class not implements the abstract methods of the parent class, it must be marked as abstract also
    */


public abstract class GeometricFigure {
    protected String typeFigure;
    
    //a constructor protected
    protected GeometricFigure(String typefigure){
        this.typeFigure = typeFigure;
    }
    
    public abstract void draw();

    public String getTypeFigure() {
        return typeFigure;
    }

    public void setTypeFigure(String typeFigure) {
        this.typeFigure = typeFigure;
    }

    @Override
    public String toString() {
        return "GeometricFigure{" + "typeFigure=" + typeFigure + '}';
    }
    
    
}
