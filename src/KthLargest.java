import java.util.*;

public class KthLargest {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};int k=2;
        Arrays.sort(nums);
        System.err.println(nums[nums.length-1-k]);


    }
}
