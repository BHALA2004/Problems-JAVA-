import java.awt.image.Kernel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeDuplicate {
    public static long kthElement(int arr1[], int arr2[], int k) {
        int[] result = new int[arr1.length+arr2.length];
        for(int i = 0;i<arr1.length;i++){
            result[i]=arr1[i];
        }
        int j = 0;
        for(int i = arr1.length;i<arr1.length+arr2.length;i++){
            result[i]=arr2[j];j++;
        }
        Arrays.sort(result);

        long m = result[k-1];
        return m;

    }
    public static void main(String[] args) {
        int arr1[] = {100, 112, 256, 349, 770};
        int arr2[]={72, 86, 113, 119, 265, 445, 892};
        long result = kthElement(arr1,arr2,7);
        System.out.println(result);
    }
}
