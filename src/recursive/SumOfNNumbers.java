package recursive;

public class SumOfNNumbers {
    public static int fun(int n){
        if(n==0){
            return n;
        }
        else {
            return n+fun(n-1);
        }
    }
    public static void main(String[] args) {
        int g = fun(3);
        System.out.println(g);
    }
}
