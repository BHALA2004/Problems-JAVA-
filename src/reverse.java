import java.util.ArrayList;
import java.util.List;

public class reverse {
    public static long reverse_digit(long n)
    {
        if(n%10==0){
            n/=10;
        }
        long k = 0;
        while(n>0){
            long r = n%10;
            k=(k*10)+r;
            n/=10;
        }
        return k;
    }
    public static void main(String[] args) {
        long f = 200;
        long c = reverse_digit(f);
        System.out.println(c);

    }
}
