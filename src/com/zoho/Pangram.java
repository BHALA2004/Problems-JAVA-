package com.zoho;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Pangram {
    public static void main(String[] args) {
        String s = "aaabbnc";String g = "";
        int[] m = new int[26];
        for(int i = 0;i<s.length();i++){
            char g1 = s.charAt(i);
            m[g1-'a']++;
        }
        System.out.println(Arrays.toString(m));
        for(int i = 0;i<m.length;i++){
            if(m[i]>=1){
                char m1 = (char) (i+'a');
                g+=m1;
            }
        }
        System.out.println(g);
    }
}
