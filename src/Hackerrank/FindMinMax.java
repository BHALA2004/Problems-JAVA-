package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinMax {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min = 0;long max = 0;
        Collections.sort(arr);
        for (int i = 0; i < arr.size()-1; i++) {
            min+=arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            max+=arr.get(i);
        }
        System.out.print(min+" "+max);

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(156873294, 719583602, 581240736, 605827319, 895647130));
        miniMaxSum(list);
    }
}
