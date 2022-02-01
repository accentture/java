/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_16_inehritance;

/**
 *
 * @author Tom
 */
interface one {
    public void print_geek();
}

interface two {
    public void print_for();
}

//interintance with interfaces, to create multiple interitance
interface three extends one, two {
    public void print_geek2();
}

//multiple inheritance is achieved with interfaces
public class Child implements three {
    public void print_geek(){
        System.out.println("geek");
    }
    public void print_for(){
        System.out.println("for");
    }
    public void print_geek2(){
        System.out.println("geek2");
    }
}

class Main {
    public static void main(String[] args)
    {
        Child c = new Child();
        c.print_geek();
        c.print_for();
        c.print_geek2();
    }
}
