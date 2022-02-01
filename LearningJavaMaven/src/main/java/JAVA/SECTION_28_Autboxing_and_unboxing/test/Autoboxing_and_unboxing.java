
package JAVA.SECTION_28_Autboxing_and_unboxing.test;

public class Autoboxing_and_unboxing {
    /*
        --autoboxing and unboxing has to see with type primitives in java
        --every primitive type has a class associate Wrapper 
        --examples of wrapper classes are the next
            int:    Integer
            long:   Long
            float:  Float
            double: Double
            boolean:Boolean
            byte:   Byte
            char:   Character
            short:  Short
    
    
        --these wrapper classes has methods and attributes, for it reason is used a lot
        --if we want to use only classes, we can use these wrapper classes
        --but if we has an algorithms that make many computing, it is recommendable to use primitive types
    */
    
    public static void main(String[] args) {
        
        
        //examples autoboxing
        //primite types
        int integer1 = 10;
        Integer integer2 = 20;
        System.out.println("integer2 = " + integer2); //shortcut -> soutv
        System.out.println("integer2 string = " + integer2.toString()); 
        System.out.println("integer2 byte = " + integer2.byteValue()); 
        System.out.println("integer2 short = " + integer2.shortValue() ); 
        System.out.println("integer2 double= " + integer2.doubleValue() ); 
        
        
        System.out.println("");
        //examples unboxing
        //unboxing is the contrarie proess to autoboxing
        int integer3 = integer2; //the value will be 10 type integer (primitive)
        System.out.println("integer3 = " + integer3);
    }
}
