package tcs;

import java.util.*;

public class SecondArrMissingFirstArr {
    public  static void find(int key , Map<Integer,Integer> val){
        for(Map.Entry<Integer,Integer> mapping :  val.entrySet()){
            if(key==mapping.getKey()){
                mapping.setValue(mapping.getValue()-1);
            }
        }
    }
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        Map<Integer,Integer> val = new HashMap<>();
        for(int i : brr){
            val.put(i,val.getOrDefault(i,0)+1);
        }
        for(int i : arr){
            find(i,val);
        }
        System.out.println(val);
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer,Integer> map : val.entrySet()){
            if(map.getValue()!=0){
                int g = map.getValue();
                for(int i = 0;i<g;i++){
                    result.add(map.getKey());
                }
            }
        }
        return  result;


    }
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(203 ,204, 205 ,206, 207, 208 ,203, 204, 205, 206));
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(203 ,204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204));
        List<Integer> result = missingNumbers(list1,list2);
        System.out.println(result);
    }
}
