package Zoho.Pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactFinder {
    public static List<Integer> findFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factors.add(i);
                if (i != n / i) {
                    factors.add(n / i);
                }
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println(Math.sqrt(10));

        List<Integer> factors = findFactors(n);
        System.out.println("Factors of " + n + " are: " + factors);
    }
}
