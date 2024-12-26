package recursive;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(summing(40,1));
    }
    public static int summing(int n,int sum){

        if(n<=0){
            return sum;
        }
        int rem = n%10;
        sum*=rem;
        return summing(n/10,sum);
    }
}
