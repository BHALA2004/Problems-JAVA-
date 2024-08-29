import java.util.*;

public class merge_array {
    public static double mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int n1 = arr2.length;
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < n1) {
            if (arr1[i] < arr2[j]) {
                merged.add(arr1[i]);
                i++;
            } else {
                merged.add(arr2[j]);
                j++;
            }
        }

        while (i < n) {
            merged.add(arr1[i]);
            i++;
        }

        while (j < n1) {
            merged.add(arr2[j]);
            j++;
        }

        int[] result = new int[merged.size()];
        for (int k = 0; k < merged.size(); k++) {
            result[k] = merged.get(k);
        }

        /*for (int num : result) {
            System.out.println(num);
        }*/
        int size = result.length;
        if(size%2==1){
            int num = size/2;
            return (double)result[num];
        }
        else{
            int num = size/2;
            int num1= result[size-num];
            int num2= result[num-1];
            double num3 = (double) (num1+num2)/2;
            return num3;
        }
    }

    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        double x  = mergeArrays(num1, num2);
        System.out.println(x);
    }
}