package Zoho.Pattern;

public class Pattern4 {
    public static void main(String[] args) {
        int n=5,temp=1;

        for(int i=1;i<=n;i++)
        {

            int sum=i+1;

            int num=temp;

            for(int j=i;j<=n;j++)
            {
                System.out.print(temp+" ");
                temp+=sum;
                sum++;
            }
            temp--;
            sum=sum-2;

            for(int j=1;j<i;j++)
            {
                System.out.print(temp+" ");
                temp+=--sum;
            }
            temp=num+i;
            System.out.println();
        }
    }
}
