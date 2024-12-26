package recursive;

public class RevNumber {
    public static void main(String[] args) {
        System.out.println(revNum(1234,0));
//        int m = 1234;
//        System.out.println((int)Math.log10(m)+1);
    }
    public static int revNum(int n ,int sum){
        if(n<=0){
            return sum;
        }
        int rem = n%10;
        sum=sum*10+rem;
        return revNum(n/10,sum);
    }
}
