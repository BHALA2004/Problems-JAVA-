package AlgoTutorDSASheet.Arrays;

public class Power {
    public static double myPow(double x, int n) {
        double k = Math.pow(x,n);
        return k;
    }
    public static void main(String[] args) {
        double x = 7.000000;int n = -3;int g = Math.abs(n);
        System.out.println(myPow(x,n));
        double nume = 1;double deno = 1;
        for(int i = 1;i<=g;i++){
            nume*=x;
        }
        for(int i = 1;i<=g+g;i++){
            deno*=x;
        }
        System.out.println(nume/deno);
    }
}
