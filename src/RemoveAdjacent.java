import java.util.Stack;
import java.lang.*;

public class RemoveAdjacent {
    public static String removeDuplicates(String s) {
        Stack stack = new Stack();
        for(int i  = 0;i<s.length();i++){
            char m = s.charAt(i);
            if(!stack.empty() && m==(char)stack.peek()){
                stack.pop();

            }
            else{
                stack.push(m);


            }
        }
        String mc = "";
        while (!stack.empty()){
            mc+=stack.pop();
        }
        StringBuilder stringBuilder = new StringBuilder(mc);
        return stringBuilder.reverse().toString();






    }
    public static void main(String[] args) {
        String s = "aaaaaaaa";
        String g = removeDuplicates(s);
        System.out.println(g);
    }}

