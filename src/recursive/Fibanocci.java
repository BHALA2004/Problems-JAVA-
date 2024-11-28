package recursive;

public class Fibanocci {
    public static int fun(int n){

        // Time complexity = 2**n

        if(n<=1){
            return n;
        }
        int first = fun(n-1);
        int second = fun(n-2);
        return first+second;
    }
    public static void main(String[] args) {
        int n = 3;
        int res = fun(n);
        System.out.println(res);

    }
}
