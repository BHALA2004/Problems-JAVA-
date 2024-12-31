package AlgoTutorDSASheet.Arrays;

import java.util.Arrays;

public class FindFirstLastPosition5 {
    public static int[] searchRange(int[] nums, int target) {
        int first = -1,second=-1;
        int start = 0;int end = nums.length-1;
        while (start<=end){
            int mid = (end+start)/2;
            if(nums[mid]==target){
                first=mid;
                second=mid;
                while (first>0 && nums[first-1]==target){
                    first--;
                }
                while (second<nums.length-1 && nums[second+1]==target){
                    second++;
                }
                break;
            } else if (nums[mid]<target) {
                start=mid+1;
            } else {
                 end=mid-1;
            }
        }
        return new int[]{first,second};
    }
    public static void main(String[] args) {
        int[] nums = {2,2};int target =2;
        int[] arr = searchRange(nums,target);
        System.out.println(Arrays.toString(arr));

    }
}
