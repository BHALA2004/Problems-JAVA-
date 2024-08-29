import java.lang.Math;
public class isprime {
    public static int isPrime(int N){
        // code here
        int c = 1;
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i==0){
                c=0;
                break;
            }
        }
        return c;

    }
    public static void main(String[] args) {
        int g = isPrime(5);
        System.out.println(g);
    }
}
