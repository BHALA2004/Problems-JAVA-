package Zoho.Pattern;

import java.util.HashMap;
import java.util.Map;

public class LongestPallindrome {
    public static int longestPalindrome(String s) {
        int n = 0,count = 0;boolean f = false;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char g =s.charAt(i);
            map.put(g,map.getOrDefault(g,0)+1);
        }
        for(Map.Entry<Character,Integer> hash : map.entrySet()){
           if(hash.getValue()%2==0){
               n+=hash.getValue();
           }
           else {
               n+= hash.getValue()-1;
               f=true;
           }

        }
        return f?n+1:n;

    }
    public static void main(String[] args) {
        String s = s = "aaaAaaaa";
        System.out.println(longestPalindrome(s));
    }
}
