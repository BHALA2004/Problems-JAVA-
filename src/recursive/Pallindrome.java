package recursive;

public class Pallindrome {
    public static void main(String[] args) {
        int n = 121;
        int k = revNum(n,0);
        System.out.println(n==k?"True":"False");

    }
    public static int revNum(int n ,int sum){
        if(n<=0){
            return sum;
        }
        int rem = n%10;
        sum=sum*10+rem;
        return revNum(n/10,sum);
    }
}
