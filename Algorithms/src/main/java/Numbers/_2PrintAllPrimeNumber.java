package Numbers;
import java.util.List;
import java.util.ArrayList;

public class _2PrintAllPrimeNumber {
    static boolean isPrimeEfficient(int num) {

        if (num <= 1) {
            return false;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int x = 5; x * x <= num; x += 6) {
            if (num % x == 0 || num % (x + 2) == 0) {
                return false;
            }
        }
        return true;

    }

    static List<Integer> getAllPrimeNumbers(int num) {
        List<Integer> primeNumbers = new ArrayList<Integer>();
        
        for (int y = 2; y < num; y += 1) {
                
            if (isPrimeEfficient(y) == true) {
                primeNumbers.add(y);
            }
        }
        return primeNumbers;

    }
    
    public static void main(String[] args) {

        List<Integer> primeNumbers = getAllPrimeNumbers(50);
        
        System.out.println("Prime numbers " + primeNumbers);
    }
}
