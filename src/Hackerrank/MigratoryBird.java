package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MigratoryBird {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int[] size = new int[arr.size()];
        for(int i : arr){
            size[i]++;
        }
        int min = Integer.MIN_VALUE;int index = -1;
        for (int i = 0; i < size.length; i++) {
            if(size[i]>min){
                min=size[i];
                index=i;
            }
        }

        return index;

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1 ,4 ,4 ,4 ,5 ,3));
        System.out.println(migratoryBirds(list));

    }
}
