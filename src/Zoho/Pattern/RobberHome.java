package Zoho.Pattern;

public class RobberHome {
    public static void main(String[] args) {
       int N = 5 , K = 10;
        int oddHome = 0;
        int evenHome = 0;
        for(int i = 1;i<=N ;i+=2){
            oddHome+=K;

        }
        for(int i = 2;i<=N ;i+=2){
            evenHome+=K;

        }
        System.out.println(Math.max(oddHome,evenHome));
    }
}
