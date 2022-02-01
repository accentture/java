package Recursion;

//get sum up to 10
public class _0RecursionJava {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("Sum: " + result);
    }
    public static int sum(int num){
        
        if(num > 0){
            return sum(num - 1) + num;
        }else {
            return 0;
        }
    }
}
