package recursive;

public class SumOfNNumbersParameterized {
    public static int fun(int n,int sum){
        if(n==0){
            return sum;
        }
        else {
           return fun(n-1,sum+n);
        }
    }
    public static void main(String[] args) {
        int res = fun(3,0);
        System.out.println(res);
    }
}
