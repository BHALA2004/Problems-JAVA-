import java.util.ArrayList;
import java.util.List;

public class SearchInBiotonicArray {
   public static int solve(int[] A,int B){
       List<Integer> list = new ArrayList<>();
       for(int i = 0;i<A.length;i++){
           list.add(i,A[i]);
       }
       if(list.contains(B)){
           return list.indexOf(B);
       }
       else {
           return -1;
       }
   }
    public static void main(String[] args) {
        int[] A = {3, 9, 10, 20, 17, 5, 1};
        int B = 5;
        int result = solve(A, B);
        System.out.println(result);
    }
}
