
package JAVA.SECTION_18_PACKAGES; //name of package always is required on the top


//util is a subpackage of java package
import java.util.*;    // * indicate to import all packages


//generally name of clas is used when they are two classes with the same name
//import java.util.Date;
//import my.packag.Date;

import java.util.Vector;

//if a class is public is necessary to store that class in another file
public class Packages1 {
    /*
        --the modificators are the next
            1 protected
            2 private
            3 public    
    
        --a member by default only can be acceced by classes in the same package
        --algunas classes son para uso interno y otras son para uso expuesto
    
        **Classpath : Classpath  is a param that specifi to the JVM the location of the defined class by the user, it is parent directory of create classby user
    
        **Java Applet. Applet is a special type of program that is embedded in the webpage to generate the dynamic content. It runs inside the browser and works at client ...
    
        **Subpackages : 
        --the subpackages are not imported by default
        --it has not access privileges
    */
    
    /*
        --the next are the packages most common in java
            1) java.lang: Contains language support classes(e.g classed which defines primitive data types, math operations). This package is automatically imported.
            2)  java.io: Contains classed for supporting input / output operations.
            3)  java.util: Contains utility classes which implement data structures like Linked List, Dictionary and support ; for Date / Time operations.
            4)  java.applet: Contains classes for creating Applets.
            5)  java.awt: Contain classes for implementing the components for graphical user interfaces (like button , ;menus etc).
            6)  java.net: Contain classes for supporting networking operations.
    
    */
    
    public Packages1(){
        Vector newVector = new Vector();
        
        
        
        //ArrayList is not imported, therefore it is used referencing the complete package
        java.util.ArrayList newList = new java.util.ArrayList();
    }
    
    
}
