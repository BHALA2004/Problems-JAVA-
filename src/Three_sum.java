import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Three_sum {
    public static boolean find3Numbers(int arr[], int n, int x) {

        // Your code Here
        Arrays.sort(arr);
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }


        int start=0;
        int end=n-1;
        while(start<end){
            if(arr[start]+arr[end]>x){
                end--;
            }
            else if(arr[start]+arr[end]<x){
                int temp = x-(arr[start]+arr[end]);
                if(m.containsKey(temp)){
                    if(m.get(temp)>1 || (temp!=arr[start] && temp!=arr[end])){
                    return true;}
                }
                start++;
            }


        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr = {40,20,10,3,6,7};
        int n = arr.length;
        int x = 24;
        Boolean s = find3Numbers(arr,n,x);
        System.out.println(s);
    }
}
