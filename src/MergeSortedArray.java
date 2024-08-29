
import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<nums1.length;i++){
            list.add(nums1[i]);

        }
        for(int i = 0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        for (int i = 0;i<list.size();i++){
            if(list.get(i)==0){
                list.remove(i);
            }
        }
        System.out.println(list);

    }
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int m = nums1.length;
        int[] nums2={2,5,6};
        int n = nums2.length;
        merge(nums1,m,nums2,n);

    }
}
