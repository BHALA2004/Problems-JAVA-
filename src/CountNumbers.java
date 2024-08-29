import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CountNumbers {
    public static void main(String[] args) {
        String s = "jviugviuabc";char m = 0;
        List<Character> list= new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            if(list.contains(s.charAt(i))){
                m=s.charAt(i);break;
            }
            list.add(s.charAt(i));
        }

        System.out.println(m);


    }
}
