package com.tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> in = new ArrayList<>();
        for(int  i : grades){
            if(i<38){
                in.add(i);
            }
            else {
                int inch = i;
                int curr  =0;
                while (i%5!=0){
                    i+=1;curr++;
                }
                if((i-inch)<3){
                    in.add(i);
                }else {
                    in.add(inch);
                }
            }

        }
        return in;
    }
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>(Arrays.asList(84,
                29,
                57));
        List<Integer> integers = gradingStudents(list);
        System.out.println(integers);
    }
}
