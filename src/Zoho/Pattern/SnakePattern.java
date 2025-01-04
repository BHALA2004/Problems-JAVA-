package Zoho.Pattern;

public class SnakePattern {
    public static void main(String[] args) {
        int n = 4;int count = 0;int temp = 0;boolean f = false;
        for(int i = 1;i<=n;i++){
            if(i%2==1){
                for(int j = 1;j<=n;j++){
                    count++;
                    System.out.print(count+" ");
                }
            }
            else if(i%2==0){
                count = count+n;
                f=true;
                if(f){
                    temp=count;
                }
                for(int j = 1;j<=n;j++){
                    System.out.print(count+ " ");
                    count--;
                }
                f=false;
                count=temp;
            }

            System.out.println();
        }
    }
}
