import java.util.Arrays;

public class Nearest {
    public static void main(String[] args) {
        int[] arr = {7,3,8,5,2,1};int n = Integer.MAX_VALUE;int val=-1;
         for(int i = 0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                 if(arr[i]<arr[j]){
                     if(arr[j]-arr[i]<n){
                         n=arr[j]-arr[i];
                         val=arr[j];
                     }
                     else {
                         val=-1;
                     }
                 }

             }
             n=Integer.MAX_VALUE;
             arr[i]=val;
             val=-1;
         }
        for(int i : arr){
            System.out.println(i);
        }
    }
}
