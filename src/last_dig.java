import java.math.BigInteger;

public class last_dig {
    public static int getLastDigit(String a,String b){
       /* double num1 = Double.parseDouble(a);
        double num2 = Double.parseDouble(b);
        double re =0;
        re = Math.pow(num1,num2);

        int m1 = (int)re;
        String s = Integer.toString(m1);
        System.out.println(s);
        char g = s.charAt(s.length()-1);
        String soo = Character.toString(g);
        int oo = Integer.parseInt(soo);
        return oo;*/

        BigInteger base = new BigInteger(a);
        BigInteger exponent = new BigInteger(b);
        BigInteger modulus = BigInteger.TEN; // Modulus 10 for getting the last digit

        // Calculate a^b mod 10
        BigInteger result = base.modPow(exponent, modulus);



        // Extract the last digit
        int lastDigit = result.intValue();

        return lastDigit;



    }
    public static void main(String[] args) {
        String a = "3",b="10";
        int m = getLastDigit(a,b);
        System.out.println(m);
    }
}
