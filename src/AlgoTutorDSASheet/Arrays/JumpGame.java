package AlgoTutorDSASheet.Arrays;

import java.util.ArrayList;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        int maxIndex = 0;

        for(int i = 0;i<nums.length;i++){
            //I value is always be greater if any number in index is 0 then i is incremented but maxIndex decrease -> false
            if(i>maxIndex){
                return false;
            }
            maxIndex=Math.max(maxIndex,i+nums[i]);
        }
        return true;


    }
    public static void main(String[] args) {
       int[] nums = {0,2,3};
        System.out.println(canJump(nums));
    }
}
