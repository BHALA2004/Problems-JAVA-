import java.util.*;
import java.io.*;

class Main {

    public static String Palindrome(String str) {
        // code goes here
        char[] m = str.toCharArray();
       String s = "";
       for(int i = 0;i<m.length;i++){
           if(m[i]!=' '){
               s+=m[i];
           }

       }
        System.out.println(s);
       StringBuilder stringBuilder = new StringBuilder(s);
       String m1 = stringBuilder.reverse().toString();
       if(s.equals(m1)){
           return "true";
       }
       else {
           return "false";
       }

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(Palindrome(s.nextLine()));
    }

}