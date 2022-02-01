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

//we need to pay attention to class with same name of differents packages
import java.util.*;
import java.sql.*;


public class Packages3_HandlingNameConficts {
    public static void main(String[] args) {
        
        //to solve problem of conflict classes, we need to use full package in every declaration
        java.util.Date deadLine = new java.util.Date();
        java.sql.Date today = new java.sql.Date(12);
        
        System.out.println("deadLine " + deadLine);
        System.out.println("today " + today);
    }
    
    //==================== Directory structure
    /*
        --the entitiees of package are saved in the same package and syb subdirectory with $BASE_DIR  as base
        --the JAVA compiler must be informed about $BASE_DIR to find the classes
        --it is acomplished throught a environment variable named CLASSPATH
    
        --IMPORTANT: the envrionemnt variable is necessary to find the files that complier will execute
    
    */
    
    
}
