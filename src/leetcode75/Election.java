package leetcode75;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Election {
    public static String predictPartyVictory(String senate) {
        Queue<Integer> queuer = new LinkedList<>();
        Queue<Integer> queued = new LinkedList<>();
        for(int i =0;i<senate.length();i++){
            if(senate.charAt(i)=='R'){
                queuer.add(i);
            }
            else{
                queued.add(i);
            }
        }
        int n = senate.length();
        while(!queuer.isEmpty() && !queued.isEmpty()){
            int valr = queuer.poll();
            int vald = queued.poll();
            if(valr<vald){
                queuer.add(valr+n);
            }
            else{
                queued.add(vald+n);
            }
        }
        return !queuer.isEmpty()?"Radiant":"Dire";
    }
    public static void main(String[] args) {
        String senate = "D";
        String result = predictPartyVictory(senate);
        System.out.println(result);
    }
}
