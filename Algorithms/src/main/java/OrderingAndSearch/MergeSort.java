package OrderingAndSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSort {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6, 1, 23, 4, 2, 3);
        List<Integer> result = mergeSort(numbers);
        System.out.println("Result " + result);
    }

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
