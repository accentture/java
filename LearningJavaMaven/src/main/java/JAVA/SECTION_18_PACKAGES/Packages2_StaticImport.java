/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_18_PACKAGES;

/**
 *
 * @author Tom
 */
//it is an example that is possible to import static classes
import static java.lang.System.*;


public class Packages2_StaticImport {
    public static void main(String[] args) {
            
        //a static import allow does not use name of CLASS
        // We don't need to use 'System.out' 
        // as imported using static.
        out.println("GeeksforGeeks");
    }
}
