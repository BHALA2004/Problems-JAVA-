package tcs;

import java.util.ArrayList;
import java.util.List;

public class AppleOrange {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int appCount = 0;
        for(int i : apples){
            int val = a+i;
            if(s<=val && val<=t){
                appCount++;
            }
        }
        System.out.println(appCount);
        int orangeCount = 0;
        for(int i : oranges){
            int val = b+i;
            if(s<=val && val<=t){
                orangeCount++;
            }
        }
        System.out.println(orangeCount);
    }
    public static void main(String[] args) {
        int homedis1 = 7;
        int homedis2= 11;
        int appleTree = 5;
        int orangeTree = 15;
        List<Integer> appleList = new ArrayList<>();
        appleList.add(-2);appleList.add(2);appleList.add(1);
        List<Integer> OrangeList = new ArrayList<>();
        OrangeList.add(5);OrangeList.add(-6);
        countApplesAndOranges(homedis1,homedis2,appleTree,orangeTree,appleList,OrangeList);

    }
}
