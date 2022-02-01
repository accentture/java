/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_6_cicles_in_java;

/**
 *
 * @author Tom
 */
public class _43UseOfLabelsInJava {
    
    public static void main(String[] args) {
        /*
            --labels allows to continue or break keywords to a specific point of our program
            --it is not reommendable to apply, it is named programcion go to
            --it is not a good practice to use Labels
            --en el buble for un Lable podria ser util
        
        */

        //defining a label
        inicio:
        for(int counter = 0; counter < 3; counter++){
            if(counter % 2 != 0){
                    continue inicio; //despues de ejecutar ira a la etiqueta inicio
                                     //tiene la capacidad de romper ciclos y ciclos anidados
                }
                System.out.println("counter: " + counter);
            }
    }
}
