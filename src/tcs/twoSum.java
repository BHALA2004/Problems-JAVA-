package tcs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class twoSum {
//    public static List<Integer> allAns(int a ,int b ,List<Integer> result){
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0;i<result.size();i++){
//            if(a==result.get(i)){
//                list.add(i+1);
//            }
//        }
//        for(int i = 0;i<result.size();i++){
//            if(b==result.get(i)){
//                list.add(i+1);
//            }
//        }
//        return list;
//    }
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
       List<Integer> list = new ArrayList<>();
       for(int i = 0;i<arr.size();i++){
           for(int j = i;j<arr.size();j++){
               if(i!=j && arr.get(i)+arr.get(j)==m){
                   list.add(i+1);list.add(j+1);
               }
           }
       }
       return list;
    }

    public static void main(String[] args) {
        int m = 4;
        List<Integer> list = new ArrayList<>();
        list.add(2);list.add(2);list.add(4);list.add(3);
        System.out.println(icecreamParlor(m,list));
    }
}
