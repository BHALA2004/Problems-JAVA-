package recursive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class ContinuousandSequence {
    public static void fun(int val, int[] arr, ArrayList<Integer> list, int n,ArrayList<ArrayList<Integer>> lists) {
        // Base case: if we've processed all elements
        if (val == n) {

                lists.add(new ArrayList<>(list));
                // To ensure subsets are printed on new lines
            return;
        }

        // Include the current element
        list.add(arr[val]);
        fun(val + 1, arr, list, n,lists);

        // Exclude the current element (backtracking)
        list.remove(list.size() - 1); // Remove the last added element
        fun(val + 1, arr, list, n,lists);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        int[] arr = {1,2,2};
        int n = arr.length;
        fun(0, arr, list, n,lists);
        Set<ArrayList<Integer>> lists1 = new HashSet<>(lists);
        System.out.println(lists1);
    }
}
