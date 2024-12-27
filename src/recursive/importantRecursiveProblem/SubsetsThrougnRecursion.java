package recursive.importantRecursiveProblem;

import java.util.ArrayList;
import java.util.List;

public class SubsetsThrougnRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
       List<List<Integer> >  list = subset(arr);
        for(List<Integer> list1 : list){
            System.out.println(list1);
        }
    }
    public static List<List<Integer>> subset(int[] arr ){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i : arr){
            int n = outer.size();
            for(int j = 0;j<n;j++){
                List<Integer> intenal = new ArrayList<>(outer.get(j));
                intenal.add(i);
                outer.add(intenal);
            }
        }
        return outer;
    }
}
