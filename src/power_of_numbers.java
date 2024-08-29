import java.math.BigInteger;

public class power_of_numbers {

    public static long power(int N,int R)
    {
        //Your code here
//        String s = "1000000007";
//        String f = Integer.toString(N);
//        String g = Integer.toString(R);
//        BigInteger fi = new BigInteger(f);
//        BigInteger two  = new BigInteger(g);
//        BigInteger c = new BigInteger(s);
//        BigInteger res = fi.modPow(two,c);
//        Long g1 = res.longValue();
//        return g1;
        double v = (Math.pow((double) N, (double) R)) % (double) 1000000007;
        return (long) v;


    }
    public static void main(String[] args) {
        int n = 12,r=21;
        long g = power(n,r);
        System.out.println(g);
    }
}
