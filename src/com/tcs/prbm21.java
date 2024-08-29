package com.tcs;

public class prbm21 {
    public static void main(String[] args) {
        int[] nums = {1,-1,4};int sum=0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
        }
        int leftsum=0;int m = 0;
        for(int i = 0;i<nums.length;i++){
            sum-=nums[i];
            if(sum==leftsum){
                m=i;break;
            }
            leftsum+=nums[i];
        }
        System.out.println(m);
    }
}
