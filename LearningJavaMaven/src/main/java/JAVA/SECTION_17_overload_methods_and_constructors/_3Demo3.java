/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_17_overload_methods_and_constructors;

/**
 *
 * @author Tom
 */
class Test {
    /*
        --it is possible to overload static methods
        --it is possible to overload main() method
    
        --overloading : it is the same function with differens signatures
        --overriding : it is the same function, same signatures but differents classes conected by inheritance
        --Overloading is an example of compiler time polymorphism and overriding is an example of run time polymorphism.
    */
    
    
    // Normal main()
    public static void main(String[] args)
    {
        System.out.println("Hi Geek (from main)");
        Test.main("Geek");
    }
  
    // Overloaded main methods
    public static void main(String arg1)
    {
        System.out.println("Hi, " + arg1);
        Test.main("Dear Geek", "My Geek");
    }
    public static void main(String arg1, String arg2)
    {
        System.out.println("Hi, " + arg1 + ", " + arg2);
    }
}