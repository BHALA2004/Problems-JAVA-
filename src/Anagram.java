import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public static boolean anagram(String s3,String s4){
        ArrayList<String> l = new ArrayList<>();
        int[] h = {1,2,3,0};
        char[] char_str = new char[s3.length()];
        char_str=s3.toCharArray();
        Arrays.sort(char_str);
        char[] char_str2=s4.toCharArray();
         Arrays.sort(char_str2);
        String s7 = new String(char_str);
        String s8 = new String(char_str2);
        if(s7.equals(s8)){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        String s = "rasp";
        String s1 = "spzr";
        boolean m = anagram(s,s1);
        System.out.println(m);
    }
}
