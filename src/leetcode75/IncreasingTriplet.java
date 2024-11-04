package leetcode75;

public class IncreasingTriplet {
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE,second=Integer.MAX_VALUE;
       for(int i = 0;i<nums.length;i++){
           if(first>=nums[i]){
               first=nums[i];
           } else if (second>=nums[i]) {
               second=nums[i];
           }
           else {
               return true;
           }
       }
return false;


    }
    public static void main(String[] args) {
       int[] nums = {2,1,5,0,4,6};
       boolean result = increasingTriplet(nums);
        System.out.println(result);

    }
}
