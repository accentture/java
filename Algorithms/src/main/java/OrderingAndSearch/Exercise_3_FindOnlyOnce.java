package OrderingAndSearch;

public class Exercise_3_FindOnlyOnce {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 2, 4, 4, 6, 6, 8, 8};
        System.out.println("numbers " + numbers);
        int result = findOnlyOnceHelper(numbers);
        System.out.println("Result " + result);
    }

    static int findOnlyOnceHelper(int[] arr) {
        return findOnlyOnce(arr, 0, arr.length - 1);
    }

    static int findOnlyOnce(int[] arr, int low, int high) {

        if (arr.length % 2 == 0) {
            return -1;
        }

        if (low == high) return arr[low];

        int mid = (int) (low + high) / 2;

        if (mid % 2 == 0) {
            if (arr[mid] == arr[mid + 1]) {
                return findOnlyOnce(arr, mid + 2, high);
            } else {
                return findOnlyOnce(arr, low, mid);
            }
        }else{
            if(arr[mid] == arr[mid - 1]){
                return findOnlyOnce(arr, mid + 1, high);
            }else{
                return findOnlyOnce(arr, low, mid - 1);
            }
        }

    }

}
