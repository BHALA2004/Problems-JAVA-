import java.util.ArrayList;
import java.util.List;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "paper"; //01034
        String t = "title";//01034
        List<String> lee1 = new ArrayList<>();
        List<String> lee2 = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            lee1.add(Integer.toString(s.indexOf(s.charAt(i))));
        }
        for(int i=0;i<t.length();i++){
            lee2.add(Integer.toString(t.indexOf(t.charAt(i))));
        }
        System.out.println(lee1);
        System.out.println(lee2);

        if(lee1.equals(lee2)){
            System.out.println("true");
        }
        else {
            System.out.println("false");

    }
    }
}
