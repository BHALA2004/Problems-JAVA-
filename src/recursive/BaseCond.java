package recursive;

public class BaseCond {
    public static void fun(int count){
        if(count==6){
            return;
        }
        System.out.println("count");
        count++;
        fun(count);
    }
    public static void main(String[] args) {
        fun(1);
    }
}
