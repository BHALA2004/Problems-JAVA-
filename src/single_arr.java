import java.util.*;
class single_arr {
    public static int singleNumber(int[] nums) {
        ArrayList<Integer> mass = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!mass.contains(nums[i])){
                mass.add(nums[i]);
            }
            else{
                mass.remove(Integer.valueOf(nums[i]));
            }
        }
        int flag=0;
        for(int num : mass){
            flag=num;
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        int name = singleNumber(arr);
        System.out.println(name);
    }
}
