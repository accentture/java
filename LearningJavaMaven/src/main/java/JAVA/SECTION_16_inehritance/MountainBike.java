/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_16_inehritance;


class Bycicle {
    public int gear;
    public int speed;
    
    public Bycicle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public void appyBrake(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }
    public String toString(){
        return ("N° of gears are: " + gear + "\n" + "spedd of bycicle is: " + speed);
    }
}

public class MountainBike extends Bycicle{
    /*
    --in the inheritance only the subclass is created not the superclass
    --in the practice inheritance and polymorphism is used to achieve higher performance and readibliy
    
    ♥ they are many types of inheritance
        1 Single Inheritance: class A serves to class B
        2 Multilevel inheritance: class A serve to class B, and class B serves to class C
            --in Java is not possible to access to grandparent's members
        3 Hierarchical Inheritance: class A serve to class B, C, D, ....
        4 Multiple Inheritance: is when an class have two or more parent classes, in JAVA it is achieved with interfaces
        5 Hybrid Inheritance: It is a mix of two or more of the above types of inheritance. It is achieved with interfaces also due that JAVA does not support multiple inheritance
    
    
    **Important facts about inheritance in Java 
        --all superclass has as parent Object class
        --a subclass only can have one superclass
        --constructors are not member, therefore it cannot be inhereted
        --private members cannot be used by subclasses,but is is possible to access trought getters and seetter as public or protected
    */
    
    
    public int seatHeight;
    
    public MountainBike(int gear, int speed, int startHeight){
        
        //using methods of Bycicle
        super(gear, speed);
        this.seatHeight = startHeight;
        
    }
    public void setheight(int newHeight){
        seatHeight = newHeight;
    }
    @Override public String toString(){
        return (super.toString() + "\n" + "seat height is: " + seatHeight);
    }
    public static void main(String[] args) {
        MountainBike bycicle = new MountainBike(3, 100, 25);
        System.out.println(bycicle.toString());
    }
}
