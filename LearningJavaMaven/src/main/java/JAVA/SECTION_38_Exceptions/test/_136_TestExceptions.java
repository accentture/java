/*
    check: https://www.scientecheasy.com/wp-content/uploads/2020/02/exception-hierarchy-1.png

    --the parent of our exceptions is truable
    --the exception class is the class that inherintace of Trowable class

    --if our exceptions inheritance of Exception class, then it is type check exception, where the compiler force us to use the trycatch block 

    --if our exception inheritance of RuntimeExeption class, the it is type uncheck exception, where the compiler not force us to use trycatch block
 */

 /*
    --only use exception type Exception only when we are sure that will happend an Exception
    --it is most recommendable to use exeption type Runtime Exception, so the code will be cleaner

 */
package JAVA.SECTION_38_Exceptions.test;

//static import
//import static JAVA.SECTION_38_Exceptions.arithmetic.ArithmeticOperation.divisionWithException;
import JAVA.SECTION_38_Exceptions.arithmetic.ArithmeticOperation;
import JAVA.SECTION_38_Exceptions.exceptions.OperationExceptions;

public class _136_TestExceptions {

    public static void main(String[] args) {
        testWithException();
        //testWithRuntimeException();
    }

    public static void testWithException() {
        //using exceptions our system can recovery of an exception
        int split = 0;

        //try catch is a block code
        try {
            //split = 10 / 0; //the exception will be type RuntimeExeption, then the compiler not force us to use trycatch bliok

            split = ArithmeticOperation.divisionWithException(10, 0);

        //processing first the exceptionw with less hierarchy
        }catch (OperationExceptions e) {
            System.out.println("An error type OperationExceptions has happened" + e);
            
            
        } catch (Exception e) {

            //between an exceptions can be more exceptions
            //System.out: indicatint that ouput of exceptions is the console
            System.out.println("An error type Exception     has happened");
            e.printStackTrace(System.out); //printing stack of exceptions
            System.out.println("message exception = " + e.getMessage()); //getting message
        
        //finallly block  always will be excecuted
        //finally block can be used to close resources
        }finally {
            System.out.println("Finally bloc ---- The division between 0 was done");
        }

        System.out.println("split = " + split);
    }

    public static void testWithRuntimeException() {
        int split = 0;

        //when we use exception type RunTimeException, we are not forced to use trycatch block, so the code is cleaner
        split = ArithmeticOperation.divisionWithRuntimeException(10, 0);

    }

}
