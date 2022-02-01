package OrderingAndSearch;

public class Exercise_1_Bonus_SquareRootFloat {

    public static void main(String[] args) {

        double result = squareRootWithFloatNumber(3);
        System.out.println("Result " + result);
    }

    static double squareRootWithFloatNumber(float number) {
        double start = 0, end = number;
        double mid = 0, accuracyNumber = 0.0000000001;
        
        int counter = 0;
        while ((end - start) > accuracyNumber) {
            mid = (end + start) / 2;

            counter++;
            System.out.println("Counter " + counter);
            if (mid * mid < number) {
                start = mid;
            } else if (mid * mid > number) {
                end = mid;
            }
        }

        return mid;
    }
}
