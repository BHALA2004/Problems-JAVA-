import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class count_triplets {
    public static int count_triplets1(int[] arr,int N){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<N;i++){
            map.put(i,arr[i]);
        }
        int count=0;
        for(int i = 0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int sum=arr[i]+arr[j];
                if(map.containsValue(sum)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 5, 3, 2};
        int count = count_triplets1(arr,n);
        System.out.println(count);
    }
}
