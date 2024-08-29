import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Smallest_number {
    public static int minNumber(int[] n1,int[] n2){
        String g = "";
        int flag=0,max=0,temp=max;
        List<Integer> l = new ArrayList<>();
        if(n1.length>n2.length){
            for(int i=0;i<n1.length;i++){
                l.add(n1[i]);
            }
            for(int i=0;i<n2.length;i++){
                Arrays.sort(n1);
                Arrays.sort(n2);
                if(l.contains(n2[i])){
                    g+=n2[i];
                    flag=1;
                    break;
                }}
            if(flag==0){
                Arrays.sort(n1);
                Arrays.sort(n2);
                int a = n1[0];
                int b = n2[0];
                if(a>b){
                g=Integer.toString(b)+Integer.toString(a);}
                else{
                    g=Integer.toString(a)+Integer.toString(b);
                }
            }


        }
        else{
            for(int i=0;i<n2.length;i++){
                l.add(n2[i]);
            }
            for(int i=0;i<n1.length;i++){
                Arrays.sort(n1);
                Arrays.sort(n2);
                if(l.contains(n1[i])){
                    g+=n1[i];
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                Arrays.sort(n1);
                Arrays.sort(n2);
                int a = n1[0];
                int b = n2[0];
                if(a>b){
                g=Integer.toString(b)+Integer.toString(a);}
                else{
                    g=Integer.toString(a)+Integer.toString(b);
                }
            }

        }
        int m = Integer.parseInt(g);
        return m;

    }
    public static void main(String[] args) {
        int[] n1 = {7,5,6};
        int[] n2 = {1,4};
        int r = minNumber(n1,n2);
        System.out.println(r);
    }
}