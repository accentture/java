
package JAVA.SECTION_38_Exceptions.exceptions;

/*
    --if the class inherits of exeception, then the compiler will oblige us to process the exception (check exception)
    --if the class interits of RuntimeException, then the compiler not will oblige us to process the exception
*/

public class OperationExceptions extends Exception {
    public OperationExceptions(String message){
        
        //propaging message exception to parent class
        super(message);
    }
}
