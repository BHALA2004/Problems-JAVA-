package AlgoTutorDSASheet.Arrays;

public class SearchInsertPos3 {
    public static int searchInsert(int[] nums, int target) {
        int value = nums[nums.length-1];
        if(value>target){
            return nums.length-1;
        }
        else {
            for(int i = 0;i<nums.length;i++){
                if(nums[i]==target){
                    return i;
                } else if (nums[i]<target) {
                    return i+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] nums = {1,3,5,6}; int target = 5;
        System.out.println(searchInsert(nums,target));
    }
}
