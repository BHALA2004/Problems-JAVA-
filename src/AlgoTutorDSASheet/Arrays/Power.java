package AlgoTutorDSASheet.Arrays;

public class Power {
    public static double myPow(double x, int n) {
        double k = Math.pow(x,n);
        return k;
    }
    public static void main(String[] args) {
        double x = 2.00000;int n = -2;
        System.out.println(myPow(x,n));
    }
}
