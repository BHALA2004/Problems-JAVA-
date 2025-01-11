package AlgoTutorDSASheet.Strings;

import java.util.HashMap;
import java.util.Map;

public class ValidPallindrome2 {
    public static boolean validPalindrome(String s) {
        int min = 0;
        Map<Character,Integer> characterIntegerMap = new HashMap<>();
        for(char c : s.toCharArray()){
            characterIntegerMap.put(c,characterIntegerMap.getOrDefault(c,0)+1);
        }
        for(int  i : characterIntegerMap.values()){
            if(i%2==1){
                min++;
            }
            if(min>2){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
       String s = "abc";
        System.out.println(validPalindrome(s));
    }
}
