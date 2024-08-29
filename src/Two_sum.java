import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_sum {
    public static boolean hasArrayTwoCandidates(int arr[], int x) {
        // code here
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        boolean g = false;
       while(start<end){
           if(arr[start]+arr[end]==x){
               return true;
           }
           else if(arr[start]+arr[end]<x){
               start++;
           }
           else{
               end--;
           }
       }
        return g;

       /* Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            int xg = x-arr[i];
            if(m.containsKey(xg)){
                return true;
            }
        }
        return false;*/


    }
    public static void main(String[] args) {
        int[] arr = {1, 2,4,3,6};
        int x=11;
        boolean m = hasArrayTwoCandidates(arr,x);
        System.out.println(m);
    }
}
