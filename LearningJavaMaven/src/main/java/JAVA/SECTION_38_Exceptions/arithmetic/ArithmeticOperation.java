package JAVA.SECTION_38_Exceptions.arithmetic;

import JAVA.SECTION_38_Exceptions.exceptions.*;

public class ArithmeticOperation {

    //due to exeption we are forced to sign with the exception that will be throwed
    public static int divisionWithException(int numerator, int denominator) throws OperationExceptions {

        if (denominator == 0) {
            throw new OperationExceptions("Division between 0");

        }

        return numerator / denominator;
    }

    //we are not forced to sign the method with the exception
    public static int divisionWithRuntimeException(int numerator, int denominator) {

        if (denominator == 0) {
            //if we use this exception type RuntimeException, the compiler does not force us to sign our method with an exception
            throw new OperationRuntimeException("Division between 0 with RuntimeException");

        }

        return numerator / denominator;
    }
}
