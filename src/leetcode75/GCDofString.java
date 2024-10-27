package leetcode75;

public class GCDofString {
    public static int GCD(int a,int b){
        if(b==0){
            return a;
        }
        else {
            return GCD(b,a%b);
        }
    }
    public static void main(String[] args) {
        String str1 = "ABCDEF", str2 = "ABC";int k = 0;int count=0;

        int a = str1.length();int b = str2.length();
        if(a>b){
        k = GCD(a,b);}
        else {
            k = GCD(b,a);
        }
        if (!(str1 + str2).equals(str2 + str1)) {
            System.out.println(" ");
        }

        // Step 2: Calculate GCD of lengths
        int gcdLength = GCD(str1.length(), str2.length());

        // Step 3: Return the substring of str1 with the length of the GCD
        String result  =  str1.substring(0, gcdLength);

        System.out.println(result);

    }
}
