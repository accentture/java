package OrderingAndSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class QuickSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6, 1, 23, 4, 2, 3);
        
        List<Integer> result = quickSort(numbers);
        System.out.println("result " + result.toString());
        
    }
    static List<Integer> quickSort(List<Integer> numbers){
        List<Integer> left = new ArrayList<Integer>(), right = new ArrayList<Integer>();
        
        if(numbers.size() < 1){
            return new ArrayList<Integer>();
        }
        
        int pivot = numbers.get(0);
        System.out.println("pivete " + pivot);
        for(int x = 1; x < numbers.size(); x++){
            if(numbers.get(x) < pivot){
                left.add(numbers.get(x));
            }else{
                right.add(numbers.get(x));
            }
        }
        List<Integer> arrayMerged = Stream.of( 
                quickSort(left), 
                Arrays.asList(pivot), 
                quickSort(right)
            )
            .flatMap(Collection::stream)
            .collect(Collectors.toList());
        return arrayMerged;
    }
}


