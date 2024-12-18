package com.tcs;

import java.util.Map;

public class Squares {
    public static int squares(int a, int b) {
        // Write your code here
        int count = 0;
        for(int i = 1;i<=Math.sqrt(b);i++){
            int c = i*i;
            if(a<=c && c<=b){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
       int a  = 3,b=9;
       int l = squares(a,b);
        System.out.println(l);
    }
}
