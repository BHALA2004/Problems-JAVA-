public class even_divide {
    public static int evenlyDivides(int n){
        int f = n;
        int count=0;
        while(n>0){
            int r = n%10;
            if(f%r==0 && r!=0)
                count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
       int N = 22074;
        int re = evenlyDivides(N);
        System.out.println(re);
    }
}
