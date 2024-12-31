package AlgoTutorDSASheet.Arrays;

import java.util.Arrays;

public class SelectionSort4 {
    public static void SelectionSortColours(int[] nums,int r,int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(nums[c]>=nums[max]){
                SelectionSortColours(nums,r,c+1,c);
            }
            else {
                SelectionSortColours(nums,r,c+1,max);
            }
        }
        else {
            int temp = nums[max];
            nums[max]=nums[r-1];
            nums[r-1]=temp;
            SelectionSortColours(nums,r-1,0,0);
        }
    }
    public static void sortColors(int[] nums) {
        SelectionSortColours(nums,nums.length,0,0);
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
