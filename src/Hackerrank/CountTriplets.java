package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;
        int index = 0;
        while (index<a.size() && index<b.size()){
            if(a.get(index)>b.get(index)){
                alice++;
            } else if (a.get(index)<b.get(index)) {
                bob++;
            }
            index++;
        }
        List<Integer> s = new ArrayList<>();
        s.add(alice);
        s.add(bob);
        return s;


    }
    public static void main(String[] args) {
        List<Integer> alice = new ArrayList<>(Arrays.asList(5 ,06, 7));
        List<Integer> bob = new ArrayList<>(Arrays.asList(3 ,6 ,10));
        System.out.println(compareTriplets(alice,bob));
    }
}
