package FromJavascriptToJava.Recursion;

import java.util.ArrayList;
import java.util.List;

public class FibonnaciNumbersWithLoop {
    public static void main(String[] args) {
        List response = getFibbonaciNumbers(18);
        System.out.println("response : " + response.toString());

    }

    static List<Integer> getFibbonaciNumbers(int amountFibbNumbers){
        List fibbNumbers = new ArrayList<Integer>();

        int counter = 1;
        while(counter < amountFibbNumbers){
            if(counter == 1 || counter == 2){
                fibbNumbers.add(1);
            }else{
                int lastNum = (int) fibbNumbers.get(fibbNumbers.size() - 1);
                int antepenultimateNum = (int) fibbNumbers.get(fibbNumbers.size() - 2);
                fibbNumbers.add(lastNum + antepenultimateNum);
            }
            counter++;
        }
        return fibbNumbers;

    }
}
