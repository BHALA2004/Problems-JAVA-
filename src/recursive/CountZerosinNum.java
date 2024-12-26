package recursive;

public class CountZerosinNum {
    public static void main(String[] args) {
        int m = 20304;int val = 0;
        System.out.println(count(m,val));
    }
    public static int count(int n,int val){
        if(n<=0){
            return val;
        }
        int rem = n%10;
        if(rem==0){
            val++;
        }
        return count(n/10,val);
    }
}
