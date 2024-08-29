public class SumofAll {
    public static int find(int x){
        int sum = 0;
        if(x/10==0){
            return x;
        }
        else {
            while (x>0){

                int r = x%10;
                sum+=r;
                x/=10;
            }
            return find(sum);
        }
    }
    public static void main(String[] args) {
        int s = 0;
        int result  = find(s);
        System.out.println(result);
    }
}
