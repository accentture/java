/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_3_tiposPrimitivosEnJava;

/**
 *
 * @author usuario
 */

public class _14TiposPrimitivosEnJava {
    public static void main(String[] args) {
        /*
        tipos primitivos de tipo enteoro: byte, short,  int, long
            byte:8 bits  ; usar bit no garantia que solo use 8 bits, lo mas proble es que use 32bits de una palara
            short:16bits
            int: 32bits
            long:64bits
            
        */
        byte numeroByte = (byte)129; //-127  //convirtiendo un numero entero a typo byte, pero hacer esto puede causar impresiciones por eso retorna -127
        System.out.println("numero con byte " + numeroByte);
        System.out.println("Valor minimo del byte " + Byte.MIN_VALUE); 
        System.out.println("Valor maximo del byte " + Byte.MAX_VALUE);
        
        short numeroShort = (short)32769; //perdida de presicion, esto debido a la perdida de bits
        System.out.println("========================SHORT " ); 
        System.out.println("Valor short " + numeroShort); 
        System.out.println("Valor minimo del short " + Short.MIN_VALUE); 
        System.out.println("Valor maximo del short " + Short.MAX_VALUE);
        
        //lo recomendable es usar el tipo int   
        int numeroEntero = (int)2147483648L; //añadir L lo convierte en literal de tipo long   
        System.out.println("========================INT " ); 
        System.out.println("Valor short " + numeroEntero); 
        System.out.println("Valor minimo del short " + Integer.MIN_VALUE); 
        System.out.println("Valor maximo del short " + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L; //si añadirmos una L, igualmente mostrara que ya superamos el tipo de dato flotante, por lo tanto habra que usar tipo float F o double D
        System.out.println("========================LONG " ); 
        System.out.println("Valor short " + numeroLong); 
        System.out.println("Valor minimo del short " + Long.MIN_VALUE); 
        System.out.println("Valor maximo del short " + Long.MAX_VALUE);
        
        
        
        
    }
}
