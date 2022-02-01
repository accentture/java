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
class A {
    int foo(int num1){
        return num1;
    }
    
    int foo(int num1, int num2){
        return num1 + num2;
    }
}
class Main {
    /*
        --it is not possible to overload by return type
    */
    
    
    public int foo() { return 10; }
  
    // compiler error: foo() is already defined
    //public char foo() { return 'c'; }
  
    public static void main(String args[])
    {
    }
}


class Main2 {
  
    /*
        --it is possible to return data if a method overloaded is specificlly called
    */
    public int foo(int a) { return 10; }
    public char foo(int a, int b) { return 'a'; }
  
    public static void main(String args[])
    {
        A a = new A();
        System.out.println(a.foo(1));
        System.out.println(a.foo(1, 2));
    }
}