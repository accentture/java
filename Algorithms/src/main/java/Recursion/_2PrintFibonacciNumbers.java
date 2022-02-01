package Recursion;

import java.util.Optional;

public class _2PrintFibonacciNumbers {
    static int fibonnaci(int positionFibNumber){
        
       if(positionFibNumber <= 1){
           return positionFibNumber ;
       }
        
       return  fibonnaci(positionFibNumber - 1) + fibonnaci(positionFibNumber - 2); 
    }
    
    public static void main(String[] args) {
        int totalFibNumbers = 19;
        
        for(int x = 1; x <= totalFibNumbers; x++){
            System.out.println(fibonnaci(x));     
        }
        
    }
}
