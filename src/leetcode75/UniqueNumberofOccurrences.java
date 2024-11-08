package leetcode75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumberofOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();boolean m = false;
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> hash : map.entrySet()){
            if(!list.contains(hash.getValue())){
                list.add(hash.getValue());
                m = true;
            }
            else {
                m=false;break;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int[] arr = {1,2};
        boolean result  = uniqueOccurrences(arr);
        System.out.println(result);
    }
}
