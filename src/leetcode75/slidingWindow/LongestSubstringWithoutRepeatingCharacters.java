package leetcode75.slidingWindow;



import java.util.HashMap;

import java.util.Map;



public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {

        Map<Character,Integer> hashmap = new HashMap<>();int max = 0;

        for(int i = 0;i<s.length();i++){
            int currI = i;
            try{
           if(hashmap.isEmpty() || hashmap.get(s.charAt(i))!=1){
               hashmap.put(s.charAt(i),1);
               max=Math.max(max,hashmap.size());
           }
           else if(hashmap.get(s.charAt(i))==1){
               max=Math.max(max,hashmap.size());
               hashmap.clear();
               hashmap.put(s.charAt(i),1);
           }
            else {
               max=Math.max(max,hashmap.size());
            }
            }
            catch (Exception e){
                hashmap.put(s.charAt(i),1);
                max=Math.max(max,hashmap.size());
            }

        }

        return max;

    }

    public static void main(String[] args) {

        String s = "abcabcbb";

        int result  = lengthOfLongestSubstring(s);

        System.out.println(result);

    }

}