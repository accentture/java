/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_10_ScopeOfVariables;

/**
 *
 * @author Tom
 */
public class _56ScopeOfVariablesInJava {
    
    static int x = 11;
    public int y = 33;
    
    
    public void method1(int x)
    {
        
        _56ScopeOfVariablesInJava test = new _56ScopeOfVariablesInJava();
        
        this.x = 22; //this keyword is used to differenciate beetween x of the class and x of argument
        
        y = 44;
 
        System.out.println("_56ScopeOfVariablesInJava.x: " + _56ScopeOfVariablesInJava.x);
        System.out.println("test.x: " + test.x);
        System.out.println("test.y: " + test.y);
        System.out.println("y: " + y);
        
        {
            // The variable x has scope within
            // brackets
            int varuable1 = 10;
            System.out.println("varuable1 : " + varuable1);
        }
    }
    public static void variableWithForLoop(){
        
        System.out.println("============ variable in loop");
        int a;
        for (a = 0; a < 4; a++)
        {
            System.out.println(a);
        }
 
       System.out.println(a); //noew is possible to acces to "a" variable   a = 4
    }
    public static void variableWithForLoop2(){
        System.out.println("============ variable in loop 2");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            
        } //after to finish the loop, "i" variable is destroyed
        
        int i = 20; //now "i" variable is created again
        System.out.println(i); //it is possible to access to "i" variable after to finish the loop
    }
 
    public static void main(String args[])
    {
        _56ScopeOfVariablesInJava t = new _56ScopeOfVariablesInJava();
        t.method1(5);
        
        
        //output
        /*
            _56ScopeOfVariablesInJava.x: 22
            test.x: 22
            test.y: 33
            y: 44
        */
        
        variableWithForLoop();
        variableWithForLoop2();
    }
}


