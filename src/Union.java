import java.util.ArrayList;
import java.util.HashSet;

public class Union {
    public static int doUnion(int arr1[], int arr2[]) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i = 0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[ ] arr1 = {1, 2, 1, 1, 2};
        int[] arr2 = {2, 2, 1, 2, 1};
        int result = doUnion(arr1,arr2);
        System.out.println(result);
    }
}
