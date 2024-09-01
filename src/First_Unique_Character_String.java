import java.util.*;

public class First_Unique_Character_String extends PriorityQueue {
    public static int firstUniqChar(String s) {
        char[] m = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<m.length;i++){
            map.put(m[i],map.getOrDefault(m[i],0)+1);
        }
        for(int i =0;i<m.length;i++){
                if(1==map.get(m[i])){
                   return i;
                }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "loeleetcode";
        First_Unique_Character_String s1 = new First_Unique_Character_String();

        int result = firstUniqChar(s);
        System.out.println(result);


    }
}
