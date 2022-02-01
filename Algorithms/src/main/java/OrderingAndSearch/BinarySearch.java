package OrderingAndSearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8};
        int numberToSearch = 3;
        int result = search(numbers, numberToSearch);
        System.out.println("result : " + result);
    }
    static int search(int[] numberCollection, int numberToSearch){
        int lowIndex = 0, 
            hightIndex = numberCollection.length, 
            midIndex;
        
        while(lowIndex <= hightIndex){
            midIndex = (lowIndex + hightIndex) / 2;
            if(numberToSearch == numberCollection[midIndex]){
                return midIndex;
            }
            
            if(numberToSearch > numberCollection[midIndex]){
                lowIndex = midIndex + 1;
            }else{
                hightIndex = midIndex - 1;
            }
        }
        
        return -1;
    }
}

