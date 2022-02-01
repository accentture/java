/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_15_staticContextInJava;

/**
 *
 * @author Tom
 */
public class _68ExerciseStaticContextInJava {
    
    //the compiler need main method to execute our code
    //first use our class name, after call main method
    public static void main(String[] args) {
        _67StaticContextInJava persona = new _67StaticContextInJava("Juan");
        System.out.println("persona = " + persona);
        
        _67StaticContextInJava persona2 = new _67StaticContextInJava("Pollo");
        System.out.println("persona = " + persona2);
        
        _67StaticContextInJava persona3 = new _67StaticContextInJava("Sebastian");
        
        print(persona3); //we can call static method from a static method
        
        //we can not use this keyword in static method
    }
    
    //doesn't matter order of modifier in a method
    static public void print(_67StaticContextInJava persona){
        System.out.println("3ra persona " + persona);
    }
}
