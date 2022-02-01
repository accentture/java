/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_10_ScopeOfVariables;

import java. util. ArrayList;

/**
 *
 * @author Tom
 */
public class _57MemoryStackAndHeapInjava {
    public static void main(String[] args) {
        /*
        --the local variables are destroyed when a method finished
        --the variables of object will be destroyed until the program finish
    
        --JVM split the memory in 2: java heap space and java stack space
    
        --lcoal variable (methods)are stored in a stack
        --the objects and its attributes are create in the heap
        --when an main method finish, the objects crated in it,also finish
    
        --it is not pssible the see this feature of java
        --the gargabe collector remove this variables of RAM memory
    
        --the method used to remove garbage is System.gc(), but it not sure to remove that garabage in that moment, nut the garbage will be removed when GC of java can. It is becaouse the remove gargabe is a weight process
    */
    
    //an example of remove memory
    ArrayList list = new ArrayList();
    list = null; //after to asign null, it will be a candidate to be removed by garbage collector
    
    
    
    }
    
}
