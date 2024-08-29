import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZOHO_q3 {
    int rem=0;
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> m = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE; // Initialize minDiff to maximum value
        for(int i=0;i<arr.length-1;i++){
            min=Math.min(min,Math.abs(arr[i+1]-arr[i]));
        }
        for(int i=0;i<arr.length-1;i++){
            if(min==Math.abs(arr[i+1]-arr[i])){
                m.add(Arrays.asList(arr[i+1],arr[i]));
            }
        }
        return m;

    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2 };
        List<List<Integer>> m = minimumAbsDifference(arr);
        System.out.println(m);
    }
}
