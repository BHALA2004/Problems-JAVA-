package recursive;

public class revPrint {
    public static void main(String[] args) {
        funBoth(5);
    }
    public static void fun(int n){
        if(n==0){
            return;
        }

        fun(n-1);
        System.out.print(n+" ");
    }
    public static void revfun(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        revfun(n-1);

    }
    public static void funBoth(int n){
        fun(n);
        System.out.println();
        revfun(n);
    }
}
