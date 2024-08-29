import java.util.ArrayList;
import java.util.List;

public class letter {
    public static String greatestLetter(String g) {
        String r = "",temp=r; // Initialize an empty string to store the result
        char[] arr = g.toCharArray();
        List<Character> cl = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            cl.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            char o = arr[i]; // Retrieve character from the input string
            if (Character.isUpperCase(o) && cl.contains(Character.toLowerCase(o)) ||
                    Character.isLowerCase(o) && cl.contains(Character.toUpperCase(o))) {
                temp=r;
                r="";
                r += Character.toUpperCase(o);
                if(temp.compareTo(r)>0){
                    r=temp;
                }
            }
        }
        return r;
    }

    public static void main(String[] args) {
        String m = "AbCdEfGhIjK";
        String s = greatestLetter(m);
        System.out.println(s);
    }
}