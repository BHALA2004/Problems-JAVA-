package tcs;

public class SnakePattern {
    public static void main(String[] args) {
        int count = 0;int flag = 0;int temp=0;int n = 5;
        for(int i = 1 ;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i%2==1){
                    count+=1;
                   System.out.print(count + " ");
                   flag=0;

               }
                else {
                    if(flag==0){
                    count=i*n;flag=1;temp = count;}
                    System.out.print(temp +"  ");
                    temp-=1;
                }
            }
            System.out.println();
        }
    }
}
