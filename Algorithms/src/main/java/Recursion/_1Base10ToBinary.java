package Recursion;

public class _1Base10ToBinary {
    static int find(int decimal_number)
    {
        int result;
        if (decimal_number == 0)
            return 0;
             
        else
            
            //chek image to understand reason of multiply by 10 ( the reason is to create the number): https://i.ytimg.com/vi/G14CL_go0Ek/hqdefault.jpg
            result = (decimal_number % 2 + 10 *
                find(decimal_number / 2));
        return result;
    }    
    public static void main(String[] args) {     
        int result = find(25);
        System.out.println("Result "+ result);
    }
}    
