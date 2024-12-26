package recursive;

public class Fibanocci {
    public static int fun(int n){

        // Time complexity = 2**n

        if(n<2){
            return n;
        }
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        int n = 7;
        int res = fun(n);
        System.out.println(res);

    }
}
