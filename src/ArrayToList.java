import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
    public static List<Integer> addToArrayForm(int[] num, int k) {
       String sum = "";
        List<Integer> s  = new ArrayList<>();
        for(int i = 0;i<num.length;i++){
            sum+=num[i];
        }

        BigInteger newvalue1 = new BigInteger(String.valueOf(k));
        BigInteger newvalue = new BigInteger(sum);
        newvalue=newvalue.add(newvalue1);
        System.out.println(newvalue);



        String result = String.valueOf(newvalue);

        for(int i = 0;i<result.length();i++){
            s.add(result.charAt(i)-'0');
        }
       return s;
    }
    public static void main(String[] args) {
        int[] nums = {9,9,9,9,9,9,9,9,9,9};int k =34;
        List<Integer> list = addToArrayForm(nums,k);
        System.out.println(list);
    }
}
