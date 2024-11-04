package leetcode75;

import java.util.Arrays;

public class ProductOfArray {
    public static int val(int[] nums,int val){
        int mult = 1;
        for(int i = 0;i<nums.length;i++){
            if(i!=val){
                mult*=nums[i];
            }
        }
        return mult;
    }
    public static int[] productExceptSelf(int[] nums) {
        int count = 0;
        int[] result = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            result[count++]=val(nums,i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] val = productExceptSelf(nums);
        System.out.println(Arrays.toString(val));
    }
}
