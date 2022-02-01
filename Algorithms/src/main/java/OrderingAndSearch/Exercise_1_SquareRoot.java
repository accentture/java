package OrderingAndSearch;

public class Exercise_1_SquareRoot {
    public static void main(String[] args) {
        int result = sqrtRoot(46.23);
        System.out.println("Result: " + result);
    }
    static int sqrtRoot(double number){
        int start = 0, end = (int)number, mid, answer = -1;
        
        while(start <= end){
            mid = (start + end) / 2;
            
            if(mid*mid == number){
                return mid;
            }
            
            if(mid*mid < number){
                start = mid + 1;
                answer = mid; //asing the awser due to decimals in number
            }else{
                end = mid - 1;
            }
        }    
        return answer;
    }
}
