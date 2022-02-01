/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_3_tiposPrimitivosEnJava;

/**
 *
 * @author Tom
 */
public class _18TipoPrimitivoChar {
    public static void main(String[] args) {
        /*
            --type char have 16bits
            
        */
        
        char miCaracter = 'a'; //char allows only to store a character
                               //use simple quote
                               //java use characters unicode, search in google ----->    "LIST UNICODE"
        System.out.println("mi caracter: " + miCaracter);
        
        //--char can store decimal types also
        char varChar = '\u0021'; //using unicode code
        System.out.println("char with unicode character: " + varChar );
        
        char varCharDecimal = 33;
        System.out.println("char with unicode number: " + varCharDecimal);
        
        char varCharSymbol = '!';
        System.out.println("Unsing symbol directly: " + varCharSymbol);
        
        
        //=============================================using var
        //if we using var, java will make an inference about data type
//        var varChar1 = '\u0021'; //using unicode code
//        System.out.println("varChar1: " + varChar1);
//        
//        var varCharDecimal2 = 33; //this literal is int type, therefore java will conver int type
//        System.out.println("varCharDecimal2: " + varCharDecimal2);
//        
//        var varCharSymbol3 = '!';
//        System.out.println("varCharSymbol3: " + varCharSymbol3);
        
        
        
        //it is poossible to store char type in int type
        int variableIntSymbol = '!';
        System.out.println("variableIntSymbol : " + variableIntSymbol);
        
        int character = 'a';
        System.out.println("variableIntSymbol: " + character);
    }
    
}
