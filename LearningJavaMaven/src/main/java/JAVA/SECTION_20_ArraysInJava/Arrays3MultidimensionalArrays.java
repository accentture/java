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
public class Arrays3MultidimensionalArrays {
    //it is possible to create multidimensional arrays in 2D and 3D
    int[][] intArray = new int[10][20];
    int[][][] intArray2 = new int[10][20][10]; //3D array
    
    
    //returning Array
    public static int[][] returningArray(){
        int arr[][] = {{9,8,7},{6,5,4},{3,2,1}};
        
        System.out.println("Returning array:");
        return arr;
    }
    
    public static void demostration(){
        //demostrating Class Objects for Arrays
        int intArray[] = new int[3];
        byte byteArray[] = new byte[3];
        short shortArray[] = new short[3];
        String stringArray[] = new String[9];
        
        
        System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass()); // accessing to a superclass of array :  java.lang.Object.
        System.out.println(byteArray.getClass());
        System.out.println(shortArray.getClass());
        System.out.println(stringArray.getClass());
        
    }

    //cloning array
    public static void cloneArray(){
        int arr[] = {1,2,3,4};
        
        //clone
        int cloneArr[] = arr.clone();
        
        System.out.println("clone = " + (arr == cloneArr) ); //false
    }
    
    public static void main(String[] args) {
        int arr[][] = {{9,8,7},{6,5,4},{3,2,1}};
        
        //printing 2D array
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        
        System.out.println();
        System.out.println(returningArray());
        
        System.out.println();
        demostration();
        
        System.out.println();
        cloneArray();
    }
    
    
}
