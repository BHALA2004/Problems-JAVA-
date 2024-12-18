package com.tcs;

import java.util.ArrayList;
import java.util.List;

public class AngryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int stu = 0;
    for(int i : a){
        if(i<=0){
            stu++;
        }
    }
    return stu>=k?"NO":"YES";



    }
    public static void main(String[] args) {

        int total = 4 , wanted = 2;
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(-1);
        arr.add(2);
        arr.add(1);
        String s = angryProfessor(wanted,arr);
        System.out.println(s);
    }
}
