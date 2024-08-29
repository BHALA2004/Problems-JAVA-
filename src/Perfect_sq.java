public class Perfect_sq {
    public static long floorSqrt(long x)
    {
        long s =(long) Math.sqrt(x);
        return s;
    }
    public static void main(String[] args) {
        long res = floorSqrt(4);
        System.out.println(res);
    }
}
