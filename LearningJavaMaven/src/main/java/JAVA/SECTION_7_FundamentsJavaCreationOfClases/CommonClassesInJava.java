/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_7_FundamentsJavaCreationOfClases;

import java.util.Date;

/**
 *
 * @author Tom
 */
public class CommonClassesInJava {
    public static void main(String[] args) {
        Date theDate = new Date();
        System.out.println(theDate);
        
        //date to string
        String date = new Date().toString();
        System.out.println(date);
        
        
    }
}
