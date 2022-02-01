/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZPROJECTS;

import java.util.Scanner;

/**
 *
 * @author Tom
 */
public class calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println(" =================== Wellcome to calculator ===================");
        
        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(console.nextLine()), acumulator = 0;
        
        System.out.println("Please enter a operation: ");
        char nameOperation = console.nextLine().charAt(0);
        
        while(nameOperation != 'e'){
            if(nameOperation == 's'){
                acumulator = number;
                System.out.println("result = " + acumulator);
            }else if(nameOperation == '+'){
                acumulator += number;
                System.out.println("result = " + acumulator);
            }else if(nameOperation == '-'){
                acumulator -= number;
                System.out.println("result = " + acumulator);
            }else if(nameOperation == '*'){
                acumulator *= number;
                System.out.println("result = " + acumulator);
            }else{
                acumulator /= number;
                System.out.println("result = " + acumulator);
            }
              
            System.out.println("Please enter a operation again: ");
            nameOperation = console.nextLine().charAt(0);
            
            System.out.println("Please enter a number again: ");
            number = Integer.parseInt(console.nextLine());
        
        }
        
        System.out.println("end result = " + acumulator);
    }
}
