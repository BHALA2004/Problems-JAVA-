import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alternate_sort {
    public static ArrayList<Long> alternateSort(long arr[] ,int N)
    {
        ArrayList<Long> array = new ArrayList<>();
        Arrays.sort(arr);
        int start=0;
        int end = N-1;
        while(start<end){
            array.add(arr[end]);
            array.add(arr[start]);
            start++;end--;
        }
        if(start==end){
            array.add(arr[start]);
        }

        return array;
    }
    public static void main(String[] args) {
        long[] arr = {7, 1, 2, 3, 4,  5};
        ArrayList<Long> g = alternateSort(arr,arr.length);
        System.out.println(g);
    }
}
