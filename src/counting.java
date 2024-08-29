import java.util.*;

public class counting {
    public static int mostFrequentEven(int[] nums) {
        int max= Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
                max=Math.max(max,hm.get(nums[i]));
            }
        }
        for(Map.Entry<Integer,Integer>  entry : hm.entrySet()){
            if(entry.getValue()==max){
                min=Math.min(min,entry.getKey());
            }
        }
        return min==Integer.MAX_VALUE?-1:min;



    }
    public static void main(String[] args) {
        int[] g = {0,1,2,2,4,4,1,6,6,6,6,6};
        int a =mostFrequentEven(g);
      System.out.println(a);
    }
}
