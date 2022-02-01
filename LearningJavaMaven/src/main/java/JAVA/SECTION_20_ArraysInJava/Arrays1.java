/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_20_ArraysInJava;

/**
 *
 * @author Tom
 */
public class Arrays1 {
    /*
        --arrays are objects in java
        --the array can be used like static field
        --the size of an array must be specified by an int or short value
        --the superclass of Array is Object
        --All the arryas implement Clonable and serializable interfaces
    
    */
    
    /*
        --in case of primitive types, the values are stored in contiguous memeory location
        --in case of object, it is stored in heap segement
    
    */
    
    //after to declare array, it is not exist, it is necessary to use new keyword to create or give memory to an array
    
    //they are two ways to declara arraya
    int[] intValuesArray; //declare array 
    int intArray[] = new int[20]; //givind memory to array
                    //the values by default will be 0, false or null according data types
    
    
    
    
    //Array literal: when dta is knowed
    static int[] intArray1 = new int[]{1,2,3,4,5,6,7,8,9};
    
    
    public static void main(String[] args) {
        System.out.println("intArray1 " + intArray1);
                                   //it is possible to use length equal to JS
        for(int i = 0; i < intArray1.length; i++){
            System.out.println("Element index " + i + " = " + intArray1[i] );
        }
    }
    
}
