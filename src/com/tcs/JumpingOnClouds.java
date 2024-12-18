package com.tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JumpingOnClouds {
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int i = 0;int count=0;
        while (i<c.size()-2){

            if(c.get(i+2)!=1){
                count++;i+=2;
            }
            else if(c.get(i+2)==1){
                count++;i+=1;
            }

        }
        if(i==c.size()-2){
            count++;
        }

        return count;


    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 0 ,1, 0, 0 ,1,0));
        System.out.println(jumpingOnClouds(list));
    }
}
