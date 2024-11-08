package leetcode75;

import java.util.Arrays;

public class KSumPairs {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;int count = 0;
        int right = nums.length-1;
        while (left<=right){
            if(nums[left]+nums[right]==k && left!=right){
                count++;left++;right--;
            } else if (nums[left]+nums[right]>k) {
                right--;
            }
            else {
                left++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,3};int k = 6;
        int result = maxOperations(nums,k);
        System.out.println(result);
    }
}
