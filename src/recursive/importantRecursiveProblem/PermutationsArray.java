package recursive.importantRecursiveProblem;

import java.util.ArrayList;

import java.util.List;

public class PermutationsArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        generatePermutations(new ArrayList<>(), nums, result);
        System.out.println(result);
    }

    public static void generatePermutations(List<Integer> current, int[] remaining, List<List<Integer>> result) {
        if (current.size() == remaining.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i <= current.size(); i++) {
            List<Integer> temp = new ArrayList<>(current);
            temp.add(i, remaining[current.size()]);
            generatePermutations(temp, remaining, result);
        }
    }
}

