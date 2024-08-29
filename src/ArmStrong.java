public class ArmStrong {
    public static String armstrongNumber(int n){
        // code here
        int h= n;
        String res = "yes";
        int sum=0;
        String f = Integer.toString(n);
        int m = f.length();
        while(n>0){
            int r = n%10;
            sum= (int) (sum+Math.pow(r, m));
            n/=10;
        }
        if(sum!=h)
            res="no";
        return res;

    }
    public static void main(String[] args) {
        String g = armstrongNumber(152);
        System.out.println(g);
    }
}
