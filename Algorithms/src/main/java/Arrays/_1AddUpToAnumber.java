package Arrays;

import java.util.List;
import java.util.ArrayList;
import org.json.JSONObject;

public class _1AddUpToAnumber {
    public static void main(String[] args) {
        int[] numberCollection = {1,2,3,4,5};
        int sum = 5;
        List<Integer> result = findBetterSum(numberCollection, sum);
        
        System.out.println("Result " + result);
    }
    static List<Integer> findBetterSum(int[] numberCollection, int weight){
        int rest;
        List<Integer> result = new ArrayList<Integer>();
        String help;
        JSONObject hashTable = new JSONObject();
        

        for(int x = 0; x < numberCollection.length; x++ ){
            rest = weight - numberCollection[x];
             
            if(hashTable.has(String.valueOf(rest)) == false){
                hashTable.put(String.valueOf(numberCollection[x]), x);
                System.out.println("check " + hashTable);
            }else{
                
                help = hashTable.get(String.valueOf(rest)).toString();
                result.add(Integer.valueOf(help));
                result.add(x);
                
                return result;
            }
        }
        result.add(-1);
        return result;

//        return numberCollection;
    }
}
