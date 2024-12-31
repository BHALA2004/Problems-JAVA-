package AlgoTutorDSASheet.Arrays;

public class BinarySearch1 {
    public static int search(int[] nums,int target,int start,int end,int index){

        int mid = (end+start)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(index==nums.length-1){
            return -1;
        }
        if(nums[mid]>=target){
            return search(nums,target,start,mid-1,index+1);
        }
        else {
            return search(nums,target,mid+1,end,index+1);

        }

    }
    public static int search(int[] nums, int target) {
       int start = 0;
       int end = nums.length-1;

       while (start<=end){
           int mid = start+(end-start)/2;
           if(nums[mid]==target){
               return mid;
           } else if (nums[mid]>=target) {
               end=mid-1;
           }
           else {
               start=mid+1;
           }
       }
       return -1;
       //return search(nums,target,0,nums.length-1,0);

    }
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};int target = 9;
        int result = search(arr,target);
        System.out.println(result);
    }
}
