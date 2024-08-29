import java.util.*;

public class Find_the_difference {
    public static char diff(String str1, String str2) {
        int n1 = str1.length();
        char flag = 0;
        int n2 = str2.length();
        int[] freq = new int[26];
        if (n1 > n2) {
            for (int i = 0; i < n2; i++) {
                freq[(str2.charAt(i)) - 'a']++;
            }
            for (int i = 0; i < n1; i++) {
                freq[str1.charAt(i) - 'a']--;
            }
        } else {
            for (int i = 0; i < n1; i++) {
                freq[(str1.charAt(i)) - 'a']++;
            }
            for (int i = 0; i < n2; i++) {
                freq[str2.charAt(i) - 'a']--;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] == -1) {
                flag = (char) (i + 'a');
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String s1 = "x";
        String s2 = "";
        char c = diff(s1, s2);
        System.out.println(c);
    }
}