package leetcode75;

import java.sql.SQLOutput;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        String s = "acb", t = "ahbgdc";int sum=0;
        boolean result = isSubsequence(s,t);
        System.out.println(result);
    }
}
