import java.util.HashMap;
import java.util.Map;

public class HashMap_anagram {
    public  static boolean isAnagram(String s, String t) {
        char[] c = new char[26];
        boolean   f = true;
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            c[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(c[i]!=0){
                f=false;break;
            }
        }
        return f;
    }
    public static void main(String[] args) {
        String s1 = "bala";
        String s2 = "alam";
        boolean s = isAnagram(s1,s2);
        System.out.println(s);
    }
}
