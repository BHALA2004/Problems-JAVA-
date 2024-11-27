package recursive;

public class BasicPrgm {
    public static void fun(int i){
        if(i==5){
            System.out.println("1000");
        }
        else {
            i++;
            fun(i);
        }
    }
    public static void main(String[] args) {
        fun(1);
    }
}
