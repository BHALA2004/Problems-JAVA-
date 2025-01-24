package Hackerrank;
import java.util.*;

public class DivSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count  = 0;
        for (int i = 0;i<ar.size()-1;i++){
            for (int j = i+1;j<ar.size();j++){
                if((ar.get(i)+ar.get(j))%k==0){
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args){
       int n = 100, k = 67;
        List<Integer> list = new ArrayList<>(Arrays.asList(57, 46, 3, 24, 53, 30, 53, 90, 50, 44, 80, 33, 55, 37, 97, 37, 82, 33, 80, 97, 84, 18, 85, 28, 99, 77, 93, 90, 88, 46, 48, 27, 3, 37, 46, 71, 98, 11, 4, 75, 90, 48, 10, 7, 46, 61, 90, 100, 59, 16, 27, 84, 18, 59, 51, 74, 52, 40, 12, 25, 48, 41, 5, 99, 80, 84, 23, 65, 96, 65, 97, 8, 87, 76, 33, 72, 76, 89, 19, 71, 39, 6, 33, 74, 55, 26, 6, 98, 80, 56, 58, 91, 47, 69, 29, 47, 88, 15, 11, 12));
        System.out.println(divisibleSumPairs(n,k,list));
    }
}
