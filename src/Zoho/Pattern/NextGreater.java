package Zoho.Pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class NextGreater {
    public static int revNextMax(int value,int[] nums,int i){
        for(int j = i;j<nums.length;j++){
            if(value<nums[j]){
                return nums[j];
            }
        }
        return Integer.MAX_VALUE;
    }
    public static int nextMax(int value,int[] nums){
        for(int i : nums){
            if(i>value){
                return i;
            }
        }
        return -1;
    }
    public static int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length];int count = 0;
        int max  = Integer.MIN_VALUE;int index = 0;
        for(int i = 0;i<nums.length;i++){
            int value = revNextMax(nums[i],nums,i);
            if(value!=Integer.MAX_VALUE){
                arr[count++]=value;
            }
            else {
                int newvalue = nextMax(nums[i],nums);
                arr[count++]=newvalue;
            }

        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1,8,-1,-100,-1,222,1111111,-111111};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
}
