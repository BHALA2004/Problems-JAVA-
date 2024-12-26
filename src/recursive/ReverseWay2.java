package recursive;

public class ReverseWay2 {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(rev(n));
    }
    public static int rev(int n){
        int digits = (int)Math.log10(n)+1;
        return helper(n,digits);
    }
    public static int helper(int n,int digits){
        if(n<=0){
            return n;
        }
        int rem = n%10;
        return rem*(int) Math.pow(10,digits-1)+helper(n/10,digits-1);
    }
}
