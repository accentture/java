package FromJavascriptToJava.Recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionWithRecursion {
    public static void main(String[] args) {
        int response = fibbonaciNumbers(18);
        System.out.println("response : " + response);

    }

    static int fibbonaciNumbers(int total){
        if(total <= 0) return 0;

        if(total == 1 || total == 2) return 1;

        return fibbonaciNumbers(total -1) + fibbonaciNumbers(total - 2);

    }
}
