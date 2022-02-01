package Numbers;
import java.util.List;
import java.util.ArrayList;

public class _2UglyNumbers {
    static int maximunDivision(int num, int divisor){
        while(num % divisor == 0){
            num /= divisor;
        }
        return num;
    }
    static boolean isUgly(int num){
        num = maximunDivision(num, 2);
        num = maximunDivision(num, 3);
        num = maximunDivision(num, 5);
        
        return num == 1;
    }
    static List<Integer> calculateUglyNumbers(int amountNumbers){
        int counter = 0, numberToEvaluate = 1;
        List<Integer> uglyNumbers= new ArrayList<Integer>();
        
        while(counter < amountNumbers){
            if(isUgly(numberToEvaluate)){
                uglyNumbers.add(numberToEvaluate);
                counter++;
            }
            numberToEvaluate++;
        }
        
        return uglyNumbers;
    }

    public static void main(String[] args) {
        List<Integer> result = calculateUglyNumbers(15);
        
        System.out.println("Result: " + result);
    }
}
