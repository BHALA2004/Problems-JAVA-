package recursive;

public class BacktrackBasic {
    public static void fun(int i,int j){
        if(i<1){
            return;
        }
        fun(i-1,j+1);
        System.out.println(j);
    }
    public static void main(String[] args) {
        int n = 3;
        fun(n,1);

    }
}
