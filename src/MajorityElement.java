import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(int x :map.keySet()){
            int r = map.get(x);
            max=Math.max(max,r);

        }
        int c = 0;
        for(Map.Entry<Integer,Integer> m :map.entrySet()){
            Integer r = m.getValue();
            if(max==r){
                c=m.getKey();
            }
        }
        return c;




    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int result = majorityElement(arr);
        System.out.println(result);
    }
}
