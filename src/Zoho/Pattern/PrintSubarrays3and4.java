package Zoho.Pattern;

public class PrintSubarrays3and4 {
    public static void main(String[] args) {
        int n = 41  ;int ntemp=n;int i = 0;
        for(i=0;ntemp/2>0;i++){
            ntemp=ntemp/2;
        }
        System.out.println(i);

        int pow = 0;
        for(int j = 0;j<n;j++){
            if(Math.pow(2,j)>n){
                pow=(int)Math.pow(2,j-1);
            }
        }
        System.out.println(pow);
        int pos = n+1-pow;
        if(i==0){
            pos=1;
        }
        else if(pos==pow){
            pos=1;
            i=i+1;
        }

        for(int j=i-1;j>=0;j--){
            if(((pos>>j) &1)==0){
                System.out.print("3");
            }
            else {
                System.out.print("4");
            }
        }
    }
}
