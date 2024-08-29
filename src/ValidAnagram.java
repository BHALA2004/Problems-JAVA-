import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] m = s.toCharArray();
        char[] m1 = t.toCharArray();
        Arrays.sort(m);
        Arrays.sort(m1);
        String s1 = "";
        String s2 = "";
        for(int i = 0;i<m.length;i++){
            s1+=m[i];
        }
        for (int i = 0;i<m1.length;i++){
            s2+=m1[i];
        }
        return (s1.equals(s2))?true:false;

    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        boolean result = isAnagram(s,t);
        System.out.println(result);
    }
}
