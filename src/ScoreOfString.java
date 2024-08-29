import java.util.ArrayList;
import java.util.List;

public class ScoreOfString {
    public static void main(String[] args) {
        String s = "zaz";
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            list.add((int)s.charAt(i));
        }
        //System.out.println(list);
        int sum=0;
        for(int i=list.size()-1;i>0;i--){
            sum+=Math.abs(list.get(i)-list.get(i-1));
        }
        System.out.println(sum);
    }
}
