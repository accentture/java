/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_6_cicles_in_java;

import java.util.Date;

/**
 *
 * @author Tom
 */
public class _42ExerciseWordsBreakAndContinue {
    public static void main(String[] args) {
        for(int counter = 0; counter < 3; counter++){
            if(counter % 2 != 0){
                
                //continue will omit the remaining lines of code and will continue with the next iteration
                continue;
            }
            System.out.println("counter: " + counter);
        }
    }
}
