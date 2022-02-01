/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_19_FinalKeywordInJava;

/**
 *
 * @author Tom
 */
public class ThisKeyword2 {
    /*
        --When a final variable is a reference to an object, then this final variable is called reference final variable.}
        --to difference to variable final, the reference final variable can change its state
        --it is not re-assigning
    
    */
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        
        //changing insteral state of object 
        // reference by final reference variable sb
        //after to change the final property, this property is called non-transitivity
        //the non-transitivity is also applied to arrays, because arrays are objects in Java
        sb.append("ForGeeks");
        
        System.out.println(sb);
    }
}


class Gfg
{
    public static void main(String args[])
    {
        //example fo local final variable
        final int i;
        i = 20; //this variable must be initizalied inmediatelly
        
        System.out.println(i);
    }
}

class Gfg2
{
    public static void main(String[] args) 
    {
        int arr[] = {1, 2, 3};
          
        // final with for-each statement
        // it is possible to use final keyword in a foorEach, becuase it variable is re-declarated in every iteration
        for (final int i : arr)
            System.out.print(i + " ");
    }    
}


//final class, when a final class is declared, it cannot be extended
//the use final in a class serves to create inmutable classes (an inmutable class is produced when after to create a class, it cahnge its conent)
final class A{
    
}



class X 
{
    //when a final method is declared, it cannot be overrided
    final void m1() 
    {
        System.out.println("This is a final method.");
    }
}

class Y extends X 
{
    //if I averride the method, it will give error in runtime
    /*
    void m1()
    { 
        // COMPILE-ERROR! Can't override.
        System.out.println("Illegal!");
    }
    */
}