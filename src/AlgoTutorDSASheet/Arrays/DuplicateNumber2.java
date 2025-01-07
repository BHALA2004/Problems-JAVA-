package AlgoTutorDSASheet.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateNumber2 {
    public static void main(String[] args) {
       int[] nums = {1,3,4,3,5};int m = 0;
//      Map<Integer,Integer> hashmap = new HashMap<>();
//      for(int i = 0;i<nums.length;i++){
//          hashmap.put(nums[i],hashmap.getOrDefault(nums[i],0)+1);
//      }
//      for(Map.Entry<Integer,Integer> has : hashmap.entrySet()){
//          if(has.getValue()>=2){
//              System.out.println(has.getValue());break;
//          }
//      }
        Arrays.sort(nums);
        int small = nums[0];int large = nums[nums.length-1];
        int[] arr = new int[large-small+1];
        for(int i =0;i<nums.length;i++){
            arr[nums[i]-small]++;
        }
        System.out.println(Arrays.toString(arr));
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>=2){
                System.out.println(small+i);
                break;
            }
        }
    }
}
