import java.lang.*;
import java.math.BigInteger;

public class Mathing {
    public static int[] count(int[] arr){
        String s = "";
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        BigInteger m = new BigInteger(s);
        BigInteger g1 = BigInteger.TEN;
        System.out.println(g1);
        m=m.add(BigInteger.ONE);
        String g = m.toString();
        int[] n = new int[g.length()];
        for(int i=0;i<g.length();i++){
            n[i]=Integer.parseInt((String.valueOf(g.charAt(i))));
        }
        return n;

    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int[] result=count(arr);
        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
