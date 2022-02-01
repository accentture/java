package OrderingAndSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.json.JSONObject;

public class Exercise_4_CountWords {
    public static void main(String[] args) {
        String sentence = "practice makes perfect get perfect by practice. just practice practice";
        
        countWordsSortedFromHighestToLowest(sentence);
    }
    static void countWordsSortedFromHighestToLowest(String words){
        List<String> wordsSplited = Arrays.asList(words.split(" "));
        List<String> wordsCounted = new ArrayList();
        
        JSONObject word = new JSONObject (); 
        for(int x = 0; x < wordsSplited.size(); x++){
            if(!word.has(wordsSplited.get(x))){
                word.put(wordsSplited.get(x), 1);
            }else{
                
                int value = Integer.parseInt(word.get(wordsSplited.get(x)).toString()) + 1;
                System.out.println("chofer " + wordsSplited.get(x).getClass());
                word.put(wordsSplited.get(x), value);
            }
        }
        Iterator<String> keys = word.keys(); 
        
        while(keys.hasNext()){
            String key = keys.next();
            Object value = word.get(key);
            System.out.println("value " + value);
        }
        
        System.out.println("word " + word.toString());
    }
    
}
    
class MergeSortAlgorithm {
    static List<Integer> mergeSort(List<Integer> numbers) {

        if (numbers.size() < 2) {
            return numbers;
        }

        int midOfArray = numbers.size() / 2;
        List<Integer> leftArray = numbers.subList(0, midOfArray);
        List<Integer> rightArray = numbers.subList(midOfArray, numbers.size());

        return merge(mergeSort(leftArray), mergeSort(rightArray));
                
    }

    static List<Integer> merge(List<Integer> array1, List<Integer> array2) {
        List<Integer> numbersSorted = new ArrayList<Integer>();
        int indexOnArray1 = 0, indexOnArray2 = 0;

        while (indexOnArray1 < array1.size() && indexOnArray2 < array2.size()) {
            if (array1.get(indexOnArray1) < array2.get(indexOnArray2)) {
                numbersSorted.add(array1.get(indexOnArray1++));
            } else {
                numbersSorted.add(array2.get(indexOnArray2++));
            }
        }

        List<Integer> firstRemainder = array1.subList(indexOnArray1, array1.size());
        List<Integer> secondRemainder = array2.subList(indexOnArray2, array2.size());

        return Stream.of(numbersSorted, firstRemainder, secondRemainder)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
