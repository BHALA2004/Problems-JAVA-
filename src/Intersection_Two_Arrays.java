import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0;i<nums1.length;i++){
            list1.add(nums1[i]);
        }
        List<Integer> list = new ArrayList<>();


        for(int i = 0;i<nums2.length;i++){
            if(list1.contains(nums2[i])){
                list.add(nums2[i]);
                list1.remove((Integer)nums2[i]);
            }
        }
        int[] result = new int[list.size()];
        for(int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }
        return result;


    }
    public static void main(String[] args) {

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[]  g = intersection(nums1,nums2);
        System.out.println(Arrays.toString(g));


    }
}
