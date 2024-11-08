package leetcode75;

import java.util.*;

public class FindtheDifferenceofTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       Set<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        for(int i: nums2){
            set2.add(i);
        }

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int i = it.next();
            if (set2.contains(i)) {
                it.remove(); // Iterator provides a safe way to remove elements
                set2.remove(i);
            }
        }

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerList1 = new ArrayList<>(set);
        List<Integer> innerList2 = new ArrayList<>(set2);
        list.add(innerList1);list.add(innerList2);
        return list;


    }
    public static void main(String[] args) {
       int[] nums1 = {1,2,3};int[] nums2 = {2,4,6};
        findDifference(nums1,nums2);
    }
}
