/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_24_VariablesArguments;

/**
 *
 * @author Tom
 */
public class _105ExerciseVariableArguments {
    
    //a function that take a variable number of arguments is named VarArgs
    //use it allows to compiler with zero or more arguments
    static void fun(int ...a ){ //inplicity declared as array if type int[]
        for (int i: a){
            System.out.println(i + " ");
        }
    }
    
    //the variable length argument onbly can be at the end of the method
    //only can exxists a variable length argument by method
    static void fun2(String str, int ...a){
        System.out.println("Data type String = " + str);
        System.out.println("Length of a: " + a.length);
        
        for(int x: a){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        fun(100);
        fun(1,2,3,4);
        fun();
        
        
        System.out.println("============================ Fun2 demo:");
        fun2("Pol", 1,2,3,4,5);
        fun2("Feo");
        
    }
    
    
}
