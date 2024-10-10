import java.util.Arrays;

public class Difference {
    public static void main(String[] args) {
        String str = "abcde";String str1 = "abc";
        int[] m = new int[26];
        for(int i = 0;i<str.length();i++){
            m[str.charAt(i)-'a']++;
        }
        for(int i = 0;i<str1.length();i++){
            m[str1.charAt(i)-'a']--;
        }
        for(int i = 0;i<m.length;i++){
            if(m[i]!=0){
                System.out.println((char) (i+97));
            }
        }

    }
}
