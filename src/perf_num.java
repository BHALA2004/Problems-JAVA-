public class perf_num {
    public static int isPerfectNumber(long N) {
        // code here
        long sum=0;

        for(int i=1;i<Math.sqrt(N);i++){
            if(N%i==0){
                sum+=i;
            }
            if(N/i!=N){
                sum+=(N/i);
            }
        }
        return sum==N?1:0;


    }
    public static void main(String[] args) {
        int m = isPerfectNumber(8589869056l);
        System.out.println(m);
    }
}
