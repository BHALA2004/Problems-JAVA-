package recursive.importantRecursiveProblem;

import java.util.*;

public class SubsetWithDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        Arrays.sort(arr);
        List<List<Integer>>  list = subset(arr);
        Set<List<Integer>> set = new HashSet<>(list);
        System.out.println(set);

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
